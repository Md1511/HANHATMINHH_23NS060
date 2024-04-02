package deQui_Jtree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JTreeExample {
    private JTextField txtPath;
    private JTree jTree;

    public JTreeExample() {
        txtPath = new JTextField();
        jTree = new JTree();

        JButton btnOpenPath = new JButton("Open Path");
        btnOpenPath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnOpenPathActionPerformed(e);
            }
        });

        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(txtPath, BorderLayout.NORTH);
        frame.add(new JScrollPane(jTree), BorderLayout.CENTER);
        frame.add(btnOpenPath, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    private void btnOpenPathActionPerformed(ActionEvent evt) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = filechooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = filechooser.getSelectedFile().getAbsolutePath();
            txtPath.setText(path);
            listFileAll(path);
        }
    }

    private void listFileAll(String path) {
        File myFile = new File("E:\\Ky2\\JAVA_practice\\Notepad\\MVC_Chuan.txt");

        if (myFile.exists() && myFile.isDirectory()) {
            DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(myFile.getName());
            addSubNodes(rootNode, myFile);

            DefaultTreeModel defaultTreeModel = new DefaultTreeModel(rootNode);
            jTree.setModel(defaultTreeModel);
        } else {
            JOptionPane.showMessageDialog(null, "Thư mục không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addSubNodes(DefaultMutableTreeNode parentNode, File parentFile) {
        for (File f : parentFile.listFiles()) {
            DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(f.getName());
            parentNode.add(childNode);

            if (f.isDirectory()) {
                addSubNodes(childNode, f);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTreeExample();
            }
        });
    }
}