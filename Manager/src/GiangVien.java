public class GiangVien extends Person {
    public GiangVien(String Name, String Date){
        super(Name,Date);
    }
    public void Print(){
        System.out.println(super.getName() + " " + super.getDate());
    }
}
