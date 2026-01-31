number = int(input("Enter a withdrawal amount.: "))

if number % 10 == 0:
    print("Withdrawal allowed")
else:
    print("withdrawal denied")