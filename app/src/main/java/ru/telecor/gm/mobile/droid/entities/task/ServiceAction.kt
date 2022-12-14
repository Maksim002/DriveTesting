package ru.telecor.gm.mobile.droid.entities.task

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class ServiceAction (
    @SerializedName("id")
    @Expose
    var id: String? = null,

    @SerializedName("name")
    @Expose
    var name: String? = null
)