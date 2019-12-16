package com.beyondcoding.lombok.dataclass;

import com.beyondcoding.lombok.Nationality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Form {

    private String id;
    private String firstName;
    private String lastName;
    private Nationality nationality;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;

}
