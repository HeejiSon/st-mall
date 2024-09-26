package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class Deliverycomplated extends AbstractEvent {

    private String id;
    private String userId;
    private Integer productNumber;
    private String productId;
}
