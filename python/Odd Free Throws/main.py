gamepoints = []
rounds = int(input("How many rounds of games were there? "))
for items in range(1, rounds + 1):
    throws = int(input("In game "+ str(items) + ", How many free throws did you make? "))
    gamepoints.append(throws)
average = (sum(gamepoints)) / len(gamepoints)
print("\nWow! Your average number of free throws is " + str(average) + "!")
print("As an integer, the average is " + str(int(average)))
print("Printing 0 for even, and 1 for odd: " + str(int(average % 2)))
input()