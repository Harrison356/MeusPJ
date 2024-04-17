using System;
using System.Globalization;
namespace Program 
{
    class Program
    {
        static void Main(string[] args)
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int a ,b ,c , menor;

            System.Console.WriteLine("Dgite o primeiro numero: ");
            a = int.Parse(Console.ReadLine());
            System.Console.WriteLine("Dgite o segundo numero: ");
            b = int.Parse(Console.ReadLine());
            System.Console.WriteLine("Dgite o terceiro numero: ");
            c = int.Parse(Console.ReadLine());

            if (a < b && a < c){
                menor = a;
            } else if (b < c){
                menor = b;
            }else {
                menor = c;
            }

            System.Console.WriteLine("Menor = " + menor);
        }
    }
}