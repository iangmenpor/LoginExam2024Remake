package edu.iesam.loginexam1eval.features.login.data

import edu.iesam.loginexam1eval.features.login.domain.User
import edu.iesam.loginexam1eval.features.login.domain.UserRepository

class UserDataRepository (private val xmlLocalDataSource: LoginXmlLocalDataSource) : UserRepository {

    override fun findById(username: String): User? {
        return xmlLocalDataSource.findById(username)
    }

    override fun save(user: User) {
        return xmlLocalDataSource.save(user)
    }

}