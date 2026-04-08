package com.example.vcs_project6.data.repository

import com.example.vcs_project6.data.model.Place
import kotlinx.coroutines.delay

class PlaceRepository {

    suspend fun fetchPlaces(): List<Place> {
        delay(1500)
        return listOf(
            Place(1,"Lăng Chủ tịch Hồ Chí Minh",
                "https://picsum.photos/300?1",
                "https://maps.app.goo.gl/TqJNF2hwaQn2W3u46"),

            Place(2,"Hồ Gươm",
                "https://picsum.photos/300?2",
                "https://maps.app.goo.gl/3m6WcV9e8V8YVYjA8"),

            Place(3,"Văn Miếu Quốc Tử Giám",
                "https://picsum.photos/300?3",
                "https://maps.app.goo.gl/5qk1F1RZ7nE6y3Yx6"),

            Place(4,"Phố cổ Hà Nội",
                "https://picsum.photos/300?4",
                "https://maps.app.goo.gl/WX9b6cP8d7R1p8wH7"),

            Place(5,"Nhà thờ Lớn Hà Nội",
                "https://picsum.photos/300?5",
                "https://maps.app.goo.gl/H9y3rX4ZpGvZ5s6z7"),

            Place(6,"Hồ Tây",
                "https://picsum.photos/300?6",
                "https://maps.app.goo.gl/Uc9X6z2R9v8K2k8K6"),

            Place(7,"Chùa Một Cột",
                "https://picsum.photos/300?7",
                "https://maps.app.goo.gl/Gt8Y6uV6Z8t4pY6Q7"),

            Place(8,"Hoàng Thành Thăng Long",
                "https://picsum.photos/300?8",
                "https://maps.app.goo.gl/2V9n3Y5f8kF6t7L98"),

            Place(9,"Bảo tàng Dân tộc học",
                "https://picsum.photos/300?9",
                "https://maps.app.goo.gl/7Yt9Q3s5U8z2P9kW8"),

            Place(10,"Nhà hát Lớn Hà Nội",
                "https://picsum.photos/300?10",
                "https://maps.app.goo.gl/N3h4K9X2p8U6d6FJ6"),

            Place(11,"Cầu Long Biên",
                "https://picsum.photos/300?11",
                "https://maps.app.goo.gl/8R3cF7kL9T2Z2X1X8"),

            Place(12,"Chợ Đồng Xuân",
                "https://picsum.photos/300?12",
                "https://maps.app.goo.gl/G7kL9R2P6V6K9M7Y7"),

            Place(13,"Công viên Thủ Lệ",
                "https://picsum.photos/300?13",
                "https://maps.app.goo.gl/F7T9V2K3M8P6X6Z5"),

            Place(14,"Nhà tù Hỏa Lò",
                "https://picsum.photos/300?14",
                "https://maps.app.goo.gl/W9M7P8V3Z6K2F3R8"),

            Place(15,"Phố đi bộ Hồ Gươm",
                "https://picsum.photos/300?15",
                "https://maps.app.goo.gl/X7K8V2Z6P3M9F6Y7"),

            Place(16,"Chùa Trấn Quốc",
                "https://picsum.photos/300?16",
                "https://maps.app.goo.gl/F6Z7X9K2P3M8V6T5"),

            Place(17,"Lotte Center Hà Nội",
                "https://picsum.photos/300?17",
                "https://maps.app.goo.gl/V7M9F3Z2K8X6P5T6"),

            Place(18,"Keangnam Landmark 72",
                "https://picsum.photos/300?18",
                "https://maps.app.goo.gl/X8P6V3M9F7Z2K6T5"),

            Place(19,"Aeon Mall Long Biên",
                "https://picsum.photos/300?19",
                "https://maps.app.goo.gl/F9Z7K3M2V6P8T5X6"),

            Place(20,"Công viên Yên Sở",
                "https://picsum.photos/300?20",
                "https://maps.app.goo.gl/K8V6P3M9F2Z7T5X6")
        )
    }
}