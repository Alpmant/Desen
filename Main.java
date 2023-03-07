import java.util.Scanner;
public class Main {
    static void desen(int x) {
        System.out.print(x + " ");
        if (x <= 0) {
            return;
        }
        desen(x - 5);
        System.out.print(x + " ");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");

        desen(n);





    }


}


            






