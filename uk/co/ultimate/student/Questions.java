
public class Questions{

    private String question;
    private String totalQuestions;




    public Questions(){

    }


    public Questions(String question, String totalQuestions){
        this.question = question;
        this.totalQuestions = totalQuestions;
    }

	public String getQuestion()
	{
		return this.question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getTotalQuestions()
	{
		return this.totalQuestions;
	}

	public void setTotalQuestions(String totalQuestions)
	{
		this.totalQuestions = totalQuestions;
	}








}