public class Passenger {
    String name;

    int age;

    Booking booking;

    public Passenger(String name, int age, Booking booking) {
        this.name = name;
        this.age = age;
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", booking=" + booking +
                '}';
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
