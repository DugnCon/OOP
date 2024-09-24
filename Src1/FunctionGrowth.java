public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("ln n" + '\t' + "n" + '\t' + "n ln n" + '\t' + "n^2" + "\t" + "n^3" + "\t" + "2^n" );
        for(int i = 16; i<=2048; i*=2) {
            System.out.print((int) Math.log(i));
            System.out.print('\t');
            System.out.print(i);
            System.out.print('\t');
            System.out.print((int) (i*Math.log(i)));
            System.out.print('\t');
            System.out.print((int) (Math.pow(i,2)));
            System.out.print("\t");
            System.out.print((int) (Math.pow(i,3)));
            System.out.print("\t");
            System.out.print((int) (Math.pow(2,i)));
            System.out.println();
        }
    }
}
