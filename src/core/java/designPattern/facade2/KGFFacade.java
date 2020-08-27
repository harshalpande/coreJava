package core.java.designPattern.facade2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import core.java.designPattern.facade2.AbstractMineWorker.Action;

public class KGFFacade {

	private List<AbstractMineWorker> listWorkers = null;

	public KGFFacade() {
		listWorkers = new ArrayList<AbstractMineWorker>();
		listWorkers.add(new TunnelDigger());
		listWorkers.add(new GoldDigger());
		listWorkers.add(new CartOperator());
	}

	public void startNewDay() {
		makeActions(listWorkers, Action.WAKE_UP, Action.GO_TO_MINE);
	}

	public void digOutGold() {
		makeActions(listWorkers, Action.WORK);
	}

	public void goToSleep() {
		makeActions(listWorkers, Action.GO_HOME, Action.GO_TO_SLEEP);
	}

	public void makeActions(Collection<AbstractMineWorker> listOfWorkers, Action... actions) {
		listOfWorkers.forEach(worker -> worker.action(actions));
	}
}
