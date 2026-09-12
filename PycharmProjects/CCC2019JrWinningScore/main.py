a1 = int(input())
a2 = int(input())
a3 = int(input())
b1 = int(input())
b2 = int(input())
b3 = int(input())

totalA = a1*3 + a2*2 + a3
totalB = b1*3 + b2*2 + b3

if totalA > totalB:
    print("A")
elif totalB > totalA:
    print("B")
else:
    print("T")
