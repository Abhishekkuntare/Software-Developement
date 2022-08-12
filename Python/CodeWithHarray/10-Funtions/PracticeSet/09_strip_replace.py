
def strip_replace(string,word):
    newStr = string.replace(word, "")
    return newStr.strip()

lines = "                  Abhishek are you ready to buy a mercedes       "
name = input("Enter your name :")

if (name in lines):
    print(f"Remove {name} successfully!")
    save = strip_replace(lines,name)
    print(save)
else:
    print("Name is not found in string.")
