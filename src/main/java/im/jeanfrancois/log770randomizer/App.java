package im.jeanfrancois.log770randomizer;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

/**
 * Entry point for the LOG770 randomizer
 *
 * @author jfim
 */
public class App {
	public static void main(String[] args) throws Exception {
		WekaRandomizer wekaRandomizer = new WekaRandomizer();
		CmdLineParser cmdLineParser = new CmdLineParser(wekaRandomizer);

		try {
			cmdLineParser.parseArgument(args);
			wekaRandomizer.run();
		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
			cmdLineParser.printUsage(System.err);
		}
	}
}
