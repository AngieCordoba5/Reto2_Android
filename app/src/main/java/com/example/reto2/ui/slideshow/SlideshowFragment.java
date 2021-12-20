package com.example.reto2.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.R;
import com.example.reto2.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private ImageView sucursal1, sucursal2, sucursal3, sucursal4;
    private TextView text1, text2, text3, text4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        sucursal1 = (ImageView) binding.imageView1;
        sucursal2 = (ImageView) binding.imageView2;
        sucursal3 = (ImageView) binding.imageView3;
        sucursal4 = (ImageView) binding.imageView4;

        text1 = (TextView) binding.textView1;
        text2 = (TextView) binding.textView2;
        text3 = (TextView) binding.textView3;
        text4 = (TextView) binding.textView4;

        sucursal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Sucursal 1", Toast.LENGTH_SHORT).show();
            }
        });

        sucursal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Sucursal 2", Toast.LENGTH_SHORT).show();
            }
        });

        sucursal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Sucursal 3", Toast.LENGTH_SHORT).show();
            }
        });

        sucursal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Imagen Sucursal 4", Toast.LENGTH_SHORT).show();
            }
        });

        ////// Text View
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Sucursal 1", Toast.LENGTH_SHORT).show();
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Sucursal 2", Toast.LENGTH_SHORT).show();
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Sucursal 3", Toast.LENGTH_SHORT).show();
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Text Sucursal 4", Toast.LENGTH_SHORT).show();
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