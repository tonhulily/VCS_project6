package com.example.vcs_project6.data.repository
import com.example.vcs_project6.R
import com.example.vcs_project6.data.model.Place
import kotlinx.coroutines.delay

class PlaceRepository {
    suspend fun fetchPlaces(): List<Place> {
        delay(1500)
        return listOf(
            Place(1,"Lăng Chủ tịch Hồ Chí Minh",
                R.drawable.lang_bac,
                "https://maps.app.goo.gl/TqJNF2hwaQn2W3u46"),

            Place(2,"Hồ Gươm",
                R.drawable.ho_guom,
                "https://maps.app.goo.gl/mw4bhvLuhXG6FWoz7"),

            Place(3,"Văn Miếu Quốc Tử Giám",
                R.drawable.van_mieu,
                "https://maps.app.goo.gl/9hpRAKegDLMvusjn9"),

            Place(4,"Phố cổ Hà Nội",
                R.drawable.pho_co,
                "https://maps.app.goo.gl/Z6rGgSfHEWx4NUmG7"),

            Place(5,"Nhà thờ Lớn Hà Nội",
                R.drawable.nha_tho_lon,
                "https://maps.app.goo.gl/MwWj87Tekbi1zgJZ7"),

            Place(6,"Hồ Tây",
                R.drawable.ho_tay,
                "https://maps.app.goo.gl/MhzEaS8CXdSQJfVcA"),

            Place(7,"Chùa Một Cột",
                R.drawable.chua_mot_cot,
                "https://maps.app.goo.gl/QAVzAGixg2dez8z49"),

            Place(8,"Hoàng Thành Thăng Long",
                R.drawable.hoang_thanh_thang_long,
                "https://maps.app.goo.gl/zHCTzmJiQBwG2gAA7"),

            Place(9,"Bảo tàng Dân tộc học",
                R.drawable.bao_tang_dan_toc_hoc,
                "https://maps.app.goo.gl/2Ey5sEGpyMrDYYBy8"),

            Place(10,"Nhà hát Lớn Hà Nội",
                R.drawable.nha_hat_lon,
                "https://maps.app.goo.gl/n8Abm5HmHYJ4K2LPA"),

            Place(11,"Cầu Long Biên",
                R.drawable.cau_long_bien,
                "https://maps.app.goo.gl/eg4CHRNnwHrEMzkk7"),

            Place(12,"Chợ Đồng Xuân",
                R.drawable.cho_dong_xuan,
                "https://maps.app.goo.gl/19ZasVfpeqteFJjm8"),

            Place(13,"Công viên Thủ Lệ",
                R.drawable.cong_vien_thu_le,
                "https://maps.app.goo.gl/UUmsXk92XAYzjYwS8"),

            Place(14,"Nhà tù Hỏa Lò",
                R.drawable.nha_tu_hoa_lo,
                "https://maps.app.goo.gl/UVjspP4fHwcDL6Pc6"),

            Place(15,"Phố đi bộ Hồ Gươm",
                R.drawable.pho_di_bo,
                "https://maps.app.goo.gl/NDLK6yXw8y4ZRvPR7"),

            Place(16,"Chùa Trấn Quốc",
                R.drawable.chua_tran_quoc,
                "https://maps.app.goo.gl/ppArogDVVtUM9EJV7"),

            Place(17,"Lotte Center Hà Nội",
                R.drawable.lotte_center,
                "https://maps.app.goo.gl/hh8yij1eYNiJG3V29"),

            Place(18,"Keangnam Landmark 72",
                R.drawable.keangnam,
                "https://maps.app.goo.gl/BUmYRMiXg8JV9WSZ8"),

            Place(19,"Phủ Tây Hồ",
                R.drawable.phu_tay_ho,
                "https://maps.app.goo.gl/PA8TodFvWRmJ6meH7"),

            Place(20,"Công viên Yên Sở",
                R.drawable.cong_vien_yen_so,
                "https://maps.app.goo.gl/kztBTssf2iXzafTS9")
        )
    }
}