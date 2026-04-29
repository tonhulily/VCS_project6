package com.example.vcs_project6.data.repository
import com.example.vcs_project6.R
import com.example.vcs_project6.data.model.Place
import kotlinx.coroutines.delay

class PlaceRepository {
    companion object {
        private val places = mutableListOf(
            Place(
                1,
                "Lăng Chủ tịch Hồ Chí Minh",
                R.drawable.lang_bac,
                "https://maps.app.goo.gl/TqJNF2hwaQn2W3u46",
                "Biểu tượng lịch sử thiêng liêng của Việt Nam",
                "Lăng Chủ tịch Hồ Chí Minh nằm tại Quảng trường Ba Đình, nơi Bác Hồ đọc Tuyên ngôn Độc lập ngày 2/9/1945. Công trình được khởi công năm 1973 và hoàn thành năm 1975. Đây là nơi lưu giữ thi hài Chủ tịch Hồ Chí Minh và là điểm đến mang giá trị lịch sử đặc biệt",
                "Buổi sáng",
                "1 - 2 giờ",
                "Miễn phí"
            ),
            Place(
                2,
                "Hồ Gươm",
                R.drawable.ho_guom,
                "https://maps.app.goo.gl/mw4bhvLuhXG6FWoz7",
                "Trái tim của thủ đô Hà Nội",
                "Hồ Gươm nằm ở trung tâm quận Hoàn Kiếm và được xem là biểu tượng nổi bật nhất của thủ đô Hà Nội. Nơi đây gắn liền với truyền thuyết vua Lê Lợi trả gươm thần cho Rùa Vàng sau khi đánh thắng giặc Minh. Xung quanh hồ có nhiều công trình nổi tiếng như Tháp Rùa, cầu Thê Húc và đền Ngọc Sơn. Đây là địa điểm lý tưởng để đi bộ, ngắm cảnh và cảm nhận nhịp sống Hà Nội.",
                "Sáng sớm hoặc tối",
                "2 - 3 giờ",
                "Miễn phí"
            ),
            Place(
                3,
                "Văn Miếu Quốc Tử Giám",
                R.drawable.van_mieu,
                "https://maps.app.goo.gl/9hpRAKegDLMvusjn9",
                "Trường đại học đầu tiên của Việt Nam",
                "Văn Miếu Quốc Tử Giám được xây dựng vào năm 1070 dưới triều vua Lý Thánh Tông và được xem là trường đại học đầu tiên của Việt Nam. Đây là nơi thờ Khổng Tử và tôn vinh truyền thống hiếu học của dân tộc. Khu di tích nổi bật với kiến trúc cổ kính, bia tiến sĩ và không gian đậm chất lịch sử.",
                "Sáng hoặc chiều",
                "2 giờ",
                "70.000 VNĐ"
            ),
            Place(
                4,
                "Phố cổ Hà Nội",
                R.drawable.pho_co,
                "https://maps.app.goo.gl/Z6rGgSfHEWx4NUmG7",
                "Nét đẹp cổ kính giữa lòng thủ đô",
                "Phố cổ Hà Nội nổi tiếng với 36 phố phường mang đậm dấu ấn lịch sử hàng trăm năm của Thăng Long xưa. Mỗi con phố từng gắn với một ngành nghề truyền thống riêng biệt. Du khách đến đây có thể khám phá kiến trúc cổ, thưởng thức ẩm thực đường phố và trải nghiệm nhịp sống đặc trưng của người Hà Nội.",
                "Buổi tối",
                "2 - 4 giờ",
                "Miễn phí"
            ),
            Place(
                5,
                "Nhà thờ Lớn Hà Nội",
                R.drawable.nha_tho_lon,
                "https://maps.app.goo.gl/MwWj87Tekbi1zgJZ7",
                "Kiến trúc Gothic nổi bật",
                "Nhà thờ Lớn Hà Nội được xây dựng vào cuối thế kỷ 19 theo kiến trúc Gothic châu Âu và là một trong những công trình Công giáo nổi bật nhất tại Việt Nam. Với vẻ đẹp cổ kính và vị trí trung tâm, nơi đây thu hút đông đảo du khách đến tham quan và chụp ảnh.",
                "Chiều tối",
                "1 giờ",
                "Miễn phí"
            ),
            Place(
                6,
                "Hồ Tây",
                R.drawable.ho_tay,
                "https://maps.app.goo.gl/MhzEaS8CXdSQJfVcA",
                "Hồ nước lớn nhất Hà Nội",
                "Hồ Tây là hồ nước tự nhiên lớn nhất Hà Nội với diện tích hơn 500 ha và lịch sử gắn liền với nhiều truyền thuyết cổ. Khu vực quanh hồ nổi tiếng với cảnh hoàng hôn đẹp, nhiều quán cà phê ven hồ và các địa điểm tâm linh như chùa Trấn Quốc, phủ Tây Hồ.",
                "Chiều hoàng hôn",
                "2 - 3 giờ",
                "Miễn phí"
            ),
            Place(
                7,
                "Chùa Một Cột",
                R.drawable.chua_mot_cot,
                "https://maps.app.goo.gl/QAVzAGixg2dez8z49",
                "Biểu tượng kiến trúc độc đáo",
                "Chùa Một Cột được xây dựng từ năm 1049 dưới triều vua Lý Thái Tông và nổi tiếng với kiến trúc độc đáo hình bông sen đặt trên một cột đá duy nhất. Đây là một trong những biểu tượng văn hóa lâu đời của Hà Nội.",
                "Buổi sáng",
                "45 phút - 1 giờ",
                "Miễn phí"
            ),
            Place(
                8,
                "Hoàng Thành Thăng Long",
                R.drawable.hoang_thanh_thang_long,
                "https://maps.app.goo.gl/zHCTzmJiQBwG2gAA7",
                "Di sản thế giới UNESCO",
                "Hoàng Thành Thăng Long là quần thể di tích lịch sử gắn liền với nhiều triều đại phong kiến Việt Nam suốt hơn 13 thế kỷ. Nơi đây được UNESCO công nhận là Di sản Văn hóa Thế giới và lưu giữ nhiều giá trị khảo cổ quan trọng.",
                "Sáng",
                "2 - 3 giờ",
                "30.000 VNĐ"
            ),
            Place(
                9,
                "Bảo tàng Dân tộc học",
                R.drawable.bao_tang_dan_toc_hoc,
                "https://maps.app.goo.gl/2Ey5sEGpyMrDYYBy8",
                "Khám phá văn hóa 54 dân tộc",
                "Bảo tàng Dân tộc học Việt Nam được thành lập năm 1997 nhằm lưu giữ và giới thiệu bản sắc văn hóa của 54 dân tộc trên khắp đất nước. Nơi đây trưng bày hàng nghìn hiện vật, trang phục và mô hình nhà truyền thống đặc sắc. Đây là điểm đến lý tưởng để tìm hiểu văn hóa Việt Nam một cách trực quan và sinh động.",
                "Ban ngày",
                "2 giờ",
                "40.000 VNĐ"
            ),
            Place(
                10,
                "Nhà hát Lớn Hà Nội",
                R.drawable.nha_hat_lon,
                "https://maps.app.goo.gl/n8Abm5HmHYJ4K2LPA",
                "Kiến trúc Pháp cổ điển",
                "Nhà hát Lớn Hà Nội được xây dựng từ năm 1901 đến năm 1911 theo phong cách kiến trúc tân cổ điển Pháp. Công trình này từng là nơi diễn ra nhiều sự kiện quan trọng trong lịch sử và hiện vẫn là trung tâm biểu diễn nghệ thuật lớn của thủ đô. Đây là địa điểm tham quan và check-in nổi tiếng với vẻ đẹp sang trọng, cổ kính.",
                "Buổi tối",
                "1 - 2 giờ",
                "Tùy sự kiện"
            ),
            Place(
                11,
                "Cầu Long Biên",
                R.drawable.cau_long_bien,
                "https://maps.app.goo.gl/eg4CHRNnwHrEMzkk7",
                "Chứng nhân lịch sử Hà Nội",
                "Cầu Long Biên được xây dựng từ năm 1899 dưới thời Pháp thuộc và từng là cây cầu thép dài nhất Đông Dương. Cây cầu đã chứng kiến nhiều giai đoạn lịch sử quan trọng của Hà Nội và hiện là địa điểm ngắm bình minh rất được yêu thích.",
                "Sáng sớm",
                "1 giờ",
                "Miễn phí"
            ),
            Place(
                12,
                "Chợ Đồng Xuân",
                R.drawable.cho_dong_xuan,
                "https://maps.app.goo.gl/19ZasVfpeqteFJjm8",
                "Khu chợ lâu đời nổi tiếng",
                "Chợ Đồng Xuân được xây dựng vào năm 1889 và là khu chợ lớn nhất, lâu đời nhất tại Hà Nội. Nơi đây từng là trung tâm giao thương quan trọng của khu phố cổ và vẫn giữ vai trò mua bán sầm uất đến ngày nay. Du khách có thể khám phá không khí chợ truyền thống và thưởng thức nhiều món ăn đặc sản Hà Nội.",
                "Buổi sáng",
                "1 - 2 giờ",
                "Miễn phí"
            ),
            Place(
                13,
                "Công viên Thủ Lệ",
                R.drawable.cong_vien_thu_le,
                "https://maps.app.goo.gl/UUmsXk92XAYzjYwS8",
                "Không gian xanh giữa thành phố",
                "Công viên Thủ Lệ được xây dựng từ năm 1975 và là một trong những công viên lâu đời nhất tại Hà Nội. Nơi đây nổi tiếng với hồ nước rộng, khu vui chơi và vườn thú với nhiều loài động vật quý hiếm. Đây là địa điểm thư giãn và vui chơi quen thuộc của các gia đình vào dịp cuối tuần.",
                "Sáng hoặc chiều",
                "2 - 3 giờ",
                "30.000 VNĐ"
            ),
            Place(
                14,
                "Nhà tù Hỏa Lò",
                R.drawable.nha_tu_hoa_lo,
                "https://maps.app.goo.gl/UVjspP4fHwcDL6Pc6",
                "Di tích lịch sử thời chiến",
                "Chùa Trấn Quốc nằm trên một hòn đảo nhỏ bên Hồ Tây và được xem là ngôi chùa cổ nhất Hà Nội với lịch sử hơn 1500 năm. Đây là địa điểm tâm linh nổi tiếng thu hút cả du khách trong và ngoài nước.",
                "Ban ngày",
                "1 - 2 giờ",
                "50.000 VNĐ"
            ),
            Place(
                15,
                "Phố đi bộ Hồ Gươm",
                R.drawable.pho_di_bo,
                "https://maps.app.goo.gl/NDLK6yXw8y4ZRvPR7",
                "Không gian vui chơi cuối tuần",
                "Phố đi bộ Hồ Gươm chính thức hoạt động từ năm 2016 nhằm tạo không gian vui chơi cộng đồng tại trung tâm thủ đô. Khu vực này diễn ra nhiều hoạt động nghệ thuật đường phố, trò chơi dân gian và sự kiện văn hóa vào mỗi cuối tuần. Đây là điểm đến rất sôi động thu hút cả người dân Hà Nội lẫn du khách.",
                "Buổi tối cuối tuần",
                "2 - 4 giờ",
                "Miễn phí"
            ),
            Place(
                16,
                "Chùa Trấn Quốc",
                R.drawable.chua_tran_quoc,
                "https://maps.app.goo.gl/ppArogDVVtUM9EJV7",
                "Ngôi chùa cổ nhất Hà Nội",
                "Chùa Trấn Quốc nằm trên một hòn đảo nhỏ bên Hồ Tây và được xem là ngôi chùa cổ nhất Hà Nội với lịch sử hơn 1500 năm. Đây là địa điểm tâm linh nổi tiếng thu hút cả du khách trong và ngoài nước.",
                "Chiều hoàng hôn",
                "1 giờ",
                "Miễn phí"
            ),
            Place(
                17,
                "Lotte Center Hà Nội",
                R.drawable.lotte_center,
                "https://maps.app.goo.gl/hh8yij1eYNiJG3V29",
                "View toàn cảnh thành phố",
                "Lotte Center Hà Nội được khánh thành vào năm 2014 và nhanh chóng trở thành một trong những tòa nhà biểu tượng hiện đại của thủ đô. Công trình nổi bật với trung tâm thương mại, khách sạn và đài quan sát trên cao. Đây là địa điểm lý tưởng để ngắm toàn cảnh Hà Nội từ trên cao, đặc biệt vào lúc hoàng hôn.",
                "Hoàng hôn / tối",
                "2 giờ",
                "230.000 VNĐ"
            ),
            Place(
                18,
                "Keangnam Landmark 72",
                R.drawable.keangnam,
                "https://maps.app.goo.gl/BUmYRMiXg8JV9WSZ8",
                "Tòa nhà biểu tượng phía Tây Hà Nội",
                "Keangnam Landmark 72 được hoàn thành vào năm 2011 và từng là tòa nhà cao nhất Việt Nam trong nhiều năm. Công trình bao gồm khu văn phòng, khách sạn, mua sắm và giải trí hiện đại. Đây là điểm đến nổi bật ở phía Tây Hà Nội với tầm nhìn đẹp và nhiều hoạt động trải nghiệm.",
                "Chiều tối",
                "2 giờ",
                "Tùy khu vực"
            ),
            Place(
                19,
                "Phủ Tây Hồ",
                R.drawable.phu_tay_ho,
                "https://maps.app.goo.gl/PA8TodFvWRmJ6meH7",
                "Điểm đến tâm linh nổi tiếng",
                "Phủ Tây Hồ nằm trên bán đảo nhô ra Hồ Tây và là nơi thờ Liễu Hạnh Công Chúa – một trong Tứ bất tử trong tín ngưỡng dân gian Việt Nam. Địa điểm này từ lâu đã trở thành nơi hành hương quen thuộc của người dân thủ đô. Du khách thường đến đây để cầu bình an, tài lộc và tận hưởng khung cảnh yên bình bên Hồ Tây.",
                "Sáng",
                "1 giờ",
                "Miễn phí"
            ),
            Place(
                20,
                "Công viên Yên Sở",
                R.drawable.cong_vien_yen_so,
                "https://maps.app.goo.gl/kztBTssf2iXzafTS9",
                "Công viên xanh lớn nhất Hà Nội",
                "Công viên Yên Sở được đưa vào hoạt động từ năm 2014 và là một trong những công viên đô thị lớn nhất Hà Nội. Nơi đây sở hữu hồ nước rộng, bãi cỏ lớn và không gian xanh thoáng đãng giữa lòng thành phố. Đây là địa điểm lý tưởng cho các hoạt động picnic, đạp xe và thư giãn vào cuối tuần.",
                "Sáng sớm / chiều",
                "2 - 4 giờ",
                "Miễn phí"
            )
        )
    }
    suspend fun fetchPlaces(): List<Place> {
        delay(1500)
        return places
    }
    fun fetchPlacesSync(): MutableList<Place> {
        return places
    }
}