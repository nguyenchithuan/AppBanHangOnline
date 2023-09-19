package edu.wkd.appbanhangonline.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.wkd.appbanhangonline.R;
import edu.wkd.appbanhangonline.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.edEmail.getText();
    }
}