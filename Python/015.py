#busqueda del numero menor
def num_min(nums):
    temp = int(nums[0])
    min = 0
    for i in range(len(nums)):
        if int(nums[i]) < temp:
            min = int(nums[i])
            temp = min
        else:
            min = temp
    return min

#busqueda del numero mayor
def num_max(nums):
    temp = int(nums[0])
    max = 0
    for i in range(len(nums)):
        if int(nums[i]) > temp:
            max = int(nums[i])
            temp = max
        else:
            max = temp
    return max


def itaration():
    data = input().split(" ")  # Recibir y separar datos
    return f"{num_max(data)} {num_min(data)}"


def main():
    print(itaration())


if __name__ == "__main__":
    main()
