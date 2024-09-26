package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer productNumber;
    private Long productId;
    private String qty;

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
