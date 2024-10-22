package JavaAssignment;

import java.util.Scanner;

public class Assign3
{
    public static void main(String[] args)
    {
        double basicSalary, hra, da, PF, netSalary;
        //basic salary of employee declared
        Scanner s=new Scanner(System.in);
        System.out.println("Enter BasicSalary");
        basicSalary=s.nextInt();
       // basicSalary = 15000;
        
        //calculating HRA, DA and PF
        hra = basicSalary * 0.3;
        da = basicSalary * 0.2;
        PF = basicSalary * 0.08;
        //Calculating net salary by adding basicSalary, hra, da and deducting PF from that
        netSalary = basicSalary + hra + da - PF;
        System.out.println("The Basic salary is:" + basicSalary);
        System.out.println("The HRA is:" + hra);
        System.out.println("The DA is:" + da);
        System.out.println("The PF is:" + PF);
        System.out.println("The net salary is:" + netSalary);
    }
}