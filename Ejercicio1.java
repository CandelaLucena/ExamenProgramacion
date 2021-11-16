import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side, squareArea;

        System.out.println("Inserte un lado");

        side = sc.nextFloat();

        squareArea = side * side;

        System.out.println(squareArea);

        sc.close();
        //oliiii
    }
}