def median(a, b, c):
    if (a <= b <= c) or (c <= b <= a):
        return b
    elif (b <= a <= c) or (c <= a <= b):
        return a
    else:
        return c

def iteration():
    show = ""
    total = int(input())
    for i in range(total):
        data = input().split(" ")
        a = int(data[0])
        b = int(data[1])
        c = int(data[2])
        show += f"{median(a, b, c)} "
    return show


def main():
    print(iteration())


if __name__ == "__main__":
    main()