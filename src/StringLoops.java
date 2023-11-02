public class StringLoops {
    public StringLoops() { }
    public int countCharacters(String character, String searchString)
    {
        int numberOfTimesAppeared = 0;
        for (int i = 0; i < searchString.length(); i ++)
        {
            while (searchString.indexOf(character) != -1)
            {
                int index = searchString.indexOf(character);
                searchString = searchString.substring(0, index) + searchString.substring(index + 1);
                numberOfTimesAppeared++;
            }
        }
        return numberOfTimesAppeared;
    }

    public String reverseString(String origString)
    {
        String reversed = "";
        for(int i = origString.length(); i >= 0; i--)
        {
            if(i == origString.length())
            {
                reversed = reversed + origString.substring(i);
            }
            else
            {
                reversed = reversed + origString.substring(i, i + 1);
            }
        }
        return reversed;
    }

    public String reverseString2(String origString)
    {
        String reversed = "";
        for(int i = 0; i <= origString.length(); i++)
        {
            if(i == origString.length())
            {
                reversed = origString.substring(i) + reversed;
            }
            else
            {
                reversed = origString.substring(i, i + 1) + reversed;
            }
        }
        return reversed;
    }

    public int countVowels(String origString)
    {
        int numberOfVowels = countCharacters("A", origString) + countCharacters("E", origString) + countCharacters("I", origString) + countCharacters("O", origString) + countCharacters("U", origString);
        numberOfVowels = numberOfVowels + countCharacters("a", origString) + countCharacters("e", origString) + countCharacters("i", origString) + countCharacters("o", origString) + countCharacters("u", origString);
        return numberOfVowels;
    }

    public int countString(String searchString, String origString)
    {
        /*
        int numberOfTimesAppeared = 0;
        searchString = searchString.toLowerCase();
        origString = origString.toLowerCase();
        for (int i = 0; i < origString.length(); i++) {
            while (origString.indexOf(searchString) != -1) {
                int index = origString.indexOf(searchString);
                origString = origString.substring(0, index) + origString.substring(index + 1);
                numberOfTimesAppeared++;
            }
        }
        return numberOfTimesAppeared;
         */
    }

    /* Returns a String with all instances of "searchString" removed from "origString";
     matches SHOULD be case sensitive (i.e no need to convert to lowercase)

     Examples:
     - if searchString = "an" and origString = "Apples and bananas",
       this method returns "Apples d bas"
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns "Raat"
     - if searchString = "lower" and origString = "sunflower",
       this method returns "sunf"
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns "Hahahahaha" (no matches due to case)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns "it’s the b d pain t"
     - if searchString = "lol" and origString = "lolololol",
       this method returns "ool"
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns "I  about to call you, n’t I?"
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns "I was about to call you, wasn’t I?" (no matches)
     - if searchString = "AB" and origString = "ABABABABABC",
       this method returns "C"
     - if searchString = "AB" and origString = "AAAAABBBBBC",
       this method returns "C"

    public String removeString(String searchString, String origString) {
        /* to be implemented
    }

    /* Returns a String with all instances of "searchChar" in "origString" replaced with
   "replaceChar"; matches SHOULD be case sensitive.

   Examples:
   - if searchChar = "a", origString = "Apples and bananas", replaceChar = "*"
     this method returns "Apples *nd b*n*n*s" (A not a match because of case)
   - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
     this method returns "Rapapappap"
   - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
     this method returns "Nice? Day today?"
   - if searchChar = "i", origString = "it’s the brain drain pain train",
     replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
   - if searchChar = "i", origString = "it’s the brain drain pain train",
     replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
   - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
     this method returns "DBDBDBDBDBC"
   - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
     this method returns "ABABABABABC" (no matches because of case)

  PRECONDITION:
      both searchChar and replaceChar are single characters, and they are not equal

    public String replaceCharacter(String searchChar, String origStr, String replaceChar) {
        /* to be implemented */
}