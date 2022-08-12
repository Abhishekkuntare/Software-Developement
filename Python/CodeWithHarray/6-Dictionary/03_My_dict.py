

MyBio = {
    "Name":'''Abhishek Pravin Kuntare''',
    "Email":"abhishekkuntare7@gmail.com",
    "Passion":"Programming",
    "Dreams":{"Dream1":"Mercedes","Dream2":"Dubai" },
    "Number":[9823028110]
}
# print(MyBio["Dreams"]["Dream1"])
# print(MyBio["Dreams"]["Dream2"])
print(MyBio)
updateBio={
    "Do":"Full-Stack WebDeveloper",
    "Love":"Family"
}
MyBio.update(updateBio)
print(MyBio)
print(MyBio.get("Number"))