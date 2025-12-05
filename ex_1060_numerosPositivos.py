n1 = float(input())
n2 = float(input())
n3 = float(input())
n4 = float(input())
n5 = float(input())
n6 = float(input())

num = [n1, n2, n3, n4, n5, n6]
contador_0 = 0
for index in num:
    if index > 0:
        contador_0 += 1

print(f'{contador_0} valores positivos')

