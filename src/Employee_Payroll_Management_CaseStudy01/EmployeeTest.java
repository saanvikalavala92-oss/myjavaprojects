package Employee_Payroll_Management_CaseStudy01;
import java.util.*;
public class EmployeeTest {
	  public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   Employee employee=new Employee();
		   Attedance attedance=new Attedance();
		   Salary salary=new Salary();
		   int choice;
		   do {
			   System.out.println("======================================");
			   System.out.println("Employee Payroll  Management System");
			   System.out.println("======================================");
			   System.out.println("1.Enter Employee Details");
			   System.out.println("2.Calculate Attedance");
			   System.out.println("3.Calculate Salary");
			   System.out.println("4.Display Employee Details");
			   System.out.println("5.Exist");
			   
			   System.out.println("Enter your choice:");
			   choice=sc.nextInt();
			
			   switch(choice) {
			   case 1:
				   System.out.println("Enter Employee Details");
				   System.out.println("Enter Employee ID");
				   employee.employeeId=sc.nextInt();
				   
				   System.out.println("Enter Employee Name:");
				   employee.employeeName=sc.nextLine();
				   
				   
				   System.out.println("\nSelect Department");
				   System.out.println("1.IT");
				   System.out.println("2.HR");
				   System.out.println("3.Finance");
				   System.out.println("4.Marketing");
				   
				   System.out.println("Enter Department choice:");
				   employee.departmentChoice=sc.nextInt();
				   
				   switch(employee.departmentChoice) {
				   case 1:
					   employee.department="IT";
					   break;
				   case 2:
					   employee.department="HR";
					   break;
				   case 3:
					   employee.department="Finance";
					   break;
				   case 4:
					   employee.department="Marketing";
					   break;
					   default:
						   employee.department="Unknown";
						  System.out.println("Invalid department");
				   }
				   
				   System.out.println("Enter Basic salary:");
				   employee.basicSalary=sc.nextDouble();
				   
				   if(employee.basicSalary>0) {
					   System.out.print("Employee details entered successfully");
				   }
				   else {
					   System.out.println("Invalid salary.Salary must be greater than");
				   }
				   break;
			   case 2:
				   System.out.print("Attedance calculation");
				   
				   System.out.println("Enter total working days:");
				   attedance.totalWorkingDays=sc.nextInt();
				   
				   if(attedance.totalWorkingDays>0) {
					   attedance.presentDays=0;
					   attedance.absentDays=0;
					   
			           for (int day = 1; day <= attedance.totalWorkingDays; day++) {                            
			        	   System.out.println("Day " + day  + " - Enter 1 for Present, 0 for Absent: ");                            
			        	   attedance.attedance = sc.nextInt();
			        	   
			        	   if (attedance.attedance==1) {
			        		   
			        		   attedance.presentDays++;
			        	   } else if (attedance.attedance == 0) {
			        		   attedance.absentDays++;
			        	   } else {
			        		   System.out.println("Invalid input.Enter only  1 or 0.");
			        	   }
			           }
			           
			   attedance.attedancePercentage = ((double) attedance.presentDays/ attedance.totalWorkingDays) * 100;
			   
			   System.out.println("\nPresent Days : "+ attedance.presentDays);
			   
			   System.out.println("Absent Days  : "  + attedance.absentDays);
			   
			   System.out.println("Attedance % : " + attedance.attedancePercentage + "%");
			   
			   if (attedance.attedancePercentage >= 75) {                           
				   System.out.println("Attendance Status: Eligible");                        } else {                            
				   System.out.println("Attendance Status: Not Eligible");
			   }
				   } else {
					   
					   System.out.println("Working days must be greater than zero.");                    }                   
				   break; 
			   case 3:
				   System.out.println("\n---SALARY CALCULATION---");
				   
				   if(employee.basicSalary>0) {
					   
					   
					   if (attedance.totalWorkingDays > 0) {
						   if (attedance.attedancePercentage >= 90) {
							   
							   salary.incentives = employee.basicSalary  * 0.10;
							   
							   salary.finalSalary = employee.basicSalary + salary.incentives;
							   
							   System.out.println("Attedance Category: Excellent");
							   
							   System.out.println("Attedance Incentive: 10%");		   
						   } else if (attedance.attedancePercentage >= 75) {
							   
							   salary.incentives  = 0;
							   salary.deduction = 0;
							   salary.finalSalary = employee.basicSalary;
							   
							   System.out.println("Attedance category: Good");
							   System.out.println("Attedance Incentives: 0%");
		   
						   } else {
							   salary.deduction = employee.basicSalary * 0.10;
							   
							   salary.finalSalary = employee.basicSalary - salary.deduction;
							   
							   
							   System.out.println("Attedance category: Low");
							   
							   System.out.print("Attedance Deduction: 10%");
						   }
							   System.out.println("Basic Salary :₹" + employee.basicSalary);
							   
							   System.out.print("Final Salary : ₹" + salary.finalSalary );
			
					   } else {
						   
						   System.out.print("Please calculate attedance first.");
					   }
					   
				   } else {
					   System.out.println("Please enter valid employee details first.");
				   }
			 break;
			 
			   case 4:
				   
				   System.out.print("\n-- EMPLOYEE DETAILS---");
				   
				   if (employee.employeeId != 0) {
					   
					   System.out.println("Employee ID : " + employee.employeeId);
					   
					   System.out.println("Employee Name : " + employee.employeeName);
					   
					   System.out.println("Department : " + employee.department);
					   
					   System.out.println("Basic Salary : ₹" + employee.basicSalary);
					   
					   System.out.println("Present Days : " + attedance.presentDays);
					   
					   System.out.println("Absent Days : " + attedance. absentDays);
					   
					  System.out.println("Attedance % : " + attedance.attedancePercentage + "%");
					  
					  System.out.println("Final Salary :  ₹" + salary.finalSalary);
				   } else {
					    System.out.println("No employee details available.");
				   }
				   break;
				   
			   case 5: 
				   
				   System.out.println("\nThank you for using the system.");
				   break; 
				  
				   
				   default:
					   
					   System.out.print("Invalid menu choice. please enter 1 to 5.");
			   }
			   
					   
			   } while (choice != 5);
			   
			   sc.close();
		   }
	  }
				   
		
