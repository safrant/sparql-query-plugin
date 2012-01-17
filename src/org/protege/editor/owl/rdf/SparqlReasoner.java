package org.protege.editor.owl.rdf;

public interface SparqlReasoner {
	
	void precalculate() throws SparqlReasonerException;
	
	SparqlResultSet executeQuery(String query) throws SparqlReasonerException;
	
	void dispose();
}
