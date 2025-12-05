aba, cliques = map(int, input().split())

contador = {
    'p' : [0],
    's' : [0]
}
for oq in range(cliques):
    acao = input()
    if acao == "fechou":
        contador['s'][0] = contador['s'][0] + 1
    else:
        contador['p'][0] = contador['p'][0] + 1
paginas = 0
if contador['p'][0] >= contador['s'][0]:
    paginas = contador['p'][0] - contador['s'][0]
else:
    paginas = contador['s'][0] - contador['p'][0]

resto = aba - paginas
if aba < 0:
    print('0')
else:
    print(resto)