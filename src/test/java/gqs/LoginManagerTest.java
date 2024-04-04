package gqs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class LoginManagerTest {

    @Test
    public void shouldLoginSucessful(){
        // Arrange 
        AuthenticationService mockAuthService = 
                mock(AuthenticationService.class);
        
        when(mockAuthService.authenticate("dickvigarista", 
        "esquadrilha123")).thenReturn(true);
        
        LoginManager loginManager = new LoginManager(mockAuthService);

        // Action 
        String result = loginManager.login("dickvigarista",
        "esquadrilha123");        

        // Assert
        verify(mockAuthService).authenticate("dickvigarista", "esquadrilha123");
        assertEquals("Login successful", result);
    }

    @Test
    public void shouldLoginFailure(){
        // Arrange 
        AuthenticationService mockAuthService = 
                mock(AuthenticationService.class);
        
        when(mockAuthService.authenticate("dickvigarista", 
        "esquadrilha231")).thenReturn(false);
        
        LoginManager loginManager = new LoginManager(mockAuthService);

        // Action 
        String result = loginManager.login("dickvigarista",
        "esquadrilha231");        

        // Assert
        verify(mockAuthService).authenticate("dickvigarista", "esquadrilha231");
        assertEquals("Login failed", result);
    }
    
}
