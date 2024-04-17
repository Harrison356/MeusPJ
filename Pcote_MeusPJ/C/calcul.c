#include <stdio.h>

int main() {
    char operador;
    double num1, num2;

    printf("Digite o operador (+, -, *, /): ");
    scanf("%c", &operador);

    printf("Digite dois números: ");
    scanf("%lf %lf", &num1, &num2);

    switch(operador) {
        case '+':
            printf("%.2lf + %.2lf = %.2lf", num1, num2, num1 + num2);
            break;
        case '-':
            printf("%.2lf - %.2lf = %.2lf", num1, num2, num1 - num2);
            break;
        case '*':
            printf("%.2lf * %.2lf = %.2lf", num1, num2, num1 * num2);
            break;
        case '/':
            if(num2 != 0)
                printf("%.2lf / %.2lf = %.2lf", num1, num2, num1 / num2);
            else
                printf("Erro! Divisão por zero!");
            break;
        default:
            printf("Operador inválido!");
    }

    return 0;
}

