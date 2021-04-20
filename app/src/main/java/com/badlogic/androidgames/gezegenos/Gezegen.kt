package com.badlogic.androidgames.gezegenos

import java.io.Serializable

data class Gezegen(var gezAdi: String, var gezBaslik: String, var gezImg: Int,
                   var gezIcerikRes: Int, var GezGenelOzell: Char) : Serializable {
}