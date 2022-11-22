package bridge.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UpAndDownTest {

    @Test
    @DisplayName("랜덤값(0,1)이 주어지면 알맞은 UpAndDown을 찾아 반환할 수 있다.")
    void tryFindUpAndDown() {
        UpAndDown down = UpAndDown.findUpAndDown(0);
        UpAndDown up = UpAndDown.findUpAndDown(1);

        assertThat(down).isEqualTo(UpAndDown.DOWN);
        assertThat(up).isEqualTo(UpAndDown.UP);
    }

    @Test
    @DisplayName("랜덤값(0,1)이 주어지면 알맞은 UpAndDown의 command(D,U)를 찾아 반환할 수 있다.")
    void tryConvertRandomValueToCommand() {
        String upCommand = UpAndDown.convertRandomValueToCommand(1);
        String downCommand = UpAndDown.convertRandomValueToCommand(0);

        assertThat(upCommand).isEqualTo("U");
        assertThat(downCommand).isEqualTo("D");
    }
}