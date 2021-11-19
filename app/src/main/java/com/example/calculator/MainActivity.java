package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ta; // Переменная для ввода данных в строку A
    EditText tb; // Переменная для ввода данных в строку B
    TextView lr; // Переменная для вывода данных в строку C

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txtA); //
        tb = findViewById(R.id.txtB); //
        lr = findViewById(R.id.labC); //
    }
    public void my_add_click(View w)
    {
        String sa = ta.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        String sb = tb.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        int a = Integer.parseInt(sa); // Перевод текстовой строки в число
        int b = Integer.parseInt(sb); // Перевод текстовой строки в число

        int c = a + b;

        String sc = String.valueOf(c); // Перевод полученного результата из числа в строку

        lr.setText(sc); // Вывод строки на экран
    }
    public void my_sub_click(View w)
    {
        String sa = ta.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        String sb = tb.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        int a = Integer.parseInt(sa); // Перевод текстовой строки в число
        int b = Integer.parseInt(sb); // Перевод текстовой строки в число

        int c = a - b;

        String sc = String.valueOf(c); // Перевод полученного результата из числа в строку

        lr.setText(sc); // Вывод строки на экран
    }
    public void my_mul_click(View w)
    {
        String sa = ta.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        String sb = tb.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        int a = Integer.parseInt(sa); // Перевод текстовой строки в число
        int b = Integer.parseInt(sb); // Перевод текстовой строки в число

        int c = a * b;

        String sc = String.valueOf(c); // Перевод полученного результата из числа в строку

        lr.setText(sc); // Вывод строки на экран
    }
    public void my_div_click(View w)
    {
        String sa = ta.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        String sb = tb.getText().toString(); // Получение введенных в текстовые поля значения в виде строковых переменных
        int a = Integer.parseInt(sa); // Перевод текстовой строки в число
        int b = Integer.parseInt(sb); // Перевод текстовой строки в число

        int c = a / b;

        String sc = String.valueOf(c); // Перевод полученного результата из числа в строку

        lr.setText(sc); // Вывод строки на экран
    }
}