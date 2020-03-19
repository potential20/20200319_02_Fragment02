package kr.co.tjoeun.a20200319_02_fragment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200319_02_fragment02.adapters.MainViewPagerAdapter;
import kr.co.tjoeun.a20200319_02_fragment02.databinding.ActivityMainBinding;

//프로젝트 기본 세팅
//trello => 코드정리 요령 => 3번 내용 따라하기
public class MainActivity extends BaseActivity {
    MainViewPagerAdapter mvpa;
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {
        mvpa = new MainViewPagerAdapter(getSupportFragmentManager());

        binding.mainViewPager.setAdapter(mvpa);

    }
}
