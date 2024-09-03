package airbnbboxer.domain;

import airbnbboxer.domain.*;
import airbnbboxer.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentDenied extends AbstractEvent {

    private Long id;
    private String customerId;
    private String reservation;
    private String price;

    public PaymentDenied(Payment aggregate) {
        super(aggregate);
    }

    public PaymentDenied() {
        super();
    }
}
//>>> DDD / Domain Event
