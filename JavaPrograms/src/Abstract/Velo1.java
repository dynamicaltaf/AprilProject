package Abstract;

public interface Velo1 {
	
	void mart(); //incomplete method of interface
	
	default void Dmart() {
		System.out.println("Shopping");
	}
}
