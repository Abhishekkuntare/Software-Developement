content = True

i =1
with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\07_readline.txt","r" ) as f:
    while content:
        content = f.readline()
        if "python" in content.lower():
            print(content)
            print(f"yes python is present in {i}")
        i+=1