#include<bits/stdc++.h>

using namespace std;

int main() {
    char operador;
    double num1, num2;

    cout << "Digite o operador (+, -, *, /): ";
    cin >> operador;

    cout << "Digite dois números: ";
    cin >> num1 >> num2;

    switch(operador) {
        case '+':
            cout << num1 << " + " << num2 << " = " << num1 + num2;
            break;
        case '-':
            cout << num1 << " - " << num2 << " = " << num1 - num2;
            break;
        case '*':
            cout << num1 << " * " << num2 << " = " << num1 * num2;
            break;
        case '/':
            if(num2 != 0)
                cout << num1 << " / " << num2 << " = " << num1 / num2;
            else
                cout << "Erro! Divisão por zero!";
            break;
        default:
            cout << "Operador inválido!";
    }

    return 0;
}