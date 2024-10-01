import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
       
        //cerates a scaner to get user input
        Scanner sc = new Scanner(System.in);
        //madlibs string
        String madlib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        String madlib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew";
        String madlib3 = "I went to the <resterouant> to eat a delicios <food> then I drove home in my <car>";

        //finds the word contanied in the <> for fisrt line
        int indexStart1 = madlib1.indexOf("<");
        int indexEnd1 = madlib1.indexOf(">");
        String sub1 = madlib1.substring(indexStart1+1, indexEnd1);
        //printing out the lines and scaning user input for first word 
        System.out.println("Give me a " + sub1);
        String input1 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub1+">", input1);

        //finds the second word contanied in the <> for 
        int indexStart2 = madlib1.indexOf("<");
        int indexEnd2 = madlib1.indexOf(">");
        String sub2 = madlib1.substring(indexStart2+1, indexEnd2);
        //printing out the lines and scaning user input for the second word
        System.out.println("Give me a " + sub2);
        String input2 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub2+">", input2);

        //finds the third word contanied in the <> for fisrt line
        int indexStart3 = madlib1.indexOf("<");
        int indexEnd3 = madlib1.indexOf(">");
        String sub3 = madlib1.substring(indexStart3+1, indexEnd3);
        //printing out the lines and scaning user input for first word 
        System.out.println("Give me a " + sub3);
        String input3 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub3+">", input3);

        //pritning out the final line
        System.out.println(madlib1);
    }


}