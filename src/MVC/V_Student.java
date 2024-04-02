package MVC;

import java.util.Scanner;

public class V_Student {
    Scanner sc = new Scanner(System.in);
    public void hienThi(M_Student mStudent)
    {
        System.out.println("Ma SV: " + mStudent.getMaSV());
        System.out.println("Ten SV: " + mStudent.getName());
    }

    public String VgetName()
    {
        System.out.println("Nhap ten SV: ");
        String nameSV = sc.next();
        return nameSV;
    }

    public String VgetMaSV()
    {
        System.out.println("Nhap ma SV: ");
        String maSV = sc.next();
        return maSV;
    }
}
