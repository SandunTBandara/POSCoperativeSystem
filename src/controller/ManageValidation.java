/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Sanu
 */
public class ManageValidation {
    public static void validateNumber(JTextField text, int limit) {
        if (!text.getText().isEmpty()) {
            for (int i = 0; i < text.getText().length(); i++) {
                char c = text.getText().charAt(i);
                if (!Character.isDigit(c)) {
                   if(c == '.'){
                        
                    }else{
                        String s = text.getText().substring(0, i);
                        text.setText(null);
                        text.setText(s);
                    }
                }
                if (text.getText().length() > limit) {
                    String ss = text.getText().substring(i, limit);
                    text.setText(null);
                    text.setText(ss);
                }
            }
        } else {
            return;
        }
    }

    public static boolean validatorText(JTextField text, JLabel error) {
        if (text.getText().isEmpty()) {
            error.setText("*Cannot be empty");
            return false;
        } else {
            error.setText("");
            return true;
        }
    }

    
    public static void validatorText2(JTextField text) {
        try{
            char[] chars = text.getText().toCharArray();
        for(int i=0; i<=chars.length; i++){
            if(Character.isDigit(chars[i])){
                text.setText(String.valueOf(chars, 0, i));
         }
        } 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean ValidateRadio(JRadioButton value, JRadioButton value1, JLabel error) {
        if (!value.isSelected() && !value1.isSelected()) {
            error.setText("*selecct a location type");
            return false;
        } else {
            error.setText("");
            return true;
        }
    }  
    
    public static void emailvalidation(String input, JLabel error){
    Pattern pattent = Pattern.compile("[@]").compile("[.]");
    Matcher matcher = pattent.matcher(input);
    
    if(!matcher.find()){
      error.setText("*invalied email address");
    }
    else{
    error.setText("");
    }
    
    }
}
