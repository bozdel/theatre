package ru.nsu.fit.theatre.role

import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.toList

@Service
class RoleService(val db: RoleRepo) {
    fun findRoles(): List<Role> = db.findAll().toList();

    fun findRolesById(id: String): List<Role> = db.findById(id).toList();

    fun findRolesByActorId(actorId: String) = db.findByActorid(actorId);

    fun save(role: Role) {
        db.save(role)
    }

    public fun <T : Any> Optional<out T>.toList(): List<T> = if (isPresent) listOf(get()) else emptyList()
}