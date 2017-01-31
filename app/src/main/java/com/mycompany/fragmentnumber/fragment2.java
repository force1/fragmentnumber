package com.mycompany.fragmentnumber;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by rock on 1/28/2017.
 */
public class fragment2 extends Fragment {


    View view;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        view=inflater.inflate(R.layout.my_fragment2, container, false);
        btn=(Button) view.findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}
