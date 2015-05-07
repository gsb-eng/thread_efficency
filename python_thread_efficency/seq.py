import time


max_size = 5000000


def loop_it(n):
    while n > 0:
        if n > max_size:
            loop(max_size)
            n -= max_size
        else:
            loop(n)
            n = -1


def loop(n):
    for i in xrange(n):
        pass


LOOP_COUNT = 500000000

start_time = time.time()

loop(LOOP_COUNT)

end_time = time.time()

print (end_time - start_time)
