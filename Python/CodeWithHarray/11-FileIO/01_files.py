
# important gives a full path for read and write files

# use open funtion read the content of file 
# f = open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\sample.txt" , "r")

# by default the mode is "r"
f = open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\sample.txt" )
# data = f.read()
data = f.read(5) #reads first 5 characters from the file
print(data)
f.close()