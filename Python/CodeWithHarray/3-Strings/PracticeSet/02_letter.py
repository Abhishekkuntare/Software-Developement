name = input("Enter your name: ")
date = input("Enter a data: ")

letter = '''Dear <|Name|>,
\tYou are selected!
\tDate: <|Date|>
Thank You!  '''

letter = letter.replace("<|Name|>",name)
letter = letter.replace("<|Date|>",date)

print(letter)