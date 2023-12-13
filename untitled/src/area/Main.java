package area;

public class Main {
    public static void main(String[] args) {
    }

    public static double triangle(double altura, double base){
        double area = altura*base/2;
        return area;
    }

    public static double rectangle(double base, double altura){
        double area = base*altura;
        return area;
    }

    public static double trapeze (double base_maior, double base_menor, double altura){
        double area = (base_maior+base_menor)*altura/2;
        return area;
    }

    public static double square(double side){
        double area = side*side;
        return area;
    }

    public static double Diamond (double larger_diagonal, double minor_diagonal){
        double area = larger_diagonal*minor_diagonal/2;
        return area;
    }

    public static double Circle (double r){
        double area = Math.PI*(r*r);
        return area;
    }

    public static double Parallelogram(double base, double altura){
        double area = base*altura;
        return area;
    }
}