number = float(input("Digite uma nota de (0 a 10): "))

if number >= 7:
    print("APPROVED")
elif number >= 5 and number < 7:
    print("RECOVERY")
else:
    print("FAILED")