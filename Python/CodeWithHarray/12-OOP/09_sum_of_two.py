class Number:
    def sum_of_two(self):
        print(f"sum of {self.num1} + {self.num2} = {self.num1 + self.num2}")

add = Number()
add.num1 = int(input("Enter a num1: "))
add.num2 = int(input("Enter a num2: "))
add.sum_of_two()
