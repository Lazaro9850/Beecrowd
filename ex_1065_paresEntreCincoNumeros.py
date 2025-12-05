n1 = int(input())
n2 = int(input())
n3 = int(input())
n4 = int(input())
n5 = int(input())



num = [n1, n2, n3, n4, n5]
contador_0 = 0
for index in num:
    if index % 2 == 0:
        contador_0 += 1

print(f'{contador_0} valores pares')
