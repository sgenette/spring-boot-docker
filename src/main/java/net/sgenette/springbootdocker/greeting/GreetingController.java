package net.sgenette.springbootdocker.greeting;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;

@Validated
@RestController
public class GreetingController {

    private static final String GREETING_TEXT = "Hello %s!";

    @GetMapping("/greeting")
    public String greet(@Valid @RequestParam(value = "name", defaultValue = "World") Person person) {
        return String.format(GREETING_TEXT, person.getName());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public String handleValidationExceptions(ConstraintViolationException ex) {
        return "Invalid parameter";
    }

}
