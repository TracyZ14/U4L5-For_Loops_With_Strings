public class StringLoopsRunner
{
    public static void main(String[] args) {
        /*
        // TEST CASES for reverseString2:
        StringLoops loops = new StringLoops();
        System.out.println(loops.reverseString2("hello!"));
        System.out.println(loops.reverseString2("Apples and bananas"));

        // TEST CASES for countVowels:
        StringLoops loops = new StringLoops();
        System.out.println(loops.countVowels("Apples and bananas"));
        System.out.println(loops.countVowels("Hello Joe"));
        System.out.println(loops.countVowels("Hmm.. pssh!"));
        System.out.println(loops.countVowels("I"));
        System.out.println(loops.countVowels("Supercalifragilisticexpialidocious"));
         */

        // TEST CASES for countString:
        StringLoops loops = new StringLoops();
        System.out.println(loops.countString("an", "Apples and bananas"));
        System.out.println(loops.countString("tat", "Ratatattat"));
        System.out.println(loops.countString("lower", "sunflower"));
        System.out.println(loops.countString("haha", "Hahahahaha"));
        System.out.println(loops.countString("HAHA", "Hahahahaha"));
        System.out.println(loops.countString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.countString("was", "I was about to call you"));
        System.out.println(loops.countString("but", "I was about to call you"));
        System.out.println(loops.countString("i", "Supercalifragilisticexpialidocious"));

        /*
        // TEST CASES for removeString:
        StringLoops loops = new StringLoops();
        System.out.println(loops.removeString("an", "Apples and bananas"));
        System.out.println(loops.removeString("tat", "Ratatattat"));
        System.out.println(loops.removeString("lower", "sunflower"));
        System.out.println(loops.removeString("haha", "Hahahahaha"));
        System.out.println(loops.removeString("HAHA", "Hahahahaha"));
        System.out.println(loops.removeString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.removeString("lol", "lolololol"));
        System.out.println(loops.removeString("was", "I was about to call you"));
        System.out.println(loops.removeString("but", "I was about to call you"));
        System.out.println(loops.removeString("AB", "ABABABABABC"));
        System.out.println(loops.removeString("AB", "AAAAABBBBBC"));

        // TEST CASES for replaceCharacter:
        StringLoops loops = new StringLoops();
        System.out.println(loops.replaceCharacter("a", "Apples and bananas", "*"));
        System.out.println(loops.replaceCharacter("t", "Ratatattat", "p"));
        System.out.println(loops.replaceCharacter("!", "Nice! Day today!", "?"));
        System.out.println(loops.replaceCharacter("i", "it’s the brain drain pain train", "I"));
        System.out.println(loops.replaceCharacter("i", "it’s the brain drain pain train", " "));
        System.out.println(loops.replaceCharacter("A", "ABABABABABC", "D"));
        System.out.println(loops.replaceCharacter("a", "ABABABABABC", "D"));

         */
    }
}