package be.wellens.koen.emptyproject;

import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Setter
@Component
public class GreetingRepository {

	private String lastGreeting;

	String getLastGreeting() {
		return Optional.ofNullable(lastGreeting).orElse("World");
	}
}
