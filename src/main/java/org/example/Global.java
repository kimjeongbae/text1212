package org.example;

import org.example.db.DBConnection;
import org.example.member.Member;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Global {
    private static Scanner scanner;
    private static Member loginedMember;

    private static DBConnection dbConnection;

    public static void initScanner() {
        scanner = new Scanner(System.in);
    }

    public static void exitScanner() {
        scanner.close();
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static DBConnection getDBConnection () {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

    public static Member getLoginedMember() {
        return loginedMember;
    }

    public static void setLoginedMember(Member member) {
        loginedMember = member;
    }

    public static String nowDateTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        return format.format(time);
    }

}