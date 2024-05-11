package org.d3if0093.assessment.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "histori")
data class Histori(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val jenis: String,
    val status: String
)
