package com.sbs.java.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>(); // article ���� �迭

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

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d�� ���� ���� �Ǿ����ϴ�.\n", id);
			}

			else if (command.equals("article list")) {

				if (articles.size() == 0) {
					System.out.println("�Խù��� �����ϴ�");
					continue;
				}
				System.out.println("��ȣ  /  ����");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d     /    %s\n", article.id, article.title);
				}

			} else if (command.startsWith("article detail ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}

				System.out.printf("��ȣ : %d\n", foundArticle.id);
				System.out.printf("��¥ : 2021-05-02 16:22:22\n");
				System.out.printf("���� : %s\n", foundArticle.title);
				System.out.printf("���� : %s\n", foundArticle.body);

			} else if (command.startsWith("article delete ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);

				int foundIndex = -1;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundIndex = i;
						break;
					}
				}

				if (foundIndex == -1) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}

				articles.remove(foundIndex);
				System.out.printf("%d�� �Խù��� �����Ǿ����ϴ�.\n", id);

			} else {
				System.out.printf("%s��(��) �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}

		}

		sc.close();

		System.out.println("==���α׷� ��==");
	}
}

class Article {

	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

}