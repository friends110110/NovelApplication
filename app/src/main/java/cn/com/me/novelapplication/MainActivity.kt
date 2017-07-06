package cn.com.me.novelapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener{
            item->
                when (item.itemId) {
                    R.id.navigation_home -> {
                        message!!.setText(R.string.title_home)
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.navigation_dashboard -> {
                        message!!.setText(R.string.title_dashboard)
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.navigation_notifications -> {
                        message!!.setText(R.string.title_notifications)
                        return@setOnNavigationItemSelectedListener true
                    }

                }
                return@setOnNavigationItemSelectedListener false
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_about) {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}
