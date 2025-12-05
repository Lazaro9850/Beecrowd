hora_inicio, minuto_inicio, hora_final, minuto_final = map(int, input().split())

inicio = hora_inicio * 60 + minuto_inicio
fim = hora_final * 60 + minuto_final

duracao = fim - inicio
if duracao <= 0:  
    duracao += 24 * 60  

duracao_horas = duracao // 60
duracao_minutos = duracao % 60

print(f'O JOGO DUROU {duracao_horas} HORA(S) E {duracao_minutos} MINUTO(S)')
