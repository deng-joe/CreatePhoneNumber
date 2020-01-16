/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;

/**
 *
 * @author Joey
 */
public class PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0});
    }
    
    private static String createPhoneNumber(int[] numbers) {
        return "(" 
                + numbers[0] 
                + numbers[1] 
                + numbers[2] 
                + ")" 
                + " " 
                + numbers[3] 
                + numbers[4] 
                + numbers[5] 
                + "-" 
                + numbers[6] 
                + numbers[7] 
                + numbers[8] 
                + numbers[9];
    }
    
}
