package lotto.controller;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.domain.Money;
import lotto.domain.Numbers;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    public void play() {
        Money money = new Money();
        buyLottos(money.trial());
        generateWinningNumbers();
        generateBonusNumber();
    }

    public void buyLottos(int trial) {
        OutputView.printNoticeTrialMessage(trial);

        List<Lotto> myLottos = new ArrayList<>();
        do {
            List<Integer> numbers = Numbers.pickRandomNumbers();
            myLottos.add(new Lotto(numbers));
        } while (myLottos.size() < trial);

        OutputView.printBoughtLottos(myLottos);
    }

    public void generateWinningNumbers() {
        Lotto winningLotto = new Lotto(InputView.inputWinningNumbers());
    }

    public void generateBonusNumber() {
        OutputView.printAskBonusNumberMessage();
    }
}
