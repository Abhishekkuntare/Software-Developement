
class Sample:
    a = "abhishek"

find = Sample()
find.a = "aniket"
# Sample.a = "aniket" this wiil be print instance of aniket 
print(Sample.a)
print(find.a)