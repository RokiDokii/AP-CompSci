number = input("Please enter a 3-digit number. ")
if len(number) == 3 and number.isnumeric():
    print(number[2] + '\n' + number[1] + '\n' + number[0])
else:
    print("Must be a 3 digits.")
input()