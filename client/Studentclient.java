package com.student.client;
import java.util.*;
import com.student.impl.*;
import com.student.dec.*;

public class Studentclient {

	public static void main(String[] args) {
		Studentimpl si = new Studentimpl();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("     1) Add records   ");
			System.out.println("     2) view records   ");
			System.out.println("     3) view a record   ");
			System.out.println("     4) Edit a Record   ");
			System.out.println("     5) Delete a record  ");
			System.out.println("     6)exit              ");
			System.out.println("Enter your choice:");
			int c = sc.nextInt();
			switch(c) {
			
			case(1):
			{
				si.addstudent();
				break;
				
			}
			case(2):
			{
				Studentd[] vs = si.viewrecords();
				if( vs != null) {
					for(Studentd s:vs) {
						if(s!=null) {
							System.out.println(s.getSno()+" "+s.getSname()+" "+s.getSadd()+" "+s.getMobilen());
						}
					}
				}
				else {
					System.out.println("Not found");
				}
				break;
			}
			case(3):
			{
				System.out.println("Enter a number: ");
				int f = sc.nextInt();
				Studentd h = si.viewar(f);
				if(h!=null) {
					System.out.println(h.getSno()+" "+h.getSname()+" "+h.getSadd()+" "+h.getMobilen());
				}
				else {
					System.out.println("Not found");
				}
				break;
			}
			case(4):
			{
				System.out.println("Enter a number: ");
				int f = sc.nextInt();
				si.editr(f);
				
				break;
			}
			case(5):
			{
				System.out.println("Enter a number:");
				int g = sc.nextInt();
				si.deleter(g);
				
			}
				
			}
		}

	}

}
