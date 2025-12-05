while True:
    try:
        h, m = map(int, input().split(':'))
        acordou = h * 60 + m
        chegada = acordou + 60
        
        encontro = 8 * 60
        if chegada <= encontro:
            atraso = 0
        else:
            atraso = chegada - encontro
        
        print(f"Atraso maximo: {atraso}")
        
    except EOFError:
        break
