dias = int(input())

ano = dias // 365
resto = dias % 365
meses = resto // 30
dias = resto % 30

print(f'{ano} ano(s)')
print(f'{meses} mes(es)')
print(f'{dias} dia(s)')
