numPlayers = int(input())
numGreat = 0
for x in range(numPlayers):
    pts = int(input())
    fls = int(input())
    if (5 * pts - 3 * fls) > 40:
        numGreat += 1

if numGreat == numPlayers:
    print(str(numGreat) + "+")
else:
    print(numGreat)
