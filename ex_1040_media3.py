N1, N2, N3, N4 = map(float, input().split())

media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1) ) / 10

print(f'Media: {media:.1f}')

if media >= 7:
    print('Aluno aprovado.')
elif 5 <= media <= 6.9:

    print('Aluno em exame.')
    exame = float(input())
    print(f'Nota do exame: {exame:.1f}')
    exame = (media + exame) / 2

    if media >= 5:
        print('Aluno aprovado.')
        print(f'Media final: {exame}')
    else:
        print('Aluno reprovado.')
        print(f'Media final: {exame}')    
else:
    print('Aluno reprovado.')
