package oop;

public class Book {
    private String name;
    private String nameAuthor;
    private int year;
    private String nameProduction;
    private String genreBook;
    private int countOfPages;

    public Book(String name, String nameAuthor, int year, String nameProduction, String genreBook, int countOfPages) {
        this.name = name;
        this.nameAuthor = nameAuthor;
        this.year = year;
        this.nameProduction = nameProduction;
        this.genreBook = genreBook;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameProduction() {
        return nameProduction;
    }

    public void setNameProduction(String nameProduction) {
        this.nameProduction = nameProduction;
    }

    public String getGenreBook() {
        return genreBook;
    }

    public void setGenreBook(String genreBook) {
        this.genreBook = genreBook;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Book { " +
                " name= '" + name + '\'' +
                ", nameAuthor = '" + nameAuthor + '\'' +
                ", year = " + year +
                ", nameProduction = '" + nameProduction + '\'' +
                ", genreBook = '" + genreBook + '\'' +
                ", countOfPages = " + countOfPages +
                " }";
    }
}
