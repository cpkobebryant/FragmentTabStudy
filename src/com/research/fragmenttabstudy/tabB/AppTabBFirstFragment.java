package com.research.fragmenttabstudy.tabB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.research.fragmenttabstudy.R;
import com.research.fragmenttabstudy.base.AppConstants;
import com.research.fragmenttabstudy.base.BaseFragment;

public class AppTabBFirstFragment extends BaseFragment {

    private Button mGotoButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_b_first_screen, container, false);

        mGotoButton =   (Button) view.findViewById(R.id.id_next_tab_b_button);
        mGotoButton.setOnClickListener(listener);

        return view;
    }

    private OnClickListener listener        =   new View.OnClickListener(){
        @Override
        public void onClick(View v){
            /* Go to next fragment in navigation stack*/
            mActivity.pushFragments(AppConstants.TAB_B, new AppTabBSecondFragment(),true,true);
        }
    };
}
