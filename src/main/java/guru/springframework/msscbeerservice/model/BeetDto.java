package guru.springframework.msscbeerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeetDto {
    private UUID uuid;
    private Integer version;
    private OffsetDateTime ceateDate ;
    private OffsetDateTime lastModifiedDate ;

    private String beerName ;
    private BeerStyleEnum beerStyle ;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand ;
}
