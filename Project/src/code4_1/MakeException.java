package code4_1;

public class MakeException {
    public void makeMyException() throws MyException {
        throw new MyException("is my exception");
    }

    public void makeSubMyException() throws SubMyException {
        throw new SubMyException("is sub my exception");
    }

}
