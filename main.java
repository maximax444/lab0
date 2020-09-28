public class main
{
public static void main(String[] args) {

    /* Задание 1 */
    short dStart = 7; /* Старт массива */
    short dEnd = 19; /* Конец массива */
    short dLen = (short)((dEnd - dStart) / 2 + 1); /* Длина */
    short d[] = new short[dLen]; /* Создание массива */

    /* Заполнение */

    for (short i = 0; i < dLen; i++) {
        d[i] = (short) (dStart + i * 2);
    }
    System.out.println("");

    /* Задание 2 */
    float xStart = -2.0f;
    float xEnd = 13.0f;
    int xLen = 16;
    float x[] = new float[16];
    for (int i = 0; i < xLen; i++) {
        x[i] = (float) ((Math.random() * xEnd) + xStart);
    }

    /* Задание 3 */
    double[][] g = new double[7][16];
    for (int i = 0; i < 7; i++) {
       for (int j = 0; j < 16; j++) {
           switch (d[i]){
               case 19:
                   g[i][j] = Math.cos(Math.pow((Math.asin((x[j] + 5.5) / 15) / 3), 2));
                   break;
               case 7:
               case 9:
               case 15:
                   g[i][j] = Math.cbrt(Math.cbrt(Math.pow(x[j] * 2, 2)));
                   break;
               default:
                   g[i][j] = Math.pow(Math.E, Math.tan(Math.cbrt(Math.asin((x[j] + 5.5) / 15))));
                   break;
               }
               System.out.printf("%.3f ", g[i][j]);
           }
           System.out.println("");
       }
}
}
