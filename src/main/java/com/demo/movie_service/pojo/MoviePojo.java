package com.demo.movie_service.pojo;

import com.demo.movie_service.dao.entity.MovieEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class MoviePojo {
	private int movieId;
	private String movieTitle;
	private String movieLanguage;
	private String movieDescription;
	private String movieImgUrl;

}
