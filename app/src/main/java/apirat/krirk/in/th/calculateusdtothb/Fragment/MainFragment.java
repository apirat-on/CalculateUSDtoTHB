package apirat.krirk.in.th.calculateusdtothb.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import apirat.krirk.in.th.calculateusdtothb.R;

/**
 * Created by acer on 26/12/2560.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Calculate Controller

        calculateController();


    } // Main Method

    private void calculateController() {
        Button button = getView().findViewById(R.id.btncalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMain, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();


            }
        });
    }



    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main, container,false);

        return view;
    }

}  //Main class






