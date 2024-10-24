package com.example.librarydemo.libraryWorkers

import com.example.librarydemo.library.Library
import com.example.librarydemo.libraryItems.BorrowStatus
import com.example.librarydemo.libraryItems.LibraryItem


class Librarian(userId: Int, name: String, val workShift: String) : LibraryWorker(userId, name) {

    override fun viewProfile() {
        println("Librarian (workerID: $workerId): $name, Work Shift: $workShift")
    }

    override fun addItem(item: LibraryItem, library: Library) {
        super.addItem(item, library)
        println("$name (Librarian) added ${item.title} to the library.")
    }


    override fun deleteItem(item: LibraryItem, library: Library) {
        super.deleteItem(item, library)
        println(" Librarian $name removed item ${item.title} from the system.")
    }

    override fun changeItemStatus(item: LibraryItem, library: Library, status: BorrowStatus) {
        super.changeItemStatus(item, library, status)
        println("Librarian $name changed item's ${item.title} status")
    }


    fun addUser(user: LibraryUser, library: Library) {
        library.users.add(user)
        println("$name (librarian) added user ${user.name} to the system.")
    }


    fun removeUser(user: LibraryUser, library: Library) {
        library.users.remove(user)
        println("$name (Librarian) removed user ${user.name} from the system.")
    }


}





