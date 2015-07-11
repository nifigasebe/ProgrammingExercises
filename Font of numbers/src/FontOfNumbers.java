/**
 * Created by Chizhov-AS on 28.04.2015.
 */
public class FontOfNumbers {

    private static String[][] zero = new String[7][7];
    private static String[][] one = new String[7][2];
    private static String[][] two = new String[7][5];
    private static String[][] three = new String[7][5];
    private static String[][] four = new String[7][7];
    private static String[][] five = new String[7][7];
    private static String[][] six = new String[7][5];
    private static String[][] seven = new String[7][5];
    private static String[][] eight = new String[7][5];
    private static String[][] nine = new String[7][5];

    private static String space;

    private static String[] zeroLines = new String[7];
    private static String[] oneLines = new String[7];
    private static String[] twoLines = new String[7];
    private static String[] threeLines = new String[7];
    private static String[] fourLines = new String[7];
    private static String[] fiveLines = new String[7];
    private static String[] sixLines = new String[7];
    private static String[] sevenLines = new String[7];
    private static String[] eightLines = new String[7];
    private static String[] nineLines = new String[7];

    public static String[] getZeroLines() {
        return zeroLines;
    }

    public static String[] getOneLines() {
        return oneLines;
    }

    public static String[] getTwoLines() {
        return twoLines;
    }

    public static String[] getThreeLines() {
        return threeLines;
    }

    public static String[] getFourLines() {
        return fourLines;
    }

    public static String[] getFiveLines() {
        return fiveLines;
    }

    public static String[] getSixLines() {
        return sixLines;
    }

    public static String[] getSevenLines() {
        return sevenLines;
    }

    public static String[] getEightLines() {
        return eightLines;
    }

    public static String[] getNineLines() {
        return nineLines;
    }

    public static String getSpace() {
        return space;
    }

