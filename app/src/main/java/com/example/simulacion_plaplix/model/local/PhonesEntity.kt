package com.example.simulacion_plaplix.model.local

import android.media.Image
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Phones_Table")
data class PhonesEntity (@PrimaryKey @NonNull  val id: Int,
                         val image: String,
                         val name: String,
                         val price: Int
)
}