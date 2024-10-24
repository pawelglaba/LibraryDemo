package com.example.librarydemo.libraryWorkers


import com.example.librarydemo.libraryItems.LibraryItem
import java.time.LocalDate


class LibraryReader(userId: Int, name: String) : LibraryUser(userId, name) {

    private val borrowedItems = mutableListOf<LibraryItem>()


    override fun viewProfile() {
        println("Reader: $name, Borrowed Items: ${borrowedItems.size}")
    }

    override fun borrowItem(item: LibraryItem): Boolean {
        if (item.borrow(userId, LocalDate.now().toString())) {
            borrowedItems.add(item)
            println("$name borrowed ${item.title}")
            return true
        } else {
            println("${item.title} allready borrowed or unavailable}")
            return false
        }
    }

    override fun returnItem(item: LibraryItem): Boolean {
        return if (borrowedItems.contains(item) && item.returnItem(
                userId,
                LocalDate.now().toString()
            )
        ) {
            borrowedItems.remove(item)
            println("$name returned ${item.title}")
            true
        } else {
            println("$name cannot return ${item.title}")
            false
        }
    }

}