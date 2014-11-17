/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */
package sakfy6.cs3330.hw3;

public class CreatureResponse {
	
	
	private String response;
	private boolean validAction;
	
	/**
	 * constructor 
	 * @param response
	 * @param validAction
	 */
	CreatureResponse(String response, boolean validAction){
		setValidAction(validAction);
		setResponse(response);
	} 
	
	/**
	 * setter
	 * @param validAction
	 */
	public void setValidAction(boolean validAction){
		this.validAction = validAction;
	}
	
	/**
	 * setter
	 * @param response
	 */
	public void setResponse (String response){
		this.response = response;
	}
	
	/**
	 * getter
	 * @return
	 */
	public boolean getValidAction(){
		return this.validAction;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getResponse(){
		return this.response;
	}

}
