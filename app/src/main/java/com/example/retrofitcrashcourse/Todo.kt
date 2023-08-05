package com.example.retrofitcrashcourse

import com.google.gson.annotations.SerializedName

data class Todo(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("completed")
	val completed: Boolean,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("userId")
	val userId: Int
)
