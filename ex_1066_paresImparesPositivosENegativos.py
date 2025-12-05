n1 = int(input())
n2 = int(input())
n3 = int(input())
n4 = int(input())
n5 = int(input())

num = [n1, n2, n3, n4, n5]
contador_maior_q_0 = 0
contador_menor_q_0 = 0
pares = 0
impares = 0

for index in num:
    if index > 0:
        contador_maior_q_0 += 1
    elif index < 0:
        contador_menor_q_0 += 1
    if index % 2 == 0:
        pares += 1
    else:
        impares += 1

print(f'{pares} valor(es) par(es)')
print(f'{impares} valor(es) impar(es)')
print(f'{contador_maior_q_0} valor(es) positivo(s)')
print(f'{contador_menor_q_0} valor(es) negativo(s)')

