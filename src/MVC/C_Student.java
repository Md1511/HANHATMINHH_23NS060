package MVC;

public class C_Student {
    V_Student vStudent;
    M_Student mStudent;

    public C_Student(V_Student vStudent, M_Student mStudent) {
        this.vStudent = vStudent;
        this.mStudent = mStudent;
    }

        public void AddSV()
        {
            mStudent.setName(vStudent.VgetName());
            mStudent.setMaSV(vStudent.VgetMaSV());
        }

}
