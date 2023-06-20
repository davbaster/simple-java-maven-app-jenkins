package com.mycompany.app;

public class App 
{
    private String message = "Hello World!";

    public String getMessage() {
        return this.message;
    }

    public boolean isMessageLong() {
        return this.message.length() > 10;
    }

    public String getMessageWithPrefix(String prefix) {
        return prefix + this.message;
    }

    public int getCountOf(char ch) {
        int count = 0;
        for (char c : this.message.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public String replaceInMessage(String oldStr, String newStr) {
        return this.message.replace(oldStr, newStr);
    }

    public int countCharacter(char c) {
    int count = 0;
    for (char character : this.message.toCharArray()) {
        if (character == c) {
            count++;
        }
    }
    return count;
}

}

