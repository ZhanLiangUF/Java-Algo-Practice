n = 999
returnNumber = 1
counter = 0
while len(str(n)) > 1:
    for digit in str(n):
        returnNumber = int(digit) * returnNumber
    n = returnNumber
    counter += 1
    returnNumber = 1
print counter
