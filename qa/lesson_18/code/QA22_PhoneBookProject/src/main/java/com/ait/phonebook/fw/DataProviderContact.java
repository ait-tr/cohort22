package com.ait.phonebook.fw;

import com.ait.phonebook.model.Contact;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderContact {
    @DataProvider
    public Iterator<Object[]> addNewContact() {

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"Oliver","Kan","98765432198","kan@gm.com","Berlin","goalkeeper"});
        list.add(new Object[]{"Oliver+1","Kan","98765432197","kan+1@gm.com","Berlin","goalkeeper"});
        list.add(new Object[]{"Oliver+2","Kan","98765432199","kan+2@gm.com","Berlin","goalkeeper"});

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> addNewContactFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader
                (new FileReader(new File("src/test/resources/contact.csv")));

        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");

            list.add(new Object[]{new Contact()
                    .setName(split[0]).setSurName(split[1]).setPhone(split[2])
                    .setEmail(split[3]).setAddress(split[4]).setDesc(split[5])});

            line = reader.readLine();
        }
        return list.iterator();
    }
}
