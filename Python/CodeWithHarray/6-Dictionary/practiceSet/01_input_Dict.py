myDict = {

    "Book":"Kitab",
    "pankha":"Fan",
    "rassi":"Rope",
    "hava":"Air"
}

print("Meaning of hindi words to english: ")
print(myDict.keys())

a= input("Enter your English word: ")
print(myDict.get(a))