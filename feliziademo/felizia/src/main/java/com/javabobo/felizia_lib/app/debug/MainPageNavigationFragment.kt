package com.javabobo.felizia_lib.app.debug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.javabobo.felizia_lib.databinding.FragmentMainPageNavigationBinding

/**
 * A fragment that user leanback components in kotlin.
 * Main functionality has been reduced and code refactored.
 * @author Luis ernesto Alcantara Alcantara.
 * @date 07/03/2021
 */
class MainPageNavigationFragment : BasePageNavigationFragment() {

    private var _binding: FragmentMainPageNavigationBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainPageNavigationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()

    }

    private fun initListeners() {
        binding.browseFrame.onChildFocusListener = mOnChildFocusListener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}