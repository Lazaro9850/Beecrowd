a, b = map(int, input().split())

if a == b:
    duracao = 24
elif a < b:
    duracao = b - a
else:
    duracao = (24-a ) + b

print(f'O JOGO DUROU {duracao} HORA(S)')
