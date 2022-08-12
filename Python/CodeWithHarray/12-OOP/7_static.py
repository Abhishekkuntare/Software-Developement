import time
class Employee:

    @staticmethod
    def greet(sign):# we also add the parameters in static method 
        print(f"Hello how are you ? : {sign} ")

    @staticmethod
    def time():
        seconds = time.time()
        # print("Seconds since epoch =", seconds)	
        seconds = 1664705169.9618232
        local_time = time.ctime(seconds)
        print("Local time:", local_time)
    
    @staticmethod
    def name():
        print("your name is abhishek!")


abhishek = Employee()
abhishek.greet("nope")  #Employee.greet()
abhishek.time()
abhishek.name()





