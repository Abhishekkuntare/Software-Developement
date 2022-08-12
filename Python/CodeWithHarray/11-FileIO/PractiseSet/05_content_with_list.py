



words = ["kutta","sale","kamine","kaddu"]

with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\05_content_read.txt", "r" ) as f :
    content = f.read()

for word in words:
    content =  content.replace(word,"%*#&#&#&&")
    with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\05_content_read.txt", "w" ) as f :
        f.write(content)

    


