print("1 - xsalada")
print("2 - xtudo")
print("3 - kikao")

cod = int(input("Digite o codigo do alimento: "))

match cod:
    case "1":
        print("xsalada - 10$")
    case "2":
        print("xtudo - 15$")
    case "3":
        print("kikao - 12$")
    case _:

        print("Esse não existe")