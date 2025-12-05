n = float(input())

inteiro = int(n)
decimal = round((n - inteiro) * 100)
print('NOTAS:')
for nota in [100, 50, 20, 10, 5, 2]:
    qnt = n // nota
    n = n % nota
    print(f'{qnt:.0f} nota(s) de R$ {nota}.00')

n = int(n)
print('MOEDAS:')
if n == 1:
    print('1 moeda(s) de R$ 1.00')
else:
    print('0 moeda(s) de R$ 1.00')
for moeda in [50, 25, 10, 5, 1]:
    qnt = decimal // moeda
    decimal = decimal % moeda
    m = float(-moeda * (-0.01) )
    print(f'{qnt} moeda(s) de R$ {m:.2f}')
