package com.rowlandsj

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(JUnitPlatform::class)
class FizzbuzzSpecs : Spek({

    describe("a fizz buzz calculation") {
        val fizzbuzz = Fizzbuzz()

        it("should return 1 when passed the number 1") {
            val expected = fizzbuzz.calculateFizzBuzz(1)
            assertEquals("1", expected)
        }

        it("should return 2 when passed the number 2") {
            val expected = fizzbuzz.calculateFizzBuzz(2)
            assertEquals("2", expected)
        }

        it("should return fizz when passed the number 3") {
            val expected = fizzbuzz.calculateFizzBuzz(3)
            assertEquals("fizz", expected)
        }

        it("should return buzz when passed the number 5") {
            val expected = fizzbuzz.calculateFizzBuzz(5)
            assertEquals("buzz", expected)
        }

        it("should return fizz when passed the number 6") {
            val expected = fizzbuzz.calculateFizzBuzz(6)
            assertEquals("fizz", expected)
        }

        it("should return buzz when passed the number 10") {
            val expected = fizzbuzz.calculateFizzBuzz(10)
            assertEquals("buzz", expected)
        }

        it("should return fizz buzz when passed the number 15") {
            val expected = fizzbuzz.calculateFizzBuzz(15)
            assertEquals("fizz buzz", expected)
        }

        it("should return fizz buzz when passed the number 30") {
            val expected = fizzbuzz.calculateFizzBuzz(30)
            assertEquals("fizz buzz", expected)
        }
    }

})
