n1 = float(input())
n2 = float(input())
n3 = float(input())
n4 = float(input())
n5 = float(input())
n6 = float(input())

num_positivo = []
num = [n1, n2, n3, n4, n5, n6]
contador_0 = 0
for index in num:
    if index > 0:
        contador_0 += 1
        num_positivo.append(index)

media = 0
for numero in num_positivo:
    media += numero

media = media / len(num_positivo)

print(f'{contador_0} valores positivos')
print(f'{media:.1f}')
