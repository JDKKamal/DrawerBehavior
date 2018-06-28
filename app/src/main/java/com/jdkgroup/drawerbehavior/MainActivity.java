package com.jdkgroup.drawerbehavior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jdkgroup.drawerbehavior.activity.Advance3DDrawer1Activity;
import com.jdkgroup.drawerbehavior.activity.AdvanceDrawer1Activity;
import com.jdkgroup.drawerbehavior.activity.AdvanceDrawer2Activity;
import com.jdkgroup.drawerbehavior.activity.AdvanceDrawer3Activity;
import com.jdkgroup.drawerbehavior.activity.AdvanceDrawer4Activity;
import com.jdkgroup.drawerbehavior.activity.AdvanceDrawer5Activity;
import com.jdkgroup.drawerbehavior.activity.DefaultDrawerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_default).setOnClickListener(this);
        findViewById(R.id.button_advance1).setOnClickListener(this);
        findViewById(R.id.button_advance2).setOnClickListener(this);
        findViewById(R.id.button_advance3).setOnClickListener(this);
        findViewById(R.id.button_advance4).setOnClickListener(this);
        findViewById(R.id.button_advance5).setOnClickListener(this);
        findViewById(R.id.button_advance_3d_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_default:
                startActivity(new Intent(this, DefaultDrawerActivity.class));
                break;
            case R.id.button_advance1:
                startActivity(new Intent(this, AdvanceDrawer1Activity.class));
                break;
            case R.id.button_advance2:
                startActivity(new Intent(this, AdvanceDrawer2Activity.class));
                break;
            case R.id.button_advance3:
                startActivity(new Intent(this, AdvanceDrawer3Activity.class));
                break;
            case R.id.button_advance4:
                startActivity(new Intent(this, AdvanceDrawer4Activity.class));
                break;
            case R.id.button_advance5:
                startActivity(new Intent(this, AdvanceDrawer5Activity.class));
                break;
            case R.id.button_advance_3d_1:
                startActivity(new Intent(this, Advance3DDrawer1Activity.class));
                break;
        }
    }
}
