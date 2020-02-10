/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Priyanshu Raturi
 */
public class Calculaor {
static float op1,op2,res;//Opreators
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calci cl = new Calci();
        cl.setVisible(true);
       
        
        if(Calci.ent){
            op1=Float.parseFloat(Calci.opreation1);
            op2=Float.parseFloat(Calci.opreation2);
            switch(Calci.opreant){
                case '+':
                    res=op1=op2;
                case '-':
                    res=op1-op2;
                case 'x':
                    res=op1*op2;
                case '/':
                    res=op1/op2;
                default:
                    res=-1;
                    
            }
            System.out.println(res);
            
        }
    }
    
}
