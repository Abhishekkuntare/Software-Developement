

text = input("Enter your text: ")
if(text == "make a lot of money"):
    print("it it a spam")
elif(text == "buy now"):
    print("it is a spam")
elif(text == "Subscribe this"):
    print("it is a spam")
elif("follow me" in text):
    print("It is a spam", text)
elif("like a video" in text):
    print("it is a spam", text)
else:
    ("it is not a spam")
