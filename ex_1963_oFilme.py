inicio, final = map(float, input().split())
dif = inicio - final
porcentagem = (100 * dif) / inicio
if porcentagem < 0:
    porcentagem = porcentagem * - 1
print(f'{porcentagem:.2f}%') 
