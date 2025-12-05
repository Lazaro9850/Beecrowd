n1, n2, n3 = map(int, input().split())

lista = [n1, n2, n3]
lista.sort()

if lista[2] == lista[0] + lista[1]:
    print('S')
elif  lista[1] == lista[0] or  lista[1] == lista[2]:
    print('S')
else:
    print('N')
    