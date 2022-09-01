import java.util.Scanner;

public class Cau11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double max= Math.log(n)/Math.log(2);
        System.out.printf("Số t lớn nhất nhỏ hơn log 2 n là: "+max);

    }
}
