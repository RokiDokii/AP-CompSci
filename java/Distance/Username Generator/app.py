firstName = input("Please enter your first name: ")
lastName = input("Please enter your last name: ")
luckyNum = len(firstName) + len(lastName)
reverseIntials = firstName[len(firstName)-1] + lastName[len(lastName)-1]
print("Your lucky number: " + str(luckyNum))
print("Reverse Intials: " + str(reverseIntials.upper()))
print("Username: " + firstName[0:int(len(firstName)/2)] + lastName[int(len(lastName)/2):len(lastName)])