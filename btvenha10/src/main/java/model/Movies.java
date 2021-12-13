package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movies {
    @SerializedName("id")
    private int id;
    @SerializedName("moviename")
    private String moviename;
    @SerializedName("type")
    private String type;
    @SerializedName("director")
    private String director;
    @SerializedName("length")
    private int length;
    @SerializedName("releasetime")
    private String releasetime;
    @SerializedName("view")
    private int view;

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", Tên phim='" + moviename + '\'' +
                ", Thể loại='" + type + '\'' +
                ", Đạo diễn='" + director + '\'' +
                ", Thời lượng=" + length + "p" +
                ", Ngày công chiếu=" + releasetime +
                ", Lượt view=" + view + " Người xem" +
                '}';
    }
}
