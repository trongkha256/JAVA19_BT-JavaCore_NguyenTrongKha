import java.util.Scanner;

public class Cau05 {
    public static void main(String[] args){
        System.out.printf("Nhập vào tọa độ A(x1,y1): ");
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        System.out.printf("Nhập vào tọa độ B(x2,y2): ");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        double kq=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.printf("AB= "+kq);


    }

}
