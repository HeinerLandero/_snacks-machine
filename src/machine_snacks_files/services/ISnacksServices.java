package machine_snacks_files.services;
import machine_snacks_files.domain.Snack;

import java.util.List;


public interface ISnacksServices {
    void addSnacks(Snack snack);
    void showSnacks();
    List<Snack> getSnacks();

}
