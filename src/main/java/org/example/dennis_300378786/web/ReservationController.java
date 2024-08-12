package org.example.dennis_300378786.web;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.example.dennis_300378786.entities.Reservation;
import org.example.dennis_300378786.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"a","e"})
@Controller
@AllArgsConstructor
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;
    static int num = 0;

    @GetMapping(path = "/index")
    public String reservations() {
        return "homePage";
    }

    @PostMapping(path="/save")
    public String save(Model model, Reservation reservation, BindingResult
            bindingResult, ModelMap mm, HttpSession session) {
        if (bindingResult.hasErrors()) {
            return "homePage";
        } else {
            reservationRepository.save(reservation);
            if (num == 2) {
                mm.put("e", 2);
                mm.put("a", 0);
            } else {
                mm.put("a", 1);
                mm.put("e", 0);
            }
            return "redirect:index";

            }}
}
