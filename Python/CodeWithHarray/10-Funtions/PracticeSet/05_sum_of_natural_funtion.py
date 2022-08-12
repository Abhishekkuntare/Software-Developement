

def sum_of_numbers(n):
    sum = 0
    for i in range(0,n):
        sum+=i
        print(sum , end=" ")


n = int(input("Enter a number: "))
sum_of_numbers(n)