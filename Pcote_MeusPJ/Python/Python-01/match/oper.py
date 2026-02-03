num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

oper = input("Escolha a operação: ")

match oper:
    case '+':
        print("A soma é: ",num1 + num2)
    case '-':
        print("A subtração é: ",num1 - num2)
    case '*':
        print("A Multi é: ",num1 * num2)
    case '/':
        if num2 != 0:
            print("A Div é: ",num1 / num2)
        else:
            print("Erro nao dividido por zero")
    case _:
        print("ERROOOOO!!!")