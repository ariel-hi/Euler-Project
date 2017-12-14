"""
a + b + c = 1000
a + b + sqrt(a^2 + b^2) = 1000
a^2 + b^2 = (1000 - a - b)^2
a^2 + b^2 = 1000000 - 2000a - 200b + a^2 + 2ab + b^2
0 = 1000000 - 2000a - 2000b + 2ab
0 = 1000000 - a(2000 - 2b) - 2000b
a = (1000000 - 2000b) / (2000 - 2b)
a = (500000 - 1000b) / (1000 - b)

Since: a < b < c < 1000, a < 333
"""

target = 1000
for b in range(1, 333):
    a = (500000 - 1000*b) / (1000 - b)
    if a == int(a):
        print(int(a * b * (target - a - b)))
        break