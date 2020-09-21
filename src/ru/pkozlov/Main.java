package ru.pkozlov;

import ru.pkozlov.components.MainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(MainFrame::new);

//        FakePhoneGenerator fPG = FakePhoneGenerator.generateThread("Generator");
//        fPG.addFakePhone("445533", "Nina", "112233");

    }
}
