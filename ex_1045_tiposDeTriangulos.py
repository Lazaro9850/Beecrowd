a, b, c = map(float, input().split())

o = [a, b, c]
o.sort()
 

if o[2] < o[0] + o[1]:
    if o[2] ** 2 == (o[1] ** 2) + (o[0] ** 2):
        print('TRIANGULO RETANGULO')
    elif o[2] ** 2 >= (o[1] ** 2) + (o[0] ** 2):
        print('TRIANGULO OBTUSANGULO')
    elif o[2] ** 2 <= (o[1] ** 2) + (o[0] ** 2):
        print('TRIANGULO ACUTANGULO')
else:
    print('NAO FORMA TRIANGULO')

if a == b == c:
    print('TRIANGULO EQUILATERO')
elif a == b or a == c or b == c:
    print('TRIANGULO ISOSCELES')
    