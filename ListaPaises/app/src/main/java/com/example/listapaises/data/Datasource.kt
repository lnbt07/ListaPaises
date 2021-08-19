package com.example.listapaises.data

import com.example.listapaises.R
import com.example.listapaises.model.Pais

class Datasource {
    fun carregarPaises(): List<Pais> {
        return listOf<Pais>(
            Pais(R.string.bonaire, R.drawable.bonaire),
            Pais(R.string.colombia, R.drawable.colombia),
            Pais(R.string.costarica, R.drawable.costarica),
            Pais(R.string.elsalvador, R.drawable.elsalvador),
            Pais(R.string.estadosunidos, R.drawable.estadosunidos),
            Pais(R.string.ilhascaiman, R.drawable.ilhascaiman),
            Pais(R.string.jamaica, R.drawable.jamaica),
            Pais(R.string.mexico, R.drawable.mexico),
            Pais(R.string.saocristovaoenevis, R.drawable.saocristovaoenevis),
            Pais(R.string.saovicente, R.drawable.saovicente)
        )
    }
}