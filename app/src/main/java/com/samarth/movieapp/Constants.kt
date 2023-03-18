package com.samarth.movieapp

import com.samarth.movieapp.model.PeopleModel
import com.samarth.movieapp.model.TagsModel
import com.samarth.movieapp.model.TrailerModels

object Constants {

    val postProduction = TagsModel(
        name = " Post Production", color = "#4B74AC"
    )
    const val homeBannerUrl =
        "https://wallpapersmug.com/download/1600x900/b36c41/spider-logo-spider-man-playstation-5.jpg"

    val trailerList = listOf(
        TrailerModels(
            thumbnailImageUrl = "https://wallpapercave.com/wp/wp2550894.jpg", bottomText = "Trailer"
        ),
        TrailerModels(
            thumbnailImageUrl = "https://images.hdqwalls.com/wallpapers/lighting-spiderman-ku.jpg",
            bottomText = "Explore More"
        ),
        TrailerModels(
            thumbnailImageUrl = "https://cdn.mos.cms.futurecdn.net/cQf8PhpieaZ5RayfxP42x7-1200-80.jpg.webp",
            bottomText = "Game On"
        ),
        TrailerModels(
            thumbnailImageUrl = "https://cdn.mos.cms.futurecdn.net/yVDrRevZY8nJcivo4pxZMF-1200-80.jpg.webp",
            bottomText = "Trailer"
        ),
        TrailerModels(
            thumbnailImageUrl = "https://wallpapercave.com/wp/wp2550894.jpg", bottomText = "Trailer"
        ),
    )

    val tagItems = listOf(
        TagsModel(
            name = "Action", color = "#02AB98"
        ),

        TagsModel(
            name = "Comedy", color = "#FFC008"
        ),

        TagsModel(
            name = "Science Fiction", color = "#F06303"
        ),
    )

    val castList = listOf(
        PeopleModel(
            profileImageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/14/Deadpool_2_Japan_Premiere_Red_Carpet_Ryan_Reynolds_%28cropped%29.jpg",
            name = "Ryan Reynolds",
            desc = "Wade Wilson"
        ),
        PeopleModel(
            profileImageUrl = "https://m.media-amazon.com/images/M/MV5BMTQ1MzYyMjQ0Nl5BMl5BanBnXkFtZTcwMTA0ODkyMg@@._V1_FMjpg_UX1000_.jpg",
            name = "Josh Brolin",
            desc = "Cable"
        ),
        PeopleModel(
            profileImageUrl = "https://m.media-amazon.com/images/M/MV5BNmU5Yjk4OTItMjMzZS00MTYzLWI1ZDktYWM4YWM2NTM2YzMzXkEyXkFqcGdeQXVyMzY2OTA2MzM@._V1_.jpg",
            name = "Morena Baccarin",
            desc = "Vanessa"
        ),
        PeopleModel(
            profileImageUrl = "https://upload.wikimedia.org/wikipedia/commons/c/ca/Julian_Dennison_2016.jpg",
            name = "Julian Dennison",
            desc = "Firefist"
        ),
        PeopleModel(
            profileImageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/14/Deadpool_2_Japan_Premiere_Red_Carpet_Ryan_Reynolds_%28cropped%29.jpg",
            name = "Ryan Reynolds",
            desc = "Wade Wilson"
        ),
        PeopleModel(
            profileImageUrl = "https://m.media-amazon.com/images/M/MV5BMTQ1MzYyMjQ0Nl5BMl5BanBnXkFtZTcwMTA0ODkyMg@@._V1_FMjpg_UX1000_.jpg",
            name = "Josh Brolin",
            desc = "Cable"
        ),
        PeopleModel(
            profileImageUrl = "https://m.media-amazon.com/images/M/MV5BNmU5Yjk4OTItMjMzZS00MTYzLWI1ZDktYWM4YWM2NTM2YzMzXkEyXkFqcGdeQXVyMzY2OTA2MzM@._V1_.jpg",
            name = "Morena Baccarin",
            desc = "Vanessa"
        ),
        PeopleModel(
            profileImageUrl = "https://upload.wikimedia.org/wikipedia/commons/c/ca/Julian_Dennison_2016.jpg",
            name = "Julian Dennison",
            desc = "Firefist"
        ),
    )

    val recommendMoviesImages = listOf(
        "https://cdn.mos.cms.futurecdn.net/ZyVweTeGxfH7WgCovKqY8d-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/2QCuywkPqD8tkdBCyGiPhF-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/vgctzbBjL8S7GJr5s2JHMB-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/cQf8PhpieaZ5RayfxP42x7-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/26ofuZ9pvo3cNuytYjY6zN-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/adSAZsEScZ7QqGnZtjScgJ-1200-80.jpg.webp",
        "https://cdn.mos.cms.futurecdn.net/yVDrRevZY8nJcivo4pxZMF-1200-80.jpg.webp",
    )
}