package com.company;
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-signa", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
        int oneLength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threelength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twolength);
        int rand3 = (int) (Math.random() * threelength);
        String Phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("what we need is a " + Phrase);
    }
}
