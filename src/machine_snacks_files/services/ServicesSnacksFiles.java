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
//                this.snacks = getSnack();
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
    private void loadedSnacks(){
        this.addSnacks(new Snack("Detodito", 125.22));
        this.addSnacks(new Snack("Coca-cola", 15.22));
        this.addSnacks(new Snack("Festival", 12.22));
        this.addSnacks(new Snack("Chocolatina jets", 25.22));
    }
    @Override
    public void addSnacks(Snack snack) {
        //Add new snack
        // 1. save it in memory list
        this.snacks.add(snack);
        // 2. save it in file
        this.saveSnackFile(snack);

    }

    private void saveSnackFile(Snack snack){
        boolean anexo = false;
        var file = new File(NAME_FILE);
        try{
            anexo = file.exists();
            var exit = new PrintWriter(new FileWriter(file , anexo));
            exit.println(snack.toString());
            exit.close();

        }catch (Exception e){
            System.out.println("Problem !!!");
        }
    }


    @Override
    public void showSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
