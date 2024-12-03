package com.talentlinked.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("")
public class HomeController(@RequestBody Job job)
{
@Autowired
TalentService Service;

//@PostMapping("/create")
////@PreAuthorize("hasRole('ADMIN')")
//public void createHotel()
//{
//    Service.createHotel(hotelRequest);
//}

@GetMapping("/getAll")
//@PreAuthorize("hasRole('ADMIN')")
public List<Hotel> getAllHotels()
{
    return hotelService.getAllHotels();
}
}
