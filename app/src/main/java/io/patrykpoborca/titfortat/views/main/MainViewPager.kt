package io.patrykpoborca.titfortat.views.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import io.patrykpoborca.titfortat.views.time..

/**
 * Created by patrykpoborca on 12/28/15.
 */

class MainViewPager(fm : FragmentManager?) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when(position){
            1 -> TimeFragment();
        }
    }

    override fun getCount(): Int {
        3;
    }
}