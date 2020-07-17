package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;
/*import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;*/
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AFragment extends Fragment {
//dkdldkdkdlsk;lkjafd
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rv = (ViewGroup) inflater.inflate(R.layout.fragment_a,container,false);

        Button button_D = (Button) rv.findViewById(R.id.btnD);
        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DICTIONARY.class); //web 뷰 액티비티 띄우기
                startActivity(intent);
            }
        });

        Button button_C = (Button) rv.findViewById(R.id.btnC);
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CALCULATOR.class); //web 뷰 액티비티 띄우기
                startActivity(intent);
            }
        });

        ImageButton button_Cam = (ImageButton) rv.findViewById(R.id.camera);
        button_Cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Camera.class); //web 뷰 액티비티 띄우기
                startActivity(intent);
            }
        });

        return rv;
    }

}
