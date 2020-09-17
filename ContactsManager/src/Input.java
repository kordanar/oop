public class Input
{
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Altyn";
        contact1.phoneNumber = "0708315524";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Kuba";
        contact2.phoneNumber = "0700245144";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Bakay";
        contact3.phoneNumber = "0700424212";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Kurstan";
        contact4.phoneNumber = "0500327676";
        myContactsManager.addContact(contact4);

        Contact result = myContactsManager.searchContact("Bakay");
        System.out.println(result.name + ": " + result.phoneNumber);

    }
}
