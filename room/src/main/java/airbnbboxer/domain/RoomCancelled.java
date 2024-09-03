package airbnbboxer.domain;

import airbnbboxer.domain.*;
import airbnbboxer.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long roomId;
    private Date date;
    private String price;
    private String status;
}
