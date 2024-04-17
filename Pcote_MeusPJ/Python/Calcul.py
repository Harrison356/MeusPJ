def soma(a, b):
    return a + b

def subtracao(a, b):
    return a - b

def multiplicacao(a, b):
    return a * b

def divisao(a, b):
    if b != 0:
        return a / b
    else:
        return "Erro: divisão por zero"

# Exibição das operações disponíveis
print("Operações disponíveis:")
print("+ para soma")
print("- para subtração")
print("* para multiplicação")
print("/ para divisão")

# Entrada dos números e operador
operador = input("Digite o operador (+, -, *, /): ")
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

# Realiza a operação e imprime o resultado
if operador == "+":
    resultado = soma(num1, num2)
elif operador == "-":
    resultado = subtracao(num1, num2)
elif operador == "*":
    resultado = multiplicacao(num1, num2)
elif operador == "/":
    resultado = divisao(num1, num2)
else:
    resultado = "Operador inválido"

print("Resultado:", resultado)
