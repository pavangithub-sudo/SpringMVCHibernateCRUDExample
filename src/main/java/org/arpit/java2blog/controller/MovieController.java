/*
 * package org.arpit.java2blog.controller;
 * 
 * import org.arpit.java2blog.model.Movie; import
 * org.arpit.java2blog.service.MovieService; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * @RestController
 * 
 * @RequestMapping(value = "/hai") public class MovieController {
 * 
 * @Autowired private MovieService movieService;
 * 
 * @RequestMapping(value = "/movie") public ModelAndView string() { ModelAndView
 * mv = new ModelAndView(); mv.addObject("msg", "movie name TeneT");
 * mv.setViewName("movie"); return mv; }
 * 
 * @RequestMapping(value = "/hello") public String hello() { return
 * "hello string"; }
 * 
 * @RequestMapping(value = "/hai") public String hai() { return "hello string";
 * }
 * 
 * @RequestMapping(value = "/addmovie", method = RequestMethod.POST, headers =
 * "Accept=application/json") public String addMovie(@ModelAttribute("movie")
 * Movie movie) { movieService.addMovie(movie); return "redirect:/movie"; } }
 */