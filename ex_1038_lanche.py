dicionario = {
    '1' : 4 ,
    '2' : 4.5 ,
    '3' : 5 , 
    '4' : 2 ,
    '5' : 1.5
}

c, q = input().split()
q = int(q)
print(f'Total: R$ {dicionario[c] * q:.2f}')