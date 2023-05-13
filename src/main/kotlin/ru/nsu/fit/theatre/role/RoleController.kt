package ru.nsu.fit.theatre.role

import org.springframework.web.bind.annotation.*

@RestController
class RoleController(val service: RoleService) {

    @GetMapping("/")
    fun index(): List<Role> = service.findRoles();

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Role> = service.findRolesById(id)

    @PostMapping("/")
    fun post(@RequestBody role: Role) {
        service.save(role)
    }

}