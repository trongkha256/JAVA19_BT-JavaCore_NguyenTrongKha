import java.util.Random;
import java.util.Scanner;

public class Cau17 {
    public static void main(String[] args){
        Random rd=new Random();
        int ran= rd.nextInt(1000)+1;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.printf("\nNhập số bạn chọn: ");
            int num=scanner.nextInt();
            if (num==ran){
                System.out.printf("\nChúc mừng đúng rồi nè :))) ");
                break;
            }
            else {
                if (num>ran){
                    System.out.printf("Lớn hơn rồi.");
                }
                else System.out.printf("Bé hơn rồi");
            }
        }


    }

}
