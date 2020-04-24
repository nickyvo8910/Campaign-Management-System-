/*
 * Class contains methods using to validate input data
 *
 */

package Kernel;

import GUI.ShowMessageDialog;
import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class Validation {

    public static String message="";
    private static SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date convertStringToDate(String sDate)
    {
        Date date=null;

        try {
             date = new Date(format.parse(sDate).getTime());
             message="Convert successfully";
        } catch (ParseException ex) {
            ex.printStackTrace();
            message="Convert Fail";
        }
        finally {
            return date;
        }
    }

    public static String convertDateToString(Date date)
    {
        return format.format(date);
    }

    public static boolean isDate(String sDate){
        try {
            format.setLenient(false);
            Date date = new Date(format.parse(sDate).getTime());
            if(date.compareTo(new Date(0,0,1))<0) {
                message="Wrong Date Format";
                return false;
            }
            return true;
        } catch (ParseException ex) {
            message="Wrong Date Format";
            return false;
        } catch ( Exception ex) {
            message="Wrong Date Format";
            return false;
        }
    }

    public static Date addToDate(int arg) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, arg);
        Date date = new Date(c.getTimeInMillis());
        return date;
    }

    public static boolean isEmpty(String text)
    {
        if((text.length()==0)||(text.trim().equals(null))||(text.trim().length() == 0))
        {
            return true;
        }
        return false;
    }

    public static boolean isCharacter(String text)
    {
        if(text.matches("^[a-zA-Z]+([\\s][a-zA-Z]+)*$"))
        {
            return true;
        }
        return false;
    }

    public static boolean checkContent(String text)
    {
        if(text.matches("^[a-zA-Z0-9]+([\\s][a-zA-Z0-9]+)*$"))
        {
            return true;
        }
        return false;
    }
    public static boolean isFloat(String text)
    {
        if(text.matches("^[0-9\\-]+(\\.[0-9]+)*$"))
            return true;
        return false;
    }

    public static boolean isInt(String text)
    {
        if(text.matches("^[0-9]+$"))
            return true;
        return false;
    }

    public static boolean isValidEmail(String email)
    {
        if(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,7}$"))
            return true;
        return false;
    }
    public static boolean validateComponents(JTextComponent[] component)
    {
        if(component!=null)
            for(int i=0; i<component.length; i++)
            {
                component[i].setBackground(Color.white);
                if( isEmpty(component[i].getText()) )
                {
                    showMess("Empty value is not allowed here");
                    component[i].setBackground(new Color(255,153,153));
                    component[i].requestFocus();
                    return false;
                }
                component[i].setBackground(Color.white);
                if(component[i].getText().indexOf("'")!=-1)
                {
                    showMess("Char ' not allow  ");
                    component[i].setBackground(new Color(255,153,153));
                    component[i].requestFocus();
                    return false;
                }

                
            }

        return true;
    }

    public static boolean setBlankField(JTextComponent[] component)
    {
        if(component!=null)
            for(int i=0; i<component.length; i++)
            {
               component[i].setBackground(Color.white);
               component[i].setText("");
            }

        return true;
    }

    public static float round(float number, int digit)
    {
        if (digit > 0)
        {
            float temp = (float)Math.pow((double)10, (double)digit);
            number = Math.round(number*temp)/temp;

            return number;
        }
        else
            return 0;
    }

    public static void showMess(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
    }

    
}

