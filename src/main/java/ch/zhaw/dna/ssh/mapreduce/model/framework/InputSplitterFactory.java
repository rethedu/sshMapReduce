package ch.zhaw.dna.ssh.mapreduce.model.framework;

import ch.zhaw.dna.ssh.mapreduce.model.framework.impl.HundredWordsInputSplitter;

/**
 * Die InputSplitterFactory kann InputSplitter erstellen.
 * 
 * @author Reto
 * 
 */
public final class InputSplitterFactory {
	
	public static InputSplitter create(String input) {
		return new HundredWordsInputSplitter(input);
	}

}
