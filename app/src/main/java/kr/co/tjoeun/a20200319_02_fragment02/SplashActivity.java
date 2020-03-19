package kr.co.tjoeun.a20200319_02_fragment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200319_02_fragment02.databinding.ActivitySplashBinding;

public class SplashActivity extends BaseActivity {

    ActivitySplashBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash);
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {

    }
}
