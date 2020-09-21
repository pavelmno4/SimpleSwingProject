package ru.pkozlov.fakePhone;

import java.util.ArrayList;

public class FakePhoneGenerator implements Runnable {
    private ArrayList<FakePhone> fakePhones = new ArrayList<>();
    public Thread thrd;

    private FakePhoneGenerator(String threadName) {
        this.thrd = new Thread(this, threadName);
    }

    public static FakePhoneGenerator generateThread(String name) {
        return new FakePhoneGenerator(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                for (FakePhone fP : this.fakePhones) {
                    System.out.println(
                            "phoneNumber: " + fP.getPhoneNumber() + ", " +
                                    "phoneName: " + fP.getPhoneName() + ", " +
                                    "phoneDate: " + fP.getPhoneData()
                    );
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<FakePhone> getFakePhones() {
        return fakePhones;
    }

    public void setFakePhones(ArrayList<FakePhone> fakePhones) {
        this.fakePhones = fakePhones;
    }

    public void addFakePhone(String phoneNumber, String phoneName, String phoneData) {
        FakePhone fakePhone = new FakePhone(phoneNumber, phoneName, phoneData);

        this.fakePhones.add(fakePhone);
    }

    public void removeFakePhone(String phoneNumber) {
        FakePhone removingFakePhone = null;

        for (FakePhone fP : this.fakePhones) {
            if (fP.getPhoneNumber().equals(phoneNumber)) {
                removingFakePhone = fP;
            }
        }
        if (removingFakePhone != null) {
            this.fakePhones.remove(removingFakePhone);
        } else {
            System.out.println("Number not found!");
        }
    }
}
