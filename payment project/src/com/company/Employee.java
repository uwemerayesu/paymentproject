package com.company;
import java.util.*;
public class Employee {
    private static final String a = null;
    public int typeemp;
    public int salary;
    public int tax;
    public int hour;
    public int gross_salary;

    public int rssb;
    public int net_salary;


    public static class Month extends Employee{
        public void emp1()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter salary");
            salary=in.nextInt();

            tax= (salary*30)/100;
            rssb=(salary*3)/100;
            net_salary=salary-(tax+rssb);


        }


    }
    public static class Week extends Employee{
        public void emp2(){
            System.out.println("Enter salary he get per week");
            Scanner in = new Scanner(System.in);
            salary=in.nextInt();
            net_salary=salary;

        }
    }
    public static class Hour extends Employee{

        public  void emp3(){
            System.out.println("Please enter number of hours he works");
            Scanner in = new Scanner(System.in);
            hour = in.nextInt();
            System.out.println("Please enter salary per  hours he works");
            salary = in.nextInt();

            if(hour<=40){
                net_salary = hour*salary;

            }
            else{
                net_salary=(40*salary);
                net_salary=net_salary+((hour-40)*(salary)*10)/100;


            }
        }
    }

    public  static void main(String[] args) {
        int a;

        Hour num = new Hour();
        Week num1=new Week();
        Month num2=new Month();

        //num.emp3();
        Scanner in = new Scanner(System.in);
        System.out.println("Please select type of employee according to type; 1:month,2:weekly,type3:hour");
        num.typeemp=in.nextInt();
        if(num.typeemp==1)
        {

            num2.emp1();

            System.out.println("result is"+num2.net_salary);

        }
        else if(num.typeemp==2){

            num1.emp2();
            System.out.println("result is"+num1.net_salary);
        }
        if(num.typeemp==3){

            num.emp3();
            System.out.println("result is"+num.net_salary);

        }
        else{
            System.out.println("this doesn't work!!!!!!!");
        }


    }

}