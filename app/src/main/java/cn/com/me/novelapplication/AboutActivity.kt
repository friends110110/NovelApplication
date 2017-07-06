package cn.com.me.novelapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
     companion object {
        val EMAIL_URI = "mailto:friends119119@gmail.com"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        collapsing_toolbar.title = getString(R.string.title_about_name)

        setSupportActionBar(titleBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        fab.setOnClickListener { email2Me() }

        fab.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }


        })

    }

    private fun email2Me() {
        val uri = Uri.parse(EMAIL_URI);
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == android.R.id.home) {
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
