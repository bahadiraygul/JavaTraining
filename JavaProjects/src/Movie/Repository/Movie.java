package Movie.Repository;

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String distributor;

    public Movie(String title, String director, int yearOfRelease, String genre, String distributor){
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.distributor = distributor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie:" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                ", distributor='" + distributor + '\'';
    }

    static class MovieCreator{
        private String title;
        private String director;
        private int yearOfRelease;
        private String genre;
        private String distributor;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public void setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setDistributor(String distributor) {
            this.distributor = distributor;
        }

        public Movie createMovie(){
            Movie movie = new Movie(title, director, yearOfRelease, genre, distributor);
            return movie;
        }
    }
}
