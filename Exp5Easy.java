import java.util.ArrayList;
import java.util.Scanner;

public class Exp5Easy {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("ENTER NUMBER: ");
            numbers.add(Integer.valueOf(sc.nextInt()));
        }
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=numbers.get(i).intValue();  
        }
        System.out.println("SUM IS: "+sum);
    }

}