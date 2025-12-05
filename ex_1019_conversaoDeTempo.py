N = int(input())
s = (N % 60) % 60 
print(f'{N // 3600}:{(N % 3600) // 60}:{s}')
