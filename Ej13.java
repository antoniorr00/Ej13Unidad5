import java.util.Scanner;

class Circulo{
    private double radio;

    public Circulo (double radio){
        if (radio<0) {
           this.radio=0;
        } else {
           this.radio=radio;
       }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

class Cilindro extends Circulo{
    private double altura;

    public Cilindro (double radio, double altura){
        super(radio);
        if (altura < 0) {
                this.altura=0;
            } else {
                this.altura=altura;
            }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getVolumen() {
            return getArea() * altura;
        }
}

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double alturaCilindro = scanner.nextDouble();

        Cilindro cilindro = new Cilindro(radioCirculo, alturaCilindro);

        System.out.println("Radio del círculo: " + cilindro.getRadio());
        System.out.println("Altura del cilindro: " + cilindro.getAltura());
        System.out.println("Área del círculo: " + cilindro.getArea());
        System.out.println("Volumen del cilindro: " + cilindro.getVolumen());
        
    }
}




