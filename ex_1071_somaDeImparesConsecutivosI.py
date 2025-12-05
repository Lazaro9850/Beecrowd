inicio = int(input())
termino = int(input())

# trabalhar com o intervalo entre os dois, independentemente da ordem
low = min(inicio, termino) + 1
high = max(inicio, termino)

soma = 0
for i in range(low, high):
    if i % 2 != 0:        # ímpar
        soma += i

print(soma)

