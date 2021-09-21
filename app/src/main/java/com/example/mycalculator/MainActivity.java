package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private double[] getInputNumbers(View view) {
        EditText num1 = (EditText)findViewById(R.id.editTextNumberDecimal);
        double numValue1 = Double.parseDouble(num1.getText().toString());
        EditText num2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
        double numValue2 = Double.parseDouble(num2.getText().toString());
        double[] nums = new double[2];
        nums[0] = numValue1;
        nums[1] = numValue2;
        Log.i("Info",  Double.toString(numValue1));
        Log.i("Info", Double.toString(numValue2));
        return nums;
    }
    public void clickAddition(View view) {
        double[] nums = getInputNumbers(view);
        Intent intent = new Intent(this, MainActivity2.class);
        double value = nums[0] + nums[1];
        intent.putExtra("message", Double.toString(value));
        startActivity(intent);
    }

    public void clickSubtract(View view) {
        double[] nums = getInputNumbers(view);
        Intent intent = new Intent(this, MainActivity2.class);
        double value = nums[0] - nums[1];
        intent.putExtra("message", Double.toString(value));
        startActivity(intent);
    }

    public void clickMultiply(View view) {
        double[] nums = getInputNumbers(view);
        Intent intent = new Intent(this, MainActivity2.class);
        double value = nums[0] * nums[1];
        intent.putExtra("message", Double.toString(value));
        startActivity(intent);
    }

    public void clickDivide(View view) {
        double[] nums = getInputNumbers(view);
        Intent intent = new Intent(this, MainActivity2.class);
        double value = nums[0] / nums[1];
        intent.putExtra("message", Double.toString(value));
        startActivity(intent);
    }
}