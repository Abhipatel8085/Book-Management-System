package com.sj.ui;

import java.util.Scanner;
import com.sj.model.Book;
import com.sj.dao.BookDAO;

public class Admin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();

        while (true) {
            System.out.println("\n=== Book Management System ===");
            System.out.println("1. View All Books");
            System.out.println("2. Insert Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Update Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    bookDAO.viewAllBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Book newBook = new Book(id, name, authorName, price);
                    bookDAO.insertBook(newBook);
                    System.out.println("Book inserted successfully!");
                    break;
                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    boolean deleted = bookDAO.deleteBook(deleteId);
                    if (deleted) {
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Book Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Author Name: ");
                    String newAuthor = sc.nextLine();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();

                    Book updatedBook = new Book(updateId, newName, newAuthor, newPrice);
                    boolean updated = bookDAO.updateBook(updatedBook);
                    if (updated) {
                        System.out.println("Book updated successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Book Management System. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
