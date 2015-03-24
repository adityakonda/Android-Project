package com.mova.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mova.fragements.HomeFragment;
import com.mova.fragements.LocateUsFragment;
import com.mova.fragements.MenuFragment;
import com.mova.fragements.ReservationFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new HomeFragment();
		case 1:
			// Games fragment activity
			return new MenuFragment();
		case 2:
			// Movies fragment activity
			return new ReservationFragment();
		case 3:
			return new LocateUsFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4 ;
	}

}
