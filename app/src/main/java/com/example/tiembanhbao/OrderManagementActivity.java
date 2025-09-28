package com.example.tiembanhbao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class OrderManagementActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_management);

        ListView lvOrders = findViewById(R.id.lvOrders);
        String[] banhBaoTypes = {
            "Bánh bao nhân thịt",
            "Bánh bao chay",
            "Bánh bao xá xíu",
            "Bánh bao kim sa",
            "Bánh bao trứng cút"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            banhBaoTypes
        );
        lvOrders.setAdapter(adapter);
    }
}
