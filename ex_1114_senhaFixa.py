senha = 2002
a = 0
while a != senha:
    a = int(input())
    if senha == a:
        print('Acesso Permitido')
        break
    print('Senha Invalida')
