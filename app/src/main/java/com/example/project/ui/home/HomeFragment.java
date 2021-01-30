package com.example.project.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.project.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView records,parties,orders,prediction,timeSpan,feedBack;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
//        {
//            @Override
//            public void onChanged(@Nullable String s) {
//                //textView.setText(s);
//            }
//        });

        records=(ImageView) root.findViewById(R.id.records);
        parties=(ImageView) root.findViewById(R.id.parties);
        orders=(ImageView) root.findViewById(R.id.orders);
        prediction=(ImageView)root.findViewById(R.id.prediction);
        timeSpan=(ImageView)root.findViewById(R.id.timespan);
        feedBack=(ImageView)root.findViewById(R.id.feedback);

        records.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent records=new Intent(getActivity(), Records.class);
                startActivity(records);
            }
        });
        parties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parties=new Intent(getActivity(), Parties.class);
                startActivity(parties);
            }
        });
//
//        orders.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//             //   Intent orders=new Intent(getActivity(), Orders.class);
//                startActivity(orders);
//            }
//        });

        prediction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prediction=new Intent(getActivity(),Prediction.class);
                startActivity(prediction);
            }
        });


        timeSpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeSpan=new Intent(getActivity(),TimeSpan.class);
                startActivity(timeSpan);
            }
        });


        feedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feedBack=new Intent(getActivity(),Feedback.class);
                startActivity(feedBack);
            }
        });

        return root;
    }
}