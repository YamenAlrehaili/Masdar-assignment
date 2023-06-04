/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject3;


public class Mavenproject3 {
   
    public static void main(String[] args) {
        FullTimeEmployee emp1= new FullTimeEmployee("Yamin", "IT",10000,5,"Bachelor");
        emp1.SalaryCalculation();
        System.out.println(emp1.getSalary());
        emp1.BonusCalculation();
        System.out.println(emp1.getSalary());
        
        PartTimeEmployee emp2= new PartTimeEmployee("Yamin", "IT",10000,5,"diploma");
        emp2.SalaryCalculation();
        System.out.println(emp2.getSalary());
        emp2.BonusCalculation();
        System.out.println(emp2.getSalary());
    }
}

class Employee{
 /*fields*/
   String name;
   String postion;
   private double salary;
   private int experience;
   private String educational_level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducational_level() {
        return educational_level;
    }

    public void setEducational_level(String educational_level) {
        this.educational_level = educational_level;
    }

   Employee( String name,String postion,double salary,int experience,String educational_level){
   this.name=name;
   this.postion=postion;
   this.salary=salary;
   this.experience=experience;
   this.educational_level=educational_level;
   }
   //this method is used to calculate the salary
     double SalaryCalculation(){
        double totalSalary= (this.getSalary()) +(this.getSalary()*0.05*this.getExperience());
        
        if(this.getEducational_level()=="Bachelor"){
        totalSalary+=500;
        }else if(this.getEducational_level()=="diploma"){
        totalSalary+=250;
        }else{
        totalSalary+=0;
        }
        this.setSalary(totalSalary);
        return totalSalary;
    }
     
//     void AddingBounsToSalary(String Position){
//         
//     }
}
