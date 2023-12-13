import static area.Main.triangle;
import static area.Main.rectangle;
import static area.Main.trapeze;
import static area.Main.square;
import static area.Main.Diamond;
import static area.Main.Circle;
import static area.Main.Parallelogram;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULING AREAS");
        System.out.println("A- Trangle");
        System.out.println("B- Rectangle");
        System.out.println("C- Trapeze");
        System.out.println("D- Square");
        System.out.println("E- Diamond");
        System.out.println("F- Circle");
        System.out.println("G- Parallelogram");
        System.out.println("What area do you want to calculate?");
        String option = sc.next();

        switch (option){
            case "A":
                System.out.println("Insert the base:");
                double base = sc.nextDouble();
                System.out.println("Insert the Height:");
                double altura = sc.nextDouble();
                System.out.println("Result: "+ triangle(base,altura));
                break;

            case "B":
                System.out.println("Insert the base:");
                double base2 = sc.nextDouble();
                System.out.println("Insert the Height:");
                double altura2 = sc.nextDouble();
                System.out.println("Result: " + rectangle(base2,altura2));
                break;

            case "C":
                System.out.println("Insert the Height:");
                double altura3 = sc.nextDouble();
                System.out.println("Insert the bigger base: ");
                double bigger_base = sc.nextDouble();
                System.out.println("Insert the smaller base: ");
                double smaller_base = sc.nextDouble();
                System.out.println("Result: "+ trapeze(bigger_base,smaller_base,altura3));
                break;

            case "D":
                System.out.println("Insirt the value of the Side: ");
                double side = sc.nextDouble();
                System.out.println("Result: "+ square(side));
                break;

            case "E":
                System.out.println("Insert the value of the larger diagonal: ");
                double larger_diagonal = sc.nextDouble();
                System.out.println("Insert the value of the minor diagonal: ");
                double minor_diagonal = sc.nextDouble();
                System.out.println("Result: "+ Diamond(larger_diagonal,minor_diagonal));
                break;

            case "F":
                System.out.println("Insert the value of the Radius: ");
                double r = sc.nextDouble();
                System.out.println("Result: "+ Circle(r));
                break;

            case "G":
                System.out.println("Insert the base:");
                double base7 = sc.nextDouble();
                System.out.println("Insert the Height:");
                double altura7 = sc.nextDouble();
                System.out.println("Result: " + Parallelogram(base7, altura7));
                break;

            default:
                System.out.println("Invalid data");
        }
    }
}
