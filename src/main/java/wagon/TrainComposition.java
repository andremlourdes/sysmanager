package wagon;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {

	private final Deque<Integer> wagon = new LinkedList<>();


	public void dockLeft(int numberWagon) {

		wagon.addFirst(numberWagon);

	}

	public void dockRight(int numberWagon) {

		wagon.addLast(numberWagon);

	}

	public void undockLeft() {

		if (!wagon.isEmpty()) {

			wagon.removeFirst();
		} else {

			throw new IndexOutOfBoundsException("No wagon available");

		}

	}

	public void undockRight() {

		if (!wagon.isEmpty()) {

			wagon.removeLast();
		} else {

			throw new IndexOutOfBoundsException("No wagon available");

		}

	}

	public static void main(String[] args) {
		TrainComposition trem = new TrainComposition();
		for (int i = 0; i < 15; i++) {
			trem.dockLeft(i);
		}
		System.out.println(trem.wagon);
		trem.dockRight(30);
		System.out.println(trem.wagon);

	}

}