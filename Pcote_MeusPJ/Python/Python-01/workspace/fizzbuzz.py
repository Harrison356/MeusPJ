num = int(input("Digite um numero 1 a 100: "))


if num < 1 and num > 100:
    print("erro")
elif num % 3 == 0:
    print("Fizz !!!")
elif num % 5 == 0:
    print("Buzz !!!")
else:
    print("FizzBuzz !!!")