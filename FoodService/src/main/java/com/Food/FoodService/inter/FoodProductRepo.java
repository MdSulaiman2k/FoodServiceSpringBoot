package com.Food.FoodService.inter;

import org.springframework.data.repository.CrudRepository;

import com.Food.FoodService.model.*;
public interface FoodProductRepo extends CrudRepository<FoodProduct , Integer>
{
     
}
