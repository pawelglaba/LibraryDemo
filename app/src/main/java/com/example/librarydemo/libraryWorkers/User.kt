package com.example.librarydemo.libraryWorkers
import com.example.librarydemo.libraryItems.LibraryItem

interface User {
    fun borrowItem(item: LibraryItem): Boolean
    fun returnItem(item: LibraryItem): Boolean

}