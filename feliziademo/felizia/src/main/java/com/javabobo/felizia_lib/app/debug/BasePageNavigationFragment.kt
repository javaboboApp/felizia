package com.javabobo.felizia_lib.app.debug

import android.graphics.Rect
import android.view.View
import androidx.fragment.app.Fragment
import androidx.leanback.widget.BrowseFrameLayout

abstract class BasePageNavigationFragment : Fragment() {

    /*
    * Listener triggered when focus in child's change
    * */
    protected val mOnChildFocusListener: BrowseFrameLayout.OnChildFocusListener = object :
        BrowseFrameLayout.OnChildFocusListener {
        override fun onRequestFocusInDescendants(
            direction: Int,
            previouslyFocusedRect: Rect
        ): Boolean {
            TODO("Not implemented")
        }

        override fun onRequestChildFocus(
            child: View,
            focused: View
        ) {
            TODO("Not implemented")
        }
    }


}