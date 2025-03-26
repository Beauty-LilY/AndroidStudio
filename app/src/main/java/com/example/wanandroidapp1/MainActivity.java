package com.example.wanandroidapp1;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import com.example.wanandroidapp1.fragment.CategoryFragment;
import com.example.wanandroidapp1.fragment.HomeFragment;
import com.example.wanandroidapp1.fragment.MineFragment;
import com.example.wanandroidapp1.fragment.ProjectFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private HomeFragment mHomeFragment;
    private ProjectFragment mProjectFragment;
    private CategoryFragment mCategoryFragment;
    private MineFragment mMineFragment;

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

//        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        //初始化控件
        mBottomNavigationView = findViewById(R.id.bottomNavigationView);
        //设置点击事件
        mBottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    if (item.getItemId()==R.id.home){
                        selectedFragment(0);
                    } else if (item.getItemId()==R.id.project) {
                        selectedFragment(1);
                    } else if (item.getItemId()==R.id.category) {
                        selectedFragment(2);
                    }else {
                        selectedFragment(3);
                    }
                    return true;
            }
        });

        //默认选中首页
       selectedFragment(0);


    }
    private void selectedFragment(int position){
        androidx.fragment.app.
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideFragment(fragmentTransaction);
        if (position==0){
            if (mHomeFragment==null){
                mHomeFragment=new HomeFragment();
                fragmentTransaction.add(R.id.content,mHomeFragment);
            }else {
                fragmentTransaction.show(mHomeFragment);
            }
        }else if (position==1){
            if (mProjectFragment==null){
                mProjectFragment=new ProjectFragment();
                fragmentTransaction.add(R.id.content,mProjectFragment);
            }else {
                fragmentTransaction.show(mProjectFragment);
            }
        } else if (position==2) {
            if (mCategoryFragment==null){
                mCategoryFragment=new CategoryFragment();
                fragmentTransaction.add(R.id.content,mCategoryFragment);
            }else {
                fragmentTransaction.show(mCategoryFragment);
            }
        }else {
            if (mMineFragment==null){
                mMineFragment=new MineFragment();
                fragmentTransaction.add(R.id.content,mMineFragment);
            }else {
                fragmentTransaction.show(mMineFragment);
            }
        }

        //一定要提交！！！
        fragmentTransaction.commit();
    }
    private void hideFragment(FragmentTransaction fragmentTransaction){
        if (mHomeFragment!=null){

            fragmentTransaction.hide(mHomeFragment);
        }
        if (mProjectFragment!=null){
            fragmentTransaction.hide(mProjectFragment);
        }
        if (mCategoryFragment!=null){
            fragmentTransaction.hide(mCategoryFragment);
        }
        if (mMineFragment!=null){
            fragmentTransaction.hide(mMineFragment);
        }
    }
}