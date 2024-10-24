package com.example.librarydemo.library

import com.example.librarydemo.libraryItems.Book
import com.example.librarydemo.libraryItems.BorrowStatus
import com.example.librarydemo.libraryItems.Ebook
import com.example.librarydemo.libraryItems.Magazine
import com.example.librarydemo.libraryWorkers.Administrator
import com.example.librarydemo.libraryWorkers.Librarian
import com.example.librarydemo.libraryWorkers.LibraryReader

fun main() {
    val book = Book(
        id = "1",
        title = "Kotlin for Beginners",
        author = "John Doe",
        "Programming",
        borrowStatus = BorrowStatus.AVAILABLE
    )
    val ebook = Ebook(
        id = "2",
        title = "Mastering Kotlin",
        fileSizeMB = 5.0,
        format = "PDF",
        borrowStatus = BorrowStatus.AVAILABLE
    )
    val magazine = Magazine(
        "3",
        "How to pass a Mobile Application Development course?",
        12345,
        "Programming",
        borrowStatus = BorrowStatus.RESERVED
    )

    // Create librarian and administrator
    val librarian = Librarian(userId = 1, name = "Bob", workShift = "Morning")
    val admin = Administrator(userId = 2, name = "Alice")
    val reader = LibraryReader(3, "Pawel")


    // Create library
    val library = Library()
   // library.addItem(book)



    // Librarian adds items to the library
    librarian.addItem(book, library)
    librarian.addItem(ebook, library)
    librarian.addItem(magazine, library)

    library.listItems()


    // Admin adds librarian as a user in the system
    admin.addWorker(librarian, library)
    admin.addWorker(admin, library)
    librarian.addUser(reader, library)

    library.listUsers()

    reader.borrowItem(book)
    reader.borrowItem(book)

    //book.listBorrowHistory()

   // reader.returnItem(book)
   // book.listBorrowHistory()

    //admin.removeWorker(librarian,Library())

    //book.reserveBook(reader.name)


}