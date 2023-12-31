package com.yandex.todo.data.local.converter

import androidx.room.TypeConverter
import java.util.*

class DateConvertor {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}