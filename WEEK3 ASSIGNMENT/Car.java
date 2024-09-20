class Car
{
    public String model;
    public int year;
    public String color;

    public Car (String model, int year, String color)
    {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void CarInfo ()
    {
        System.out.println("Model: "+model);
        System.out.println("Year: "+ year);
        System.out.println("Color: "+color);
    }

    public static void main(String args[])
    {
        Car obj1 = new Car ("SUV",2024,"Red");
        obj1.CarInfo();
        Car obj2 = new Car ("SEDAN",2024,"Yellow");
        obj2.CarInfo();
    }
}