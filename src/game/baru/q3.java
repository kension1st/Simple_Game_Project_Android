package game.baru;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class q3 extends Activity {
	Button btn1,btna,btnb,btnc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q3);
		btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(zonk);
        btna = (Button) findViewById(R.id.button2);
        btna.setOnClickListener(zonk);
        btnb = (Button) findViewById(R.id.button3);
        btnb.setOnClickListener(pertama);
        btnc = (Button) findViewById(R.id.button4);
        btnc.setOnClickListener(zonk);
    };
    private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ac();
    	}
    };
    void ma(){
    	Intent kon = new Intent (this,q4.class);
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
    	al.setMessage("Ayo Lanjut Gan!!!!");
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
    	al.setMessage("Segini Aja Gak Bisa Adeh Lu Gan!!!");
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