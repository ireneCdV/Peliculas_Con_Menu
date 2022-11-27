package com.example.peliculas.Film

import com.example.peliculas.Film.Film

class FilmProvider {
    companion object{
        val filmList = listOf<Film>(
            Film(
                film = "Encanto",
                director = "Manuel",
                year = 2022,
                photo = "https://lumiere-a.akamaihd.net/v1/images/encanto_ka_las_pay1_92ad7410.jpeg"
            ),

            Film(
                film = "Inside out",
                director = "Pepa",
                year = 2006,
                photo = "https://lumiere-a.akamaihd.net/v1/images/homepage_hero_mobile_insideout_streetmessageupdate_span_0aea4bd0.jpeg"
            ),

            Film(
                film = "Frozen 2",
                director = "Paco",
                year = 2019,
                photo = "https://lumiere-a.akamaihd.net/v1/images/image_07f1aaf3.jpeg"
            ),

            Film(
                film = "Luca",
                director = "Dario",
                year = 2021,
                photo = "https://lumiere-a.akamaihd.net/v1/images/sdk_latam_payoff_localized_bpo_6e4f16c1.jpeg?region=0%2C0%2C2100%2C3000"
            ),

            Film(
                film = "Avatar",
                director = "Jose",
                year = 2011,
                photo = "https://i.blogs.es/4b382c/avatardvd/450_1000.jpg"
            ),



        )
    }
}