package com.chaitu.swiggy.service;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface MenuItemRepository  {
	

	public List<MenuItem> findAll();
}


