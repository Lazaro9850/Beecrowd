while True:
   try:
        linha = int(input())
        if linha == 0:
            print('vai ter copa!')
        else:
            print('vai ter duas!')
   except EOFError:
       break
 