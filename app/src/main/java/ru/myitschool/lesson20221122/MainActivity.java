package ru.myitschool.lesson20221122;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import ru.myitschool.lesson20221122.databinding.ActivityMainBinding;
import ru.myitschool.lesson20221122.databinding.ItemUserBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ItemUserBinding userBinding;
    Unit unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //setContentView(R.layout.activity_main);
        //TextView textView = findViewById(R.id.outputText);
        binding.add.setOnClickListener(view -> addContact());
    }

    private void clearInput()
    {
        binding.inputName.setText("");
        binding.inputPhone.setText("");
        binding.inputName.clearFocus();
        binding.inputPhone.clearFocus();
        binding.radioGroup.clearCheck();
    }

    private void addContact() {
        {
            userBinding = ItemUserBinding.inflate(getLayoutInflater());
            String name = binding.inputName.getText().toString();
            String phone = binding.inputPhone.getText().toString();
            if (!name.isEmpty() && !phone.isEmpty()) {
//                binding.outputText.append(name + "\n" + phone + "\n");
                if(binding.radioJ.isChecked())
                {
                    unit = new Junior(name, phone);
                    userBinding.layoutUser.setBackgroundColor(Color.GREEN);
                }
                if(binding.radioM.isChecked())
                {
                    unit = new Middle(name, phone);
                    userBinding.layoutUser.setBackgroundColor(Color.YELLOW);
                }
                if(binding.radioS.isChecked())
                {
                    unit = new Senior(name, phone);
                    userBinding.layoutUser.setBackgroundColor(Color.RED);
                }






                userBinding.name.setText(unit.getName());
                userBinding.phone.setText(unit.getPhone());
                userBinding.status.setText(unit.Speak());
                binding.container.addView(userBinding.getRoot());

                clearInput();

            } else {
                Snackbar.make(binding.getRoot(),
                        "Заполните все поля",
                        Snackbar.LENGTH_SHORT).show();
                //Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
            }
        }
    }

}