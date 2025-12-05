x, y = map(float, input().split())

if y == x == 0:
    print('Origem')
elif y == 0 or x == 0:
    if y == 0:
        print('Eixo X')
    else:
        print('Eixo Y')
elif y > 0 and x > 0:
    print('Q1')
elif y > 0 and x < 0:
    print('Q2')
elif y < 0 and x > 0:
    print('Q4')
elif y < 0 and x < 0:
    print('Q3')
    