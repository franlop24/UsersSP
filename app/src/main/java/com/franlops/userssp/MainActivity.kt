package com.franlops.userssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.franlops.userssp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers(): MutableList<User> {
        val users = mutableListOf<User>()

        val francisco = User(1, "Francisco", "Lopez", "https://avatars.githubusercontent.com/u/39685222?s=400&u=a8044460a19cd7e2f5198d170db4963080d63e34&v=4")
        val jose = User(2, "Jose", "Perez", "https://avatars.githubusercontent.com/u/51543942?v=4")
        val pedro = User(3, "Pedro", "Gomez", "")
        val andrea = User(4, "Andrea", "Ramirez", "")
        val jessica = User(5, "Jessica", "Lopez", "")
        val fernanda = User(6, "Fernanda", "Contreras", "")
        users.add(francisco)
        users.add(jose)
        users.add(pedro)
        users.add(andrea)
        users.add(jessica)
        users.add(fernanda)
        users.add(francisco)
        users.add(jose)
        users.add(pedro)
        users.add(andrea)
        users.add(jessica)
        users.add(fernanda)
        users.add(francisco)
        users.add(jose)
        users.add(pedro)
        users.add(andrea)
        users.add(jessica)
        users.add(fernanda)

        return users
    }
}