package game.baru;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class option extends Activity {
	Button a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.option);
		a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(pertama);
	}
	private OnClickListener pertama = new OnClickListener() {
    	public void onClick(View v) {
    	ma();
    	}
    };
    void ma(){
    	Intent kon = new Intent (this,start.class);
    	startActivity(kon);
    	}
}

