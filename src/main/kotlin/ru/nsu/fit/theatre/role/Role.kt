package ru.nsu.fit.theatre.role

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("ROLE")
data class Role(@Id var id: String, val actorid: String, val sex: Boolean)