package scheme;


import java.io.*;
import java.util.*;

public class Scheme {
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x11;
    private int x22;
    private int x33;
    private int x44;
    private int notx1;
    private int notx2;
    private int notx3;
    private int notx4;
    private int notx11;
    private int notx22;
    private int notx33;
    private int notx44;

    private int x5;
    private int x6;
    private int x7;
    private int x8;
    private int x55;
    private int x66;
    private int x77;
    private int x88;
    private int notx5;
    private int notx6;
    private int notx7;
    private int notx8;
    private int notx55;
    private int notx66;
    private int notx77;
    private int notx88;

    private int x111;
    private int x222;
    private int x333;
    private int x444;
    private int x1111;
    private int x2222;
    private int x3333;
    private int x4444;
    private int notx111;
    private int notx222;
    private int notx333;
    private int notx444;
    private int notx1111;
    private int notx2222;
    private int notx3333;
    private int notx4444;

    private int x555;
    private int x666;
    private int x777;
    private int x888;
    private int x5555;
    private int x6666;
    private int x7777;
    private int x8888;
    private int notx555;
    private int notx666;
    private int notx777;
    private int notx888;
    private int notx5555;
    private int notx6666;
    private int notx7777;
    private int notx8888;

    public Scheme() {
        this.x1 = -2;
        this.x2 = -2;
        this.x3 = -2;
        this.x4 = -2;
        this.x11 = -2;
        this.x22 = -2;
        this.x33 = -2;
        this.x44 = -2;
        this.notx1 = -2;
        this.notx2 = -2;
        this.notx3 = -2;
        this.notx4 = -2;
        this.notx11 = -2;
        this.notx22 = -2;
        this.notx33 = -2;
        this.notx44 = -2;

        this.x5 = -2;
        this.x6 = -2;
        this.x7 = -2;
        this.x8 = -2;
        this.x55 = -2;
        this.x66 = -2;
        this.x77 = -2;
        this.x88 = -2;
        this.notx5 = -2;
        this.notx6 = -2;
        this.notx7 = -2;
        this.notx8 = -2;
        this.notx55 = -2;
        this.notx66 = -2;
        this.notx77 = -2;
        this.notx88 = -2;

        this.x111 = -2;
        this.x222 = -2;
        this.x333 = -2;
        this.x444 = -2;
        this.x1111 = -2;
        this.x2222 = -2;
        this.x3333 = -2;
        this.x4444 = -2;
        this.notx111 = -2;
        this.notx222 = -2;
        this.notx333 = -2;
        this.notx444 = -2;
        this.notx1111 = -2;
        this.notx2222 = -2;
        this.notx3333 = -2;
        this.notx4444 = -2;

        this.x555 = -2;
        this.x666 = -2;
        this.x777 = -2;
        this.x888 = -2;
        this.x5555 = -2;
        this.x6666 = -2;
        this.x7777 = -2;
        this.x8888 = -2;
        this.notx555 = -2;
        this.notx666 = -2;
        this.notx777 = -2;
        this.notx888 = -2;
        this.notx5555 = -2;
        this.notx6666 = -2;
        this.notx7777 = -2;
        this.notx8888 = -2;
    }

