package com.faintingdonkey.greekname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap<String, String[]> alphabet = new HashMap<>();
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAlphabet();
        translate();
    }

    private void translate() {
        String greekname = "";
        int greeknumber = 0;

        for(int i = 0; i < name.length(); i++){
            char letter = name.charAt(i);
            int index = 0;
            if(Character.isUpperCase(letter)){
                index = 1;
            }
            String l = Character.toString(Character.toLowerCase(letter));

            greekname += alphabet.get(l)[index];

            greeknumber += Integer.parseInt(alphabet.get(l)[2]);
        }
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
    }
}
