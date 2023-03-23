import java.util.Scanner;
public class Kuvvetler {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz.");
        a = inp.nextInt();
        System.out.println("4'ün kuvvetleri :");
        for(int i = 0; i<=a; i++){
            System.out.println(Math.pow(4,i));
        }
        System.out.println("------------");
        System.out.println("5'in kuvvetleri :");
        for(int j = 0;j<=a;j++){
            System.out.println(Math.pow(5,j));
        }
    }
}
