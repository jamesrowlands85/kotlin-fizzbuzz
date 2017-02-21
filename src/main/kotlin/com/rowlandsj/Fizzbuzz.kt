package com.rowlandsj

class Fizzbuzz {

    private val three = 3
    private val five = 5

    fun calculateFizzBuzz(input: Int): String {
        if(input % (three * five) == 0) {
            return "fizz buzz"
        }
        if(input % three == 0) {
            return "fizz"
        }
        else if(input % five == 0) {
            return "buzz"
        }

        return input.toString()
    }

}
