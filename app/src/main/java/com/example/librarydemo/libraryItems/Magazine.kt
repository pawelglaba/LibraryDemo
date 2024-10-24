package com.example.librarydemo.libraryItems

class Magazine(
    override val id: String, override val title: String,
    val issueNumber: Long, val category: String, override var borrowStatus: BorrowStatus
) : LibraryItem() {


    override fun borrow(userId: Int, borrowDate: String): Boolean {
        val message = super.borrow(userId, borrowDate)
        if (message) {
            println("Magazine $title (issue number: $issueNumber) borrowed successfully")
        } else println(println("Magazine $title (issue number: $issueNumber) is not available"))
        return message
    }

    override fun returnItem(userId: Int, returnDate: String): Boolean {
        val message = super.returnItem(userId, returnDate)
        if (message) {
            println("Magazine $title (issue number: $issueNumber) is returned successfully")
        } else println("Magazine $title return failed")
        return message
    }
}





