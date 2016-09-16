public class PhraseOMatic{

     public static void main(String []args){
        
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B2B", "win-win", "frontend", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point","solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];
        
        System.out.print("What we need is a " + phrase + "      ");
     }
}
