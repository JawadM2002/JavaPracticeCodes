/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

/**
 *
 * @author 25240462
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        
        while(x < 101) {
            System.out.print("value of x:" + x);
            x += 2;
            System.out.print("\n");
        }
    }
}
