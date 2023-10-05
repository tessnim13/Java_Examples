import java.util.Scanner;

public class ornek2 { // I calculated if the person has passed or failed the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your midterm grade: ");

        int vizeNotu = scanner.nextInt(); 

        System.out.println("Your final grade: ");

        int finalNotu = scanner.nextInt(); 

        float vizePuan = vizeNotu*0.4f;
        float finalPuan = finalNotu*0.6f;
        
        float toplam = vizePuan + finalPuan;
        System.out.println(toplam);
        

        if (toplam >= 50 & finalNotu >= 50) {
            System.out.println("CONGRATULATIONS");
        } else {
            System.out.println("YOU FAILED");
        }
        
    }
}
