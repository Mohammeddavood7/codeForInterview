package company.throughtworkTest;

import java.util.TreeMap;

public class IntToRoman {

    private static final TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
    }

    public static String intToRoman(int num)
    {
        StringBuilder roman = new StringBuilder();
        // Iterate through the keys in descending order
        for (int key : map.descendingKeySet())
        {
            // While the number is greater than or equal to the current key
            while (num >= key)
            {
                // Append the corresponding Roman numeral to the StringBuilder
                roman.append(map.get(key));
                // Subtract the key from the number
                num -= key;
            }
        }
        return roman+"";
    }

    public static void main(String[] args) {
        int i1 = 113;
        int i2 = 16;

        System.out.println(i1 + " in Roman numerals: " + intToRoman(i1));
        System.out.println(i2 + " in Roman numerals: " + intToRoman(i2));
    }
}

