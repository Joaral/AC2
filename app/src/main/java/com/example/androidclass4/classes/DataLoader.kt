package com.example.androidclass4.classes

import com.example.androidclass4.R
import com.example.androidclass4.models.FraseMotivadora

class DataLoader() {
    fun loadMotivationInfo(): List<FraseMotivadora>{
        return listOf<FraseMotivadora>(
            FraseMotivadora(R.drawable.paisaje1, R.string.frasemotivacional1),
            FraseMotivadora(R.drawable.paisaje2, R.string.frasemotivacional2),
            FraseMotivadora(R.drawable.paisaje3, R.string.frasemotivacional3),
            FraseMotivadora(R.drawable.paisaje4, R.string.frasemotivacional4),
            FraseMotivadora(R.drawable.paisaje5, R.string.frasemotivacional5),
            FraseMotivadora(R.drawable.paisaje6, R.string.frasemotivacional6),
            FraseMotivadora(R.drawable.paisaje_7, R.string.frasemotivacional7),
            FraseMotivadora(R.drawable.paisaje8, R.string.frasemotivacional8),
            FraseMotivadora(R.drawable.paisaje9, R.string.frasemotivacional9),
            FraseMotivadora(R.drawable.paisaje10, R.string.frasemotivacional10)
            )
    }
}
