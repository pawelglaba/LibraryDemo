package com.example.librarydemo.libraryWorkers

abstract class LibraryUser(val userId: Int, val name: String) : User {

    abstract fun viewProfile()
}

