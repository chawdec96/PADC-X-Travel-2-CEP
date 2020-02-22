package com.cep96.padc_x_travelapp_assignment_cep.data.vos

import com.google.gson.annotations.SerializedName

data class CountryVO (
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("location")val location: String,
    @SerializedName("average_rating") val averageRating: Double,
    @SerializedName("scores_and_reviews")val scoresAndReviews: List<ScoresAndReviewsVO>,
    @SerializedName("photos")val photos: List<String>
)