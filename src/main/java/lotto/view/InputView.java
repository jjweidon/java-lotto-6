package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static int inputMoney() {
        OutputView.printAskMoneyMessage();
        return Integer.parseInt(Console.readLine());
    }

    public static String inputWinningNumbers() {
        OutputView.printAskWinningNumbersMessage();
        return Console.readLine();
    }

    public static String inputBonusNumber() {
        OutputView.printAskBonusNumberMessage();
        return Console.readLine();
    }

    private void validateMoney(int amount) {
        if (amount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 잘못된 금액입니다.");
        }
    }
}