def sumsq(n):
    return sum([i**2 for i in range(1, n+1)])

def sqsum(n):
    return int((n * (n+1)/2) ** 2)

print(sqsum(100) - sumsq(100))
