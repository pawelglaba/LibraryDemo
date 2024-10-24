package com.example.librarydemo.libraryWorkers

import com.example.librarydemo.library.Library
import com.example.librarydemo.libraryItems.BorrowStatus
import com.example.librarydemo.libraryItems.LibraryItem

interface Worker {

    fun viewProfile()
    fun addItem(item: LibraryItem, library: Library)
    fun deleteItem(item: LibraryItem, library: Library)
    fun changeItemStatus(item: LibraryItem, library: Library, status: BorrowStatus)

}