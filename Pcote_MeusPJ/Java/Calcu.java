import java.util.Locale;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		char operador;
        double num1, num2;

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = sc.next().charAt(0);

        System.out.print("Digite dois números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        switch(operador) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Erro! Divisão por zero!");
                break;
            default:
                System.out.println("Operador inválido!");
        }

}}
