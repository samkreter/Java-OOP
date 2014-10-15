package sakfy6.cs3330.hw2;

public class HumanResponse {
	
	
	private String response;
	private boolean validAction;
	
	HumanResponse(String response, boolean validAction){
		setValidAction(validAction);
		setResponse(response);
	} 
	
	public void setValidAction(boolean validAction){
		this.validAction = validAction;
	}
	
	public void setResponse (String response){
		this.response = response;
	}
	
	public boolean getValidAction(){
		return this.validAction;
	}
	
	public String getResponse(){
		return this.response;
	}

}
