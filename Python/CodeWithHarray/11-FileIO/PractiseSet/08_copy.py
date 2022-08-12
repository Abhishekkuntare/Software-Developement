
with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\08_this.txt","r" ) as f:
    content = f.read()

with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\08_copy.txt","w" ) as f:
    f.write(content)