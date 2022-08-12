
# 1 we create a class 
class Railway:
    formart = "Real railways"
    # 4 create a function for printing data 
    def printAbhishekApplicationData(self):
        print(f" Your Name:- {self.name}")
        print(f" Your Train:- {self.train}")
        print(f" Your Time:- {self.time}")


#2 create a object for takes a class 
abhishekApplication = Railway()

# 3 gives objects data for printing 
abhishekApplication.name = "Abhishek Pravin Kuntare"
abhishekApplication.train = "Mumbai Express"
abhishekApplication.time = 12.03

#5 calling a function for printing the data 
abhishekApplication.printAbhishekApplicationData()
