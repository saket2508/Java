/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package complex;
import java.util.*;
class CreateComplex{
    private double r;
    private double c;
    Scanner s = new Scanner(System.in);
    void realInput(){
        r = s.nextDouble();
        
    }
    void complexInput(){
        c = s.nextDouble();
        
        
        
    }
    void displayComplex(){
        System.out.println(r + "+ i"+c);
    }
    
    CreateComplex add(CreateComplex c2){
        CreateComplex c3 = new CreateComplex();
        c3.r = r+ c2.r;
        c3.c = c + c2.c;
        return c3;
        
    }
    CreateComplex subtract(CreateComplex c2){
        CreateComplex c3 = new CreateComplex();
        c3.r = r - c2.r;
        c3.c = c - c2.c;
        return c3;
    }
    
}


public class Complex {

    

    public static void main(String[] args) {
        CreateComplex c1 = new CreateComplex();
        CreateComplex c2 = new CreateComplex();
        c1.complexInput();
        c1.realInput();
        c2.complexInput();
        c2.realInput();
        c1.displayComplex();
        c2.displayComplex();
        CreateComplex res = new CreateComplex();
        CreateComplex res2 = new CreateComplex();
        res = c1.add(c2);
        res.displayComplex();
        res2 = c1.subtract(c2);
        res2.displayComplex();
        
    }
    
}
