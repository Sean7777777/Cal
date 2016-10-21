package com.example.administrator.computer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_point;
    private Button btn_add;
    private Button btn_dec;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_clear;
    private Button btn_del;
    private Button btn_eql;
    private Button btn_bin;
    private Button btn_Oct;
    private Button btn_Hex;
    private TextView text;
    private TextView text1;
    String str1="0.0";
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0=(Button) findViewById(R.id.button_0);
        btn_1=(Button) findViewById(R.id.button_1);
        btn_2=(Button) findViewById(R.id.button_2);
        btn_3=(Button) findViewById(R.id.button_3);
        btn_4=(Button) findViewById(R.id.button_4);
        btn_5=(Button) findViewById(R.id.button_5);
        btn_6=(Button) findViewById(R.id.button_6);
        btn_7=(Button) findViewById(R.id.button_7);
        btn_8=(Button) findViewById(R.id.button_8);
        btn_9=(Button) findViewById(R.id.button_9);
        btn_point=(Button) findViewById(R.id.button_point);
        btn_add=(Button) findViewById(R.id.button_add);
        btn_dec=(Button) findViewById(R.id.button_dec);
        btn_mul=(Button) findViewById(R.id.button_mul);
        btn_div=(Button) findViewById(R.id.button_div);
        btn_clear=(Button) findViewById(R.id.button_clear);
        btn_del=(Button) findViewById(R.id.button_del);
        btn_eql=(Button) findViewById(R.id.button_equal);
        btn_bin= (Button) findViewById(R.id.button_Bin);
        btn_Oct= (Button) findViewById(R.id.button_Otc);
        btn_Hex= (Button) findViewById(R.id.button_Hex);
        text=(TextView) findViewById(R.id.edit);
        text1=(TextView) findViewById(R.id.edit1);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_dec.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_eql.setOnClickListener(this);
        btn_bin.setOnClickListener(this);
        btn_Oct.setOnClickListener(this);
        btn_Hex.setOnClickListener(this);
        if(text1.getText().toString().length()>14)
            text1.setTextSize(20);
        if(text.getText().toString().length()>14)
            text.setTextSize(20);
    }
    @Override
    public void onClick(View v) {
        String str=text1.getText().toString();

        switch (v.getId()){
            case R.id.button_0:
            case R.id.button_1:
            case R.id.button_2:
            case R.id.button_3:
            case R.id.button_4:
            case R.id.button_5:
            case R.id.button_6:
            case R.id.button_7:
            case R.id.button_8:
            case R.id.button_9:
                text1.setText(str+((Button)v).getText());
                break;
            case R.id.button_point:
                if(str.charAt(str.length()-1)=='.')
                    text1.setText(str);
                else
                    text1.setText(str+btn_point.getText());
                break;
            case R.id.button_add:
                if(!str.equals("")) {
                    if (str.charAt(str.length() - 1) != '+' && str.charAt(str.length() - 1) != '-' && str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 1) != '/') {
                        c = '+';
                        str1 = text1.getText().toString();
                        text1.setText(str1 + "+");
                    } else
                        text1.setText(str);
                }else
                   text1.setText("");
                break;
            case R.id.button_dec:
                if(!str.equals("")) {
                    if (str.charAt(str.length() - 1) != '+' && str.charAt(str.length() - 1) != '-' && str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 1) != '/') {
                        c = '-';
                        str1 = text1.getText().toString();
                        text1.setText(str1 + "-");
                    } else
                        text1.setText(str);
                }else
                   text1.setText("");
                break;
            case R.id.button_mul:
                if(!str.equals("")) {
                    if (str.charAt(str.length() - 1) != '+' && str.charAt(str.length() - 1) != '-' && str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 1) != '/') {
                        c = '*';
                        str1 = text1.getText().toString();
                        text1.setText(str1 + "*");
                    } else
                        text1.setText(str);
                }else
                text1.setText("");
                break;
            case R.id.button_div:
                if(!str.equals("")) {
                    if (str.charAt(str.length() - 1) != '+' && str.charAt(str.length() - 1) != '-' && str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 1) != '/') {
                        c = '/';
                        str1 = text1.getText().toString();
                        text1.setText(str1 + "/");
                    } else
                        text1.setText(str);
                }else
                text1.setText("");
                break;
            case R.id.button_clear:
                text.setText("");
                text1.setText("");
                break;
            case R.id.button_del:
                if(str.length()==0)
                    text1.setText("");
                else
                    text1.setText(str.substring(0,str.length()-1));
                break;
            case R.id.button_Bin:
                    text.setText(str);
                if(!text.getText().toString().contains(".")) {
                    if (!text.getText().toString().equals("")) {
                        if(!text.getText().toString().contains("+")||!text.getText().toString().contains("-")||!text.getText().toString().contains("*")||!text.getText().toString().contains("/")) {
                            text1.setText(Integer.toBinaryString(Integer.parseInt(text.getText().toString())) + "");
                            Toast.makeText(MainActivity.this, "二进制", Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(MainActivity.this,"包含运算符，不能转换",Toast.LENGTH_SHORT).show();
                    } else
                        text1.setText("0");
                }else
                    DtoM(Double.parseDouble(text.getText().toString()),2);
                break;
            case R.id.button_Otc:
                if(!text.getText().toString().contains(".")) {
                    if (!text.getText().toString().equals("")) {
                        text1.setText(Integer.toOctalString(Integer.parseInt(text.getText().toString())) + "");
                        Toast.makeText(MainActivity.this, "八进制", Toast.LENGTH_SHORT).show();
                    } else
                        text1.setText("0");
                }else
                    DtoM(Double.parseDouble(text.getText().toString()),8);
                break;
            case R.id.button_Hex:
                if(!text.getText().toString().contains(".")) {
                    if (!text.getText().toString().equals("")) {
                        text1.setText(Integer.toHexString(Integer.parseInt(text.getText().toString())) + "");
                        Toast.makeText(MainActivity.this, "十六进制", Toast.LENGTH_SHORT).show();
                    } else
                        text1.setText("0");
                }else
                    DtoM(Double.parseDouble(text.getText().toString()),16);
                break;
            case R.id.button_equal:
                double result=0;
                if(str.length()!=0) {
                    if(str.contains("+")||str.contains("-")||str.contains("*")||str.contains("/")) {
                        String str2 = text1.getText().toString().substring(str1.length() + 1, str.length());
                        text.setText(text1.getText().toString());
                        if (!str1.equals("") && !str2.equals("")) {
                            double d1 = Double.parseDouble(str1);
                            double d2 = Double.parseDouble(str2);
                            if (c == '+')
                                result = d1 + d2;
                            if (c == '-')
                                result = d1 - d2;
                            if (c == '*') {
                                BigDecimal b1 = new BigDecimal(Double.toString(d1));
                                BigDecimal b2 = new BigDecimal(Double.toString(d2));
                                result = b1.multiply(b2).doubleValue();
                            }
                            if (c == '/') {
                                if (d2 == 0)
                                    Toast.makeText(MainActivity.this, "分母不能为0", Toast.LENGTH_SHORT).show();
                                else {
                                    double b = d1 / d2;
                                    result = Double.parseDouble(new DecimalFormat("#.00000000").format(b));
                                }
                            }
                            if (!str1.contains(".") && !text.getText().toString().contains(".")) {
                                if (c != '/') {
                                    int res = (int) result;
                                    text1.setText(res + "");
                                } else
                                    text1.setText(result + "");
                            } else
                                text1.setText(result + "");
                        } else
                            text1.setText("0");
                    }else
                        text1.setText(str);
                }  break;
        }
    }

    public void DtoM(double value,int radix){
        int val=(int)value;
        double m=value-val;
        StringBuilder builder=new StringBuilder();
        int rem=0,quo=0;
        while(val!=0){
            quo=val/radix;
            rem=val%radix;
            builder.append(rem);
            val=quo;
        }
        builder.reverse();
        builder.append(".");
        int count=8;
        double num=0;
        if(radix==2) {
            for (int i = 0; i < count; i++) {
                num = m * radix;
                if (num >= 1) {
                    builder.append(1);
                    m = num - 1;
                } else {
                    builder.append(0);
                    m = num;
                }
            }
        }else if(radix==8){
            for(int i=0;i<count;i++){
                num=m*radix;
                if(num>=1){
                    int number=(int)num;
                    builder.append(number);
                    m=num-number;
                }else{
                    builder.append(0);
                    m=num;
                }
            }
        }else if(radix==16){
            for(int i=0;i<count;i++){
                num=m*radix;
                if(num>=1){
                    if(num<10) {
                        int number = (int) num;
                        builder.append(number);
                        m = num - number;
                    }else {
                        int number = (int) num;
                        char ch = (char) ('a' + number - 10);
                        builder.append(ch);
                        m=num-number;
                    }
                }else{
                    builder.append(0);
                    m=num;
                }
            }
        }
        text1.setText(builder.toString());
    }

}
