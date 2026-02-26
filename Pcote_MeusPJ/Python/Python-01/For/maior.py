maior = None
menor = None

for i in range(5):
    numero = int(input("Digite um número: "))

    if maior is None or numero > maior:
        maior = numero

    if menor is None or numero < menor:
        menor = numero

print("Maior:", maior)
print("Menor:", menor)