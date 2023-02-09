year = int(input("Please input a year.\n"))
if year <= 1582:
    print("Invalid Year.")
elif (year % 4 == 0 and year % 100 != 0) or (year % 4 == 0 and year % 400 == 0):
    print("That's a Leap Year.")
else:
    print("Not a Leap Year.")