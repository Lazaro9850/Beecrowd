i = float(input())

if i <= 2000.00:
    print('Isento')
elif i <= 3000.00:
    print(f'R$ {(i - 2000) * 0.08:.2f}')
elif i <= 4500.00:
    print(f'R$ {80 + (i - 3000) * 0.18:.2f}')
else:
    print(f'R$ {350 + (i - 4500) * 0.28:.2f}')
    