package lotto;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameConsole {

    private static final String INPUT_PURCHASE_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public int inputPurchase(){
        notice(INPUT_PURCHASE_MESSAGE);
        String purchase = Console.readLine();
    }

    public void inputWinningNumber(){
        String winningNumber = Console.readLine();
    }

    private static void notice(String inputMessage) {
        System.out.println(inputMessage);
    }

    public void inputBonusNumber(){
        String bonusNumber = Console.readLine();
    }

    public void outputLottos(int lottoCount, List<Lotto> lottos) {
        System.out.println(String.format("%d개를 구매했습니다.", lottoCount));
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getNumbers());
        }
    }
}
