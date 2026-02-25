contador = 1
pares = 0
impares = 0

while contador <= 10:
    numero = int(input(f"Digite o {contador}º número: "))

    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1

    contador += 1

print("Quantidade de pares:", pares)
print("Quantidade de ímpares:", impares)
