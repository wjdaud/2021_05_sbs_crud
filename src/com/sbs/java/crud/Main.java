package com.sbs.java.crud;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;
		while (true) {
			System.out.printf("��ɾ� ) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				System.out.println("��ɾ �Է��� �ּ���.");
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}

			if (command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("����: ");
				String title = sc.nextLine();
				System.out.printf("����: ");
				String body = sc.nextLine();

				System.out.printf("%d�� ���� ���� �Ǿ����ϴ�.\n", id);
			} else if (command.equals("article list")) {
				System.out.printf("�Խù��� �����ϴ�.\n");
			} else {
				System.out.printf("%s��(��) �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}

		}

		sc.close();

		System.out.println("==���α׷� ��==");
	}
}