package edu.fsu.cs.mobile.example.fragmentxml;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state)
	{
		return inflater.inflate(R.layout.sublayout, null, false);
	}

}
