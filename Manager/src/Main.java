import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        List<Student> student = new ArrayList<>();
        List<GiangVien> giangVien = new ArrayList<>(); 
        for(int i = 0; i < Size ; i++){
            sc.next();
            String Name = sc.nextLine();
            String Date = sc.nextLine();
            String MSSV = sc.nextLine();
            Student st = new Student(Name, Date, MSSV);
            GiangVien gv = new GiangVien(Name, Date);
            student.add(st);
            giangVien.add(gv);
        }
        for(int i = 0; i < Size ; i++){
            sc.next();
            String Name = sc.nextLine();
            String Date = sc.nextLine();
            GiangVien gv = new GiangVien(Name, Date);
            giangVien.add(gv);
        }
        for(int i =0 ;i < student.size() ; i++){
            student.get(i).Print();
        }
        for(int i =0 ;i < giangVien.size() ; i++){
            giangVien.get(i).Print();
        }

    }
}
