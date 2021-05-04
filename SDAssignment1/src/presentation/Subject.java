package presentation;

public interface Subject {
	public void registerObserver(Forum forum);
	public void notifyObservers(String message);
}






