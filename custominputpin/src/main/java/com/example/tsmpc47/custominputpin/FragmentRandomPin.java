package com.example.tsmpc47.custominputpin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class FragmentRandomPin extends Fragment implements View.OnClickListener{

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_cancel, btn_ok;
    private ImageButton btn_hapus;
    private EditText edt;
    private String set = "";
    private String bintang = "";
    private int[] random = new int[]{0,1,2,3,4,5,6,7,8,9};
    private String data;
    private String message = "Xory, Max limit 5";
    private int limit = 5;

    public ResultListener mListenerResult;

    //private OnFragmentInteractionListener mListener;

    public FragmentRandomPin() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment randompin.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentRandomPin newInstance(String param1, String param2) {
        FragmentRandomPin fragment = new FragmentRandomPin();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        shuffle(random);
        View view = inflater.inflate(R.layout.fragment_randompin, container, false);

        edt = view.findViewById(R.id.edt);
        btn_0 = view.findViewById(R.id.btn_0);
        btn_1 = view.findViewById(R.id.btn_1);
        btn_2 = view.findViewById(R.id.btn_2);
        btn_3 = view.findViewById(R.id.btn_3);
        btn_4 = view.findViewById(R.id.btn_4);
        btn_5 = view.findViewById(R.id.btn_5);
        btn_6 = view.findViewById(R.id.btn_6);
        btn_7 = view.findViewById(R.id.btn_7);
        btn_8 = view.findViewById(R.id.btn_8);
        btn_9 = view.findViewById(R.id.btn_9);
        btn_cancel = view.findViewById(R.id.btn_cancel);
        btn_hapus = view.findViewById(R.id.btn_hapus);
        btn_ok = view.findViewById(R.id.btn_ok);

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

        return view;
    }

    public void setOnResultListener(ResultListener listener) {
        this.mListenerResult = listener;
    }

    private void shuffle(int[] array){
        for (int i = 0; i < array.length; i++) {
            int s = i+(int)(Math.random() * (array.length - i));
            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }

    private void toastMax(View v) {
        Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
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

    public FragmentRandomPin limitMax(int max){
        limit = max;
        return this;
    }

    public FragmentRandomPin limitMsg(String msg){
        message = msg;
        return this;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_0) {
            String nol = btn_0.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(nol);
            } else {
                conditionNotEmpaty(nol);
            }

        } else if (i == R.id.btn_1) {
            String satu = btn_1.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(satu);
            } else {
                conditionNotEmpaty(satu);
            }

        } else if (i == R.id.btn_2) {
            String dua = btn_2.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(dua);
            } else {
                conditionNotEmpaty(dua);
            }

        } else if (i == R.id.btn_3) {
            String tiga = btn_3.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(tiga);
            } else {
                conditionNotEmpaty(tiga);
            }

        } else if (i == R.id.btn_4) {
            String empat = btn_4.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(empat);
            } else {
                conditionNotEmpaty(empat);
            }

        } else if (i == R.id.btn_5) {
            String lima = btn_5.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(lima);
            } else {
                conditionNotEmpaty(lima);
            }

        } else if (i == R.id.btn_6) {
            String enam = btn_6.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(enam);
            } else {
                conditionNotEmpaty(enam);
            }

        } else if (i == R.id.btn_7) {
            String tujuh = btn_7.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(tujuh);
            } else {
                conditionNotEmpaty(tujuh);
            }

        } else if (i == R.id.btn_8) {
            String delapan = btn_8.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
            }else if (set.equals("")) {
                conditionEmpaty(delapan);
            } else {
                conditionNotEmpaty(delapan);
            }

        } else if (i == R.id.btn_9) {
            String sembilan = btn_9.getText().toString();
            if(set.length() >= limit){
                toastMax(v);
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
            mListenerResult.onButtonCancel();
        } else if(i == R.id.btn_ok){
            mListenerResult.onButtonOK(data);
        }
    }
}
