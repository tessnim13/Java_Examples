import java.util.Scanner;

public class ornek {  //this is a calculater
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.number: ");
        float sayi1 = Float.parseFloat(scanner.nextLine());
        System.out.println("2.number: ");
        float sayi2 = Float.parseFloat(scanner.nextLine());
        
        System.out.println("Write whatever you want (+, -, /, *)");
        char islem = scanner.nextLine().charAt(0);

        
        switch(islem) {
            case '+':
            System.out.println("islem: " + (sayi1 + sayi2));
            break;

            case '-':
            System.out.println("islem: " + (sayi1 - sayi2));
            break;

            case '/':
            System.out.println("islem: " + (sayi1 / sayi2));
            break;

            case '*':
            System.out.println("islem: " + (sayi1 * sayi2));
            break;

            default:
            System.out.println("What are you doing");
            break;
        } 
    }
}
