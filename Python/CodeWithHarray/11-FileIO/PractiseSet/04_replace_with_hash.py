
# with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\04_content.txt" ) as f:
#     content = f.read()
#     content = content.replace("kutta", "#%*&@$!")

# with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\04_content.txt", "w" ) as f :
#     f.write(content)

with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\04_content.txt" ) as f:
    data = f.read()
    data = data.replace("donkey","@$(@^$*")
    with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\04_content.txt", "w" ) as f:
        f.write(data)

 
   