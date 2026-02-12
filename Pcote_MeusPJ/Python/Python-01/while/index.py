cont = 1 
number = 0
total = 0
pares = 0
impares = 0

while cont != 0:
    number = int(input("Digite um número (0 para sair): "))
    
    if number % 2 == 0:
        pares += 1
    else:
        impares += 1

    cont += 1
    
    total += number
    media = total / cont
    
    print("Quantidade total de números digitados ",cont)
    print("Quantidade de pares ",pares)
    print("Quantidade de ímpares ",impares)
    print("Soma total", total)
    print("Média dos valores ",media)
    
    