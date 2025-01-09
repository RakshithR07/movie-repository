package com.demo.movie_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="movie-details")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_title")
	@NotNull
	private String movieTitle;
	@Column(name="movie_language")
	@NotNull
	private String movieLanguage;
	@Column(name="movie_desc")
	private String movieDescription;
	@Column(name="movie_img_url")
	private String movieImgUrl;
	

}
