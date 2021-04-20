package program.handler;

import scheme.Scheme;
import treeFind.TreeFind;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
    public static void start(int n, BufferedReader bufferedReader) throws IOException {
        if (n == 4) {
            go6(bufferedReader);
        }
    }

    private static void go6(BufferedReader bufferedReader1) throws IOException {
        Scheme scheme = new Scheme();
        File file = new File("dummy");
        int[] def = new int[40];
        for (int i = 0; i < 40; i++) {
            def[i] = -2;
        }

        /*Scanner scanner = new Scanner(System.in);
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
        }*/
        int num;
        int zr;
        while (bufferedReader1.ready()) {
            String f = bufferedReader1.readLine();
            String[] ff = f.split(" ");
            num = Integer.parseInt(ff[0]);
            def[num] = Integer.parseInt(ff[1]);
        }
        bufferedReader1.close();

        //String f = scheme.functionByDefect6("x66 = 1 x1 = 0 x33 = 0");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Result.txt"));
        String f = scheme.functionByDefect6(def, bufferedWriter);
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
        tree.buildTree(bufferedWriter);
        bufferedWriter.write('\n');
        //System.out.println();
        int test = 3 + tree.highLevel;
        bufferedWriter.write("Длина теста = " + test + '\n');
        //System.out.println("Длина теста = " + test);
        bufferedWriter.write('\n');
        //System.out.println();
        bufferedWriter.write("Выбранные точки : " + tree.test + '\n');
        //System.out.println("Выбранные точки : " + tree.test);
        bufferedWriter.close();
    }
}
