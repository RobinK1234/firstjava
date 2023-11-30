package week9;

import week9.mooc.logic.ApplicationLogic;
import week9.mooc.ui.TextUserInterface;
import week9.mooc.ui.UserInterface;

public class Ex17 {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }

}