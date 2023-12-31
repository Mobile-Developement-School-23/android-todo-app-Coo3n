package com.yandex.todo.domain.repository

import com.yandex.todo.domain.model.ListItem
import com.yandex.todo.domain.model.TodoItem
import com.yandex.todo.utils.Resource
import kotlinx.coroutines.flow.Flow

interface TodoItemsRepository {
    suspend fun getTodoListItems(
        fetchFromRemote: Boolean
    ): Flow<Resource<List<ListItem>>>
    suspend fun mergeTodoItemList()
    suspend fun addTodoItem(todoItem: TodoItem)
    suspend fun updateTodoItem(todoItem: TodoItem)
    suspend fun updateTodoItemList()
    suspend fun deleteTodoItem(todoItem: TodoItem)
}