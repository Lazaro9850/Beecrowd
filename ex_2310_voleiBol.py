qnt = int(input())

estatistica = {
    'saque' : [0, 0],
    'bloqueio' : [0, 0],
    'ataque' : [0, 0]
}

for i in range(qnt):
    jogador = input()
    t_saque, t_bloq, t_atk = map(int, input().split())
    s_saque, s_bloq, s_atk = map(int, input().split())
    
    estatistica['saque'][0] = estatistica['saque'][0] + t_saque
    estatistica['saque'][1] = estatistica['saque'][1] + s_saque

    estatistica['bloqueio'][0] = estatistica['bloqueio'][0] + t_bloq
    estatistica['bloqueio'][1] = estatistica['bloqueio'][1] + s_bloq

    estatistica['ataque'][0] = estatistica['ataque'][0] + t_atk
    estatistica['ataque'][1] = estatistica['ataque'][1] + s_atk

ponto_s = (estatistica['saque'][1] / estatistica['saque'][0]) * 100
ponto_b = (estatistica['bloqueio'][1] / estatistica['bloqueio'][0]) * 100
ponto_a = (estatistica['ataque'][1] / estatistica['ataque'][0]) * 100

print(f'Pontos de Saque: {ponto_s:.2f} %.')
print(f'Pontos de Bloqueio: {ponto_b:.2f} %.')
print(f'Pontos de Ataque: {ponto_a:.2f} %.')