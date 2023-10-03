public class Laptop {
    private String brand, color;
    private int id, price, ram, hdd, diagonal;


    public Laptop(int id, String brand, String color, int ram, int hdd, int diagonal, int price){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.price = price;
    }
    public int getId(){
        return id;
    }
//    public void setId(int id) {
//        this.id = id;
//    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public int getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "id " + id + " Brand: " + brand + ", Color: " + color + ", RAM: " + ram + ", HDD: " + hdd + ", Diagonal: " + diagonal + ", Price: " + price;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            } else {
                Laptop laptop = (Laptop) obj;
                return this.id == laptop.id;
            }
        }

    }
    public int hashCode() {
        return 31 * brand.hashCode() - ram;
    }
}