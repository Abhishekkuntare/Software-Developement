import os

oldName = ("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\sample2.txt" ) 
newName = ("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\remove_by_python.txt" ) 

with open (oldName, "r")  as f:
    content = f.read()

with open (newName, "w") as f:
    f.write(content)

os.remove(oldName)

