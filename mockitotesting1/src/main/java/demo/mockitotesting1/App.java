package demo.mockitotesting1;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
   
    	private UserRepository userRepository;

        public App(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public Student getUserById(String id) {
            return userRepository.findById(id);
        }

        public List<Student> getAllUsers() {
            return userRepository.findAll();
        }

        public void addUser(Student student) {
            userRepository.save(student);
        }
	} 
        

