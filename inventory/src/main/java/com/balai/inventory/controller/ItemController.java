package com.balai.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.balai.inventory.repository.ItemRepo;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemRepo repo;

    @GetMapping("/view")
    public String viewItems(Model model) {
        model.addAttribute("items", repo.findAll());
        return "view-items";
    }
}
