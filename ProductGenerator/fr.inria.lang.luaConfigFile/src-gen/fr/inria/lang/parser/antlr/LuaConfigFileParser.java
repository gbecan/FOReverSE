/*
* generated by Xtext
*/
package fr.inria.lang.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.inria.lang.services.LuaConfigFileGrammarAccess;

public class LuaConfigFileParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private LuaConfigFileGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.inria.lang.parser.antlr.internal.InternalLuaConfigFileParser createParser(XtextTokenStream stream) {
		return new fr.inria.lang.parser.antlr.internal.InternalLuaConfigFileParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "LuaConfigFile";
	}
	
	public LuaConfigFileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LuaConfigFileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
