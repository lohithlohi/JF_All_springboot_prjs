package com.ust;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    /*
        steps for testing:
        1. Initialize the objects you want to test.
        2. Invoke the methods you want to test.
        3. Assert the expected outcomes using JUnit assertions.
     */

    @Test
    @DisplayName("Create a contact using the constructor")
    void createContact() {
        // Given
        Contact contact = new Contact(1, "John Doe", "1234567890");
        // Then
        assertEquals(1, contact.getId(), "Id qualified");
        assertEquals("John Doe", contact.getName(), "Name qualified");
        assertTrue(contact.getPhoneNumbers().contains("1234567890"), "Pnumber qualified");
    }

    @Test
    @DisplayName("Create a contact using the empty constructor")
    void createContactEmptyConstructor() {
        // Given
        Contact contact = new Contact();
        // Then
        assertAll(
                () -> assertEquals(0, contact.getId()),
                () -> assertNull(contact.getName()),
                () -> assertTrue(contact.getPhoneNumbers().isEmpty())
        );
    }
}