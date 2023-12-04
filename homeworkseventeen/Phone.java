package com.proftelran.org.lessonseventeen.homeworkseventeen;

public class Phone {
    public String phone;
    public String phoneType;

    public Phone(String phone, String phoneType) {
        this.phone = phone;
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }
}

