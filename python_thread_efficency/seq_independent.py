'''
This programme runs different independent statemenst in sequence.
'''
import time


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


def seq_run():
    start_time = time.time()
    loop_it(MAX_NUM*10)
    print("Loop completed")

    sum_of_n_digits(MAX_NUM*10)
    print("Sum completed")

    sum_of_squares(MAX_NUM*10)
    print("Sum of squares completed")

    end_time = time.time()
    print end_time - start_time


if __name__ == "__main__":
    seq_run()
