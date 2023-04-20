import React, { useEffect, useState } from 'react';

interface Movie {
  title: string;
  link: string;
  year: number;
  genre: string;
  img: string;
  rating: number;
}

function Cinema(): JSX.Element {
  const [movies, setMovies] = useState<Movie[]>([]);
  useEffect(() => {
    async function loadMovies(): Promise<void> {
      const response = await fetch('https://alisherkhamidov.github.io/temp_cinema_api/movie_list.json');
      const obj = await response.json();
      // console.log(obj.movies); obj = {movies: [...]}
      setMovies(obj.movies);
    }
    loadMovies();
  }, []);
  return (
    <ul>
      {movies.map((movie) => (
        <li key={movie.title}>
          <a href={movie.link}>
            {movie.title}
            <img src={movie.img} alt="" />
            <div>{movie.rating}</div>
          </a>
        </li>
      ))}
    </ul>
  );
}

export default Cinema;
