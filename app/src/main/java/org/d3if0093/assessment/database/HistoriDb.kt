package org.d3if0093.assessment.database

import android.content.Context
import androidx.compose.runtime.CompositionLocalContext
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.d3if0093.assessment.model.Histori

@Database(entities = [Histori::class], version = 1, exportSchema = false)
abstract class HistoriDb : RoomDatabase(){
    abstract val dao: HistoriDao
    companion object{
        @Volatile
        private var INSTANCE: HistoriDb? = null
        fun getInstance(context:Context): HistoriDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        HistoriDb::class.java,
                        "histori.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}