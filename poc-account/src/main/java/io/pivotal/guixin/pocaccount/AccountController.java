package io.pivotal.guixin.pocaccount;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private Map<String, String> storage = new HashMap<>();

    public AccountController() {
        storage.put("guixin", "Guixin's Account");
    }

    @GetMapping
    public String getAccount(@RequestParam String name) {
        return storage.getOrDefault(name, "Not found!");
    }
}
