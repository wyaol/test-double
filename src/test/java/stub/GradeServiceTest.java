package stub;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Mock
    GradeSystem gradeSystemStub;

    @InjectMocks
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        // given
        long studentId = 123;
        when(gradeSystemStub.gradesFor(studentId)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));

        // when
        double result = gradeService.calculateAverageGrades(studentId);

        // then
        assertEquals(90, result);
    }
}
