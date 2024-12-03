package edu.iesam.loginexam1eval.features.login.domain

class SignInUseCase (private val userRepository: UserRepository) {

    operator fun invoke(username: String, password: String): Boolean{
        val user: User? = userRepository.findById(username)
        if (user == null){
            userRepository.save(User(username, username, password))
            return true
        } else {
            return false
        }
    }

}