package com.example.librarydemo.libraryItems

class Book(
    override val id: String, override val title: String,
    val author: String, val genre: String, override var borrowStatus: BorrowStatus
) : LibraryItem() {

    override fun borrow(userId: Int, borrowDate: String): Boolean {
        val message = super.borrow(userId, borrowDate)
        if (message) {
            println("Book $title written by $author is borrowed successfully")
        } else println("Book $title written by $author is not available")
        return message
    }

    override fun returnItem(userId: Int, returnDate: String): Boolean {
        val message = super.returnItem(userId, returnDate)
        if (message) {
            println("Book $title written by $author is borrowed successfully")
        } else println("Book $title written by $author is not available")
        return message
    }

    fun reserveBook(userName: String): Boolean {
        if (borrowStatus == BorrowStatus.AVAILABLE) {
            println("Book $title written by $author is reserved successfully by $userName")
            borrowStatus = BorrowStatus.RESERVED
            return true
        } else {
            println("Book $title written by $author is not available")
            return false
        }
    }
}








