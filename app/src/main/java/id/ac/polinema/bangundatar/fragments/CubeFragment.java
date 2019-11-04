package id.ac.polinema.bangundatar.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import id.ac.polinema.bangundatar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CubeFragment extends Fragment {
    TextView panjang, lebar, tinggi, jenisKubus, outputPerhitungan, outputRumus;
    Button calculateVolume, calculateLuas, calculateKeliling;

    public CubeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cube, container, false);
        jenisKubus = view.findViewById(R.id.hasil_jenis_kubus);
        tinggi = view.findViewById(R.id.tinggi_kubus);
        lebar = view.findViewById(R.id.lebar_kubus);
        panjang = view.findViewById(R.id.panjang_kubus);
        outputPerhitungan = view.findViewById(R.id.hasil_perhitungan_kubus);
        outputRumus = view.findViewById(R.id.hasil_rumus_kubus);
        calculateVolume = view.findViewById(R.id.calculate_volume);
        calculateLuas = view.findViewById(R.id.calculate_luas);
        calculateKeliling = view.findViewById(R.id.calculate_keliling);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dPanjang = Double.valueOf(panjang.getText().toString());
                double dLebar = Double.valueOf(lebar.getText().toString());
                double dTinggi = Double.valueOf(tinggi.getText().toString());
                double hasil = 0;

                if (dPanjang == dLebar && dPanjang == dTinggi){
                    jenisKubus.setText("Kubus");
                } else if (dLebar == dTinggi){
                    jenisKubus.setText("Kubus");
                } else {
                    jenisKubus.setText("Balok");
                }

                hasil = dPanjang * dLebar * dTinggi;
                outputPerhitungan.setText(String.valueOf(hasil));
                outputRumus.setText("Panjang X Lebar X Tinggi");
            }
        });

        calculateLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dPanjang = Double.valueOf(panjang.getText().toString());
                double dLebar = Double.valueOf(lebar.getText().toString());
                double dTinggi = Double.valueOf(tinggi.getText().toString());
                double hasil = 0;

                if (dPanjang == dLebar && dPanjang == dTinggi){
                    jenisKubus.setText("Kubus");
                    hasil = 6 * dPanjang * dLebar;
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("6 X Rusuk X Rusuk");
                } else if (dLebar == dTinggi){
                    jenisKubus.setText("Kubus");
                    hasil = 6 * dPanjang * dLebar;
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("6 X Rusuk X Rusuk");
                } else {
                    jenisKubus.setText("Balok");
                    hasil = 2 * ((dPanjang * dLebar) + (dPanjang * dTinggi) + (dLebar * dTinggi));
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("2 X ((Panjang X Lebar) + (Panjang X Tinggi) + (Lebar X Tinggi)");
                }
            }
        });

        calculateKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dPanjang = Double.valueOf(panjang.getText().toString());
                double dLebar = Double.valueOf(lebar.getText().toString());
                double dTinggi = Double.valueOf(tinggi.getText().toString());
                double hasil = 0;

                if (dPanjang == dLebar && dPanjang == dTinggi){
                    jenisKubus.setText("Kubus");
                    hasil = 12 * dPanjang;
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("12 X Rusuk");
                } else if (dLebar == dTinggi){
                    jenisKubus.setText("Kubus");
                    hasil = 12 * dPanjang;
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("12 X Rusuk");
                } else {
                    jenisKubus.setText("Balok");
                    hasil = 4 * (dPanjang + dLebar + dTinggi);
                    outputPerhitungan.setText(String.valueOf(hasil));
                    outputRumus.setText("4 X (Panjang + Lebar + Tinggi");
                }
            }
        });
        return view;
    }
}
