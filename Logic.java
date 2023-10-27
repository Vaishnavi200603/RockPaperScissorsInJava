package org.example;

public class RockPaperScissors {
    public static int receiveInput(String userInput, String computerInput){
        if(userInput.equals(computerInput)){
            return 0;
        }
        else if(userInput.equals("R")){
            if(computerInput.equals("S")){
                return 1;
            }
            else if(computerInput.equals("P")){
                return -1;
            }
        }
        else if(userInput.equals("S")){
            if(computerInput.equals("P")){
                return 1;
            }
            else if(computerInput.equals("R")){
                return -1;
            }
        }
        else if(userInput.equals("P")){
            if(computerInput.equals("R")){
                return 1;
            }
            else if(computerInput.equals("S")){
                return -1;
            }
        }
        else{
            return -10;
        }
        return 0;
    }
}
