import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập số cần chuyển: ");
        int num=scanner.nextInt();
        List a=new ArrayList();
        if (num<=0){
            System.out.printf("Không có cơ số hợp lệ");
            return;
        }
        while (num>0){
            a.add(num%2);
            num=num/2;
        }
        System.out.printf("Cơ số 2 là: ");
        for (int i=a.size()-1;i>=0;i--){
            System.out.printf(a.get(i).toString());
        }
        // Chuyển lại cơ số 10:
        int tempNum=0;
        for (int i=a.size()-1;i>=0;i--){
            tempNum+=(int)a.get(i)*Math.pow(2,i);
        }
        System.out.printf("\nCơ số 10: "+tempNum);
    }
}
