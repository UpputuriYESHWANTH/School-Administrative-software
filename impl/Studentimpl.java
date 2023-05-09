package com.student.impl;
import java.util.*;
import com.student.dec.*;

public class Studentimpl {
	
	Scanner sc = new Scanner(System.in);
	Studentd[] addrecords=null;
	
	public void addstudent() {
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		addrecords = new Studentd[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter student number: ");
			int sn = sc.nextInt();
			System.out.println("Enter student name: ");
			String sna = sc.next();
			System.out.println("Enter address:");
			String sad = sc.next();
			System.out.println("Enter student mobile number: ");
			long smo = sc.nextLong();
			Studentd sd = new Studentd(sn, sna, sad, smo);
			addrecords[i] = sd;		
	}

}
	public Studentd[] viewrecords() {
		return addrecords;
	}
	public Studentd viewar(int s) {
		Studentd st = null;
		Studentd[] sf = addrecords;
		if(sf!=null) {
			for(Studentd k : sf) {
				if(k!=null) {
					if(k.getSno()==s) {
						st = k;
						
					}
				}
			}
		}
		return st;
		
	}
	
	public void editr(int v) {
		Studentd g = null;
		Studentd[] f = addrecords;
		if(f!=null) {
			for(Studentd h : f) {
				if(h!=null) {
					if(h.getSno()==v) {
						System.out.println("1)Update student number: ");
						System.out.println("2)Update student name: ");
						System.out.println("3)Update student address: ");
						System.out.println("4)Update student mobile number: ");
						System.out.println("your choice: ");
						int c = sc.nextInt();
						switch(c) {
						case(1):
						{
							System.out.println("enter updated student number:");
							int sd = sc.nextInt();
							h.setSno(sd);
							System.out.println("student number update successful");
							break;
						}
						case(2):
						{
							System.out.println("enter updated student name:");
							String sn = sc.next();
							h.setSname(sn);
							System.out.println("name update successful");
							break;
						}
						case(3):
						{
							System.out.println("enter updated student address:");
							String sad = sc.next();
							h.setSadd(sad);
							System.out.println("student address update successful");
							break;
						}
						case(4):
						{
							System.out.println("enter updated student mobile number:");
							long smb = sc.nextLong();
							h.setMobilen(smb);
							System.out.println("student mobile number update successful");
							break;
						}
						}


						
					}
				}
			}
		}
	}
	
	public void deleter(int g) {
		int i = 0;
		int a = 0;
		Studentd[] fg = addrecords;
		if(fg!=null) {
			for(Studentd j : fg) {
				if(j!=null) {
					if(j.getSno()==g) {
						addrecords[i] = null;
						a++;
					}
					i++;
				}
			}
		}
		if(a==0) {
			System.out.print("Not found");
		}
		
	}
}
