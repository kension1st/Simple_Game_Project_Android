package game.baru;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class zonk extends Activity {
	TextView a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zonk);
		a = (TextView) findViewById(R.id.textView1);
        a.setOnClickListener(pertama);
	};

	private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ma();
    	}
    };
    void ma(){
    	Intent kon = new Intent (this,start.class);
    	startActivity(kon);
    	}
    @Override
    public void onBackPressed() {
    	
    	AlertDialog al=new AlertDialog.Builder(this).create();
    	al.setTitle("Perhatian");
    	al.setMessage("Click gambar bukan Back!!");
    	al.setButton("Ok", new DialogInterface.OnClickListener() {
    		
    		public void onClick(DialogInterface dialog, int which) {
    			// TODO Auto-generated method stub
    		}
    	});
    	al.show();

    }
	}