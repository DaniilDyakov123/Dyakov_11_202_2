import java.util.Comparator;


public class Task24 {
    public static void main(String[] args) {

    }
}

class LComparator<Integer> implements Comparator<Integer> {
    public static int getNumberOfDigits(int n) {
        if (n == 0) {
            return {1, 0};
        }
        int tens = 1;
        int nDigits = 1;
        while (n >= tens) {
            tens *= 10;
            nDigits += 1;
        }
        return new int[] {nDigits - 1,  tens / 10};
    }

    @Override
    public int compare(Integer n1,  Integer n2) {
        //узнать колво цифр в каждом числе
        int [] result = getNumberOfDigits()
        int nDigits1 = getNumberOfDigits(n1);
        int nDigits2 = getNumberOfDigits(n2)[0];
        int minDigits = nDigits1 > nDigits2 ? nDigits2 : nDigits1;
        //получить 10 в степени колво цифр минус 1
        int tenPower1 = 0;
        int tenPower2 = 0;
        int i = 1;
        while (i <= minDigits) {
            int digit1 = n1 / tenPower1;
            int digit2 = n2 / tenPower2;
            if (digit1 != digit2) {
                return digit1 - digit2;
            } else {
                i++;
                n1 = n1 % tenPower1;
                n2 = n2 % tenPower2;
                tenPower1 /= 10;
                tenPower2 /= 10;
            }
        }
        if (nDigits1 == nDigits2) {
            return 0;
        } else {
            return nDigits1 - nDigits2;
        }
    }
}
