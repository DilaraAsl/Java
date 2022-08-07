package Day25_ConstructorsAndDateFormatting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BirthdaysArrayList {
    public static void main(String[] args) {
        /*

    1. create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person

    4. find out who was born on leap year
         */
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Dilsad","Hatice","Suleyman","Emin"));

        ArrayList<LocalDate> birthDays=new ArrayList<>(Arrays.asList(LocalDate.of(1977,11,12),LocalDate.of(1955,4,1),
                LocalDate.of(1948,10,13),LocalDate.of(2020,7,4)));

        System.out.println(names.get(birthDays.indexOf(Collections.max(birthDays)))); // max returns the recent(biggest) year which is the youngest
        System.out.println(names.get(birthDays.indexOf(Collections.min(birthDays))));// min returns the smallest year which is the oldest in the list

            }

        }


