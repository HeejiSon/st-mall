package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Deliverycomplated extends AbstractEvent {

    private String id;
    private String userId;
    private Integer productNumber;
    private String productId;

    public Deliverycomplated() {
        super();
    }
}
//>>> DDD / Domain Event
