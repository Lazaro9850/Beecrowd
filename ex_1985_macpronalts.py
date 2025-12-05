quant = int(input())

codigos = {
    1001 : 1.5,
    1002 : 2.5,
    1003 : 3.5,
    1004 : 4.5,
    1005 : 5.5
}

cod = 0
q = 0

valor = 0
for codigo in range(quant):
    cod, q = map(int, input().split())
    valor += codigos[cod] * q

print(f'{valor:.2f}')
