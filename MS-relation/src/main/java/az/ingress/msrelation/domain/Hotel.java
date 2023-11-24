package az.ingress.msrelation.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Entity
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String hotelName;

    String location;

    @Enumerated(EnumType.STRING)
    RoomType roomType;

    Double price;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    Booking booking;


}
