package Questions;

import java.util.Scanner;

public class Q5ComplexIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double income = input.nextInt();
        double sum = 0;
        double temp = 0;
        if (income <= 23000) {
        	sum = income - income*0.1;
        }
        else {
        	if(income <=56000) {
        		temp = income - 23000;
        		sum = income -((income - 23000)*0.1 + temp*0.2);
        	}
        	else {
        		if(income <= 130000) {
        			temp = income - 56000;
        			sum = income - ((23000*0.1)+(23000*0.2)+income*0.3);
        		}
        		else {
        			if(income <= 230000) {
        				temp = income - 130000;
        				sum = income -((23000*0.1) + (23000*0.2) + (74000*0.3) + (temp * 0.4));
        			}
        			else {
        				if(income > 230000) {
        					temp = income - 230000;
        					sum = income - ((23000*0.1) + (23000*0.2) + (74000*0.3) + (100000*0.4) + (temp*0.5));
        				}
        			}
        		}
        	}
        }
        
       System.out.println(name+" "+"income is "+sum);
       input.close();
	}

}
