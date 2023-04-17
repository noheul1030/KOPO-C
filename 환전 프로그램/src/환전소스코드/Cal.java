package 환전소스코드;

import java.util.Arrays;
import java.util.List;

public class Cal {
    public List<Integer> USD_List = Arrays.asList(100, 50, 10, 5, 2, 1);
    public List<Integer> EUR_List = Arrays.asList(500, 100, 50, 20, 10, 5, 2, 1);
    public List<Integer> JPY_List = Arrays.asList(10000, 5000, 1000, 500, 100);
    public List<Integer> Won_List = Arrays.asList(1000, 500, 100, 50, 10);

    public List<String> USD_Call = Arrays.asList("장", "장", "장", "장", "개", "개");
    public List<String> EUR_Call = Arrays.asList("장", "장", "장", "장", "장", "장", "개", "개");
    public List<String> JPY_Call = Arrays.asList("장", "장", "장", "개", "개");
    public List<String> Won_Call = Arrays.asList("장", "개", "개", "개", "개");

    public List<String> changeMoney_type = Arrays.asList(" ", "달러", "유로", "엔");
}
