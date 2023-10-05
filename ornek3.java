import java.util.Scanner;
 

public class ornek3 { //I calculated the hipothenus of a triangle
    public static void main(String[] args) {
        System.out.println("Bir dik üçgenin hipotenüsü hesaplanacaktır.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kenarı: ");
        float ilkKenar = Float.parseFloat(scanner.nextLine());
        System.out.println("2.kenarı: ");
        float ikinciKenar = Float.parseFloat(scanner.nextLine());
        
        float ilkKare  = (float)(Math.pow(ilkKenar, 2)); 
        float ikinciKare  = (float)(Math.pow(ikinciKenar, 2)); 
        float hipotenus = ilkKare + ikinciKare;

        System.out.println("hipotenüs: " + (Math.sqrt(hipotenus)));

    }
}
