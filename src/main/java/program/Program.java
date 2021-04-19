package program;

import program.handler.Handler;
import scheme.Scheme;
import treeFind.TreeFind;

import java.io.*;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        Scheme scheme = new Scheme();
        // Построение множества функций неисправности (1/4 схемы)
        /*TreeSet<String> functions = scheme.generateFunctions2();
        File file = new File("functions-LeftBottom.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String f : functions) {
            bufferedWriter.write(f);
            bufferedWriter.write('\n');
        }
        bufferedWriter.close();*/

        // AND-OR SCHEMES
        /*File file1 = new File("functions-Bottom.txt");
        File file2 = new File("functions-Upper.txt");
        TreeSet<Long> functions = scheme.orSchemes(file1, file2);
        System.out.println("FUCK YEAH");
        File file = new File("functions1_1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Long f : functions) {
            bufferedWriter.write("[1, ");
            String s = Long.toBinaryString(f);
            for (int i = 0; i < 63 - s.length(); i++) {
                bufferedWriter.write("0, ");
            }
            for (int i = 0; i < s.length() - 1; i++) {
                bufferedWriter.write(s.charAt(i) + ", ");
            }
            bufferedWriter.write(s.charAt(s.length() - 1) + "]");
            bufferedWriter.write('\n');
        }
        bufferedWriter.close();*/


        // соединение файлов
        /*File file = new File("functionsAll.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("functions1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        int k = 1;
        while (bufferedReader.ready()) {
            String f = bufferedReader.readLine();
            if (!f.equals("")) {
                System.out.println(k++);
                bufferedWriter.write(f);
                bufferedWriter.write('\n');
            }
        }
        bufferedWriter.close();
        bufferedReader.close();*/

        // ГРАДИЕНТ
        /*ArrayList<String> functions = new ArrayList<String>();
        File file1 = new File("functionsAllKonfeta.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        while (bufferedReader.ready()) {
            functions.add(bufferedReader.readLine());
        }
        Tree tree = new Tree(functions, new ArrayList<Integer>());
        tree.buildTree();
        System.out.println(tree.highLevel);
        System.out.println(tree.test);*/


        Handler.start(4);


        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, в секундах с: " + elapsed / 1000);
        //[16, 64, 176, 32, 0, 48, 208, 80, 224, 128, 144, 160, 192, 96, 112, 240]
    }
}
