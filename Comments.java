package com.murali.outofboxforstudent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Comments extends Activity {  
   Button bt;
   EditText et;
	@Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.comments); 
        bt=(Button)findViewById(R.id.mailit);
        et=(EditText)findViewById(R.id.comment);
    }  
	
	public void onBtnClick(View v){
		Intent i=new Intent(Intent.ACTION_SEND);
    	i.setData(Uri.parse("email"));
    	String[] s={"mcubereddy@gmail.com"};
    	
    	i.putExtra(Intent.EXTRA_EMAIL, s);
    	i.putExtra(Intent.EXTRA_SUBJECT, "Comments on OutOfBoxForStudent");
    	i.putExtra(Intent.EXTRA_TEXT, et.getText().toString());
    	i.setType("message/rfc822");
    	Intent chooser= Intent.createChooser(i, "Launch Email");
    	startActivity(chooser);
	}

}
