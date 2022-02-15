package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * this is the data item that will be displayed by the app
 * update the constructor to take in imageResources
 * add @ annotations, so there would be no confusion about what type
 * of resource is supplied
 */

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)