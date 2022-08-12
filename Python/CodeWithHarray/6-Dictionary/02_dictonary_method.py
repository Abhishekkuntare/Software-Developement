
myDict = {
    "lang":"python",
    "fav":"html",
    "love":"programming",
    "dream":{"Mercedes":"Dubai"},
    3:3,

}
print((myDict.keys())) #default type was dict_keys{} prints the keys of the dict

print("\n")
# print(list(myDict.keys())) #typecast in list[]
# print(tuple(myDict.keys())) #typecast in tuple()

print(myDict.values()) #print all the values in content

print("\n")
print(myDict.items()) #print the all (key,values) in content

print(myDict)
updateDict ={
    "City":"Dubai",
    "Car":"Mercedes",
    "love":"Money",
}
myDict.update(updateDict)  #added the key,values in content
print(myDict)

print(myDict.get("love")) #Prints the the value of key
print(myDict["love"])

# The difference between .get() and [] syntax is 
print(myDict.get("love1")) # returns a None when key is not present
# print(myDict["love1"]) #returns a Error when key is not present