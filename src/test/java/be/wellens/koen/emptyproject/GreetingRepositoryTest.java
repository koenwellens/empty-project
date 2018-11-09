package be.wellens.koen.emptyproject;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingRepositoryTest {

	private static final String NAME = RandomStringUtils.randomAlphanumeric(35);

	@Test
	public void storesNameCorrectly() {
		GreetingRepository greetingRepository = new GreetingRepository();

		assertThat(greetingRepository.getLastGreeting()).isEqualTo("World");
		greetingRepository.setLastGreeting(NAME);
		assertThat(greetingRepository.getLastGreeting()).isEqualTo(NAME);
	}
}