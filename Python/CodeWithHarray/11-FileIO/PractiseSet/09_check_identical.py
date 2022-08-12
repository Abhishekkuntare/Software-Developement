

file1 = ("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\08_this.txt" ) 
file2 = ("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\08_copy.txt" ) 

with open (file1, "r")as f:
    f1 = f.read()

with open(file2, "r") as f:
    f2 = f.read()

if(f1 ==f2):
    print("Files are identical")
else:
    print("Files are not identical")