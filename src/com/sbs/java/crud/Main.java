package com.sbs.java.crud;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		System.out.printf("��ɾ� ) ");
		String command = sc.nextLine();

		System.out.printf("�Էµ� ��ɾ� : %s\n", command);

		System.out.printf("��ɾ� ) ");
		int num = sc.nextInt();

		System.out.printf("�Էµ� ��ɾ� : %d\n", num);

		sc.close();

		System.out.println("==���α׷� ��==");
	}
}