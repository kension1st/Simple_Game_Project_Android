package game.baru;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class traps extends Activity {
	Button btn1,btna,btnb,btnc;
	TextView a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.traps);
		btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(zonk);
        btna = (Button) findViewById(R.id.button2);
        btna.setOnClickListener(zonk);
        btnb = (Button) findViewById(R.id.button3);
        btnb.setOnClickListener(zonk);
        btnc = (Button) findViewById(R.id.button4);
        btnc.setOnClickListener(zonk);
        a = (TextView) findViewById(R.id.textView1);
        a.setOnClickListener(pertama);
    };
    private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ac();
    	}
    };
    void ma(){
    	Intent kon = new Intent (this,q1.class);
    	startActivity(kon);
    	}
    
    private OnClickListener zonk = new OnClickListener() {
    	public void onClick(View v) {
    	sh();
    	}
    };
    void zk(){
    	Intent kon = new Intent (this,zonk.class);
    	startActivity(kon);
    	}
    
    
    
    
    void ac(){
    	AlertDialog al=new AlertDialog.Builder(this).create();
    	al.setTitle("Hasil");
    	al.setMessage("Pinter Lu Gan! Ayo Balik Ke Soal Utama!");
    	al.setButton("Lanjut", new DialogInterface.OnClickListener() {
    		
    		public void onClick(DialogInterface dialog, int which) {
    			// TODO Auto-generated method stub
    			ma();
    		}
    	});
    	al.show();
    	}
    
    void sh(){
    	AlertDialog al=new AlertDialog.Builder(this).create();
    	al.setTitle("Hasil");
    	al.setMessage("Emang Gak Bisa Di Harapkan Ni !!!");
    	al.setButton("Ok", new DialogInterface.OnClickListener() {
    		
    		public void onClick(DialogInterface dialog, int which) {
    			// TODO Auto-generated method stub
    			zk();
    		}
    	});
    	al.show();
    	}
    
    
    
    
    @Override
    public void onBackPressed() {
    	
    	AlertDialog al=new AlertDialog.Builder(this).create();
    	al.setTitle("Perhatian");
    	al.setMessage("Masak Nyerah ????");
    	al.setButton("Lanjut", new DialogInterface.OnClickListener() {
    		
    		public void onClick(DialogInterface dialog, int which) {
    			// TODO Auto-generated method stub
    		}
    	});
    	al.show();

    }
		}