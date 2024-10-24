package com.example.librarydemo.libraryItems

class Ebook(
    override val id: String, override val title: String,
    val fileSizeMB: Double, val format: String, override var borrowStatus: BorrowStatus
) : LibraryItem() {

    override fun borrow(userId: Int, borrowDate: String): Boolean {
        val message = super.borrow(userId, borrowDate)
        if (message) {
            println("eBook $title is borrowed successfully")
        } else println("eBook $title  is not available")
        return message
    }

    override fun returnItem(userId: Int, returnDate: String): Boolean {
        val message = super.returnItem(userId, returnDate)
        if (message) {
            println("eBook $title is returned successfully")
        } else println("eBook $title  return failed")
        return message
    }


}



