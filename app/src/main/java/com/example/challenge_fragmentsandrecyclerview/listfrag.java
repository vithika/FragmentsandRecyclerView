package com.example.challenge_fragmentsandrecyclerview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class listfrag extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter myadapter;
    RecyclerView.LayoutManager  layoutManager;
    View view;

    public listfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_listfrag, container, false);
         return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView=view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

     layoutManager=new LinearLayoutManager(this.getActivity());
     recyclerView.setLayoutManager(layoutManager);

        myadapter=new CarAdapter(this.getActivity(),ApplicationClass.cars);
        recyclerView.setAdapter(myadapter);


    }
}
