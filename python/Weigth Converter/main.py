weight = float(input("Weight: "))
unit = input("(K)g or (L)bs: ")
if unit.upper() == 'L':
    kg = weight * 0.45
    print('Weight in Kg: ' + str(kg))
elif unit.upper() == 'K':
    lbs = weight / 0.45
    print('Weight in Lbs: ' + str(lbs))
else:
    print("Invalid Response.")
input()