package Lab02;
//Nguyen Thanh Hieu - 20225716

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private float cost;
    private int length;

    public DigitalVideoDisc(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = length;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director;
    }

    public float getCost(){
        return cost;
    }

    public int getLength(){
        return length;
    }

    public boolean equals(DigitalVideoDisc disc) {
        if (disc == null) {
            return false;
        }
        return this.getTitle() != null && this.getTitle().equals(disc.getTitle());
    }
}
