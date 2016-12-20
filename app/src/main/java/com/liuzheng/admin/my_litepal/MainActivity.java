package com.liuzheng.admin.my_litepal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.crud.DataSupport;

import java.util.Date;
import java.util.List;

/**
 * 参考http://www.jianshu.com/p/557682e0a9f0  （懒人必备）Android开源数据库LitePal
 *     http://blog.csdn.net/guolin_blog/article/details/38556989  创建表和LitePal的基本用法
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.mButton);
        button2 = (Button) findViewById(R.id.mButton2);
        button2.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mButton:
                //添加一条数据
                News news = new News();
                news.setTitle("这是一条新闻标题");
                news.setContent("这是一条新闻内容");
                news.setPublishDate(new Date());
                news.save();
                if (news.save()) {
                    Toast.makeText(MainActivity.this, "存储成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "存储失败", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.mButton2:
                //想要获取DEST表中的所有数据
                List<News> mDestList = DataSupport.findAll(News.class);
                break;
        }
    }
}
