package com.example.mynetcamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    EditText e1,e2;
    TextView t1;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        t1=(TextView)findViewById(R.id.textView8);
        b2=(Button)findViewById(R.id.button65);
        b3=(Button)findViewById(R.id.button66);
        b4=(Button)findViewById(R.id.button67);
        b5=(Button)findViewById(R.id.button68);
        b6=(Button)findViewById(R.id.button69);
        b7=(Button)findViewById(R.id.button70);
        b8=(Button)findViewById(R.id.button71);
        b9=(Button)findViewById(R.id.button72);
        b10 =(Button)findViewById(R.id.button73);
        b11=(Button)findViewById(R.id.button74);
        b12=(Button)findViewById(R.id.button75);
        b13=(Button)findViewById(R.id.button76);
        b14=(Button)findViewById(R.id.button77);
        b15=(Button)findViewById(R.id.button78);
        b16=(Button)findViewById(R.id.button79);
        b17=(Button)findViewById(R.id.button80);
        b18=(Button)findViewById(R.id.button81);
        b19=(Button)findViewById(R.id.button82);
        b20=(Button)findViewById(R.id.button83);
        b1=(Button)findViewById(R.id.button64);
        e1=(EditText)findViewById(R.id.editTextCal1);
        e2=(EditText)findViewById(R.id.editTextCal2);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Calculator.this,Sixth.class);
                startActivity(i2);
                finish();
            }
        });
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.7f);
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"9");
                    }
                });
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+"0");
                    }
                });
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText()+".");
                    }
                });
                b16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText("");
                    }
                });
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"9");
                    }
                });
                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+"0");
                    }
                });
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText()+".");
                    }
                });
                b16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText("");
                    }
                });

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3=f3.toString();
                t1.setText(s3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3=f3.toString();
                t1.setText(s3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=f3.toString();
                t1.setText(s3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s3=f3.toString();
                t1.setText(s3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double d1=Math.toRadians(d);
                Double d2=Math.cos(d1);
                String s2=d2.toString();
                t1.setText(s2);
                ts.speak(s2,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double d1=Math.toRadians(d);
                Double d2=Math.sin(d1);
                String s2=d2.toString();
                t1.setText(s2);
                ts.speak(s2,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double d1=Math.toRadians(d);
                Double d2=Math.tan(d1);
                String s2=d2.toString();
                t1.setText(s2);
                ts.speak(s2,TextToSpeech.QUEUE_FLUSH,null);
                e1.setText("");
                e2.setText("");
            }
        });


    }
}


