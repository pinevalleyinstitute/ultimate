

public class Answers {


    
    
    private String answer;
    private boolean correct;
    

   

    public Answers() {

    }

    public Answers( String answer,boolean correct){
        
        this.answer =answer;
        this.correct = correct;

    
    }

     
    
	public String getAnswer()
	{
		return this.answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public boolean getCorrect()
	{
		return this.correct;
	}

	public void isCorrect(boolean correct)
	{
		this.correct = correct;
	}


    

  

   
}