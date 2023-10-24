package com.Kito_Profit.kito_profit;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.Kito_Profit.kito_profit.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText texthargabeli,textlaba,texthargajual,textlababersih;
    Button buttonhitung1,buttonreset2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texthargabeli= (EditText )findViewById(R.id.texthargabeli);
        textlaba=(EditText )findViewById(R.id.textlaba);
        texthargajual=(EditText )findViewById(R.id.texthargajual);
        textlababersih=(EditText )findViewById(R.id.textlababersih);
        buttonhitung1=(Button )findViewById(R.id.buttonhitung1);
        buttonreset2=(Button )findViewById(R.id.buttonreset2);
        texthargajual.setFocusable(false);
        textlababersih.setFocusable(false);


        buttonreset2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                        // TODO Auto-generated method stub
                        texthargabeli.setText("");
                        textlaba.setText("");
                        texthargajual.setText("");
                        textlababersih.setText("");
                    }
                });

        buttonhitung1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Double Vtexthargabeli = Double.parseDouble(texthargabeli.getText().toString());
                Double Vtextlaba = Double.parseDouble(textlaba.getText().toString());
                Double Vtexthargajual = (Vtexthargabeli * Vtextlaba / 100) + Vtexthargabeli;
                Double Vtextlababersih =  Vtexthargajual - Vtexthargabeli;


                DecimalFormat df = new DecimalFormat("@@##");
                texthargajual.setText("Rp. " +  df.format(Vtexthargajual));
                textlababersih.setText(df.format(Vtextlababersih));

                //end
         }
       });
    }
}




