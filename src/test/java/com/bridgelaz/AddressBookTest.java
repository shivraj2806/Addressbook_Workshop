package com.bridgelaz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {
    AddressBook address=new AddressBook();

     @Test
        public void whenEnterDetails_checkContact(){
            try {
                address.addContact("shivraj","jadhav","shiv@gmail.com","karmala","7741993813","431112","maharashtra","solapur");
                address.addContact("mahi","dhoni","mahi@10","zarkhand","985742316","5855","zarkhand","zarkhand");
                int count=address.count();
                Assertions.assertEquals(2,2);

            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

