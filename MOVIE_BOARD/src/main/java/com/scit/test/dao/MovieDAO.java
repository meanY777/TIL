package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.MovieVO;

@Repository
public class MovieDAO {
	@Autowired
	private SqlSession session;
	
	public int insertMovie(MovieVO movie) {
		
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.insertMovie(movie);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	public ArrayList<MovieVO> selectAllMovie(){
		
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		ArrayList<MovieVO> movie = null; 
		try {
			movie = mapper.selectAllMovie();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}
	public MovieVO selectOneMovie(int movie_no) {
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		MovieVO movie = new MovieVO();
		try {
			movie = mapper.selectOneMovie(movie_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}
	public void updateMovie(MovieVO movie) {
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		try {
			mapper.updateMovie(movie);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteMovie(int movie_no) {
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		try {
			mapper.deleteMovie(movie_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateHits(int movie_no) {
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		try {
			mapper.updateHits(movie_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<HashMap<String,Object>>search(HashMap<String,Object>map){
		MovieMapper mapper = session.getMapper(MovieMapper.class);
		
		ArrayList<HashMap<String,Object>>list = null;
		
		try {
			list = mapper.search(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
