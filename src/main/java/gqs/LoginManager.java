package gqs;

public class LoginManager {
    private AuthenticationService authService;

    public LoginManager(AuthenticationService authService){
        this.authService = authService;
    }

    public String login(String username, 
    String password){
        if (this.authService.authenticate(username, password)){
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
    
}
