import random
num = int(random.random()*10)+1
print(num)
userNum = int(input("Please guess a number between 1-10. You have 5 guesses remaining.\n"))
guess = 5
while guess > 0:
    guess -= 1
    if userNum < num:
        print("Too low! You have",guess,"guesses remaining.")
        userNum = int(input())
    elif userNum > num:
        print("Too high! You have",guess,"guesses remaining.")
        userNum = int(input())
    elif userNum == num:
        print("Congrats! You won with",guess,"guesses remaining.")
        exit()
print("Sorry, You couldn't guess the number! You lose.")