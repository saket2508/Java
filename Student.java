/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.*;

/**
 *
 * @author lab121
 */
public class Student {
    private String name;
    private String regNo;
    private String DOJ;
    private double SemGPA;
    private double CGPA;
    Student(){
        
    }
    
    Student(String name, double SemGPA, double CGPA){
        this.name = name;
        this.SemGPA = SemGPA;
        this.CGPA = CGPA;
    }
    
    void display(){
        System.out.println("NAME: " + this.name);
        System.out.println("RegNo: " + this.regNo);
        System.out.println("Semester GPA: " + this.SemGPA);
        System.out.println("CGPA: " + this.CGPA);
        System.out.println();
    }
    
    void findRegNo(String year, String no){
        String yr = year.substring(2,4);
        yr = yr + no;
        this.regNo = yr;
    }
    
    public static void sortByName(Student arr[]){
        int n  = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i].name.compareTo(arr[j].name) > 0){
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void sortByGPA(Student arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i].SemGPA > arr[j].SemGPA){
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void sortByCGPA(Student arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i].CGPA > arr[j].CGPA){
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void findNames(Student arr[], char c){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i].name.charAt(0) == c){
                System.out.println(arr[i].name);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of students");
        n = sc.nextInt();
        Student arr[] = new Student[n];
        String year;
        String no;
        for(int i=0;i<n;i++){
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("enter the sem gpa");
            double gpa = sc.nextDouble();
            System.out.println("enter the cgpa");
            double cgpa = sc.nextDouble();
            arr[i] = new Student(name, gpa, cgpa);
            System.out.println("Enter the year of joining");
            year = sc.next();
            System.out.println("Enter the time of joining");
            no = sc.next();
            arr[i].findRegNo(year, no);
            
        }
        
        int m;
        m  = sc.nextInt();
        switch(m){
            case 1:
                System.out.println("list will be sorted lexicographically");
                sortByName(arr);
                break;
            case 2:
                System.out.println("List will be sorted gpa wise");
                sortByGPA(arr);
                break;
            case 3:
                System.out.println("list will be sorted cgpa wise");
                sortByCGPA(arr);
                break;
        }
        
        for(int i=0;i<n;i++){
            arr[i].display();
        }
        System.out.println("Enter the charecter");
        char c = sc.next().charAt(0);
        findNames(arr, c);
    }
    
}
