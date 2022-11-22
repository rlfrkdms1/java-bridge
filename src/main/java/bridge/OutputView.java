package bridge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    private static final String OUTPUT_GAME_START = "다리 건너기 게임을 시작합니다.";

    public void printStartGame() {
        System.out.println(OUTPUT_GAME_START);
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(Map<String, List<String>> movingMap) {
        Arrays.stream(UpAndDown.values()).forEach((upAndDown -> printBridgeStatus(movingMap, upAndDown.getCommand())));
    }

    private void printBridgeStatus(Map<String, List<String>> result, String upAndDown) {
        List<String> bridgeStatus = result.get(upAndDown);
        System.out.println(bridgeStatus.stream()
                .collect(Collectors.joining("|", "[", "]")));
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }
}
