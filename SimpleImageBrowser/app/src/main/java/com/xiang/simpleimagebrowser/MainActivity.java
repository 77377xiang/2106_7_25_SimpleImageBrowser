package com.xiang.simpleimagebrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int[] images = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
    int currentImg = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        //创建ImageView 组件
        final ImageView image = new ImageView(this);
        //组件加入布局
        main.addView(image);
        //初始化显示第一张图片
        image.setImageResource(images[0]);
        //点击浏览下一张
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //++i,先加一在运算  % 取模
                image.setImageResource(images[++currentImg%images.length]);
            }
        });
    }
}
