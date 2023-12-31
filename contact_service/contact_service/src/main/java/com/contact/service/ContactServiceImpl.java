package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "masumgc@gmail.com", "Masum", 1311L),
            new Contact(2L, "hafiz@gmail.com", "Hafiz", 1312L),
            new Contact(3L, "Rahman@gmail.com", "Rahman", 1311L),
            new Contact(4L, "md@gmail.com", "Md", 1314L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
