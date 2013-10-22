import java.io.IOException;

/**
 * @(#) PertViz.java
 */
public class PertViz {
	// private String inputFileName;

	// private String outputFileName;

	//private TaskParser parser;

	//private DotFileGenerator dotFileGenerator;

	public static void main(String[] args) {
		String inputFile = args[0];
		String outputFile = args[1];

		try {

			TaskParser parser = new TaskParser();
			System.out.println("Parsing pert file " + inputFile);
			TaskCollection tc;
			tc = parser.parseTasksFromFile(inputFile);

			System.out.println("Generating dot file " + outputFile);
			DotFileGenerator dfg = new DotFileGenerator();
			dfg.generateDotFile(tc, outputFile);

			System.out.println("Dot file generated.");

		} catch (IOException e) {
			System.out.println("Error parsing file " + e.getMessage());
			e.printStackTrace();
		}

	}

}
