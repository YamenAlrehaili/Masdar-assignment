/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

public class FullTimeEmployee extends Employee {
     double Bonus;
     final double FULL_TIME_BOUNS_RATE=0.03;

     FullTimeEmployee(String name,String postion,double salary,int experience,String educational_level){
         super(name,postion,salary,experience,educational_level);
     }
        //this method is used to calculate the salary + Bonus Full-time employee
    double BonusCalculation(){
        Bonus=this.getSalary()*FULL_TIME_BOUNS_RATE;
          this.setSalary(Bonus+this.getSalary());
        return Bonus;
    }
}
