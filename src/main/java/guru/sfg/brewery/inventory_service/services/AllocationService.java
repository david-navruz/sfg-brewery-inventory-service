package guru.sfg.brewery.inventory_service.services;

import guru.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
