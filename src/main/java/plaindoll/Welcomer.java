package plaindoll;

public class Welcomer {
	// Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
	// https://t.me/notopsofficial
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
	public String sayHunter() {
		return "Beware the night, brave hunter — the hunt is never over.";
	}
	
	// НОВЫЙ МЕТОД ДЛЯ ЗАДАНИЯ
	public String reply() {
		return "Greetings, hunter. The night is dark, but your path is clear.";
	}
}