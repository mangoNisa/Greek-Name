package com.faintingdonkey.greekname;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap<String, String[]> alphabet = new HashMap<>();
    String name;
    TextView tvName, tvNum, tvTitleName, tvTitleNum;
    EditText etName;
    Button btnGetName;
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initAlphabet();
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.et_name);
        tvTitleName = (TextView) findViewById(R.id.tv_titlename);
        tvNum = (TextView) findViewById(R.id.tv_num);
        tvTitleNum = (TextView) findViewById(R.id.tv_titlenum);
        tvName = (TextView) findViewById(R.id.tv_greekname);
        btnGetName = (Button) findViewById(R.id.btn_get_name);

        btnGetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().equals("Jennifer Gargett")){
                    Toast.makeText(getApplicationContext(), "YO YO YO DIGGIE DE DIGGIE DAY, ALSO, TWINKLING MINT LEAF", Toast.LENGTH_LONG).show();
                }else if(etName.getText().toString().equals("Waqar-un-nisa Nabi")){
                    Toast.makeText(getApplicationContext(), "I am the developer KINNNNNG", Toast.LENGTH_LONG).show();
                }else if(etName.getText().toString().equals("Sexy Banana")){
                    Toast.makeText(getApplicationContext(), "Hey Sexy ;) you into bananas? I'll peel your skin off first.", Toast.LENGTH_LONG).show();
                    MediaPlayer mPlayer = MediaPlayer.create(MainActivity.this, R.raw.banana);
                }else if(etName.getText().toString().equals("Ryan Maloney")){
                    Toast.makeText(getApplicationContext(), "He is the african king", Toast.LENGTH_LONG).show();
                    mPlayer = MediaPlayer.create(MainActivity.this, R.raw.lion);
                    mPlayer.start();
                }else if(etName.getText().toString().equals("Gulan Insay")) {
                    Toast.makeText(getApplicationContext(), "EGGGG: Glasgow is in ruins. This is a secret message. SAVE YOURSELF!1!>£3 >:(", Toast.LENGTH_LONG).show();
                    mPlayer = MediaPlayer.create(MainActivity.this, R.raw.lion);
                    mPlayer.start();
                }

                name = etName.getText().toString();

                translate();
            }
        });
    }

    private void translate() {
        String greekName = "";
        int greekNumber = 0;

        for(int i = 0; i < name.length(); i++){
            char letter = name.charAt(i);
            int index = 0;
            if(Character.isUpperCase(letter)){
                index = 1;
            }
            if(Character.isSpaceChar(letter)){
                greekName += " ";
            }else {
                String l = Character.toString(Character.toLowerCase(letter));

                greekName += alphabet.get(l)[index];

                greekNumber += Integer.parseInt(alphabet.get(l)[2]);
            }
        }

        tvTitleName.setVisibility(View.VISIBLE);
        tvName.setText(greekName);
        tvTitleNum.setVisibility(View.VISIBLE);
        tvNum.setText(greekNumber + "");
    }

    /**
     * dont judge this terrible code! Only God can judge my code. XD
     */
    private void initAlphabet() {
        alphabet.put("a", new String[]{"α", "Α", "1"});
        alphabet.put("b", new String[]{"β", "Β", "2"});
        alphabet.put("c", new String[]{"χ", "Χ", "600"});
        alphabet.put("d", new String[]{"δ", "Δ", "4"});
        alphabet.put("e", new String[]{"ε", "Ε", "5"});
        alphabet.put("f", new String[]{"φ", "Φ", "500"});
        alphabet.put("g", new String[]{"γ", "Γ", "3"});
        alphabet.put("h", new String[]{"η", "Η", "8"});
        alphabet.put("i", new String[]{"ι", "Ι", "10"});
        alphabet.put("j", new String[]{"τζ", "TZ", "307"});
        alphabet.put("k", new String[]{"κ", "Κ", "20"});
        alphabet.put("l", new String[]{"λ", "Λ", "30"});
        alphabet.put("m", new String[]{"μ", "Μ", "40"});
        alphabet.put("n", new String[]{"ν", "Ν", "50"});
        alphabet.put("o", new String[]{"ο", "Ο", "70"});
        alphabet.put("p", new String[]{"π", "Π", "80"});
        alphabet.put("q", new String[]{"θ", "Θ", "9"});
        alphabet.put("r", new String[]{"ρ", "Ρ", "100"});
        alphabet.put("s", new String[]{"σ", "Σ", "200"});
        alphabet.put("t", new String[]{"τ", "Τ", "300"});
        alphabet.put("u", new String[]{"υ", "Υ", "400"});
        alphabet.put("v", new String[]{"β", "Β", "2"});
        alphabet.put("w", new String[]{"ω", "Ω", "800"});
        alphabet.put("x", new String[]{"ξ", "Ξ", "60"});
        alphabet.put("y", new String[]{"ψ", "Ψ", "700"});
        alphabet.put("z", new String[]{"ζ", "Ζ", "7"});
        alphabet.put("z", new String[]{" ", " ", "0"});

    }

    public void onDestroy() {
        mPlayer.stop();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        mPlayer.stop();
        super.onBackPressed();
    }
}
