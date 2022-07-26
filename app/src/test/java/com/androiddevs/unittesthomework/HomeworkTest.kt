package com.androiddevs.unittesthomework

import com.google.common.truth.Truth.assertThat
import org.junit.Test


@Test
fun `fibonacci f(0) = 0`(){
    val result = Homework.fib(0)
    assertThat(result).isEqualTo(0)
}

@Test
fun `f(1) = 1`(){
    val result = Homework.fib(1)
    assertThat(result).isEqualTo(1)
}

@Test
fun `f(n) == f(n-2) + f(n-1)`(){
    val fibN5 = Homework.fib(5)
    val fibN4 = Homework.fib(4)
    val fibN3 = Homework.fib(3)
    assertThat(fibN5).isEqualTo(fibN4 + fibN3)
}

@Test
fun `fibonacci input 2 return 1`() {
    assertThat(Homework.fib(2)).isEqualTo(1)
}

@Test
fun `fibonacci input 6 return wrong number=(8)`() {
    assertThat(Homework.fib(6)).isNotEqualTo(8)
}


@Test
fun `two open braces return false`(){
    val result = Homework.checkBraces("((a*b)+d")
    assertThat(result).isFalse()
}

@Test
fun `two close braces return false`(){
    val result = Homework.checkBraces("(a*b)+d)")
    assertThat(result).isFalse()
}

@Test
fun `valid braces return true`(){
    val result = Homework.checkBraces("(a+b)")
    assertThat(result).isTrue()
}

@Test
fun `inversely braces return false`(){
    val result = Homework.checkBraces(")a*b(")
    assertThat(result).isFalse()
}
}