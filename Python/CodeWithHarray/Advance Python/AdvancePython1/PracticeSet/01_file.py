def readFile(fileName):
    try:
        with open(fileName ,"r") as f:
            print(f.read())
    except FileNotFoundError:
        print(f"File {fileName} not found!")

a = readFile("F:\\Software Developer\\Abhishek's Code\\Python\\Advance Python\\TryAndExcept\\PracticeSet\\1.txt",)



c = readFile("F:\\Software Developer\\Abhishek's Code\\Python\\Advance Python\\TryAndExcept\\PracticeSet\\3.txt",)


b = readFile("F:\\Software Developer\\Abhishek's Code\\Python\\Advance Python\\TryAndExcept\\PracticeSet\\2.txt",)



    
