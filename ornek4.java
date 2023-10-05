import java.util.Scanner;



public class ornek4 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Weight: ");
        float kilosu = Float.parseFloat(scanner.nextLine());
        System.out.println("Your Height: ");
        float boyu = Float.parseFloat(scanner.nextLine());

        float vucutIndexi = kilosu / (float)(Math.pow(boyu,2));
        if (vucutIndexi < 18.5) {
            System.out.println("your body index: " + vucutIndexi);
            System.out.println("Very low");
        } else if(vucutIndexi >= 18.5 & vucutIndexi < 25.0) {
            System.out.println("your body index: " + vucutIndexi);
            System.out.println("Ideal");
        } else if(vucutIndexi >= 25 & vucutIndexi < 30) {
            System.out.println("your body index: " + vucutIndexi);
            System.out.println("High Weight");
        } else if(vucutIndexi >= 30 & vucutIndexi < 35) {
            System.out.println("your body index: " + vucutIndexi);
            System.out.println("Obese");
        } else if(vucutIndexi >= 35) {
            System.out.println("your body index: " + vucutIndexi);
            System.out.println("Very overweight");
        }
    }
}
