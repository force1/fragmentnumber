package com.mycompany.fragmentnumber;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rock on 1/28/2017.
 */
public class fragment3 extends Fragment

{
    View view;
    TextView display_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        view=inflater.inflate(R.layout.my_fragment3, container,false);
        display_text=(TextView) view.findViewById(R.id.editText1);
        return view;
    }

    public void setName(String Name){
        display_text.setText("Result::" + Name);
    }

}
