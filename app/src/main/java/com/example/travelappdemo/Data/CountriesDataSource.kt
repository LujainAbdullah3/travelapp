package com.example.travelappdemo.Data

import com.example.travelappdemo.R

class CountriesDataSource {

    companion object {

        fun createCountriesList(): List<Country> {
            return listOf(
                Country(
                    "AlUla",
                    "saudi arabia",
                    R.drawable.image1,
                    "If you visit only one place in Saudi-Arabia, let it be AlUla and its heritage gem Hegra (also known as Madain Saleh). The other-worldly scenery, breath taking nature, and rich history make it a destination worth exploring for many days. Hegra is not only the tombs of the ancient Nabatean people and Saudi Arabia’s first UNESCO listed world heritage site, but it offers much more for the tourist to explore.",
                    "https://goo.gl/maps/zMQWFGzPLfWtnWRA6"),
                Country(
                    "Najran",
                    "saudi arabia",
                    R.drawable.image2,
                    "Najran The colorful city of Najran on the Yemeni border offers an unforgettable experience for travelers. Its unique history, architecture and culture blends in with the neighboring Yemen. Najran is a very tourist friendly destination in Saudi-Arabia that pleases even the most experienced traveler. Inscribed as Saudi Arabia’s UNESCO heritage site in 2021, the Hima Rock Art site is located in Najran.",
                    "https://goo.gl/maps/JtVMqsNM2i93TZyw7"),
                Country(
                    "Empty Quarter",
                    "saudi arabia",
                    R.drawable.image3,
                    "Empty Quarter It is not empty. It is full of beauty, silence, wildlife and tranquility.",
                    "https://goo.gl/maps/gNmrLFWzaws97AY79"),
                Country(
                    "Al Soudah ",
                    "saudi arabia",
                    R.drawable.image4,
                    "Al Soudah The Asir National Park and the Al-Soudah area near Abha are a lush, breezy paradise best visited in the hot summer months. The park offers trekking, camping sites, cable cars, and plenty of other outdoor activities in addition to interesting architecture and friendly people.",
                    "https://goo.gl/maps/uhc4DgB3Njpymuwj7"),
                Country(
                    "Taif",
                    "saudi arabia",
                    R.drawable.image5,
                    "The mountain city of Taif is famous for its roses and rosewater. In the spring the flowers and the whole area are in full bloom. Taif is also known for its glorious old palaces, fruit farms and the Al Hada mountain cable car with thrilling views. The best time to visit Taif is from March to through the summer months, when it’s cooler than the rest of the country due its elevated location.",
                    "https://goo.gl/maps/AeNMJ5n9zi5ALhK66")

            )

        }

    }

}