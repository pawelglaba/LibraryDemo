package com.example.librarydemo.library

import com.example.librarydemo.libraryItems.BorrowRecord
import com.example.librarydemo.libraryItems.BorrowStatus
import com.example.librarydemo.libraryItems.LibraryItem
import com.example.librarydemo.libraryWorkers.LibraryUser
import com.example.librarydemo.libraryWorkers.LibraryWorker

class Library {

    val items = mutableListOf<LibraryItem>()
    val users = mutableListOf<LibraryUser>()
    val workers = mutableListOf<LibraryWorker>()


    fun addItem(item: LibraryItem) {
        items.add(item)
        println("${item.title} has been added to the library.")
    }


    fun addUser(user: LibraryUser) {
        users.add(user)
        println("${user.name} has been added to the system.")
    }


    fun removeUser(user: LibraryUser) {
        if (users.contains(user)) {
            users.remove(user)
            println("${user.name} has been removed from the system.")
        } else {
            println("${user.name} is not in the system.")
        }
    }


    fun listItems() {
        if (items.isNotEmpty()) {
            println("Items in the library:")
            for (item in items) {
                println("- ${item.title} (Status: ${item.borrowStatus})")
            }
        } else {
            println("The library has no items.")
        }
    }


    fun listUsers() {
        if (users.isNotEmpty()) {
            println("Users in the system:")
            for (user in users) {
                println("- ${user.name}")
            }
        } else {
            println("No users in the system.")
        }
    }


}





