package com.example.roommvvm.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//digunakan untuk menentukan struktur dalam tabel Student
@Entity
data class Student (
    @PrimaryKey(autoGenerate = true) var id: Int? = null,

    //untuk mendeklarasikan struktur tabel
    @ColumnInfo var name: String = ""
)