package com.company.yellowpages;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Company> companyHashMap = new HashMap<>();


        Company company1 = new Company("Grand Candy", "54/92-93, Mesrop Mashtots Ave, Yerevan 0009",
                500, "https://maps.app.goo.gl/mhrocYiEGxYyrD9RA",
                "https://www.grandcandy.am/", "+374 10 44 56 63");

        Company company2 = new Company("Tesla", "3500 Deer Creek Road Palo Alto, CA 94304", 2000,
                "https://maps.app.goo.gl/QmL52i77mt4x1nvK6",
                "www.tesla.com", "+1 650-681-5000");

        Company company3 = new Company("Lockheed Martin", "6801 Rockledge Drive Bethesda, MD 20817 U.S.A",
                10000, "https://maps.app.goo.gl/UT7oegRc3q6mX6R38",
                "www.lockheedmartin.com", "+1 301 897-6000");

        companyHashMap.put("Grand Candy", company1);
        companyHashMap.put("Tesla", company2);
        companyHashMap.put("Lockheed Martin", company3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the company name:");
        String userInput = scanner.nextLine();

        for (String i : companyHashMap.keySet()) {
            if (userInput.equals(i)) {
                companyHashMap.get(i).printCompanyInfo();
            }

        }
    }
}
