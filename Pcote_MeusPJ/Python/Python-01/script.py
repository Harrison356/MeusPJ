resposta = input("O ônibus passou? (sim/não): ")

while resposta != "sim":
    if resposta == "não":
        print("Olhando para a rua...")
        resposta = input("O ônibus passou? (sim/não): ")
    else:
        print("Erro: digite apenas 'sim' ou 'não'.")
        resposta = input("O ônibus passou? (sim/não): ")

print("Puts! perdi o ônibus!")
