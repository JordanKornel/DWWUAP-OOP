package mytestpackage;

import java.util.Scanner;

import homework.Book;
import homework.EBook;

public class Homework {
	
	public static void main(String[] args)  {
		int n=0;
		Book[] konyvek=new Book[n];
		n = readInt();
		System.out.println(n);
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Adj meg egy szerz�t:"+ (i+1) +". szerz�:");
			String author = scan.nextLine();
			System.out.println("Adj meg egy c�met:"+ (i+1) +". c�m:");
			String title = scan.nextLine();
			System.out.println("Adj meg egy �rat:"+ (i+1) +". �r:");
			int price = scan.nextInt();
			System.out.println("Adj meg egy oldalsz�mot:"+ (i+1) +". oldalsz�ma:");
			int pages = scan.nextInt();
			System.out.println("Adj meg egy style:"+ (i+1) +". oldalsz�ma:");
			String style = scan.nextLine();
			System.out.println("Adj meg egy url:"+ (i+1) +". oldalsz�ma:");
			String url = scan.nextLine();


			konyvek[i] = new EBook(author,title, price, pages, style, url);
			if(i==i-1) {
				scan.close();
			}
			
		}
		
		}
	private static int readInt() {
		int n = 0;
		
		do {
			Scanner olvas= new Scanner(System.in);
			System.out.println("Adja meg a k�nyvek sz�m�t:");
			try {
				n=olvas.nextInt();
			}catch(Exception e) {
				continue;
			}
			olvas.close();
		}while(n<1|| n>10);
		return n;
	}
	}
	
