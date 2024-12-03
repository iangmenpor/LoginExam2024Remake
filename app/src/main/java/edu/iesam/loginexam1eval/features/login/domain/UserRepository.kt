package edu.iesam.loginexam1eval.features.login.domain

interface UserRepository {

    fun findById(username: String): User?

    fun save(user: User)

}