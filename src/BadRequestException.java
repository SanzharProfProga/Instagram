public class BadRequestException extends Exception {

    private String message;

    public BadRequestException() {
    }

    public BadRequestException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public BadRequestException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
