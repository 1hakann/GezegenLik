package com.badlogic.androidgames.gezegenos

import android.content.Context
import android.widget.ArrayAdapter
import java.util.*

class GezegenArrayAdapter(context: Context, resource: Int, textViewResourceId: Int, Gezegenler:Array<String>, GezAciklama:Array<String>, GezRes:Array<Int>)
    : ArrayAdapter<String>(context, resource, textViewResourceId, Gezegenler) {

}