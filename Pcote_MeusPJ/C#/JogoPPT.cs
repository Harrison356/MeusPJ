using System;
using System.Globalization;
namespace Program 
{
    class Program
    {

    static void Main(string[] args)
    {
        System.Console.WriteLine("************************/Digite com letra minuscula/***************************");
        System.Console.WriteLine("Jogador 1 Escoha entre Pedra ,Papel ou Tesoura: ");
        string jog1 = Console.ReadLine();

        System.Console.WriteLine("Jogador 2 Escoha entre Pedra ,Papel ou Tesoura: ");
        string jog2 = Console.ReadLine();


        /* Jogador 1*/
        if (jog1 == "pedra" && jog2 == "tesoura") {

            System.Console.WriteLine("Jogador 1 ganhou");
        } else if (jog1 == "tesoura" && jog2 == "papel"){

        System.Console.WriteLine("Jogador 1 ganhou");
        } else if (jog1 == "papel" && jog2 == "pedra"){

        System.Console.WriteLine("Jogador 1 ganhou");


        /* Jogador 2*/

        }else if (jog2 == "pedra" && jog1 == "tesoura") {

            System.Console.WriteLine("Jogador 2 ganhou");
        } else if (jog2 == "tesoura" && jog1 == "papel"){

        System.Console.WriteLine("Jogador 2 ganhou");
        } else if (jog2 == "papel" && jog1 == "pedra"){
            
            System.Console.WriteLine("Jogador 2 ganhou");
        } else {
            System.Console.WriteLine("Opção invalida !!!");
        }


        }
    }
}