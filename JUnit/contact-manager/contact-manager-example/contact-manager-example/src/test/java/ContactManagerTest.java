import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    public static ContactManager contactManager;

    @BeforeAll
    public static void createContactManager() {
        contactManager = new ContactManager();
        System.out.println("Instance created");
    }

    @BeforeEach
    public void printIt() {
        System.out.println("Hello");
    }


    @Test
    public void shouldCreateContact() {
//        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John", "Doe", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should Not Create Contact When First Name is Null")
    public void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {
//        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Doe", "0123456789");
        });
    }
}