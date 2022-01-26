package com.example.kmmtester

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}