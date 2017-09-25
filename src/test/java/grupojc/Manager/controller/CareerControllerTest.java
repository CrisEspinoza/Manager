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
public class CareerControllerTest {
    @MockBean
    private CareerController careerController;

    @Test
    public void deleteCareerTest()
    {
        careerController.deleteAll();
        Assert.assertEquals(careerController.count(),0);
    }

    @Test
    public void addStudentsTest()
    {
        Career career = new Career("Ingenieria");
        Student student1 = new Student("Javier","19448718-5","ejemplo@abc.com",2015, career);
        Student student2 = new Student("Jiji","19448710-5","ejemploa@abc.com",2015, career);
        Assert.assertEquals(career.getStudents().size(),2);
    }
}