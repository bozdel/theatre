package ru.nsu.fit.theatre.actor

import org.springframework.data.repository.CrudRepository

interface ActorRepo : CrudRepository<Actor, String>