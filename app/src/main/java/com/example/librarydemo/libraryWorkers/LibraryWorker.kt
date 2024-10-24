package com.example.librarydemo.libraryWorkers

import com.example.librarydemo.library.Library
import com.example.librarydemo.libraryItems.BorrowStatus
import com.example.librarydemo.libraryItems.LibraryItem

abstract class LibraryWorker(val workerId: Int, val name: String) : Worker {

    override fun viewProfile() {
        println("$name is the worker of the Library (ID:$workerId)")
    }

    override fun addItem(item: LibraryItem, library: Library) {
        library.addItem(item)
    }

    override fun deleteItem(item: LibraryItem, library: Library) {
        library.items.remove(item)
    }

    override fun changeItemStatus(item: LibraryItem, library: Library, status: BorrowStatus) {
        item.borrowStatus = status
    }


}