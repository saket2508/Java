import java.util.*;
import java.io.*;

public class CalculatorMain {
    public static void main(String args[]){
        String infix;
        Scanner sc = new Scanner(System.in);
        infix = sc.nextLine();
        System.out.println(calculator(infix));
    }
    static int calculator(String infix){
        Stack<Integer> s1 = new Stack<>(); //for operands
        Stack<Character> s2 = new Stack<>(); //for operators
        for(int i=0;i<infix.length();i++){
            char token = infix.charAt(i);
            if(isOperand(token)){
               String s = "";
               s += token;
               while(i+1<infix.length() && isOperand(infix.charAt(i+1))){
                   s+= infix.charAt(i+1);
                   i++;
               }
               int num = Integer.parseInt(s);
               s1.push(num);
            }
            else if(isOperator(token)){
                if(s2.empty() || !hasLowerPriority(token,s2.peek())){
                    s2.push(token);
                }
                else{
                    int b = s1.pop();
                    int a = s1.pop();
                    char op = s2.pop();
                    int res = performOp(op,a,b);
                    s1.push(res);
                    s2.push(token);
                }
            }
            else if(token == '('){
                s2.push(token);
            }
            else if(token == ')'){
                while(s2.peek()!= '('){
                    int b = s1.pop();
                    int a = s1.pop();
                    char op = s2.pop();
                    int res = performOp(op,a,b);
                    s1.push(res);
                }
                s2.pop();
            }
        }
        while(!s2.empty()){
            char op = s2.pop();
            int b = s1.pop();
            int a = s1.pop();
            int res = performOp(op,a,b);
            s1.push(res);
        }
        int res = s1.pop();
        return res;
    }
    static int performOp(char token,int a,int b){
        switch (token){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '/':
                return a/b;
            case '*':
                return a*b;
        }
        return 0;
    }
    static boolean hasLowerPriority(char token,char op){
        if(opWeight(token) <= opWeight(op)){
            return true;
        }
        return false;
    }
    static int opWeight(char token){
        int weight = 0;
        switch(token){
            case '+':
            case '-':
                weight = 1;
                break;
            case '/':
            case '*':
                weight = 2;
                break;
        }
        return weight;
    }
    static boolean isOperator(char token){
        if(token == '+' || token == '-' || token == '*' || token == '/'){
            return true;
        }
        return false;
    }
    static boolean isOperand(char token){
        if(token >= '0' && token <= '9'){
            return true;
        }
        return false;
    }
}
