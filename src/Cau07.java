import java.util.Scanner;

public class Cau07 {
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                System.out.printf("Nhập vào số: ");
                int num=scanner.nextInt();
                if (num >0){
                        System.out.printf("Các ước số của "+num+ " là: ");
                        for (int i=1 ;i <=num;i++){
                                if (num%i==0){
                                        System.out.printf(i+", ");
                                }
                        }
                }
                else System.out.printf("Số không hợp lệ.");

        }
        }
