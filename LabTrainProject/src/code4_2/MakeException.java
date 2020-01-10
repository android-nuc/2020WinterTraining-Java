package code4_2;

public class MakeException {
    public void makeMyException() throws MyException {
        throw new MyException("IS MY Exception");
    }

    public void makeSubMyException() throws SubMyException {
        throw new SubMyException("IS MY SUB Exception");
    }
}
