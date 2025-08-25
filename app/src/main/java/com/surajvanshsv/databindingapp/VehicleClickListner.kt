package com.surajvanshsv.databindingapp

import android.content.Context
import android.view.View
import android.widget.Toast

class VehicleClickListner(var context: Context) {

    fun displayToastMessage(view: View){
        Toast.makeText(context,
            "You clicked button",
            Toast.LENGTH_SHORT)
            .show()
    }
}