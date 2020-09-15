package mock;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith({MockitoExtension.class})
public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    @Mock
    DoorPanel mockDoorPanel;

    @InjectMocks
    SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        // given

        // when
        securityCenter.switchOn();

        //then
        verify(mockDoorPanel, times(1)).close();

    }
}
