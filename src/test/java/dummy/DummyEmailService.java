package dummy;

import org.example.dummy.EmailService;

public class DummyEmailService implements EmailService {
    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Method not implemented !!!");
    }
}
