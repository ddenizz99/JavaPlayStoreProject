package Core.Utilities.Results;

public class Result extends IResult{
	
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	public Result(boolean success) {
		this.success = success;
	}
}
