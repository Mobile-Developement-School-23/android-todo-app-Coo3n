package com.yandex.todo.data.remote

import com.yandex.todo.data.remote.dto.*
import retrofit2.Response
import retrofit2.http.*


interface TodoApi {
    @GET("list")
    suspend fun getTodoList(): Response<ListTodoItemDto>

    @PATCH("list")
    suspend fun mergeTodoList(
        @Body todoItemListRequest: TodoItemListRequest
    ): Response<TodoItemListResponse>

    @POST("list")
    suspend fun addTodoItem(
        @Body todoItemRequest: TodoItemRequest
    ): Response<TodoItemResponse>

    @PUT("list/{id}")
    suspend fun updateTodoItem(
        @Path("id") id: String,
        @Body todoItemRequest: TodoItemRequest
    ): Response<TodoItemResponse>

    @DELETE("list/{id}")
    suspend fun deleteTodoItemById(
        @Path("id") id: String
    ): Response<TodoItemResponse>
}