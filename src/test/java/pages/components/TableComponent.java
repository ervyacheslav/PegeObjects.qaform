package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {

    public void checkResultTable(String result)
    {
        $(".table-responsive").shouldHave(text(result));
    }




}