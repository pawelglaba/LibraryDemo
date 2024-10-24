package com.example.librarydemo.libraryWorkers

import com.example.librarydemo.library.Library

class Administrator(userId: Int, name: String) : LibraryWorker(userId, name) {


    override fun viewProfile() {
        println("Administrator: $name")
    }

    fun addWorker(worker: LibraryWorker, library: Library) {
        library.workers.add(worker)
        println("$name (Administrator) added user ${worker.name} to the system.")
    }

    fun removeWorker(worker: LibraryWorker, library: Library) {
        library.workers.remove(worker)
        println("$name (Administrator) removed user ${worker.name} from the system.")
    }




}