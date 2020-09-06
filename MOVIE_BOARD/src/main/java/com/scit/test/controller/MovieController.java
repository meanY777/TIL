package com.scit.test.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.test.service.MovieService;
import com.scit.test.vo.MovieVO;

@RequestMapping(value="/movie")
@Controller
public class MovieController {
	@Autowired
	private MovieService ms;
	
	@RequestMapping(value="/uploadMovie",method = RequestMethod.GET)
	public String goUploadMovie() {
		
		return "movie/uploadMovie";
	}

	@RequestMapping(value="/upload",method = RequestMethod.POST)
	public String movieUpload(MovieVO movie) {
		
		String page = ms.insertMovie(movie);
		return page;
	}
	@RequestMapping(value="/movieContext",method = RequestMethod.GET)
	public String movieContext(int movie_no,Model model) {
		ms.updateHits(movie_no);
		MovieVO movie = ms.selectOneMovie(movie_no);
		model.addAttribute("movie", movie);
		
		return "movie/movieContext";
	}
	@RequestMapping(value="/updatePage",method = RequestMethod.GET)
	public String updatePage(int movie_no,Model model) {
		MovieVO movie = ms.selectOneMovie(movie_no);
		model.addAttribute("movie", movie);
		
		return "movie/movieUpdate";
	}
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String movieUpdate(MovieVO movie) {
		
		ms.updateMovie(movie);
		
		return "redirect:/movie/movieList";
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public String updatePage(int movie_no) {
		
		ms.deleteMovie(movie_no);
		
		return "redirect:/movie/movieList";
	}
	@RequestMapping(value="/movieList",method = RequestMethod.GET)
	public String search(
						@RequestParam(value ="searchType" ,defaultValue="") String searchType,
						@RequestParam(value ="searchText" ,defaultValue="") String searchText,
						int movie_no,
						Model model) {
		
		ArrayList<HashMap<String,Object>>list = ms.search(searchType, searchText,movie_no);
		model.addAttribute("movie", list);
		return "movie/movieList";
	}
}
