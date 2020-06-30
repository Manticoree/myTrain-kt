package com.body.mytrain.entities.bd


import com.body.mytrain.entities.bd.person.Person
import com.body.mytrain.entities.bd.person.PersonDao

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Person::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract val personDao: PersonDao
}
