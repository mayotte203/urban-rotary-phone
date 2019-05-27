package hello;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {
    private int from;
    private int to;
    List<Integer> resultList;
    FindNumbers(int from, int to)
    {
        this.from = from;
        this.to = to;
    }
    public List getResultList(){
        resultList = new ArrayList<>();
        for(int i = (int)Math.sqrt(from); i < (int)Math.sqrt(to) + 1; i++) {
            if(i * i <= to && i * i >= from)
            resultList.add(i);
        }
        return resultList;
    }
}
