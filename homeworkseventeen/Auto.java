package com.proftelran.org.lessonseventeen.homeworkseventeen;

public class Auto {
    private int number;
    private String color;
    private String brand;
    private int mileage;
    private int price;

    public Auto(int number, String color, String brand, int mileage, int price) {
        this.number = number;
        this.color = color;
        this.brand = brand;
        this.mileage = mileage;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
