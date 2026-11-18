package com.example.pcshop.controller;

import com.example.pcshop.model.Cart;
import com.example.pcshop.model.Product;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final PageController pageController;

    public CartController(PageController pageController) {
        this.pageController = pageController;
    }

    private Cart getCart(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        return cart;
    }

    @GetMapping
    public String cartPage(HttpSession session, Model model) {
        Cart cart = getCart(session);
        model.addAttribute("cart", cart);
        model.addAttribute("pageTitle", "Корзина — PC Shop");
        return "cart";
    }

    @PostMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, HttpSession session) {
        Cart cart = getCart(session);
        List<Product> products = pageController.getProducts();
        products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .ifPresent(cart::addItem);
        return "redirect:/cart";
    }

    @PostMapping("/remove/{id}")
    public String removeFromCart(@PathVariable Long id, HttpSession session) {
        Cart cart = getCart(session);
        cart.removeItem(id);
        return "redirect:/cart";
    }

    @PostMapping("/update/{id}")
    public String updateQuantity(@PathVariable Long id,
                                 @RequestParam int quantity,
                                 HttpSession session) {
        Cart cart = getCart(session);
        if (quantity <= 0) {
            cart.removeItem(id);
        } else {
            cart.updateQuantity(id, quantity);
        }
        return "redirect:/cart";
    }

    @PostMapping("/clear")
    public String clearCart(HttpSession session) {
        Cart cart = getCart(session);
        cart.clear();
        return "redirect:/cart";
    }
}