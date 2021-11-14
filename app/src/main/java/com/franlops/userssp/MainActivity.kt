package com.franlops.userssp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.franlops.userssp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferences = getPreferences(Context.MODE_PRIVATE)

        val isFirstTime = preferences.getBoolean(getString(R.string.sp_fisrt_time), true)
        Log.i("SP", "${getString(R.string.sp_fisrt_time)} = $isFirstTime")

        preferences.edit().putBoolean(getString(R.string.sp_fisrt_time), false).commit()

        userAdapter = UserAdapter(getUsers(), this)
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize(true)
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

    override fun onClick(user: User, position:Int) {
        Toast.makeText(this, "$position : ${user.getFullName()}", Toast.LENGTH_LONG).show()
    }
}