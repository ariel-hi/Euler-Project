prev = 1
curr = 2
total = 2
while curr < 4000000:
    temp = curr
    curr = prev + curr
    prev = temp
    if curr % 2 == 0:
        total += curr
print(total)
