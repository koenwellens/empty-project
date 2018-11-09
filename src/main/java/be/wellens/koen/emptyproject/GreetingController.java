package be.wellens.koen.emptyproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	private final GreetingRepository greetingRepository;

	@Autowired
	public GreetingController(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@GetMapping
	public String getLastGreeting() {
		return "Hello, " + greetingRepository.getLastGreeting();
	}

	@PostMapping(consumes = "application/json")
	public void storeGreeting(@RequestBody NameBody body) {
		greetingRepository.setLastGreeting(body.getName());
	}
}
