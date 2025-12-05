a, b = map(int, input().split())

r1 = a % b
r2 = b % a
if r1 == 0 or r2 == 0:
    print('Sao Multiplos')
else:
    print('Nao sao Multiplos')