package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MovieDAO;
import com.scit.test.dao.MovieMapper;
import com.scit.test.vo.MovieVO;
@Service
public class MovieService {
	@Autowired
	private MovieDAO dao;
	public String insertMovie(MovieVO movie) {
		int cnt = dao.insertMovie(movie);
		String page ="";
		if(cnt  == 0) {
			page ="redirect:/movie/movieList";
		}else {
			page="redirect:/movie/movieList";
		}
		
		return page;
	}
	public ArrayList<MovieVO> selectAllMovie(){
		
	
		ArrayList<MovieVO> movie = dao.selectAllMovie();
		
		return movie;
	}
	
	public MovieVO selectOneMovie(int movie_no) {
		
		MovieVO movie = dao.selectOneMovie(movie_no);
		
		return movie;
	}
	public void updateMovie(MovieVO movie) {
		
		
		dao.updateMovie(movie);
		
		
	}
	public void deleteMovie(int movie_no) {
		dao.deleteMovie(movie_no);
	
	}
	public void updateHits(int movie_no) {
		dao.updateHits(movie_no);
	
	}
	public ArrayList<HashMap<String,Object>>search(String searchType,String searchText,int movie_no){
		
		HashMap<String,Object> map = new HashMap<>();
		map.put("searchType", searchType);
		map.put("searchText", searchText);
		map.put("movie_no",movie_no);
		
		ArrayList<HashMap<String,Object>>list =dao.search(map);
		
		
		return list;
	}
}