    public TreeSet<String> generateFunctions2() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        for (int k = 0; k < 3; k++) {
            if (notx1 < 2) {
                notx1++;
            }
            for (int l = 0; l < 3; l++) {
                if (notx2 < 2) {
                    notx2++;
                }
                for (int o = 0; o < 3; o++) {
                    if (x1 < 2) {
                        x1++;
                    }
                    for (int p = 0; p < 3; p++) {
                        if (x2 < 2) {
                            x2++;
                        }
                        functions.add(getFunction2());
                    }
                    x2 = -2;
                }
                x1 = -2;
            }
            notx2 = -2;
        }
        return (TreeSet<String>) functions;
    }

    public TreeSet<String> generateFunctionsLeftUpper() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        int kol = 0;
        for (int i = 0; i < 3; i++) {
            if (notx44 < 2) {
                notx44++;
            }
            for (int j = 0; j < 3; j++) {
                if (notx33 < 2) {
                    notx33++;
                }
                for (int k = 0; k < 3; k++) {
                    if (notx22 < 2) {
                        notx22++;
                    }
                    for (int l = 0; l < 3; l++) {
                        if (notx11 < 2) {
                            notx11++;
                        }
                        for (int m = 0; m < 3; m++) {
                            if (notx4 < 2) {
                                notx4++;
                            }
                            for (int n = 0; n < 3; n++) {
                                if (notx3 < 2) {
                                    notx3++;
                                }
                                for (int o = 0; o < 3; o++) {
                                    if (notx2 < 2) {
                                        notx2++;
                                    }
                                    for (int p = 0; p < 3; p++) {
                                        if (notx1 < 2) {
                                            notx1++;
                                        }
                                        for (int q = 0; q < 3; q++) {
                                            if (x44 < 2) {
                                                x44++;
                                            }
                                            for (int r = 0; r < 3; r++) {
                                                if (x33 < 2) {
                                                    x33++;
                                                }
                                                for (int s = 0; s < 3; s++) {
                                                    if (x22 < 2) {
                                                        x22++;
                                                    }
                                                    for (int t = 0; t < 3; t++) {
                                                        if (x11 < 2) {
                                                            x11++;
                                                        }
                                                        for (int u = 0; u < 3; u++) {
                                                            if (x4 < 2) {
                                                                x4++;
                                                            }
                                                            for (int v = 0; v < 3; v++) {
                                                                if (x3 < 2) {
                                                                    x3++;
                                                                }
                                                                for (int w = 0; w < 3; w++) {
                                                                    if (x2 < 2) {
                                                                        x2++;
                                                                    }
                                                                    for (int x = 0; x < 3; x++) {
                                                                        if (x1 < 2) {
                                                                            x1++;
                                                                        }
                                                                        functions.add(getFunction2());
                                                                    }
                                                                    x1 = -2;
                                                                }
                                                                x2 = -2;
                                                            }
                                                            x3 = -2;
                                                        }
                                                        x4 = -2;
                                                    }
                                                    x11 = -2;
                                                }
                                                x22 = -2;
                                            }
                                            x33 = -2;
                                        }
                                        x44 = -2;
                                    }
                                    notx1 = -2;
                                }
                                notx2 = -2;
                            }
                            notx3 = -2;
                        }
                        notx4 = -2;
                    }
                    notx11 = -2;
                }
                notx22 = -2;
            }
            notx33 = -2;
        }
        return (TreeSet<String>) functions;
    }

    public TreeSet<String> generateFunctionsRightUpper() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        int kol = 0;
        for (int oo = 0; oo < 3; oo++) {
            if (x555 < 2) {
                x555++;
            }
            for (int pp = 0; pp < 3; pp++) {
                if (x666 < 2) {
                    x666++;
                }
                for (int qq = 0; qq < 3; qq++) {
                    if (x777 < 2) {
                        x777++;
                    }
                    for (int rr = 0; rr < 3; rr++) {
                        if (x888 < 2) {
                            x888++;
                        }
                        for (int ooo = 0; ooo < 3; ooo++) {
                            if (x5555 < 2) {
                                x5555++;
                            }
                            for (int ppp = 0; ppp < 3; ppp++) {
                                if (x6666 < 2) {
                                    x6666++;
                                }
                                for (int qqq = 0; qqq < 3; qqq++) {
                                    if (x7777 < 2) {
                                        x7777++;
                                    }
                                    for (int rrr = 0; rrr < 3; rrr++) {
                                        if (x8888 < 2) {
                                            x8888++;
                                        }
                                        for (int oooo = 0; oooo < 3; oooo++) {
                                            if (notx555 < 2) {
                                                notx555++;
                                            }
                                            for (int pppp = 0; pppp < 3; pppp++) {
                                                if (notx666 < 2) {
                                                    notx666++;
                                                }
                                                for (int qqqq = 0; qqqq < 3; qqqq++) {
                                                    if (notx777 < 2) {
                                                        notx777++;
                                                    }
                                                    for (int rrrr = 0; rrrr < 3; rrrr++) {
                                                        if (notx888 < 2) {
                                                            notx888++;
                                                        }
                                                        for (int ooooo = 0; ooooo < 3; ooooo++) {
                                                            if (notx5555 < 2) {
                                                                notx5555++;
                                                            }
                                                            for (int ppppp = 0; ppppp < 3; ppppp++) {
                                                                if (notx6666 < 2) {
                                                                    notx6666++;
                                                                }
                                                                for (int qqqqq = 0; qqqqq < 3; qqqqq++) {
                                                                    if (notx7777 < 2) {
                                                                        notx7777++;
                                                                    }
                                                                    for (int rrrrr = 0; rrrrr < 3; rrrrr++) {
                                                                        if (notx8888 < 2) {
                                                                            notx8888++;
                                                                        } // 48 (правая верхняя часть)
                                                                        functions.add(getFunction2());
                                                                    }
                                                                    notx8888 = -2;
                                                                }
                                                                notx7777 = -2;
                                                            }
                                                            notx6666 = -2;
                                                        }
                                                        notx5555 = -2;
                                                    }
                                                    notx888 = -2;
                                                }
                                                notx777 = -2;
                                            }
                                            notx666 = -2;
                                        }
                                        notx555 = -2;
                                    }
                                    x8888 = -2;
                                }
                                x7777 = -2;
                            }
                            x6666 = -2;
                        }
                        x5555 = -2;
                    }
                    x888 = -2;
                }
                x777 = -2;
            }
            x666 = -2;
        }
        return (TreeSet<String>) functions;
    }

    public TreeSet<String> generateFunctionsLeftBottom() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        int kol = 0;
        for (int oo = 0; oo < 3; oo++) {
            if (x5 < 2) {
                x5++;
            }
            for (int pp = 0; pp < 3; pp++) {
                if (x6 < 2) {
                    x6++;
                }
                for (int qq = 0; qq < 3; qq++) {
                    if (x7 < 2) {
                        x7++;
                    }
                    for (int rr = 0; rr < 3; rr++) {
                        if (x8 < 2) {
                            x8++;
                        }
                        for (int ooo = 0; ooo < 3; ooo++) {
                            if (x55 < 2) {
                                x55++;
                            }
                            for (int ppp = 0; ppp < 3; ppp++) {
                                if (x66 < 2) {
                                    x66++;
                                }
                                for (int qqq = 0; qqq < 3; qqq++) {
                                    if (x77 < 2) {
                                        x77++;
                                    }
                                    for (int rrr = 0; rrr < 3; rrr++) {
                                        if (x88 < 2) {
                                            x88++;
                                        }
                                        for (int oooo = 0; oooo < 3; oooo++) {
                                            if (notx5 < 2) {
                                                notx5++;
                                            }
                                            for (int pppp = 0; pppp < 3; pppp++) {
                                                if (notx6 < 2) {
                                                    notx6++;
                                                }
                                                for (int qqqq = 0; qqqq < 3; qqqq++) {
                                                    if (notx7 < 2) {
                                                        notx7++;
                                                    }
                                                    for (int rrrr = 0; rrrr < 3; rrrr++) {
                                                        if (notx8 < 2) {
                                                            notx8++;
                                                        }
                                                        for (int ooooo = 0; ooooo < 3; ooooo++) {
                                                            if (notx55 < 2) {
                                                                notx55++;
                                                            }
                                                            for (int ppppp = 0; ppppp < 3; ppppp++) {
                                                                if (notx66 < 2) {
                                                                    notx66++;
                                                                }
                                                                for (int qqqqq = 0; qqqqq < 3; qqqqq++) {
                                                                    if (notx77 < 2) {
                                                                        notx77++;
                                                                    }
                                                                    for (int rrrrr = 0; rrrrr < 3; rrrrr++) {
                                                                        if (notx88 < 2) {
                                                                            notx88++;
                                                                        } // (левая нижняя часть)
                                                                        functions.add(getFunction2());
                                                                    }
                                                                    notx88 = -2;
                                                                }
                                                                notx77 = -2;
                                                            }
                                                            notx66 = -2;
                                                        }
                                                        notx55 = -2;
                                                    }
                                                    notx8 = -2;
                                                }
                                                notx7 = -2;
                                            }
                                            notx6 = -2;
                                        }
                                        notx5 = -2;
                                    }
                                    x88 = -2;
                                }
                                x77 = -2;
                            }
                            x66 = -2;
                        }
                        x55 = -2;
                    }
                    x8 = -2;
                }
                x7 = -2;
            }
            x6 = -2;
        }
        return (TreeSet<String>) functions;
    }

    public TreeSet<String> generateFunctionsRightBottom() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        int kol = 0;
        for (int i = 0; i < 3; i++) {
            if (notx4444 < 2) {
                notx4444++;
            }
            for (int j = 0; j < 3; j++) {
                if (notx3333 < 2) {
                    notx3333++;
                }
                for (int k = 0; k < 3; k++) {
                    if (notx2222 < 2) {
                        notx2222++;
                    }
                    for (int l = 0; l < 3; l++) {
                        if (notx1111 < 2) {
                            notx1111++;
                        }
                        for (int m = 0; m < 3; m++) {
                            if (notx444 < 2) {
                                notx444++;
                            }
                            for (int n = 0; n < 3; n++) {
                                if (notx333 < 2) {
                                    notx333++;
                                }
                                for (int o = 0; o < 3; o++) {
                                    if (notx222 < 2) {
                                        notx222++;
                                    }
                                    for (int p = 0; p < 3; p++) {
                                        if (notx111 < 2) {
                                            notx111++;
                                        }
                                        for (int q = 0; q < 3; q++) {
                                            if (x4444 < 2) {
                                                x4444++;
                                            }
                                            for (int r = 0; r < 3; r++) {
                                                if (x3333 < 2) {
                                                    x3333++;
                                                }
                                                for (int s = 0; s < 3; s++) {
                                                    if (x2222 < 2) {
                                                        x2222++;
                                                    }
                                                    for (int t = 0; t < 3; t++) {
                                                        if (x1111 < 2) {
                                                            x1111++;
                                                        }
                                                        for (int u = 0; u < 3; u++) {
                                                            if (x444 < 2) {
                                                                x444++;
                                                            }
                                                            for (int v = 0; v < 3; v++) {
                                                                if (x333 < 2) {
                                                                    x333++;
                                                                }
                                                                for (int w = 0; w < 3; w++) {
                                                                    if (x222 < 2) {
                                                                        x222++;
                                                                    }
                                                                    for (int x = 0; x < 3; x++) {
                                                                        if (x111 < 2) {
                                                                            x111++;
                                                                        }
                                                                        functions.add(getFunction2());
                                                                    }
                                                                    x111 = -2;
                                                                }
                                                                x222 = -2;
                                                            }
                                                            x333 = -2;
                                                        }
                                                        x444 = -2;
                                                    }
                                                    x1111 = -2;
                                                }
                                                x2222 = -2;
                                            }
                                            x3333 = -2;
                                        }
                                        x4444 = -2;
                                    }
                                    notx111 = -2;
                                }
                                notx222 = -2;
                            }
                            notx333 = -2;
                        }
                        notx444 = -2;
                    }
                    notx1111 = -2;
                }
                notx2222 = -2;
            }
            notx3333 = -2;
        }
        return (TreeSet<String>) functions;
    }

    private String getFunction2() {
        int[] function = new int[4];
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i1 = 0; i1 < 2; i1++) {
                function[i1 + i2 * 2] = getFunctionValueRightBottom(i1, i2);
            }
        }
        return Arrays.toString(function);
    }


    private int getFunctionValueRightBottom(int i1, int i2) {
        boolean x_1 = ((x1 != 0 && x1 != 1) ? (i1 == 1) : (x1 == 1));
        boolean notx_1 = ((notx1 != 0 && notx1 != 1) ? (i1 == 0) : (notx1 == 1));

        boolean x_2 = ((x2 != 0 && x2 != 1) ? (i2 == 1) : (x2 == 1));
        boolean notx_2 = ((notx2 != 0 && notx2 != 1) ? (i2 == 0) : (notx2 == 1));

        if ((notx_1 && notx_2) || (x_1 && x_2)) {
            return 1;
        }
        return 0;
    }


    public TreeSet<String> andSchemes(File file1, File file2) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader(file1));
        BufferedReader bf2 = new BufferedReader(new FileReader(file2));
        int[][] functions1 = new int[4723][16];
        int[][] functions2 = new int[11][4];
        TreeSet<String> functions = new TreeSet<>();
        String f1 = "";
        String f2 = "";
        int jg = 0;
        for (int i = 0; i < 4723; i++) {
            f1 = bf1.readLine();
            int t = 1;
            for (int j = 0; j < 16; j++) {
                functions1[i][j] = Integer.parseInt(String.valueOf(f1.charAt(t)));
                t += 3;
            }
        }
        for (int i = 0; i < 11; i++) {
            f2 = bf2.readLine();
            int t = 1;
            for (int j = 0; j < 4; j++) {
                functions2[i][j] = Integer.parseInt(String.valueOf(f2.charAt(t)));
                t += 3;
            }
        }
        int[] func = new int[64];
        for (int m = 0; m < 4723; m++) {
            for (int n = 0; n < 11; n++) {
                int k = 0;
                for (int i = 0; i < 16; i++) {
                    for (int j = 0; j < 4; j++) {
                        func[k++] = functions1[m][i] * functions2[n][j];
                    }
                }
                if (!functions.contains(Arrays.toString(func))) {
                    functions.add(Arrays.toString(func));
                    System.out.println(jg++);
                }
            }
        }
        bf1.close();
        bf2.close();
        return functions;
    }

    public TreeSet<Long> orSchemes(File file1, File file2) throws IOException {
        TreeSet<Long> functions = new TreeSet<Long>();
        BufferedReader bf1 = new BufferedReader(new FileReader(file1));
        BufferedReader bf2 = new BufferedReader(new FileReader(file2));
        int[][] functions1 = new int[47221][64];
        int[][] functions2 = new int[47221][64];
        String f1 = "";
        String f2 = "";
        for (int i = 0; i < 47221; i++) {
            f1 = bf1.readLine();
            int t = 1;
            for (int j = 0; j < 64; j++) {
                functions1[i][j] = Integer.parseInt(String.valueOf(f1.charAt(t)));
                t += 3;
            }

            f2 = bf2.readLine();
            t = 1;
            for (int j = 0; j < 64; j++) {
                functions2[i][j] = Integer.parseInt(String.valueOf(f2.charAt(t)));
                t += 3;
            }
        }


        //String func = "[";
        int k = 1;
        //Long min = 8608480604381511679l;
        int[] func = new int[64];
        for (int m = 0; m < 1000; m++) {
            //int[] f_1 = functions1[m];
            for (int n = 0; n < 47221; n++) {
                //int[] f_2 = functions2[n];
                for (int i = 0; i < 64; i++) {
                    if ((functions1[m][i] + functions2[n][i]) == 0) {
                        func[i] = 0;
                    } else {
                        func[i] = 1;
                    }
                }
                if (func[0] != 0) {
                    Long doubleVers = (long) 0;
                    Long degree = (long) 1;
                    for (int i = 63; i > 0; i--) {
                        doubleVers += func[i] * degree;
                        degree *= 2;
                    }
                    if (/*doubleVers > min && */!functions.contains(doubleVers)) {
                        System.out.println(k++ + " " + m);
                        functions.add(doubleVers);
                    }
                }
            }
        }
        bf1.close();
        bf2.close();
        return functions;
    }

    public String functionByDefect6(int[] defect) throws IOException {
        handleDefect(defect);
        int[] function = new int[64];
        for (int i6 = 0; i6 < 2; i6++) {
            for (int i5 = 0; i5 < 2; i5++) {
                for (int i4 = 0; i4 < 2; i4++) {
                    for (int i3 = 0; i3 < 2; i3++) {
                        for (int i2 = 0; i2 < 2; i2++) {
                            for (int i1 = 0; i1 < 2; i1++) {
                                function[i1 + i2 * 2 + i3 * 4 + i4 * 8 + i5 * 16 + i6 * 32] = getFunctionValue6(i1, i2, i3, i4, i5, i6);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Получившаяся функция:");
        System.out.println(Arrays.toString(function));
        return findFunction(Arrays.toString(function));
    }

    private String findFunction(String function) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("functionsAll6.txt")));
        String f = "";
        String func = "";
        int min = 70;
        int cur = 0;
        int k = 0;
        while (bufferedReader.ready()) {
            f = bufferedReader.readLine();
            k++;
            if (f.length() == function.length()) {
                if (f.equals(function)) {
                    bufferedReader.close();
                    System.out.println("----");
                    return function;
                }
                cur = 0;
                for (int i = 0; i < f.length() - 1; i++) {
                    if (f.charAt(i) != function.charAt(i)) {
                        cur++;
                    }
                    if (cur > min) {
                        break;
                    }
                }
                if (cur <= min) {
                    min = cur;
                    func = f;
                }
            }
        }
        bufferedReader.close();
        System.out.println("---");
        return func;
    }

    private void handleDefect(int[] def) {
        if (def[0] > -1) {
            x1 = def[0];
        }
        if (def[1] > -1) {
            notx2 = def[1];
        }
        if (def[2] > -1) {
            notx3 = def[2];
        }
        if (def[3] > -1) {
            notx4 = def[3];
        }
        if (def[4] > -1) {
            notx1 = def[4];
        }
        if (def[5] > -1) {
            x2 = def[5];
        }
        if (def[6] > -1) {
            x3 = def[6];
        }
        if (def[7] > -1) {
            x4 = def[7];
        }
        if (def[8] > -1) {
            notx11 = def[8];
        }
        if (def[9] > -1) {
            notx22 = def[9];
        }
        if (def[10] > -1) {
            x33 = def[10];
        }
        if (def[11] > -1) {
            notx44 = def[11];
        }
        if (def[12] > -1) {
            x11 = def[12];
        }
        if (def[13] > -1) {
            x22 = def[13];
        }
        if (def[14] > -1) {
            notx33 = def[14];
        }
        if (def[15] > -1) {
            x44 = def[15];
        }
        if (def[16] > -1) {
            x5 = def[16];
        }
        if (def[17] > -1) {
            x6 = def[17];
        }
        if (def[18] > -1) {
            notx5 = def[18];
        }
        if (def[19] > -1) {
            notx6 = def[19];
        }
        if (def[20] > -1) {
            x55 = def[20];
        }
        if (def[21] > -1) {
            notx66 = def[21];
        }
        if (def[22] > -1) {
            notx55 = def[22];
        }
        if (def[23] > -1) {
            x66 = def[23];
        }
        if (def[24] > -1) {
            notx111 = def[24];
        }
        if (def[25] > -1) {
            notx222 = def[25];
        }
        if (def[26] > -1) {
            notx333 = def[26];
        }
        if (def[27] > -1) {
            notx444 = def[27];
        }
        if (def[28] > -1) {
            x111 = def[28];
        }
        if (def[29] > -1) {
            x222 = def[29];
        }
        if (def[30] > -1) {
            x333 = def[30];
        }
        if (def[31] > -1) {
            x444 = def[31];
        }
        if (def[32] > -1) {
            x1111 = def[32];
        }
        if (def[33] > -1) {
            notx2222 = def[33];
        }
        if (def[34] > -1) {
            notx3333 = def[34];
        }
        if (def[35] > -1) {
            x4444 = def[35];
        }
        if (def[36] > -1) {
            notx1111 = def[36];
        }
        if (def[37] > -1) {
            x2222 = def[37];
        }
        if (def[38] > -1) {
            x3333 = def[38];
        }
        if (def[39] > -1) {
            notx4444 = def[39];
        }
    }

    private void handleDefectOld(String defect) {
        String contact = "";
        int i = 0;
        while (i < defect.length()) {
            if (defect.charAt(i) == ' ' && i < defect.length() - 1) {
                if (contact.equals("x1")) {
                    x1 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x2")) {
                    x2 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x3")) {
                    x3 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x4")) {
                    x4 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x11")) {
                    x11 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x22")) {
                    x22 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x33")) {
                    x33 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x44")) {
                    x44 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx1")) {
                    notx1 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx2")) {
                    notx2 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx3")) {
                    notx3 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx4")) {
                    notx4 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx11")) {
                    notx11 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx22")) {
                    notx22 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx33")) {
                    notx33 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx44")) {
                    notx44 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                }

                /////
                if (contact.equals("x111")) {
                    x111 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x222")) {
                    x222 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x333")) {
                    x333 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x444")) {
                    x444 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x1111")) {
                    x1111 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x2222")) {
                    x2222 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x3333")) {
                    x3333 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x4444")) {
                    x4444 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx111")) {
                    notx111 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx222")) {
                    notx222 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx333")) {
                    notx333 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx444")) {
                    notx444 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx1111")) {
                    notx1111 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx2222")) {
                    notx2222 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx3333")) {
                    notx3333 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx4444")) {
                    notx4444 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                }
                if (contact.equals("x5")) {
                    x5 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x55")) {
                    x55 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx5")) {
                    notx5 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx55")) {
                    notx55 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                //
                if (contact.equals("x6")) {
                    x6 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x66")) {
                    x66 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx6")) {
                    notx6 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx66")) {
                    notx66 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
            } else {
                contact += defect.charAt(i++);
            }
        }
    }

    private int getFunctionValue6(int i1, int i2, int i3, int i4, int i5, int i6) {
        boolean x_1 = ((x1 != 0 && x1 != 1) ? (i1 == 1) : (x1 == 1));
        boolean notx_1 = ((notx1 != 0 && notx1 != 1) ? (i1 == 0) : (notx1 == 1));

        boolean x_11 = ((x11 != 0 && x11 != 1) ? (i1 == 1) : (x11 == 1));
        boolean notx_11 = ((notx11 != 0 && notx11 != 1) ? (i1 == 0) : (notx11 == 1));

        boolean x_111 = ((x111 != 0 && x111 != 1) ? (i1 == 1) : (x111 == 1));
        boolean notx_111 = ((notx111 != 0 && notx111 != 1) ? (i1 == 0) : (notx111 == 1));

        boolean x_1111 = ((x1111 != 0 && x1111 != 1) ? (i1 == 1) : (x1111 == 1));
        boolean notx_1111 = ((notx1111 != 0 && notx1111 != 1) ? (i1 == 0) : (notx1111 == 1));

        boolean x_2 = ((x2 != 0 && x2 != 1) ? (i2 == 1) : (x2 == 1));
        boolean notx_2 = ((notx2 != 0 && notx2 != 1) ? (i2 == 0) : (notx2 == 1));

        boolean x_22 = ((x22 != 0 && x22 != 1) ? (i2 == 1) : (x22 == 1));
        boolean notx_22 = ((notx22 != 0 && notx22 != 1) ? (i2 == 0) : (notx22 == 1));

        boolean x_222 = ((x222 != 0 && x222 != 1) ? (i2 == 1) : (x222 == 1));
        boolean notx_222 = ((notx222 != 0 && notx222 != 1) ? (i2 == 0) : (notx222 == 1));

        boolean x_2222 = ((x2222 != 0 && x2222 != 1) ? (i2 == 1) : (x2222 == 1));
        boolean notx_2222 = ((notx2222 != 0 && notx2222 != 1) ? (i2 == 0) : (notx2222 == 1));

        boolean x_3 = ((x3 != 0 && x3 != 1) ? (i3 == 1) : (x3 == 1));
        boolean notx_3 = ((notx3 != 0 && notx3 != 1) ? (i3 == 0) : (notx3 == 1));

        boolean x_33 = ((x33 != 0 && x33 != 1) ? (i3 == 1) : (x33 == 1));
        boolean notx_33 = ((notx33 != 0 && notx33 != 1) ? (i3 == 0) : (notx33 == 1));

        boolean x_333 = ((x333 != 0 && x333 != 1) ? (i3 == 1) : (x333 == 1));
        boolean notx_333 = ((notx333 != 0 && notx333 != 1) ? (i3 == 0) : (notx333 == 1));

        boolean x_3333 = ((x3333 != 0 && x3333 != 1) ? (i3 == 1) : (x3333 == 1));
        boolean notx_3333 = ((notx3333 != 0 && notx3333 != 1) ? (i3 == 0) : (notx3333 == 1));

        boolean x_4 = ((x4 != 0 && x4 != 1) ? (i4 == 1) : (x4 == 1));
        boolean notx_4 = ((notx4 != 0 && notx4 != 1) ? (i4 == 0) : (notx4 == 1));

        boolean x_44 = ((x44 != 0 && x44 != 1) ? (i4 == 1) : (x44 == 1));
        boolean notx_44 = ((notx44 != 0 && notx44 != 1) ? (i4 == 0) : (notx44 == 1));

        boolean x_444 = ((x444 != 0 && x444 != 1) ? (i4 == 1) : (x444 == 1));
        boolean notx_444 = ((notx444 != 0 && notx444 != 1) ? (i4 == 0) : (notx444 == 1));

        boolean x_4444 = ((x4444 != 0 && x4444 != 1) ? (i4 == 1) : (x4444 == 1));
        boolean notx_4444 = ((notx4444 != 0 && notx4444 != 1) ? (i4 == 0) : (notx4444 == 1));

        boolean x_5 = ((x5 != 0 && x5 != 1) ? (i5 == 1) : (x5 == 1));
        boolean notx_5 = ((notx5 != 0 && notx5 != 1) ? (i5 == 0) : (notx5 == 1));

        boolean x_55 = ((x55 != 0 && x55 != 1) ? (i5 == 1) : (x55 == 1));
        boolean notx_55 = ((notx55 != 0 && notx55 != 1) ? (i5 == 0) : (notx55 == 1));

        boolean x_6 = ((x6 != 0 && x6 != 1) ? (i6 == 1) : (x6 == 1));
        boolean notx_6 = ((notx6 != 0 && notx6 != 1) ? (i6 == 0) : (notx6 == 1));

        boolean x_66 = ((x66 != 0 && x66 != 1) ? (i6 == 1) : (x66 == 1));
        boolean notx_66 = ((notx66 != 0 && notx66 != 1) ? (i6 == 0) : (notx66 == 1));

        if ((
                ((x_1 && notx_2 && notx_3 && notx_4) ||
                        (x_1 && notx_2 && x_3 && x_4) ||
                        (notx_1 && x_2 && notx_3 && notx_4) ||
                        (notx_1 && x_2 && x_3 && x_4) ||
                        // LEFT UPPER
                        (notx_11 && notx_22 && x_33 && notx_44) ||
                        (notx_11 && notx_22 && notx_33 && x_44) ||
                        (x_11 && x_22 && x_33 && notx_44) ||
                        (x_11 && x_22 && notx_33 && x_44)
                )

                        &&

                        ((x_5 && x_6) || (notx_5 && notx_6))                        // RIGHT UPPER
        )

                ||

                (
                        ((x_55 && notx_66) || (notx_55 && x_66))                     // LEFT BOTTOM

                                &&

                                ((notx_111 && notx_222 && notx_333 && notx_444) ||
                                        (notx_111 && notx_222 && x_333 && x_444) ||
                                        (x_111 && x_222 && notx_333 && notx_444) ||
                                        (x_111 && x_222 && x_333 && x_444) ||
                                        // RIGHT BOTTOM
                                        (x_1111 && notx_2222 && notx_3333 && x_4444) ||
                                        (x_1111 && notx_2222 && x_3333 && notx_4444) ||
                                        (notx_1111 && x_2222 && notx_3333 && x_4444) ||
                                        (notx_1111 && x_2222 && x_3333 && notx_4444)
                                )
                )
        ) {
            return 1;
        }
        return 0;
    }
}