num1 = int(input("Insert first number: "))
num2 = int(input("Insert second number: "))
i = range(101)
for i in i:
    while i % num1 == 0:
        print("Fizz")
    while i % num2 == 0:
        print("Buzz")
    else:
        print(i)


    #if i % num1 == 0 and i % num2 == 0:
    #    print("FizzBuzz")
    #elif i % num1 == 0:
    #    print("Fizz")
    #elif i % num2 == 0:
    #    print("Buzz")
    #else:
    #    print(i)