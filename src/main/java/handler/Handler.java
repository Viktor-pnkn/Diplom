package program.handler;

import scheme.Scheme;
import treeFind.TreeFind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
    public static void start(int n) throws IOException {
        if (n == 4) {
            go6();
        }
    }

    private static void go6() throws IOException {
        Scheme scheme = new Scheme();
        File file = new File("dummy");
        int[] def = new int[40];
        for (int i = 0; i < 40; i++) {
            def[i] = -2;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера контактов, которые вы хотите замкнуть/разомкнуть, а затем 1 или 0 для замыкания и размыкания соответственно");
        System.out.println("Для окончания ввода введите 3");
        System.out.println();
        int num;
        int zr;
        while (true) {
            System.out.println("Введите номер контакта:");
            num = Integer.parseInt(scanner.next()) - 1;
            if (num == 2) {
                break;
            }
            System.out.println("Введите замыкание/размыкание (0 или 1): ");
            zr = Integer.parseInt(scanner.next());
            def[num] = zr;
        }

        //String f = scheme.functionByDefect6("x66 = 1 x1 = 0 x33 = 0");
        String f = scheme.functionByDefect6(def);
        int t = 1;
        int[] mass = new int[64];
        for (int i = 0; i < 64; i++) {
            mass[i] = Integer.parseInt(String.valueOf(f.charAt(t)));
            t += 3;
        }
        if (mass[2] == 0) {
            if (mass[43] == 0) {
                if (mass[48] == 0) {
                    file = new File("f2_0_0.txt");
                }
                else {
                    file = new File("f2_0_1.txt");
                }
            }
            else {
                if (mass[55] == 0) {
                    file = new File("f2_1_0.txt");
                }
                else {
                    file = new File("f2_1_1.txt");
                }
            }
        }
        else {
            if (mass[40] == 0) {
                if (mass[60] == 0) {
                    file = new File("f1_0_0.txt");
                }
                else {
                    file = new File("f1_0_1.txt");
                }
            }
            else {
                if (mass[22] == 0) {
                    file = new File("f1_1_0.txt");
                }
                else {
                    file = new File("f1_1_1.txt");
                }
            }
        }

        ArrayList<String> functions = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            functions.add(bufferedReader.readLine());
        }
        TreeFind tree = new TreeFind(functions, new ArrayList<Integer>(), f, mass);
        tree.buildTree();
        System.out.println(tree.highLevel);
        System.out.println(tree.test);
    }
}
