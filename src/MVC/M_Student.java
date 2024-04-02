package MVC;

public class M_Student {
    private String MaSV;
    private String Name;

    public M_Student(String maSV, String name) {
        MaSV = maSV;
        Name = name;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
