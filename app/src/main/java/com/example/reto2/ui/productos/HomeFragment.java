package com.example.reto2.ui.productos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.reto2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ImageView producto1, producto2, producto3, producto4;
    private TextView text1, text2, text3, text4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        producto1 = (ImageView) binding.imageView1;
        producto2 = (ImageView) binding.imageView2;
        producto3 = (ImageView) binding.imageView3;
        producto4 = (ImageView) binding.imageView4;

        text1 = (TextView) binding.textView1;
        text2 = (TextView) binding.textView2;
        text3 = (TextView) binding.textView3;
        text4 = (TextView) binding.textView4;

        producto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Producto 1", Toast.LENGTH_SHORT).show();
            }
        });

        producto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Producto 2", Toast.LENGTH_SHORT).show();
            }
        });

        producto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Producto 3", Toast.LENGTH_SHORT).show();
            }
        });

        producto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Producto 4", Toast.LENGTH_SHORT).show();
            }
        });

        ////// Text View
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Producto 1", Toast.LENGTH_SHORT).show();
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Producto 2", Toast.LENGTH_SHORT).show();
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Producto 3", Toast.LENGTH_SHORT).show();
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Producto 4", Toast.LENGTH_SHORT).show();
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