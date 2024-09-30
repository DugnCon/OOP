public class Student extends Person {
    private String MSSV;
    public Student(String Name, String Date, String MSSV){
        super(Name,Date);
        this.MSSV = MSSV;
    }
    public void Print(){
        System.out.println(super.getName() + " " + super.getDate() + " " + this.MSSV);
    }
}
