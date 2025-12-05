dia_de_inicio = int(input().split()[1])
hora_de_inicio, minuto_de_inicio, segundo_de_inicio = map(int, input().split(' :'))

dia_de_termino = int(input().split()[1])
hora_de_termino, minuto_de_termino, segundo_de_termino = map(int, input().split(' :'))


segundos_totais_do_inicio = (( hora_de_inicio * 3600) + (minuto_de_inicio * 60) + segundo_de_inicio)
segundos_totais_do_termino = (( hora_de_termino * 3600) + (minuto_de_termino * 60) + segundo_de_termino)
segundos_totais = (segundos_totais_do_termino - segundos_totais_do_inicio) + ((dia_de_termino - dia_de_inicio) * 86400)



if segundos_totais < 0:
    segundos_totais += 86400
    dias_totais = segundos_totais // 86400
    resto = segundos_totais % 86400
    horas_totais = resto // 3600
    resto = resto % 3600
    minutos_totais = resto // 60
    resto = resto % 60

    print(f'{dias_totais} dia(s)')
    print(f'{horas_totais} hora(s)')
    print(f'{minutos_totais} minuto(s)')
    print(f'{resto} segundo(s)')
else:
    dias_totais = segundos_totais // 86400
    resto = segundos_totais % 86400
    horas_totais = resto // 3600
    resto = resto % 3600
    minutos_totais = resto // 60
    resto = resto % 60

    print(f'{dias_totais} dia(s)')
    print(f'{horas_totais} hora(s)')
    print(f'{minutos_totais} minuto(s)')
    print(f'{resto} segundo(s)')

