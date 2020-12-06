package com.example.fourpics.models

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class SignUpHandler {
    var database: FirebaseDatabase
    var youtubeVideosReference: DatabaseReference

    init {
        database = FirebaseDatabase.getInstance()
        youtubeVideosReference = database.getReference("Accounts")
    }

    fun create(youtubeVideo: SignUpModels): Boolean{
        val id = youtubeVideosReference.push().key
        youtubeVideo.id = id

        youtubeVideosReference.child(id!!).setValue(youtubeVideo)


        return true
    }
    fun update(youtubeVideo: SignUpModels):Boolean {
        youtubeVideosReference.child(youtubeVideo.id!!).setValue(youtubeVideo)
        return true
    }

    fun delete(youtubeVideo: SignUpModels): Boolean {
        youtubeVideosReference.child(youtubeVideo.id!!).removeValue()
        return true
    }
}