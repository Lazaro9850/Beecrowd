n = int(input())
lista = []
dentro = 0
fora = 0
for i in range(n):
    x = int(input())
    lista.append(x)
    if x >= 10 and x <= 20:
        dentro = 1 + dentro
    else:
        fora = 1 + fora

print(f'{dentro} in')
print(f'{fora} out')