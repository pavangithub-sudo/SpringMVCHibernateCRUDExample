/*
 * package org.arpit.java2blog.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "movies") public class Movie {
 * 
 * @Id
 * 
 * @Column(name = "id")
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private int id;
 * 
 * @Column(name = "moviename") private String moviename;
 * 
 * @Column(name = "genre") private String genre;
 * 
 * public Movie(int id, String moviename, String genre) { super(); this.id = id;
 * this.moviename = moviename; this.genre = genre; }
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getMoviename() { return moviename; }
 * 
 * public void setMoviename(String moviename) { this.moviename = moviename; }
 * 
 * public String getGenre() { return genre; }
 * 
 * public void setGenre(String genre) { this.genre = genre; }
 * 
 * @Override public String toString() { return "Movie [id=" + id +
 * ", moviename=" + moviename + ", genre=" + genre + "]"; }
 * 
 * 
 * 
 * }
 */