package cn.springdemo;

public class HelloSpring {
    private String   message ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void print() {
        System.out.println( "消息的值为：" + getMessage() );

    }

}
