package airbnbboxer.domain;

import airbnbboxer.domain.*;
import airbnbboxer.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomReserved extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long roomId;
    private Date date;
    private String price;
    private String status;

    public RoomReserved(Reservation aggregate) {
        super(aggregate);
    }

    public RoomReserved() {
        super();
    }
}
//>>> DDD / Domain Event
