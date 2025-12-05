qnt = int(input())


musicas = {
    0 : 'PROXYCITY',
    1 : 'P.Y.N.G.',
    2 : 'DNSUEY!',
    3 : 'SERVERS',
    4 : 'HOST!',
    5 : 'CRIPTONIZE',
    6 : 'OFFLINE DAY',
    7 : 'SALT',
    8 : 'ANSWER!',
    9 : 'RAR?',
    10 : 'WIFI ANTENNAS'
}

for i in range(qnt):
    s1, s2 = map(int, input().split())
    soma = s1 + s2
    print(musicas[soma])
    