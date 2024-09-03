package airbnbboxer.domain;

import airbnbboxer.domain.*;
import airbnbboxer.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long roomId;
    private Date date;
    private String price;
    private String status;

    public RoomCancelled(Reservation aggregate) {
        super(aggregate);
    }

    public RoomCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
