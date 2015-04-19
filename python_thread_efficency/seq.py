import time


def loop_it(n):
    while n > 0:
        n -= 1

LOOP_COUNT = 50000000

start_time = time.time()

loop_it(LOOP_COUNT)

end_time = time.time()

print (end_time - start_time)
