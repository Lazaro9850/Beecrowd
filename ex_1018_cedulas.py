N = int(input())
restante = N

print(N)  # imprime o valor original
for nota in [100, 50, 20, 10, 5, 2, 1]:
    qtd = restante // nota
    restante %= nota
    print(f'{qtd} nota(s) de R$ {nota},00')
