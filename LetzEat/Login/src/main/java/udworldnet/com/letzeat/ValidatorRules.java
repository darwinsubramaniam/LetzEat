package udworldnet.com.letzeat;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by darwin on 05/03/16.
 * This is the validator Rules for the LetzEat registration process
 */
public class ValidatorRules {


    /**
     * Validated the The Validator Rules
     * 1. name input is not empty
     * 2. name starts with an Uppercase letter
     *
     * If the validator rules is failed, Toast is shown to the user
     *
     * @param currentContext context in which validator occurs
     * @param name user's name to be validated
     * @param true when the validation is a succes , false if validation failed
     */
    public static boolean isNameValid(Context currentContext, CharSequence name)
    {
        if(name.toString().isEmpty()){
            Toast.makeText(currentContext,"Name cannot be empty",Toast.LENGTH_LONG).show();
            return false;
        }

        if (!Character.isUpperCase(name.charAt(0))){
            Toast.makeText(currentContext,"Name should start from an Uppercase letter",Toast.LENGTH_LONG).show();
            return false;
        }

        return true;

    }

    /**
     *
     * @param currentContext
     * @param email_ID
     * @return
     */
    public static boolean isEmailValid(Context currentContext, CharSequence email_ID){
        return true;
    }

    /**
     * Delete this Part if not necessary to check for Age Validation
     * @param currentContext
     * @param year
     * @return
     */
    public static boolean isAgeValid(Context currentContext, Number year){
        return true;
    }
}
