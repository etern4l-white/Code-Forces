import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.nextLine();
        System.out.println();
        
        while(i > 0) {
            System.out.println((in.nextLine().toLowerCase().equals("yes"))? "YES":"NO");
            i--;
        }
        in.close();
    }
}
