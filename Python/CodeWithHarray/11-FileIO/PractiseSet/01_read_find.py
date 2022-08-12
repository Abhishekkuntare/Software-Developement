

# f = open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\poem.txt" )

with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\poem.txt" ) as f:
        
    data = f.read()
    if ("Twinkle") in data:
        print("Twinkle is present !")
    else:
        print("Twinkle is not present!")
    # print(data)
# f.close()


