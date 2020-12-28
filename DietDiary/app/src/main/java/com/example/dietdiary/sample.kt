package com.example.dietdiary

fun main(){
    start()
    println(add(5,4))

    //String Template
    val firstname = "우람 "
    val lastname = "장 "
    println("안녕 나는 ${firstname+lastname}이다.")

    checkNum(99)
}
//1 함수
fun start(){
    println("코틀린새끼 ㅎㅇ")
}

fun add(a: Int, b: Int):Int{
    return a+b
}

//2 val / var
// val은 immutable 불변의값 final같은역할
// var는 mutable 값 즉, 변수

//4. 조건식
fun maxBy(a:Int,b:Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int,b : Int): Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b: Int = when(score){
        1 -> 1
        2 -> 2
        3 -> 3
        else -> 0
    }

    when(score){
        in 90..100 -> println("Genius")
        in 80..90 -> println("not bad")
        else -> println("Okay")
    }
}
// Array and List
// array는 값 변경가능하나 정적 배열 (사이즈 지정)
//List -> 1. List 와 2.Mutable 리스트가 존재한다.
//기본 List는 list[0] =3  이런식으로 값 변경 불가하다
//List 는 get만 있다. (인터페이스임)
//어레이와 리스트는 참조값이 변경되지 않는다면 var 이나 val써도 상관 x
fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    var arrayList = arrayListOf<Int>(1,3,20)
    arrayList.add(10)
    arrayList.add(30)
    arrayList.set(2,2)
}

//nullsble / null
var name = "joyce"
var nullname : String? =null
var nameInUpperCase = name.toUpperCase()
var nullNameInUpperCase = nullname?.toUpperCase()