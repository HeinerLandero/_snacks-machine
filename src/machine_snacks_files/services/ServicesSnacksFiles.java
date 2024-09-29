package machine_snacks_files.services;

import machine_snacks_files.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServicesSnacksFiles implements ISnacksServices {

    private final String NAME_FILE = "snacks.txt";
    //Create List
    private List<Snack> snacks = new ArrayList<>();
    public ServicesSnacksFiles(){
        var file = new File(NAME_FILE);
        var exist = false;
        try{
            exist = file.exists();
            if(exist){
                this.snacks = getSnack();
            }else{
                var exit = new PrintWriter(new FileWriter(file));
                exit.close();
                System.out.println("File Created!");
            }
        }catch (Exception e){
            System.out.println("Ops, problems");
        }
        if(!exist){
            loadedSnacks();
        }
    }
    @Override
    public void addSnacks(Snack snack) {

    }

    @Override
    public void showSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
