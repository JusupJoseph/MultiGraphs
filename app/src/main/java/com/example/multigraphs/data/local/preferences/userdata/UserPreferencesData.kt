package com.example.multigraphs.data.local.preferences.userdata

import com.example.multigraphs.data.local.preferences.PreferencesConstants
import com.example.multigraphs.data.local.preferences.PreferencesHelper
import java.util.prefs.Preferences

class UserPreferencesData(
    private val preferences: PreferencesHelper
) {
    var isAuthorized: Boolean
    get() = preferences().getBoolean(
        PreferencesConstants.PREF_IS_AUTHORIZED, false
    )
    set(value) = preferences().edit().putBoolean(
        PreferencesConstants.PREF_IS_AUTHORIZED, value
    ).apply()

}