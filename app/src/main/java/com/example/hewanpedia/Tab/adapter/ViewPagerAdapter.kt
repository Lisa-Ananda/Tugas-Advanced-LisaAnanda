package com.example.hewanpedia.Tab.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hewanpedia.Tab.HerbiFragment
import com.example.hewanpedia.Tab.KarniFragment
import com.example.hewanpedia.Tab.OmniFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> {
                OmniFragment()
            }

            1 -> {
                HerbiFragment()
            }

            2 -> {
                KarniFragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}