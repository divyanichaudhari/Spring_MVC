package demo.mockitotesting1;

import java.util.List;

public interface UserRepository {
    Student findById(String id);
    List<Student> findAll();
    void save(Student student); // Corrected to match the intended save method
}
