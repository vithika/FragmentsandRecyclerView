package com.example.challenge_fragmentsandrecyclerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

    Button btncarinfo,btnownerinfo;
    ImageView ivcar;
    TextView tvmodel,tvname,tvtel;
    FragmentManager fragmentManager;
    Fragment buttonfrag,listfrag,carinfofrag,ownerinfofrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncarinfo=findViewById(R.id.btncarinfo);
        btnownerinfo =findViewById(R.id.btnownerinfo);
        ivcar=findViewById(R.id.ivmake);
        tvmodel=findViewById(R.id.tvmodel);
        tvname=findViewById(R.id.tvname);
        tvtel=findViewById(R.id.tvtel);

        fragmentManager=getSupportFragmentManager();
        buttonfrag=fragmentManager.findFragmentById(R.id.buttonfrag);
        listfrag=fragmentManager.findFragmentById(R.id.listfrag);
        carinfofrag=fragmentManager.findFragmentById(R.id.carinfo);
        ownerinfofrag=fragmentManager.findFragmentById(R.id.ownerinfo);

        fragmentManager.beginTransaction()
                .show(buttonfrag)
                .show(listfrag)
                .show(carinfofrag)
                .hide(ownerinfofrag)
                .commit();


        btnownerinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction()
                        .show(buttonfrag)
                        .show(listfrag)
                        .hide(carinfofrag)
                        .show(ownerinfofrag)
                        .commit();

            }
        });

        btncarinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction()
                        .show(buttonfrag)
                        .show(listfrag)
                        .show(carinfofrag)
                        .hide(ownerinfofrag)
                        .commit();


            }
        });
        onItemClicked(0);


    }

    @Override
    public void onItemClicked(int index) {

        tvname.setText(ApplicationClass.cars.get(index).getOwnername());
        tvmodel.setText(ApplicationClass.cars.get(index).getModel());
        tvtel.setText(ApplicationClass.cars.get(index).getOwnernumber());

        if(ApplicationClass.cars.get(index).getMake().equals("nissan"))
        {
            ivcar.setImageResource(R.drawable.nissan);
        }
        else if(ApplicationClass.cars.get(index).getMake().equals("volkswagen"))
        {
            ivcar.setImageResource(R.drawable.volkswagen);
        }
        else
        {
            ivcar.setImageResource(R.drawable.mercedes);
        }

    }
}
