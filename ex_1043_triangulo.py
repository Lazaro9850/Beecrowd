A, B, C = map(float, input().split())

maior = [A, B, C]
maior.sort()
p = A + B + C
if maior[2] < maior[0] + maior[1]:
    print(f'Perimetro = {p:.1f}')
else:
    print(f'Area = {((A + B) * C) / 2}')
    