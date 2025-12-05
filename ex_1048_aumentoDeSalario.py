salario = float(input())

if salario >= 0 and salario <= 400.00:
    salario_reajustado = salario * 1.15
    ajuste = '15 %'
elif salario >= 400.01 and salario <= 800.00:
    salario_reajustado = salario * 1.12
    ajuste = '12 %'
elif salario >= 800.01 and salario <=1200.00:
    salario_reajustado = salario * 1.10
    ajuste = '10 %'
elif salario >= 1200.01 and salario <= 2000.00:
    salario_reajustado = salario * 1.07
    ajuste = '7 %'
elif salario > 2000.01:
    salario_reajustado = salario * 1.04
    ajuste = '4 %'

print(f'Novo salario: {salario_reajustado:.2f}')
print(f'Reajuste ganho: {salario_reajustado - salario:.2f}')
print(f'Em percentual: {ajuste}')
