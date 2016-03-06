package udworldnet.com.letzeat;

import udworldnet.com.letzeat.Security.*;
import android.app.Application;
import com.baasbox.android.*;
import android.util.Log;

import java.security.Security;

/**
 * Created by darwin on 06/03/16.
 */
public class LetzEat extends Application {
    @Override
    public void onCreate(){
        super .onCreate();


        BaasBox.builder(this).setAuthentication(BaasBox.Config.AuthType.SESSION_TOKEN)
                .setApiDomain(ServerSetting.domain)
                .setPort(ServerSetting.port)
                .setAppCode(ServerSetting.appcode)
                .init();
    }
}
