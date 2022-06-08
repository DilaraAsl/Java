package day12_methodsAndStringReview;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a website:");
        String website = kb.next().trim();
        System.out.println(website);
        int length = website.length();
        kb.close();
        System.out.println(website.substring(0,4));
        if (website.substring(0,4).equals("www.")) {
            System.out.println(website.substring(0,3));

            if (website.substring(length - 4, length).equals(".com")) {
                System.out.println("Valid website");}
                else if (website.substring(length - 4, length).equals(".edu")) {
                    System.out.println("Valid website");
                }
                else if (website.substring(length - 4, length).equals(".gov")) {
                    System.out.println("Valid website");
                }
                else System.out.println("Invalid website");
            }

        }
    }
