package ch.fablabs.fabjam.cocktail.service.recipe.actions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TareAction extends AbstractAction {

	@Override
	protected void initialRun() {
		commandService.tare();
	}

	@Override
	public void run() {
		setFinished(endOfCommandReceived("t"));
	}
}
