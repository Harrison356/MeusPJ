package main

import "fmt"

func main() {

	aprovados := make(map[int]string)

	aprovados[1234567890] = "Maria"
	aprovados[12345678290] = "Mdeja"
	aprovados[123456789230] = "Roger"

	fmt.Println(aprovados)

	for cpf, nome := range aprovados {
		fmt.Printf("%s (CPF: %d)\n", nome, cpf)
	}
}
