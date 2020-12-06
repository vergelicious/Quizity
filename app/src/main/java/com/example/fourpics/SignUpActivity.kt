package com.example.fourpics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.example.fourpics.models.SignUpHandler
import com.example.fourpics.models.SignUpModels
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

lateinit var signUpHandler: SignUpHandler

class SignUpActivity : AppCompatActivity() {
    lateinit var channelEditText: EditText
    lateinit var linkEditText: EditText
    lateinit var rankEditText: EditText
    lateinit var reasonEditText: EditText
    lateinit var button: Button
    lateinit var youtubeVideos: ArrayList<SignUpModels>
    lateinit var youtubeVideosArrayAdapter: ArrayAdapter<SignUpModels>
    lateinit var youtubeVideoGettingEdited: SignUpModels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        channelEditText = findViewById(R.id.videoChannelEditText)
        linkEditText = findViewById(R.id.videoLinkEditText)
        rankEditText = findViewById(R.id.videoRankEditText)
        reasonEditText = findViewById(R.id.reasonEditText)
        button = findViewById(R.id.button)

        signUpHandler = SignUpHandler()
        youtubeVideos = ArrayList()


        button.setOnClickListener{
            val name = channelEditText.text.toString()
            val email = linkEditText.text.toString()
            var password: Int
            if (rankEditText.text.toString() == "" ) {
                password = 0
            } else {
                password = rankEditText.text.toString().toInt()
            }


            val confirmpassword = reasonEditText.text.toString()


            if(button.text.toString() == "Add"){
                val restaurant = SignUpModels(name = name , email = email ,password =  password, confirmpassword = confirmpassword  )
                if(signUpHandler.create(restaurant)){
                    Toast.makeText(this, "Your account has been added.", Toast.LENGTH_SHORT).show()
                }
                clear()
            } else if(button.text.toString() == "Update") {
                val restaurant = SignUpModels( id = youtubeVideoGettingEdited.id, name = name , email = email ,password =  password, confirmpassword = confirmpassword )
                if(signUpHandler.update(restaurant)){
                    Toast.makeText(this, "Your account has been updated.", Toast.LENGTH_SHORT).show()
                }
                clear()
            }
        }
        findViewById<Button>(R.id.btnSubmit).setOnClickListener { backToLogin() }
    }
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        return when (item.itemId){
            R.id.editYoutube -> {
                youtubeVideoGettingEdited = youtubeVideos[info.position]
                channelEditText.setText(youtubeVideoGettingEdited.name)
                linkEditText.setText(youtubeVideoGettingEdited.email)
                rankEditText.setText(youtubeVideoGettingEdited.password.toString())
                reasonEditText.setText(youtubeVideoGettingEdited.confirmpassword)
                button.setText("Update")
                return true
            }
            R.id.deleteYoutube -> {
                if (signUpHandler.delete(youtubeVideos[info.position])){
                    Toast.makeText(this, "Your account has been updated", Toast.LENGTH_SHORT).show()
                }
                return true
            }
            else -> super.onContextItemSelected(item)
        }
    }
    override fun onStart() {
        super.onStart()
        signUpHandler.youtubeVideosReference.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                youtubeVideos.clear()
                p0.children.forEach {
                        it -> val video = it.getValue(SignUpModels::class.java)
                    youtubeVideos.add(video!!)
                    youtubeVideos.sortWith(object: Comparator<SignUpModels>{
                        override fun compare(o1: SignUpModels, o2: SignUpModels): Int = when {
                            else -> -1
                        }
                    })

                }
                youtubeVideosArrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, youtubeVideos)
            }

            override fun onCancelled(p0: DatabaseError) {
            }
        })
    }
    fun clear(){
        channelEditText.text.clear()
        linkEditText.text.clear()
        rankEditText.text.clear()
        reasonEditText.text.clear()
        button.setText("Add")
    }
    private fun backToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Your account has been signed up.", Toast.LENGTH_SHORT).show()
    }
}