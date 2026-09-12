num = 0
for x in range(6):
    if input() == "W":
        num += 1

if num == 1 or num == 2:
    print(3)
elif num == 3 or num == 4:
    print(2)
elif num == 5 or num == 6:
    print(1)
else:
    print(-1)


