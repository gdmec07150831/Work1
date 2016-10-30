package cn.edu.gdmec.s07150831.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;

    private MultiAutoCompleteTextView macTextView;

    private String[] res = {"beijing1","beijing2","shanghai","guangzhou","shandong"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //单个搜索匹配
        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        //ArrayAdapter<String>是适配器，是数据和视图之间的桥梁，将数据罗列出来。
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);

        //多个搜索匹配，以逗号为分隔符
     macTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        macTextView.setAdapter(adapter);
        //设置以逗号为分隔符为结束符号
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
