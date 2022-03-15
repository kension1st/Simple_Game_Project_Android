package game.baru;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class start extends Activity {
	Button btn1,btn2,btn5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn1 = (Button) findViewById(R.id.play);
        btn1.setOnClickListener(pertama);
        btn2 = (Button) findViewById(R.id.option);
        btn2.setOnClickListener(kedua);
        btn5 = (Button) findViewById(R.id.keluar);
        btn5.setOnClickListener(
        		new OnClickListener() {
    		
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			finish();
    		}
    		});
        		
        
    };
    private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ma();
    	}
    };
  
    void ma(){
    	Intent kon = new Intent (this,q1.class);
    	startActivity(kon);
    	}
    private OnClickListener kedua = new OnClickListener() {
    	public void onClick(View v) {
    	ca();
    	}
    };
    void ca(){
    	Intent kon = new Intent (this,option.class);
    	startActivity(kon);
    	}
		
@Override
public void onBackPressed() {
	
	AlertDialog al=new AlertDialog.Builder(this).create();
	al.setTitle("Perhatian");
	al.setMessage("Apakah Anda Yakin Ingin Keluar");
	al.setButton("Ya", new DialogInterface.OnClickListener() {
		
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			finish();
		}
	});
	al.setButton2("Tidak", new DialogInterface.OnClickListener() {
		
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			
		}
	});
	al.show();

}
}
