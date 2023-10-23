package com.example.retrofit

data class Comment(
    val body:String,
    val email: String,
    val Id: Int,
    val name: String,
    val postId: String
)
fun Comment.toComment(): CustomComment{
    return CustomComment(
        name = name,
        email = email
    )
}
