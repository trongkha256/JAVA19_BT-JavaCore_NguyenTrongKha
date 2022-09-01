import java.util.ArrayList;
import java.util.Scanner;

public class Cau14 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList a=new ArrayList<Integer>();
        System.out.printf("Nhập vào số lượng phần tử: " );
        int num=scanner.nextInt();
        System.out.printf("Nhập mảng: ");
        for (int i=0;i<num;i++){
            System.out.printf("a["+i+"]= ");
            a.add(scanner.nextInt());
        }
        System.out.printf("Mảng ban đầu: "+ a.toString());
        for (int i=0;i<num;i++){
            boolean check=true;
            for (int j=i+1;j<num;j++){
                if (a.get(i)==a.get(j)){
                    a.remove(i);
                    i--;
                    num--;
                    break;
                }
            }

        }
        System.out.printf("\nMảng sau khi xóa các phần tử trùng: "+a.toString());

    }
}
