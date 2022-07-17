import java.time.LocalDate;
import java.time.Month;

public class User {
    private LocalDate birthdate;
    private int size;
    private Photo[] photos;
    private Address address;

    public User(LocalDate birthdate, int size, Photo[] photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1985, Month.AUGUST, 31);
        int size = 180;
        Photo[] photos = {
                new Photo("https://via.placeholder.com/120", "photo 1", 120, 120),
                new Photo("https://via.placeholder.com/120", "photo 2", 120, 120)
        };
        Address address = new Address("9", "ALL. Serr", "Bordeaux", "France");

        User user = new User(birthdate, size, photos, address);

        System.out.println(
                "Birth date : " + user.getBirthdate() + "\n" +
                        "Size : " + user.getSize());
        for (int i = 0; i < user.photos.length; i++) {
            System.out.println(user.photos[i].getFilename() + " url : " + user.photos[i].getUrl());
        }
        System.out.println(
                "Address : \n" +
                        "   " + user.getAddress().getNumber() + "\n" +
                        "   " + user.getAddress().getStreet() + "\n" +
                        "   " + user.getAddress().getCity() + "\n" +
                        "   " + user.getAddress().getCountry());
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
