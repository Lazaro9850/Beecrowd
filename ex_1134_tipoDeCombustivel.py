combustivel = {
    1 : 'Alcool',
    2 : 'Gasolina',
    3 : 'Diesel',
    4 : 'Fim',
}
a = int(input())

Alcool = 0
Gasolina = 0
Diesel = 0
while a != 4:
    if a in combustivel:
        if a == 1:
            Alcool = Alcool + 1
        elif a == 2:
            Gasolina = Gasolina + 1
        elif a == 3:
            Diesel = Diesel + 1
    a = int(input())

print('MUITO OBRIGADO')
print(f'Alcool: {Alcool}')
print(f'Gasolina: {Gasolina}')
print(f'Diesel: {Diesel}')
