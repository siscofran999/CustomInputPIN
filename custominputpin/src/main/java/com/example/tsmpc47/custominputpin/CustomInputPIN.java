package com.example.tsmpc47.custominputpin;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CustomInputPIN extends ConstraintLayout implements View.OnClickListener {

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_cancel, btn_ok;
    private ImageButton btn_hapus;
    private EditText edt;
    private String set = "";
    private String bintang = "";
    private int[] random = new int[]{0,1,2,3,4,5,6,7,8,9};
    private String data;
    private int limit = 5;

    public ResultListener mListener;

    public void setOnResultListener(ResultListener listener) {
        this.mListener = listener;
    }

    public CustomInputPIN(Context context) {
        super(context,null);
    }

    public CustomInputPIN(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custompin,this,true);
        shuffle(random);

        edt = v.findViewById(R.id.edt);
        btn_0 = v.findViewById(R.id.btn_0);
        btn_1 = v.findViewById(R.id.btn_1);
        btn_2 = v.findViewById(R.id.btn_2);
        btn_3 = v.findViewById(R.id.btn_3);
        btn_4 = v.findViewById(R.id.btn_4);
        btn_5 = v.findViewById(R.id.btn_5);
        btn_6 = v.findViewById(R.id.btn_6);
        btn_7 = v.findViewById(R.id.btn_7);
        btn_8 = v.findViewById(R.id.btn_8);
        btn_9 = v.findViewById(R.id.btn_9);
        btn_cancel = v.findViewById(R.id.btn_cancel);
        btn_hapus = v.findViewById(R.id.btn_hapus);
        btn_ok = v.findViewById(R.id.btn_ok);

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
        btn_hapus.setOnClickListener(this);
        btn_cancel.setOnClickListener(this);
        btn_ok.setOnClickListener(this);

        for (int i = 0; i < random.length; i++) {
            switch (i){
                case 0:
                    btn_0.setText(String.valueOf(random[i]));
                    break;
                case 1:
                    btn_1.setText(String.valueOf(random[i]));
                    break;
                case 2:
                    btn_2.setText(String.valueOf(random[i]));
                    break;
                case 3:
                    btn_3.setText(String.valueOf(random[i]));
                    break;
                case 4:
                    btn_4.setText(String.valueOf(random[i]));
                    break;
                case 5:
                    btn_5.setText(String.valueOf(random[i]));
                    break;
                case 6:
                    btn_6.setText(String.valueOf(random[i]));
                    break;
                case 7:
                    btn_7.setText(String.valueOf(random[i]));
                    break;
                case 8:
                    btn_8.setText(String.valueOf(random[i]));
                    break;
                default:
                    btn_9.setText(String.valueOf(random[i]));
            }
        }
    }

    private void shuffle(int[] array){
        for (int i = 0; i < array.length; i++) {
            int s = i+(int)(Math.random() * (array.length - i));
            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_0) {
            String nol = btn_0.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(nol);
            } else {
                conditionNotEmpaty(nol);
            }

        } else if (i == R.id.btn_1) {
            String satu = btn_1.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(satu);
            } else {
                conditionNotEmpaty(satu);
            }

        } else if (i == R.id.btn_2) {
            String dua = btn_2.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(dua);
            } else {
                conditionNotEmpaty(dua);
            }

        } else if (i == R.id.btn_3) {
            String tiga = btn_3.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(tiga);
            } else {
                conditionNotEmpaty(tiga);
            }

        } else if (i == R.id.btn_4) {
            String empat = btn_4.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(empat);
            } else {
                conditionNotEmpaty(empat);
            }

        } else if (i == R.id.btn_5) {
            String lima = btn_5.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(lima);
            } else {
                conditionNotEmpaty(lima);
            }

        } else if (i == R.id.btn_6) {
            String enam = btn_6.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(enam);
            } else {
                conditionNotEmpaty(enam);
            }

        } else if (i == R.id.btn_7) {
            String tujuh = btn_7.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(tujuh);
            } else {
                conditionNotEmpaty(tujuh);
            }

        } else if (i == R.id.btn_8) {
            String delapan = btn_8.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(delapan);
            } else {
                conditionNotEmpaty(delapan);
            }

        } else if (i == R.id.btn_9) {
            String sembilan = btn_9.getText().toString();
            if(set.length() >= limit){
                Toast.makeText(v.getContext(), "Max "+limit, Toast.LENGTH_SHORT).show();
            }else if (set.equals("")) {
                conditionEmpaty(sembilan);
            } else {
                conditionNotEmpaty(sembilan);
            }
        } else if (i == R.id.btn_hapus) {
            int panjang = set.length();
            if (panjang == 0) {
                set = "";
            } else {
                if (data != null && data.length() > 0 ) {
                    data = data.substring(0, data.length() - 1);
                }
                StringBuilder sb = new StringBuilder(set);
                sb.delete(panjang - 1, panjang);
                String hapus = sb.toString();
                edt.setText(hapus);
                set = hapus;
            }
        } else if(i == R.id.btn_cancel){
            data = "";
            edt.setText("");
            set = "";
            bintang = "";
        } else if(i == R.id.btn_ok){
            mListener.onButtonOK(data);
        }
    }

    private void conditionNotEmpaty(String number) {
        data = data+number;
        set = bintang + number;
        bintang = set.replace(number, "*");
        edt.setText(bintang);
    }

    private void conditionEmpaty(String number) {
        data = number;
        set = number;
        bintang = set.replace(number, "*");
        edt.setText(bintang);
    }

    public void limitMax(int max){
        limit = max;
    }
}
