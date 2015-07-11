import java.util.ArrayList;

/**
 * Created by Chizhov-AS on 28.04.2015.
 */
public class WriteResult {

    public void writeResult(int[] numbers) {

        FontOfNumbers fontOfNumbers = new FontOfNumbers();
        fontOfNumbers.setUp();

        StringBuilder[] stringBuilder = new StringBuilder[7];
        String s = " ";
        for (int i=0; i<stringBuilder.length;i++){
            stringBuilder[i] = new StringBuilder(s);
        }

        String[] lines;

        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {

                case 0:
                    lines = fontOfNumbers.getZeroLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 1:
                    lines = fontOfNumbers.getOneLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 2:
                    lines = fontOfNumbers.getTwoLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 3:
                    lines = fontOfNumbers.getThreeLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 4:
                    lines = fontOfNumbers.getFourLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 5:
                    lines = fontOfNumbers.getFiveLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 6:
                    lines = fontOfNumbers.getSixLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 7:
                    lines = fontOfNumbers.getSevenLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 8:
                    lines = fontOfNumbers.getEightLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                case 9:
                    lines = fontOfNumbers.getNineLines();
                    for (int z=0; z<7; z++){
                        stringBuilder[z].append(lines[z]).append(fontOfNumbers.getSpace());
                    }
                    break;

                default:
                    System.out.println("Switch ERROR !!");
                    break;
            }
        }

        for (StringBuilder string : stringBuilder){
            System.out.println(string);
        }  }
}
