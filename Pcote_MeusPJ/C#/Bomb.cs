using System;
using System.Globalization;
namespace Program 
{
    class Program
    {
        static void Main(string[] args)
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

    
        Console.WriteLine("Digite uma frase:");
        string frase = Console.ReadLine();

        string fraseMinuscula = frase.ToLower();

       
        if (fraseMinuscula.Contains("bomba"))
        {
            Console.WriteLine("Duck !!!");
        }
        else
        {
            Console.WriteLine("A palavra 'bomba' não foi encontrada.");
        }
    }
}}
    


        