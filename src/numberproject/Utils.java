/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberproject;

/**
 *
 * @author karlmorris
 */
public class Utils {
    public static int largest (int[] list){
        
        int largestSeen = list[0];
        
        for (int i = 0; i < list.length; i++){
            if (list[i] > largestSeen)
                largestSeen = list[i];
        }
        return largestSeen;
    }
}
