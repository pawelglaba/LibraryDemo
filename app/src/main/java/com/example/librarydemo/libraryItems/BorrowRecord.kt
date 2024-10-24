package com.example.librarydemo.libraryItems

data class BorrowRecord(
    val userId: Int,
    val itemId: String,
    val borrowDate: String,
    var returnDate: String?,
    var status: BorrowStatus = BorrowStatus.BORROWED
)
