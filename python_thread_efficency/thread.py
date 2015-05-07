import time

from threading import Thread


def loop_it(n):
    while n > 0:
        n -= 1

LOOP_COUNT = 500000000

print LOOP_COUNT//2

thread_one = Thread(target=loop_it, args=(LOOP_COUNT//2, ))
thread_two = Thread(target=loop_it, args=(LOOP_COUNT//2, ))

start_time = time.time()
thread_one.start()
thread_two.start()

thread_one.join()
thread_two.join()

end_time = time.time()
print(end_time - start_time)
