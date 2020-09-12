package com.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateSql {
    final static String ALLSTR = "0123456789abcdef";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // String path = "d:/1992/";
        String path = sc.nextLine();
        File file = new File("d:/loadSql.sql");
        FileWriter fw = new FileWriter(file);
        StringBuffer temStr = new StringBuffer("t");
        for (int i = 0; i < 16; i++) {
            temStr.append(ALLSTR.substring(i, i + 1));
            for (int j = 0; j < 16; j++) {
                temStr.append(ALLSTR.substring(j, j + 1));
                fw.write("load data infile \"" + path + temStr.toString() + ".txt\"" + " into table "
                        + temStr.toString() + " fields terminated by ',' lines terminated by '\\n' (`id`,`id_m`);\n");
                temStr.delete(2, 3);
            }
            temStr.delete(1, 2);
        }
        fw.flush();
        fw.close();
        sc.close();
    }
}
