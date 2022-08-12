


class Account:
    def accountName(self):
            self.name = input("Enter your name: ")
            return self.name
    


class Library:
    def __init__(self,listOfBooks):
        self.listOfBooks = listOfBooks

    def displayBooks(self):
        print("Books are present in the library are: ")
        for book in self.listOfBooks:
            print(book)
   
    def borrowBook(self,bookName):
        try:
            if(bookName in self.listOfBooks):
                print(f"You have been issued {bookName} book keep it safe and return within 30 days!")
                self.listOfBooks.remove(bookName)
            elif(bookName != self.listOfBooks):
                print(f"Sorry, This book is not in the collection of list. Please choose book in the collection of list.")
  
            else:
                print(f"Sorry, {bookName} book is already has been issued for someone. Please wait until the book is returned.")
        except Exception as e:
            print("Invalid Choice! Please select the correct choice you have to given.")

    def returnBook(self,bookName):
        self.listOfBooks.append(bookName)
        print(f"Thanks for returning the {bookName} book! Hope you enjoyed reading it . Have a nice day!")
    
    def addBook(self,bookName):
        self.listOfBooks.append(bookName)
        print(f"You have been added the {bookName} book for Hawking Library, Thanks.")
    

    def createAccount(self,name):
        def __init__(self,name):
            self.name = name
            print(f"your name is added {name}")

            
    def displayUserDetails(self):
        print("User Details are: ")
        for user in self.name:
            print(user)

class Student:
    def requestBook(self):
        self.book = input("Enter the name of book you want to borrow: ")
        return self.book
    
    def returnBook(self):
        self.book = input("Enter the name of book you want to return: ")
        return self.book
    
    def addBook(self):
        self.book = input("Enter the name of book for donate/add in the Hawking's library: ")
        return self.book
    

if __name__ == "__main__":

    HawkingLibrary = Library(["Python", "Flask", "TenserFlow", "Django"])
    student = Student()
    account = Account()



    while(True):
        welcomeMsg = '''========Welcome to Hawking Library========
        Please Choose an option:
        1. Listing all the books
        2. Request the book
        3. Return a book
        4. Add a book
        5: Create a Account
        6: Display user Details
        7. Exit the Library'''
        print(welcomeMsg)

        try:

            a = int(input("Enter a choice: "))
            if a==1:
                HawkingLibrary.displayBooks()
            elif a==2:
                HawkingLibrary.borrowBook(student.requestBook())
            elif a==3:
                HawkingLibrary.returnBook(student.returnBook())
            elif a==4:
                HawkingLibrary.addBook(student.addBook())
            elif a==5:
                HawkingLibrary.createAccount(account.accountName())
            elif a==6:
                HawkingLibrary.displayUserDetails()

            elif a==7:
                print("Thanks for choosing Hawking library. Have a great day ahead!")
                exit()
            else:
                print("Invalid Choice!")
        except Exception as e:
            print(e)


