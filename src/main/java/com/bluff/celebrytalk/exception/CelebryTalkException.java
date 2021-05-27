package com.bluff.celebrytalk.exception;

public class CelebryTalkException extends RuntimeException {
    public CelebryTalkException() {
        super();
    }

    public CelebryTalkException(String message) {
        super(message);
    }

    public CelebryTalkException(String message, Throwable cause) {
        super(message, cause);
    }

    public CelebryTalkException(Throwable cause) {
        super(cause);
    }
}
