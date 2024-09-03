package airbnbboxer.domain;

import airbnbboxer.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RoomRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private String description;
    private String price;
}
