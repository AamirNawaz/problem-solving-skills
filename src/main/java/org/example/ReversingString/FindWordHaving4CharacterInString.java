package org.example.ReversingString;
public class FindWordHaving4CharacterInString {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("*********** Find word contains 4 characters in the string and return those! ****************");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        String numbersInString = "one, two, three, four, five, six, seven, eight, nine, ten";
        var trimedString = numbersInString.replaceAll("\\s", "");
        var result = trimedString.split(",");
        for (String s : result) {
            if (s.length() == 4) {
                System.out.println(s);
            }
        }

     /*   output:
                four
                five
                nine
      */

    }
}