    public void setUp() {

        String[][][] numbers = {zero,one,two,three,four,five,six,seven,eight,nine};

        for (String[][] number : numbers) {
            for (int i = 0; i <number.length; i++) {
                for (int j = 0; j < number[0].length; j++) {
                    number[i][j] = " ";
                }
            }
        }

        space = "   ";

        zero[0][2] = "*";
        zero[0][3] = "*";
        zero[0][4] = "*";
        zero[1][1] = "*";
        zero[1][5] = "*";
        zero[2][0] = "*";
        zero[2][6] = "*";
        zero[3][0] = "*";
        zero[3][6] = "*";
        zero[4][0] = "*";
        zero[4][6] = "*";
        zero[5][1] = "*";
        zero[5][5] = "*";
        zero[6][2] = "*";
        zero[6][3] = "*";
        zero[6][4] = "*";

        one[0][1] = "*";
        one[1][0] = "*";
        one[1][1] = "*";
        one[2][1] = "*";
        one[3][1] = "*";
        one[4][1] = "*";
        one[5][1] = "*";
        one[6][1] = "*";

        two[0][1] = "*";
        two[0][2] = "*";
        two[0][3] = "*";
        two[1][0] = "*";
        two[1][4] = "*";
        two[2][0] = "*";
        two[2][4] = "*";
        two[3][2] = "*";
        two[4][1] = "*";
        two[5][1] = "*";
        two[6][1] = "*";
        two[6][2] = "*";
        two[6][3] = "*";
        two[6][4] = "*";

        three[0][1] = "*";
        three[0][2] = "*";
        three[0][3] = "*";
        three[1][0] = "*";
        three[1][4] = "*";
        three[2][3] = "*";
        three[3][2] = "*";
        three[4][4] = "*";
        three[5][0] = "*";
        three[5][4] = "*";
        three[6][1] = "*";
        three[6][2] = "*";
        three[6][3] = "*";

        four[0][5] = "*";
        four[1][4] = "*";
        four[1][5] = "*";
        four[2][3] = "*";
        four[2][5] = "*";
        four[3][1] = "*";
        four[3][5] = "*";
        four[4][0] = "*";
        four[4][1] = "*";
        four[4][2] = "*";
        four[4][3] = "*";
        four[4][4] = "*";
        four[4][5] = "*";
        four[4][6] = "*";
        four[5][5] = "*";
        four[6][5] = "*";

        five[0][0] = "*";
        five[0][1] = "*";
        five[0][2] = "*";
        five[0][3] = "*";
        five[0][4] = "*";
        five[1][0] = "*";
        five[2][0] = "*";
        five[3][0] = "*";
        five[3][1] = "*";
        five[3][2] = "*";
        five[3][3] = "*";
        five[3][4] = "*";
        five[4][6] = "*";
        five[5][6] = "*";
        five[6][0] = "*";
        five[6][1] = "*";
        five[6][2] = "*";
        five[6][3] = "*";
        five[6][4] = "*";

        six[0][0] = "*";
        six[1][0] = "*";
        six[2][0] = "*";
        six[3][0] = "*";
        six[3][1] = "*";
        six[3][2] = "*";
        six[3][3] = "*";
        six[4][0] = "*";
        six[4][4] = "*";
        six[5][0] = "*";
        six[5][4] = "*";
        six[6][0] = "*";
        six[6][1] = "*";
        six[6][2] = "*";
        six[6][3] = "*";

        seven[0][0] = "*";
        seven[0][1] = "*";
        seven[0][2] = "*";
        seven[0][3] = "*";
        seven[0][4] = "*";
        seven[1][4] = "*";
        seven[2][3] = "*";
        seven[3][2] = "*";
        seven[4][1] = "*";
        seven[5][0] = "*";
        seven[6][0] = "*";

        eight[0][1] = "*";
        eight[0][2] = "*";
        eight[0][3] = "*";
        eight[1][0] = "*";
        eight[1][4] = "*";
        eight[2][0] = "*";
        eight[2][4] = "*";
        eight[3][1] = "*";
        eight[3][2] = "*";
        eight[3][3] = "*";
        eight[4][0] = "*";
        eight[4][4] = "*";
        eight[5][0] = "*";
        eight[5][4] = "*";
        eight[6][1] = "*";
        eight[6][2] = "*";
        eight[6][3] = "*";

        nine[0][1] = "*";
        nine[0][2] = "*";
        nine[0][3] = "*";
        nine[0][4] = "*";
        nine[1][0] = "*";
        nine[1][4] = "*";
        nine[2][0] = "*";
        nine[2][4] = "*";
        nine[3][1] = "*";
        nine[3][2] = "*";
        nine[3][3] = "*";
        nine[3][4] = "*";
        nine[4][4] = "*";
        nine[5][4] = "*";
        nine[6][4] = "*";

        for (int i=0;i<7;i++) {
            zeroLines[i] = zero[i][0] + zero[i][1] + zero[i][2] + zero[i][3] + zero[i][4] + zero[i][5] + zero[i][6];
            oneLines[i] = one[i][0] + one[i][1];
            twoLines[i] = two[i][0] + two[i][1] + two[i][2] + two[i][3] + two[i][4];
            threeLines[i] = three[i][0] + three[i][1] + three[i][2] + three[i][3] + three[i][4];
            fourLines[i] = four[i][0] + four[i][1] + four[i][2] + four[i][3] + four[i][4] + four[i][5] + four[i][6];
            fiveLines[i] = five[i][0] + five[i][1] + five[i][2] + five[i][3] + five[i][4] + five[i][5] + five[i][6];
            sixLines[i] = six[i][0] + six[i][1] + six[i][2] + six[i][3] + six[i][4];
            sevenLines[i] = seven[i][0] + seven[i][1] + seven[i][2] + seven[i][3] + seven[i][4];
            eightLines[i] = eight[i][0] + eight[i][1] + eight[i][2] + eight[i][3] + eight[i][4];
            nineLines[i] = nine[i][0] + nine[i][1] + nine[i][2] + nine[i][3] + nine[i][4];
        }
    }
}
