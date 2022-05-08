package com.proect.notes.feature_note.data.data_sourse

import androidx.room.Database
import androidx.room.RoomDatabase
import com.proect.notes.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao
}