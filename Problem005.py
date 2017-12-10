# destructive
def flatten(lst):
    l = len(lst)
    for i in range(l):
        for j in range(i, l):
            if i == j:
                continue
            if lst[j] % lst[i] == 0:
                lst[j] //= lst[i]

def prod(lst):
    p = 1
    for i in lst:
        p *= i
    return p

lst = [i for i in range(2, 21)]
flatten(lst)
print(prod(lst))
