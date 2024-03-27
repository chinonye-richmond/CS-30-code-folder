// Chinonye Richmond
// Assignment 7
// 3/27/2024
// This program removes the word very from the first message and replaces the abbreviation lol with its full meaning laugh out loud in the second message.

public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        int start1 = message1.indexOf(target1);
        int end1 = target1.length();
        System.out.println(message1.substring(0,start1) + message1.substring(start1 + end1));


        String message2 = "That was great - lol.";
        String target2 = "lol";
        int start2 = message2.indexOf(target2);
        int end2 = target2.length();
        System.out.println(message2.substring(0,start2) + "laugh out loud.");

        
    }
}
