n = int(input())

T = []

for i in range(1):
    for index in range(n):
        temp = int(input())
        if temp >= 0 or temp <= 2**31:
            T.append(temp)
    for ano in T:
        if ano > 2015:
            ano = ano - 2014
            contagem = ano
            print(f'{ano} A.C.')
        elif ano == 2015:
            print(f'1 A.C.')
        else:
            ano = 2015 - ano
            contagem = ano
            print(f'{ano} D.C.')