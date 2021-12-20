package com.example.reto2.ui.servicios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.reto2.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {


    private FragmentGalleryBinding binding;
    private ImageView servicio1, servicio2, servicio3, servicio4;
    private TextView text1, text2, text3, text4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        servicio1 = (ImageView) binding.imageView1;
        servicio2 = (ImageView) binding.imageView2;
        servicio3 = (ImageView) binding.imageView3;
        servicio4 = (ImageView) binding.imageView4;

        text1 = (TextView) binding.textView1;
        text2 = (TextView) binding.textView2;
        text3 = (TextView) binding.textView3;
        text4 = (TextView) binding.textView4;

        servicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Servicio 1", Toast.LENGTH_SHORT).show();
            }
        });

        servicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Servicio 2", Toast.LENGTH_SHORT).show();
            }
        });

        servicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Servicio 3", Toast.LENGTH_SHORT).show();
            }
        });

        servicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Servicio 4", Toast.LENGTH_SHORT).show();
            }
        });

        ////// Text View
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Servicio 1", Toast.LENGTH_SHORT).show();
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Servicio 2", Toast.LENGTH_SHORT).show();
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Servicio 3", Toast.LENGTH_SHORT).show();
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Servicio 4", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}