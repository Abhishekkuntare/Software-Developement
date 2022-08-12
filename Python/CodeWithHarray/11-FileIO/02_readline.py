
f = open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\sample.txt", "r" )

# Read first line 
data = f.readline()
print(data , end="")

# Read second line 
data = f.readline()
print(data)
f.close()