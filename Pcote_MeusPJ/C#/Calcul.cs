using System;
using System.Globalization;
namespace Program 
{
    class Program
    {
        static void Main(string[] args)
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

      double num1, num2;
        char operacao;

        Console.WriteLine("Bem-vindo à calculadora em C#!");

        Console.Write("Digite o primeiro número: ");
        num1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Digite o segundo número: ");
        num2 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Digite a operação (+, -, *, /): ");
        operacao = Convert.ToChar(Console.ReadLine());

            double resultado = 0;

        
        switch (operacao)
        {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    resultado = num1 / num2;
                else
                    Console.WriteLine("Erro! Não é possível dividir por zero.");
                break;
            default:
                Console.WriteLine("Operação inválida!");
                break;
        }

        Console.WriteLine($"O resultado é: {resultado}");

        Console.ReadLine();

        }
    }
}