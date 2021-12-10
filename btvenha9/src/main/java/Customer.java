import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Customer {
    private String id;
    private String name;
    private LocalDate birthday;
    private Gender gender;
    private String birthplace;
    private String phone;
    private String email;


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", Tên='" + name + '\'' +
                ", Ngày sinh=" + birthday +
                ", Giới tính=" + gender +
                ", Nơi sinh='" + birthplace + '\'' +
                ", Số Đt='" + phone + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
