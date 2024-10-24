package com.example.librarydemo.libraryItems

abstract class LibraryItem {

    abstract val id: String
    abstract val title: String
    abstract var borrowStatus: BorrowStatus


    val borrowHistory = mutableListOf<BorrowRecord>()

    open fun borrow(userId: Int, borrowDate: String): Boolean {
        return if (borrowStatus == BorrowStatus.AVAILABLE) {
            borrowStatus = BorrowStatus.BORROWED
            val record = BorrowRecord(
                userId = userId,
                itemId = id,
                borrowDate = borrowDate,
                returnDate = null,
                status = BorrowStatus.BORROWED
            )
            borrowHistory.add(record)
            true
        } else
            false
    }


    open fun returnItem(userId: Int, returnDate: String): Boolean {
        val lastBorrow = borrowHistory.lastOrNull { it.status == BorrowStatus.BORROWED }
        return if (lastBorrow != null && borrowStatus == BorrowStatus.BORROWED) {
            borrowStatus = BorrowStatus.AVAILABLE
            lastBorrow.returnDate = returnDate
            lastBorrow.status = BorrowStatus.AVAILABLE
            println("$title has been returned by User ID $userId on $returnDate.")
            true
        } else {
            println("$title was not borrowed.")
            false
        }
    }


    open fun listBorrowHistory() {
        if (borrowHistory.isNotEmpty()) {
            println("Borrow history for $title:")
            borrowHistory.forEach { record ->
                println("User ID: ${record.userId}, Borrow Date: ${record.borrowDate}, Return Date: ${record.returnDate ?: "Not Returned"}, Status: ${record.status}")
            }
        } else {
            println("No borrow history for $title.")
        }
    }
}