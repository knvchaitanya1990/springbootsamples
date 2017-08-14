package com.chaitu.swiggy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class MenuRestWS {

	@Autowired
	MenuService menuService;
	
	@RequestMapping("/all")
	public MenuItem[] getAllItems(){
		return menuService.getItems();
	}
	
	@RequestMapping("/id/{id}")
	public MenuItem getMenuItem(@PathVariable("id") int id){
		return menuService.getItem(id);
	}
	
}
