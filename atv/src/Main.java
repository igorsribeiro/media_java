import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float av1,av2,av3,media;

        System.out.println("Insira a nota da av1: ");
        av1 = sc.nextFloat();

        System.out.println("Insira a nota da av2: ");
        av2 = sc.nextFloat();

        System.out.println("Insira a nota da av3: ");
        av3 = sc.nextFloat();

        media = (av1+av2+av3)/3;

        System.out.printf("A sua média final é %.2f\n" ,media);
    }
}
