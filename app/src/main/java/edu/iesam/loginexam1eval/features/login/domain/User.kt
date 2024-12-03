package edu.iesam.loginexam1eval.features.login.domain

/**
 * id = username porque es único
 * username
 * password
 */
data class User(val id: String, val username: String, val password: String)