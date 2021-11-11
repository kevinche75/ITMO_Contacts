package se.ifmo.refactoring.contacts.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.ifmo.refactoring.contacts.api.ContactService;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(final String[] args) {
    logger.info("Starting program...");

    final ContactService contactService = new ContactClient("http://localhost:8080");

    final Scanner scanner = new Scanner(System.in);
    final PrintWriter writer = new PrintWriter(System.out, true);

    final MainMenu mainMenu = new MainMenu(scanner, writer, contactService);
    mainMenu.init();
  }
}
