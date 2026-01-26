public class SpecialCharacterDemo {
    public static void main(String[] args) {

        String text1 = "We are the so-called \"Vikings\" from the north.";
        String text2 = "It\'s alright.";
        String text3 = "This is a backslash: \\";

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}

/*
output:

We are the so-called "Vikings" from the north.
It's alright.
This is a backslash: \


This example demonstrates:

\" → double quote

\' → single quote

\\ → backslash

/
