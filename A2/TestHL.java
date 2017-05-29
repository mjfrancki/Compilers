// TESTHL CLASS USED TO TEST CPS710 ASSIGNMENT 3
//
class TestHL {

    private static SimpleCharStream instream;
    private static HLTokenManager scanner;
    private static HL parser;

    public static void main(String args[]) {

		// Figure out input stream from args or stdin
		java.io.InputStream infile;
		if (args.length < 1) {
	 		infile = System.in;
		} 
		else try {  
	  		infile = new java.io.FileInputStream(args[0]);
		} catch (java.io.FileNotFoundException e) {
	   		System.out.println("File " + args[0] + " not found."); 
	   		return;
		} 

		// Create scanner and parser
		instream = new SimpleCharStream(infile);
		scanner = new HLTokenManager(instream);
		parser = new HL(scanner);

		// Call parser until EOF reached
		while (nextParse());
    }




    private static boolean nextParse() {
		SimpleNode tree;
		Eval evaluator = new Eval();
		Object value;

		try {
			tree = parser.start();
			if (tree == null)	return true;
			value = tree.jjtAccept(evaluator,null);
			if (value!=null)
				System.out.println(value);

		} catch (ParseException e) {	// catch EOF
			return false;

		} catch (Exception e) {	// catch visitor exceptions
			System.out.println(e);
		}
		return true;
	}

}
