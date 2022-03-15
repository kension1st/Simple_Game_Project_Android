package game.baru;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class q4 extends Activity {
	Button btn1,btna,btnb,btnc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q4);
		btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(pertama);
        btna = (Button) findViewById(R.id.button2);
        btna.setOnClickListener(zonk);
        btnb = (Button) findViewById(R.id.button3);
        btnb.setOnClickListener(zonk);
        btnc = (Button) findViewById(R.id.button4);
        btnc.setOnClickListener(zonk);
    };
    private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ac();
    	}
    };
    void ma(){
    	Intent kon = new Intent (this,q5.class);
    	startActivity(kon);
    	}
    
    private OnClickListener zonk = new OnClickListener() {
    	public void onClick(View v) {
    	sh();
    	}
    };
    void zk(){
    	Intent kon = new Intent (this,traps.class);
    	startActivity(kon);
    	}
    
    
    
    
    void ac(){
    	AlertDialog al=new AlertDialog.Builder(this).create();
    	al.setTitle("Hasil");
    	al.setMessage("Semangat Gan! Dikit Lagi!");
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
    	al.setMessage("Kok Gak Bisa Gan ? Adeh!");
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
    	al.setMessage("Belum Selesai Udah Mau Keluar Aja!");
    	al.setButton("Lanjut", new DialogInterface.OnClickListener() {
    		
    		public void onClick(DialogInterface dialog, int which) {
    			// TODO Auto-generated method stub
    		}
    	});
    	al.show();

    }
		}