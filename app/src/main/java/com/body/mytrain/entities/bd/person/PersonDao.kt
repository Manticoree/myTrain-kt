package com.body.mytrain.entities.bd.person

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDao {

    // получение всех Person из бд
    @get:Query("SELECT * FROM person")
    val allPeople: List<Person>

    //Добавление в бд
    @Insert
    fun insertAll(vararg people: Person)

    //удаление из бд
    @Delete
    fun delete(person: Person)


}
