package com.apps.kotlininspectionsissue

import android.app.Activity

class MainActivity : Activity() {

    inline fun testFunction() {
        // has "Remove 'inline' modifier" > "Suppress 'NOTHING_TO_INLINE' for ..." inspection settings in
        // kotlin plugin "202-1.5.10-release-894-AS8194.7" and doesn't in
        // kotlin plugin "202-1.5.20-release-283-AS8194.7"
    }

}