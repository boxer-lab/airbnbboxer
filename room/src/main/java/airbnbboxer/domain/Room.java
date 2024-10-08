package airbnbboxer.domain;

import airbnbboxer.RoomApplication;
import airbnbboxer.domain.RoomDeleted;
import airbnbboxer.domain.RoomRegistered;
import airbnbboxer.domain.RoomUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Room_table")
@Data
//<<< DDD / Aggregate Root
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private String price;

    private String status;

    @PostPersist
    public void onPostPersist() {
        RoomRegistered roomRegistered = new RoomRegistered(this);
        roomRegistered.publishAfterCommit();

        RoomDeleted roomDeleted = new RoomDeleted(this);
        roomDeleted.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        RoomUpdated roomUpdated = new RoomUpdated(this);
        roomUpdated.publishAfterCommit();
    }

    public static RoomRepository repository() {
        RoomRepository roomRepository = RoomApplication.applicationContext.getBean(
            RoomRepository.class
        );
        return roomRepository;
    }
}
//>>> DDD / Aggregate Root
