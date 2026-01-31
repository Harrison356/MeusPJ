number = int(input("Enter the years: "))

if number % 4 == 0 and number % 100 != 0 or number % 400 == 0:
    print("Years Bissexto")
else:
    print("Normal")