import random
diceType = int(input("Please select desired die.\n 1. d4\n 2. d6\n 3. d8\n 4. d10\n 5. d12\n 6. d20\n 7. d100\n"))
if diceType >= 0 and diceType <= 7:
    print("Rolling die...")
else:
    print("Invalid.")
    exec(open('app.py').read())
if diceType == 1: result = int(random.random()*4)+1
elif diceType == 2: result = int(random.random()*6)+1
elif diceType == 3: result = int(random.random()*8)+1
elif diceType == 4: result = int(random.random()*10)+1
elif diceType == 5: result = int(random.random()*12)+1
elif diceType == 6: result = int(random.random()*20)+1
else: result = (random.random()*100)+1
print("Result: " + str(result))