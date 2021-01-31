package classes;

import java.util.Map;

public class Dictionary {
    private String firstWord;
    private String secondWord;

    public Dictionary(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    @Override
    public String toString() {
        return "Dictionary {" +
                " firstWord = '" + firstWord + '\'' +
                ", secondWord = '" + secondWord + '\'' +
                " }";
    }
}
