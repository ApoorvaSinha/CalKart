package com.example.myproject1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_desert extends Fragment {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    CheckBox dc1,dc2,dc3,dc4,dc5,dc6,dc7,dc8;
    Button b1,b2,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ImageButton b3;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16;
    String res,res1,res2,res3,res4,res5,res6,res7,re,re1,re2,re3,re4,re5,re6,re7;
    SharedPreferences dsp;
    private static Fragment_desert dinstance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        dinstance = this;
        return inflater.inflate(R.layout.fragment_desert,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1 = getActivity().findViewById(R.id.dtextView);
        t2 = getActivity().findViewById(R.id.dtextView1);
        t3 = getActivity().findViewById(R.id.dtextView2);
        t4 = getActivity().findViewById(R.id.dtextView3);
        t5 = getActivity().findViewById(R.id.dtextView4);
        t6 = getActivity().findViewById(R.id.dtextView5);
        t7 = getActivity().findViewById(R.id.dtextView6);
        t8 = getActivity().findViewById(R.id.dtextView7);
        t9 = getActivity().findViewById(R.id.dtextView8);
        t10 = getActivity().findViewById(R.id.dtextView9);
        t11 = getActivity().findViewById(R.id.dtextView10);
        t12 = getActivity().findViewById(R.id.dtextView11);
        t13 = getActivity().findViewById(R.id.dtextView12);
        t14 = getActivity().findViewById(R.id.dtextView13);
        t15 = getActivity().findViewById(R.id.dtextView14);
        t16 = getActivity().findViewById(R.id.dtextView15);
        b1 = getActivity().findViewById(R.id.dbutton);
        b2 = getActivity().findViewById(R.id.dbutton1);
        b5 = getActivity().findViewById(R.id.dbutton2);
        b6 = getActivity().findViewById(R.id.dbutton3);
        b7 = getActivity().findViewById(R.id.dbutton4);
        b8 = getActivity().findViewById(R.id.dbutton5);
        b9 = getActivity().findViewById(R.id.dbutton6);
        b10 = getActivity().findViewById(R.id.dbutton7);
        b11 = getActivity().findViewById(R.id.dbutton8);
        b12 = getActivity().findViewById(R.id.dbutton9);
        b13 = getActivity().findViewById(R.id.dbutton10);
        b14 = getActivity().findViewById(R.id.dbutton11);
        b15 = getActivity().findViewById(R.id.dbutton12);
        b16 = getActivity().findViewById(R.id.dbutton13);
        b17 = getActivity().findViewById(R.id.dbutton14);
        b18 = getActivity().findViewById(R.id.dbutton15);
        b3 = getActivity().findViewById(R.id.imageButton);
        dc1 = getActivity().findViewById(R.id.dcheckBox);
        dc2 = getActivity().findViewById(R.id.dcheckBox1);
        dc3 = getActivity().findViewById(R.id.dcheckBox2);
        dc4 = getActivity().findViewById(R.id.dcheckBox3);
        dc5 = getActivity().findViewById(R.id.dcheckBox4);
        dc6 = getActivity().findViewById(R.id.dcheckBox5);
        dc7 = getActivity().findViewById(R.id.dcheckBox6);
        dc8 = getActivity().findViewById(R.id.dcheckBox7);

        dc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b1.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 90;

                    @Override
                    public void onClick(View v) {
                        if (dc1.isChecked() == true) {
                            if (g1 != 0 || g2 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b2.setOnClickListener(new View.OnClickListener() {
                            int w1 = x1;
                            int y1 = x2;

                            @Override
                            public void onClick(View v) {

                                if (dc1.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w1 > 1) {
                                    y1 = y1 - 90;
                                    w1--;
                                }
                                re = String.valueOf(w1);
                                t2.setText(String.valueOf(w1));
                                res = String.valueOf(y1);
                                t1.setText(res);
                                g1 = Integer.parseInt(re);
                                g2 = Integer.parseInt(res);
                            }
                        });
                    }

                    private void increments2() {
                        i = g1 + 1;
                        j = g2 + 90;
                        re = String.valueOf(i);
                        t2.setText(re);
                        res = String.valueOf(j);
                        t1.setText(res);
                        x1 = Integer.parseInt(re);
                        x2 = Integer.parseInt(res);
                        g1 = 0;
                        g2 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 90;
                        re = String.valueOf(i);
                        t2.setText(re);
                        res = String.valueOf(j);
                        t1.setText(res);
                        x1 = Integer.parseInt(re);
                        x2 = Integer.parseInt(res);
                    }

                });
            }
        });

        dc2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b5.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 125;

                    @Override
                    public void onClick(View v) {
                        if (dc2.isChecked() == true) {
                            if (g3 != 0 || g4 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b6.setOnClickListener(new View.OnClickListener() {
                            int y2 = x4;
                            int w2 = x3;

                            @Override
                            public void onClick(View v) {

                                if (dc2.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w2 > 1) {
                                    y2 = y2 - 125;
                                    w2--;
                                }
                                re1 = String.valueOf(w2);
                                t4.setText(re1);
                                res1 = String.valueOf(y2);
                                t3.setText(res1);
                                g3 = Integer.parseInt(re1);
                                g4 = Integer.parseInt(res1);
                            }

                        });
                    }

                    private void increments2() {
                        i = g3 + 1;
                        j = g4 + 125;
                        re1 = String.valueOf(i);
                        t4.setText(re1);
                        res1 = String.valueOf(j);
                        t3.setText(res1);
                        x3 = Integer.parseInt(re1);
                        x4 = Integer.parseInt(res1);
                        g3 = 0;
                        g4 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 125;
                        res1 = String.valueOf(j);
                        t3.setText(res1);
                        re1 = String.valueOf(i);
                        t4.setText(re1);
                        x3 = Integer.parseInt(re1);
                        x4 = Integer.parseInt(res1);
                    }
                });
            }
        });

        dc3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b7.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 115;

                    @Override
                    public void onClick(View v) {
                        if (dc3.isChecked() == true) {
                            if (g5 != 0 || g6 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b8.setOnClickListener(new View.OnClickListener() {
                            int y3 = x6;
                            int w3 = x5;

                            @Override
                            public void onClick(View v) {
                                if (dc3.isChecked() == true) {
                                    decrements();
                                }
                            }

                            private void decrements() {
                                if (w3 > 1) {
                                    y3 = y3 - 115;
                                    w3--;
                                }
                                re2 = String.valueOf(w3);
                                t6.setText(re2);
                                res2 = String.valueOf(y3);
                                t5.setText(res2);
                                g5 = Integer.parseInt(re2);
                                g6 = Integer.parseInt(res2);
                            }
                        });
                    }

                    private void increments2() {
                        i = g5 + 1;
                        j = g6 + 115;
                        re2 = String.valueOf(i);
                        t6.setText(re2);
                        res2 = String.valueOf(j);
                        t5.setText(res2);
                        x5 = Integer.parseInt(re2);
                        x6 = Integer.parseInt(res2);
                        g5 = 0;
                        g6 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 115;
                        re2 = String.valueOf(i);
                        t6.setText(re2);
                        res2 = String.valueOf(j);
                        t5.setText(res2);
                        x5 = Integer.parseInt(re2);
                        x6 = Integer.parseInt(res2);
                    }
                });
            }

        });

        dc4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b9.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 200;

                    @Override
                    public void onClick(View v) {
                        if (dc4.isChecked() == true) {
                            if (g7 != 0 || g8 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b10.setOnClickListener(new View.OnClickListener() {
                            int y4 = x8;
                            int w4 = x7;

                            @Override
                            public void onClick(View v) {

                                if (dc4.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w4 > 1) {
                                    y4 = y4 - 200;
                                    w4--;
                                }
                                re3 = String.valueOf(w4);
                                t8.setText(re3);
                                res3 = String.valueOf(y4);
                                t7.setText(res3);
                                g7 = Integer.parseInt(re3);
                                g8 = Integer.parseInt(res3);
                            }
                        });
                    }

                    private void increments2() {
                        i = g7 + 1;
                        j = g8 + 200;
                        re3 = String.valueOf(i);
                        t8.setText(re3);
                        res3 = String.valueOf(j);
                        t7.setText(res3);
                        x7 = Integer.parseInt(re3);
                        x8 = Integer.parseInt(res3);
                        g7 = 0;
                        g8 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 200;
                        re3 = String.valueOf(i);
                        t8.setText(re3);
                        res3 = String.valueOf(j);
                        t7.setText(res3);
                        x7 = Integer.parseInt(re3);
                        x8 = Integer.parseInt(res3);
                    }
                });
            }

        });

        dc5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b11.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 215;

                    @Override
                    public void onClick(View v) {
                        if (dc5.isChecked() == true) {
                            if (g9 != 0 || g10 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b12.setOnClickListener(new View.OnClickListener() {
                            int y5 = x10;
                            int w5 = x9;

                            @Override
                            public void onClick(View v) {

                                if (dc5.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 215;
                                    w5--;
                                }
                                re4 = String.valueOf(w5);
                                t10.setText(re4);
                                res4 = String.valueOf(y5);
                                t9.setText(res4);
                                g9 = Integer.parseInt(re4);
                                g10 = Integer.parseInt(res4);
                            }
                        });
                    }

                    private void increments2() {
                        i = g9 + 1;
                        j = g10 + 215;
                        re4 = String.valueOf(i);
                        t10.setText(re4);
                        res4 = String.valueOf(j);
                        t9.setText(res4);
                        x9 = Integer.parseInt(re4);
                        x10 = Integer.parseInt(res4);
                        g9 = 0;
                        g10 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 215;
                        re4 = String.valueOf(i);
                        t10.setText(re4);
                        res4 = String.valueOf(j);
                        t9.setText(res4);
                        x9 = Integer.parseInt(re4);
                        x10 = Integer.parseInt(res4);
                    }
                });
            }

        });

        dc6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b13.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 180;

                    @Override
                    public void onClick(View v) {
                        if (dc6.isChecked() == true) {
                            if (g11 != 0 || g12 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b14.setOnClickListener(new View.OnClickListener() {
                            int y5 = x12;
                            int w5 = x11;

                            @Override
                            public void onClick(View v) {

                                if (dc6.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 180;
                                    w5--;
                                }
                                re5 = String.valueOf(w5);
                                t12.setText(re5);
                                res5 = String.valueOf(y5);
                                t11.setText(res5);
                                g11 = Integer.parseInt(re5);
                                g12 = Integer.parseInt(res5);
                            }
                        });
                    }

                    private void increments2() {
                        i = g11 + 1;
                        j = g12 + 180;
                        re5 = String.valueOf(i);
                        t12.setText(re5);
                        res = String.valueOf(j);
                        t11.setText(res5);
                        x11 = Integer.parseInt(re5);
                        x12 = Integer.parseInt(res5);
                        g11 = 0;
                        g12 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 180;
                        re5 = String.valueOf(i);
                        t12.setText(re5);
                        res5 = String.valueOf(j);
                        t11.setText(res5);
                        x11 = Integer.parseInt(re5);
                        x12 = Integer.parseInt(res5);
                    }
                });
            }

        });

        dc7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b15.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 140;

                    @Override
                    public void onClick(View v) {
                        if (dc7.isChecked() == true) {
                            if (g13 != 0 || g14 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b16.setOnClickListener(new View.OnClickListener() {
                            int y5 = x14;
                            int w5 = x13;

                            @Override
                            public void onClick(View v) {

                                if (dc7.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 140;
                                    w5--;
                                }
                                re6 = String.valueOf(w5);
                                t14.setText(re6);
                                res6 = String.valueOf(y5);
                                t13.setText(res6);
                                g13 = Integer.parseInt(re6);
                                g14 = Integer.parseInt(res6);
                            }
                        });
                    }

                    private void increments2() {
                        i = g13 + 1;
                        j = g14 + 140;
                        re6 = String.valueOf(i);
                        t14.setText(re6);
                        res6 = String.valueOf(j);
                        t13.setText(res6);
                        x13 = Integer.parseInt(re6);
                        x14 = Integer.parseInt(res6);
                        g13 = 0;
                        g14 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 140;
                        re6 = String.valueOf(i);
                        t14.setText(re6);
                        res6 = String.valueOf(j);
                        t13.setText(res6);
                        x13 = Integer.parseInt(re6);
                        x14 = Integer.parseInt(res6);
                    }
                });
            }

        });

        dc8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b17.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 130;

                    @Override
                    public void onClick(View v) {
                        if (dc8.isChecked() == true) {
                            if (g15 != 0 || g16 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b18.setOnClickListener(new View.OnClickListener() {
                            int y5 = x16;
                            int w5 = x15;

                            @Override
                            public void onClick(View v) {

                                if (dc8.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 130;
                                    w5--;
                                }
                                re7 = String.valueOf(w5);
                                t16.setText(re7);
                                res7 = String.valueOf(y5);
                                t15.setText(res7);
                                g15 = Integer.parseInt(re7);
                                g16 = Integer.parseInt(res7);
                            }
                        });
                    }

                    private void increments2() {
                        i = g15 + 1;
                        j = g16 + 130;
                        re7 = String.valueOf(i);
                        t16.setText(re7);
                        res7 = String.valueOf(j);
                        t15.setText(res7);
                        x15 = Integer.parseInt(re7);
                        x16 = Integer.parseInt(res7);
                        g15 = 0;
                        g16 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 130;
                        re7 = String.valueOf(i);
                        t16.setText(re7);
                        res7 = String.valueOf(j);
                        t15.setText(res7);
                        x15 = Integer.parseInt(re7);
                        x16 = Integer.parseInt(res7);
                    }
                });
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(getActivity(), MainActivity.class);
                startActivity(obj3);
            }
        });
    }

    public static Fragment_desert dgetInstance() {
        return dinstance;
    }
    public void dcalcu(){
        int dtotal = 0;
        String ditem="",dqty="",damt="";
        if (dc1.isChecked() == true) {

            ditem = ditem + dc1.getText().toString() + "\n";
            dqty = dqty + t2.getText().toString() + "\n";
            damt = damt + t1.getText().toString() + "\n";
            String t = t1.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);
        }
        if (dc2.isChecked() == true) {
            ditem = ditem + dc2.getText().toString() + "\n";
            dqty = dqty + t4.getText().toString() + "\n";
            damt = damt + t3.getText().toString() + "\n";
            String t = t3.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);
        }
        if (dc3.isChecked() == true) {
            ditem = ditem + dc3.getText().toString() + "\n";
            dqty = dqty + t6.getText().toString() + "\n";
            damt = damt + t5.getText().toString() + "\n";
            String t = t5.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);
        }
        if (dc4.isChecked() == true) {
            ditem = ditem + dc4.getText().toString() + "\n";
            dqty = dqty + t8.getText().toString() + "\n";
            damt = damt + t7.getText().toString() + "\n";
            String t = t7.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);

        }
        if (dc5.isChecked() == true) {
            ditem = ditem + dc5.getText().toString() + "\n";
            dqty = dqty + t10.getText().toString() + "\n";
            damt = damt + t9.getText().toString() + "\n";
            String t = t9.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);

        }
        if (dc6.isChecked() == true) {
            ditem = ditem + dc6.getText().toString() + "\n";
            dqty = dqty + t12.getText().toString() + "\n";
            damt = damt + t11.getText().toString() + "\n";
            String t = t11.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);

        }
        if (dc7.isChecked() == true) {
            ditem = ditem + dc7.getText().toString() + "\n";
            dqty = dqty + t14.getText().toString() + "\n";
            damt = damt + t13.getText().toString() + "\n";
            String t = t13.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);

        }
        if (dc8.isChecked() == true) {
            ditem = ditem + dc8.getText().toString() + "\n";
            dqty = dqty + t16.getText().toString() + "\n";
            damt = damt + t15.getText().toString() + "\n";
            String t = t15.getText().toString();
            dtotal = dtotal + Integer.parseInt(t);

        }
        dsp=this.getActivity().getSharedPreferences("dcalis", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=dsp.edit();
        editor.putString("k1",ditem);
        editor.putString("k2",dqty);
        editor.putString("k3", damt);
        editor.putInt("k4", dtotal);
        editor.commit();
    }

}
