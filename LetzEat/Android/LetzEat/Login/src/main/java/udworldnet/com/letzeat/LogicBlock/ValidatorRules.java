package udworldnet.com.letzeat.LogicBlock;

import android.content.Context;
import android.util.Patterns;
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
     *Validate email: check whether it is not empty and if it matches with the Patterns of Email address
     * Show Toast with a warning if Validation fails
     *
     * @param currentContext context, in which validation occurs
     * @param email email to be validated
     * @return true if email address is valid , false if it email is  not valid
     */
    public static boolean isEmailValid(Context currentContext, CharSequence email){

        if(email.toString().isEmpty())
        {
            Toast.makeText(currentContext,"Email cannot be empty",Toast.LENGTH_LONG).show();
            return false;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher((email)).matches()){
            Toast.makeText(currentContext,"Invalid email format",Toast.LENGTH_LONG).show();
            return false;
        }

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

    /**
     * Validates password : check wheather it is not empty and if the password is same with the password_retype
     * Show Toast what a warning if validation fails
     *
     * @param currentContext
     * @param password
     * @param password_retype
     * @return
     */
    public static boolean isPasswardValid(Context currentContext, CharSequence password, CharSequence password_retype){

        if(password.toString().isEmpty()){
            Toast.makeText(currentContext,"Password cannot be empty",Toast.LENGTH_LONG).show();
            return false;
        }

        //validates wheather password is correctly retyped
        if (!password.toString().equals(password_retype.toString())) {
            Toast.makeText(currentContext, "Password is not correctly retyped", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }
}
