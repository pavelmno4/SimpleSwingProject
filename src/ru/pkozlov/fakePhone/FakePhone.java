package ru.pkozlov.fakePhone;

public class FakePhone {
    private String phoneNumber;
    private String phoneName;
    private String phoneData;

    public FakePhone(String phoneNumber, String phoneName, String phoneData) {
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneName;
        this.phoneData = phoneData;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneData() {
        return phoneData;
    }

    public void setPhoneData(String phoneData) {
        this.phoneData = phoneData;
    }
}
