package com.android.problempractice

fun main(){
    val arr= intArrayOf(4,1,6,3,2)
    val num= solution(arr)
    println(num)
}
fun solution(A: IntArray): Int {
    // Implement your solution here
    var result =0
    for(i in A.indices){
        if(i > 0 && i!= A[i] ){
            result = i
        }
    }
    return result
}