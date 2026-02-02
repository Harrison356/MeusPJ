import os



password = input("Digite sua senha: ")
os.system("cls")

if password == "1234":
    print("Access allowed")
else:
    print("Access denied")