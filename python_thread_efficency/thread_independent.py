'''
This programme runs independent statemenst in parallel.
'''
import time
from threading import Thread


MAX_NUM = 5000000


def loop_it(num):
    st = time.time()
    while num > 0:
        num -= 1
    print(time.time() - st)


def sum_of_n_digits(n):
    sum = 0
    st = time.time()
    while n > 0:
        sum += n
        n -= 1
    print(sum)
    print(time.time() - st)


def sum_of_squares(n):
    sum = 0
    st = time.time()
    while n > 0:
        sum += n * n
        n -= 1
    print(sum)
    print(time.time() - st)


def parallel_run():
    start_time = time.time()
    t1 = Thread(target=loop_it, args=(5000000*10, ))
    t1.start()

    t2 = Thread(target=sum_of_n_digits, args=(5000000*10, ))
    t2.start()

    t3 = Thread(target=sum_of_squares, args=(5000000*10, ))
    t3.start()

    t1.join(); t2.join(); t3.join()
    end_time = time.time()
    print end_time - start_time

if __name__ == "__main__":
    parallel_run()
