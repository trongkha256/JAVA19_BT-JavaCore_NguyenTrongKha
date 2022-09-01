import java.util.Scanner;

public class Cau16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();


        if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println("Đây là năm nhuận");
        }
        else
            System.out.println("Đây không phải năm nhuận");
    }
}
