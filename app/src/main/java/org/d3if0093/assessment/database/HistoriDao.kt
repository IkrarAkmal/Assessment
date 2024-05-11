package org.d3if0093.assessment.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import org.d3if0093.assessment.model.Histori

@Dao
interface HistoriDao {
    @Insert
    suspend fun insert(histori: Histori)

    @Update
    suspend fun update(histori: Histori)

    @Query("SELECT * FROM histori ORDER BY nama DESC")
    fun getHistori(): Flow<List<Histori>>
}