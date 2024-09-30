

public class Person {
    private String Name;
    private String Date;
    public Person(String Name, String Date){
        this.Name = Name;
        this.Date = Date;
    }
    void chuanHoaTen(){
        StringBuilder S = new StringBuilder("");
        String[] arr = Name.split("\\s+");
        for(int i =0 ; i < arr.length ; i++){
            String s = arr[i];
            S.append(Character.toUpperCase(s.charAt(0)));
            for(int j = 1;j < s.length() ; j++){
                S.append(Character.toLowerCase(s.charAt(j)));
            }
            S.append(" ");
        }
        S.deleteCharAt(S.length() - 1);
        this.Name = String.valueOf(S);
    }
    void xylyNgaySinh(){
        StringBuilder S = new StringBuilder(Date);
        if(S.charAt(1) == '/') S.insert(0, '0');
        if(S.charAt(4) == '/') S.insert(3, '0');
        this.Date = String.valueOf(S);
    }
    public String getName(){
        chuanHoaTen();
        return this.Name;
    }
    public String getDate(){
        xylyNgaySinh();
        return this.Date;
    }
}
