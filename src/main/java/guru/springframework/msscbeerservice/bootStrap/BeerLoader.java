package guru.springframework.msscbeerservice.bootStrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
         loadBeerData();
    }

    private void loadBeerData() {

        if(beerRepository.count() == 0){

            beerRepository.save(
                    Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .price(new BigDecimal("1200.00"))
                    .upc(122222222222L)
                    .minOrdered(12)
                    .quantityToBrew(1200)
                    .build()
            );

            beerRepository.save(
                    Beer.builder()
                            .beerName("KIng fisher")
                            .beerStyle("PALE_ALE")
                            .price(new BigDecimal("1500.00"))
                            .upc(122222222223L)
                            .minOrdered(15)
                            .quantityToBrew(1900)
                            .build()
            );


        }
    }
}
