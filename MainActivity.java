package com.faintingdonkey.greekname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap<String, String[]> alphabet = new HashMap<>();
    String name;
    TextView tvName;
    EditText etName;
    Button btnGetName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initAlphabet();
    }

    private void initView() {
        etName = (EditText) findViewById(R.id.et_name);
        tvName = (TextView) findViewById(R.id.tv_greekname);
        btnGetName = (Button) findViewById(R.id.btn_get_name);

        btnGetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString() == "Jennifer Gargett"){
                    Toast.makeText(getApplicationContext(), "YO YO YO DIGGIE DE DIGGIE DAY, ALSO, TWINKLING MINT LEAF", Toast.LENGTH_LONG).show();
                }else if(etName.getText().toString() == "Waqar-un-nisa Nabi"){
                    Toast.makeText(getApplicationContext(), "I am the developer KINNNNNG", Toast.LENGTH_LONG).show();
                }else if(etName.getText().toString() == "Sexy Banana"){
                    Toast.makeText(getApplicationContext(), "Hey Sexy ;) you into bananas? I'll peel your skin off first.", Toast.LENGTH_LONG).show();
                }else if(etName.getText().toString() == "Ryan Maloney"){
                    Toast.makeText(getApplicationContext(), "He is the african king", Toast.LENGTH_LONG).show();

                }
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
            String l = Character.toString(Character.toLowerCase(letter));

            greekName += alphabet.get(l)[index];

            greekNumber += Integer.parseInt(alphabet.get(l)[2]);
        }

        String text = "Greek Name: \n" + greekName + "\n \n" + "Greek Number: \n" + greekNumber;
        tvName.setText(text);
    }

    /**
     * dont judge this terrible code! Only God can judge my code. XD
     */
    private void initAlphabet() {
        alphabet.put("a", new String[]{"α", "Α", ""});
        alphabet.put("b", new String[]{"β", "Β", ""});
        alphabet.put("c", new String[]{"χ", "Χ", ""});
        alphabet.put("d", new String[]{"δ", "Δ", ""});
        alphabet.put("e", new String[]{"ε", "Ε", ""});
        alphabet.put("f", new String[]{"φ", "Φ", ""});
        alphabet.put("g", new String[]{"γ", "Γ", ""});
        alphabet.put("h", new String[]{"η", "Η", ""});
        alphabet.put("i", new String[]{"ι", "Ι", ""});
        alphabet.put("j", new String[]{"τζ", "TZ", ""});
        alphabet.put("k", new String[]{"κ", "Κ", ""});
        alphabet.put("l", new String[]{"λ", "Λ", ""});
        alphabet.put("m", new String[]{"μ", "Μ", ""});
        alphabet.put("n", new String[]{"ν", "Ν", ""});
        alphabet.put("o", new String[]{"ο", "Ο", ""});
        alphabet.put("p", new String[]{"π", "Π", ""});
        alphabet.put("q", new String[]{"θ", "Θ", ""});
        alphabet.put("r", new String[]{"ρ", "Ρ", ""});
        alphabet.put("s", new String[]{"σ", "Σ", ""});
        alphabet.put("t", new String[]{"τ", "Τ", ""});
        alphabet.put("u", new String[]{"υ", "Υ", ""});
        alphabet.put("v", new String[]{"β", "Β", ""});
        alphabet.put("w", new String[]{"ω", "Ω", ""});
        alphabet.put("x", new String[]{"ξ", "Ξ", ""});
        alphabet.put("y", new String[]{"ψ", "Ψ", ""});
        alphabet.put("z", new String[]{"ζ", "Ζ", ""});
        alphabet.put("z", new String[]{" ", " ", "0"});

    }
}
