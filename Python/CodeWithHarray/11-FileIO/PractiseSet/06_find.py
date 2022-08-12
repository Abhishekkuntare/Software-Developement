
with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\06_find.txt","r" ) as f:
    content = f.read().lower()

if "python" in content:
    print("Yes python is present !")
else:
    print("No present !")
