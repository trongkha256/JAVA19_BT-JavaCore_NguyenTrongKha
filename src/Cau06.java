import java.util.Scanner;

public class Cau06 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập vào chuỗi");
        String s=scanner.nextLine();
        System.out.printf("Chuỗi đảo ngược: ");
        for (int i=s.length()-1;i>=0;i--){
            char temp=s.charAt(i);
            System.out.printf(""+temp);
        }
    }
}
