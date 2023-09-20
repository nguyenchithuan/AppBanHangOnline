package edu.wkd.appbanhangonline.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.wkd.appbanhangonline.R;
import edu.wkd.appbanhangonline.databinding.ActivityForgotPasswordBinding;

public class ForgotPasswordActivity extends AppCompatActivity {
    private ActivityForgotPasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}