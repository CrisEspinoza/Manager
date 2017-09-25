package grupojc.Manager.controller;

import grupojc.Manager.model.Career;
import grupojc.Manager.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest {

    @MockBean
    private StudentController studentController;

    @Test
    public void deleteStudentsTest() throws Exception
    {
        studentController.deleteAll();
        Assert.assertEquals(studentController.count(),0);
    }

    @Test
    public  void getStudentTest() throws Exception
    {
        Student student = new Student("Javier","19448718-5","ejemplo@abc.com",2015, new Career("Ingenieria"));
        studentController.save(student);
        Assert.assertEquals(studentController.count(), 0); // Debe ser 1
    }
}