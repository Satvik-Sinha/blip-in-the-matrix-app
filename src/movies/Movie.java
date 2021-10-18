package movies;

public class Movie {
    private String name;
    private String imgSrc;
    private String color;
    private String genre;
    private String year;
    private int likes,dislikes;
    private int id;

//    public Movie(String name, String imgSrc, String color, String genre, String year, int likes, int dislikes, int it){
//        this.id = id;
//        this.name = name;
//        this.imgSrc = imgSrc;
//        this.color = color;
//        this.genre = genre;
//        this.year = year;
//        this.likes=likes;
//        this.dislikes=dislikes;
//    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getImgSrc() {
        return imgSrc;
    }
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    //likes
    public int getLikes(){
        return this.likes;
    }
    public void addLike(){
        likes=likes+1;
    }

    //dislikes
    public int getDislikes(){
        return this.dislikes;
    }
    public void addDisLike(){
        dislikes=dislikes+1;
    }
}