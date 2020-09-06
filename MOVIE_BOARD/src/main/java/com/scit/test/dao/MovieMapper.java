package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.MovieVO;

public interface MovieMapper {

	public int insertMovie(MovieVO movie);
	public ArrayList<MovieVO> selectAllMovie();
	public MovieVO selectOneMovie(int movie_no);
	public void updateMovie(MovieVO movie);
	public void deleteMovie(int movie_no);
	public void updateHits(int movie_no);
	public ArrayList<HashMap<String,Object>>search(HashMap<String,Object>map);
}
