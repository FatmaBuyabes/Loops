public class WeekdaysPrinter {
    String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    for(
    int i = 0;i<days.length;i++)
    {
        if (i >= 5) {
            break;
        }
        System.out.println(days[i]);

    }

    for(
    String day:days)
    {
        System.out.println(day);

    }
}}