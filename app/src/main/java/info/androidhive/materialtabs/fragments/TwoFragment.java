package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Lingkaran;
import info.androidhive.materialtabs.activity.MainActivity;
import info.androidhive.materialtabs.activity.Persegi;
import info.androidhive.materialtabs.activity.PersegiPanjang;
import info.androidhive.materialtabs.activity.Segitiga;


public class TwoFragment extends Fragment{
ImageButton persegi;
ImageButton persegipanjang;
ImageButton segitiga;
ImageButton lingkaran;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        persegi = (ImageButton) view.findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PERSEGI = new Intent(getActivity(), Persegi.class);
                startActivity(PERSEGI);
            }
        });
        persegipanjang=(ImageButton) view.findViewById(R.id.persegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PERSEGIPANJANG = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(PERSEGIPANJANG);
            }
        });
        segitiga=(ImageButton) view.findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SEGITIGA = new Intent(getActivity(), Segitiga.class);
                startActivity(SEGITIGA);
            }
        });
        lingkaran=(ImageButton) view.findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LINGKARAN = new Intent(getActivity(), Lingkaran.class);
                startActivity(LINGKARAN);
            }
        });
        return view;
    }

}
