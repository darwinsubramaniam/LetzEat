package udworldnet.com.letzeat.LogicBlock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.baasbox.android.BaasHandler;
import com.baasbox.android.RequestToken;
import com.baasbox.android.BaasResult;
import com.baasbox.android.BaasUser;

import udworldnet.com.letzeat.R;

public class LoginActivity extends AppCompatActivity {

    private final static String SIGNUP_TOKEN_KEY = "signup_token_key";
    private final static String EXTRA_USERNAME = "com.udworldnet.com.letzeat.username.EXTRA";

    private String mUsername;
    private String mPassword;

    private EditText mUserView;
    private EditText mPasswordView;
    private View mLoginFormView;
    private View mLoginStatusView;
    private TextView mLoginStatusMessageView;

    private RequestToken mSignupOrLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //the layout is loaded

        if(savedInstanceState!=null){
            mSignupOrLogin = savedInstanceState.getParcelable(SIGNUP_TOKEN_KEY);
        }

        mUsername = getIntent().getStringExtra(EXTRA_USERNAME);
        mUserView = (EditText) findViewById(R.id.email_id);
        mUserView.setText(mUsername);







    }
}
