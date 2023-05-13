package ru.nsu.fit.theatre.role

import org.springframework.data.repository.CrudRepository

interface RoleRepo : CrudRepository<Role, String> {
    fun findByActorid(actorId: String): List<Role>
}