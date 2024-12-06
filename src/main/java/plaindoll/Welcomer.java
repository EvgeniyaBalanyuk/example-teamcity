import java.util.Random
package plaindoll;

public class Welcomer{
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}

	 // Новый метод, который возвращает произвольную реплику с "hunter"
	public String sayHunterMessage() {
        String[] messages = {
            "Hunter, beware the shadows.",
            "You are a brave hunter, indeed.",
            "Only a true hunter could face such a challenge.",
            "The night is dark, hunter, but you are darker.",
            "A hunter's path is always fraught with danger."
        };

        // Генерация случайного числа для выбора реплики
        Random random = new Random();
        int index = random.nextInt(messages.length);  // случайное число от 0 до length-1

        return messages[index];
    }
}
