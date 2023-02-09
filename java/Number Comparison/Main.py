num1 = int(input("Please insert two numbers:\n")) #Prompts the user to enter two numbers
num2 = int(input())

if num1 == num2:
    print("You entered the same number twice!") #If the two numbers are the same
elif num1 > num2:
    print(num1," is higher.") #If the first number is higher
else:
    print(num2," is higher.") #If the second number is higher

if num1 and num2 % 2 == 0:
    print("Even Steven!") #If the numbers are both even
elif num1 and num2 % 2 == 1:
    print("Odd Todd!") #If the numbers are both odd
else:
    print("Plain Jane!") #If the numbers are opposites

if num1 % num2 == 0:
    print(num1, " is a multiple of ", num2) #If the first number is a multple of the second
elif num2 % num1 == 0:
    print(num2, " is a multiple of ", num1) #If the second number is a multple of the first
else:
    print("Not a multiple.") #If neither are multiples of eachother