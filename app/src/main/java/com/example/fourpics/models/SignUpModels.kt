package com.example.fourpics.models

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class SignUpModels(var id: String? = "",var name: String? = "", var email: String? = "", var password: Int = 0, var confirmpassword: String? = "") {
    override fun toString(): String {
        return "($password)\t $name \nEmail: $email\nConfirmPassword: $confirmpassword"
    }
}