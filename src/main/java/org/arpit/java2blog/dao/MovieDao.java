/*
 * package org.arpit.java2blog.dao;
 * 
 * import org.arpit.java2blog.model.Movie; import
 * org.springframework.jdbc.core.JdbcTemplate;
 * 
 * public class MovieDao { JdbcTemplate template;
 * 
 * public void setTemplate(JdbcTemplate template) { this.template = template; }
 * 
 * public int save(Movie movie) {
 * 
 * String
 * sql="insert into movies(moviename,genre) values('"+movie.getMoviename()+"',"+
 * movie.getGenre()+"')"; return template.update(sql);
 * 
 * 
 * }
 * 
 * }
 */