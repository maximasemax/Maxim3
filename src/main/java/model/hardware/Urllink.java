package model.hardware;

import java.util.ArrayList;
import java.util.List;
// это задачи короторые решаем на скорость

public class Urllink {
    private final List<String> list = new ArrayList<>(10);

    public Urllink(){
        fill();
    }

    public int getEmptyLinesCount(){
        int emptiCount = 0;
        for (String item : list){
            if(item.isEmpty()){
              emptiCount ++;
            }
        }
        return emptiCount;

    }

    public int getBlankLinesCount(){
        int blankCount = 0;
        for (String item : list ){
            if(item.isBlank()){
                blankCount++;
            }
        }
        return blankCount;
    }

    public List<String> getStartingWith(){
        List<String> rezult = new ArrayList<>();
        for (String item : list){
            if (item.startsWith("A")){
                rezult.add(item);
            }
        }
        return rezult;
    }

    private void fill(){
        list.add("HaveFan");
        list.add("haveFan");
        list.add("Havefan");
        list.add("OlgaZanita");
        list.add("OlgaNeZanita");
        list.add("");
        list.add("");
        list.add("\t    \t\t\t\t     ");
    }


}
