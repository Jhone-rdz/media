import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números para calcular a média:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();
        
        double media = calcularMedia(numero1, numero2, numero3);
        
        System.out.println("A média dos três números é: " + media);
        
        scanner.close();
    }
    
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
