package demo.mockitotesting1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class TestStudent {
    
    private App app; 

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); 
        app = new App(userRepository); 
    }
   

    @Test
    public void testGetUserById() {
    	
        Student mockUser = new Student("1", "Sakshi b", 20, "sakshi.b@google.com");
        
        //stub because it allows us to control the output
        when(userRepository.findById("1")).thenReturn(mockUser); 

        Student user = app.getUserById("1"); 

        assertEquals("1", user.getId());
        assertEquals("Sakshi b", user.getName());
        assertEquals(20, user.getAge());
        assertEquals("sakshi.b@google.com", user.getEmail());
    }

    @Test
    public void testGetAllUsers() {
        Student stud1 = new Student("1", "Sonali Mane", 20, "sonali.mane@google.com");
        Student stud2 = new Student("2", "Chetan Mali", 22, "chetan.mali@google.com");
        Student stud3 = new Student("4", "Divyani chaudhari", 29, "Divyanichaudhari9@gmail.com");
        List<Student> mockUsers = Arrays.asList(stud1, stud2, stud3);
        
        when(userRepository.findAll()).thenReturn(mockUsers); 

        List<Student> users = app.getAllUsers(); 

        assertEquals(3, users.size());
        assertEquals("Sonali Mane", users.get(0).getName()); 
        assertEquals("Chetan Mali", users.get(1).getName());
        assertEquals("Divyani chaudhari", users.get(2).getName());
        
    }


    @Test
    public void testAddUser() {
        Student newUser = new Student("3", "Karan Ahire", 32, "karan.ahire@google.com");

        app.addUser(newUser); 

        verify(userRepository).save(newUser); 
    }
    

    
   
}
