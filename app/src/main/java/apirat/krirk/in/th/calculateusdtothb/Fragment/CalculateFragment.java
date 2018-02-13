package apirat.krirk.in.th.calculateusdtothb.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import apirat.krirk.in.th.calculateusdtothb.MainActivity;
import apirat.krirk.in.th.calculateusdtothb.R;

/**
 * Created by acer on 9/1/2561.
 */

public class CalculateFragment extends Fragment implements View.OnClickListener {
    //    Explicit


    private String displayString = "";

    private String tag = "13FebruaryV1";
    private  boolean addABoolean = false, minusAboolean = false;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar

        createToolbar();





    } // Main Method







    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolberCalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle("Calculate USD To THB");

        ((MainActivity) getActivity()).getSupportActionBar()
                .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.money, container, false);
        return view;
    }






    @Override
    public void onClick(View view) {

    }
}  //Main class


