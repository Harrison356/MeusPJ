pares = 0
impares = 0

for x in range(1, 6):
    numero = int(input(f"Digite o {x}º número: "))

    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1



print("Quantidade de pares:", pares)
print("Quantidade de ímpares:", impares)