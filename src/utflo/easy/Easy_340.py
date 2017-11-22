inputString = input()
charsInString = []

for letter in inputString:
    if letter in charsInString:
        print("{} is the first recurring character.".format(letter))
        print("The first occurence of {} is at position {}.".format(letter, charsInString.index(letter)))
        break
    else:
        charsInString.append(letter)
else:
    print("No recurring characters.")
