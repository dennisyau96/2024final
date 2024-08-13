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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import java.util.List;


//GIT HUB LINK: https://github.com/dennisyau96/2024final.git
@SessionAttributes({"a","e"})
@Controller
@AllArgsConstructor
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;
    static int num = 0;


//    @GetMapping(path="/index")
//    public String reservations(Model model, @RequestParam(name="keyword",defaultValue = "") String keyword){
////
//        List<Reservation> reservations;
//        if (keyword.isEmpty()) {
//            reservations = reservationRepository.findAll();
//        } else {
//            long key = Long.parseLong(keyword);
//            reservations = reservationRepository.findReservationByIdById(key);
//        }
//        model.addAttribute("listReservation", reservations);
//        return "homePage";}


    @GetMapping("/index")
    public String reservation (Model model){
        List<Reservation> reservations = reservationRepository.findAll();
        model.addAttribute("reservations",reservations );
        return "homePage";
    }

    @GetMapping("/delete")
    public String delete(Long id){
        reservationRepository.deleteById(id);
        return "redirect:/index";
    }

//    @GetMapping("/formReservations")
//    public String formReservation(Model model) {
//        model.addAttribute("reservation", new Reservation());
//        return "formReservations";
//    }

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

    @GetMapping("/editReservation")
    public String editReservation(Model model, Long id, HttpSession session){
        num = 2;
        session.setAttribute("info", 0);
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if(reservation==null) throw new RuntimeException("Reservation does not exist");
        model.addAttribute("reservation", reservation);
        return "editReservation";
    }






}
