package Core.Utilities.Results;

public class DataResult<T> extends IDataResult<T>{
	
	public DataResult(boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	public DataResult(boolean success) {
		this.success = success;
	}
	
	public DataResult(T data, boolean success, String message)
    {
		this(success, message);
		this.data = data;
    }
	
	public DataResult(T data, boolean success)
    {
		this(success);
		this.data = data;
    }

}
