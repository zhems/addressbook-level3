package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StorageStub implements Storage {

    public StorageStub(){}
    
    public AddressBook load() throws StorageOperationException {
        return null;
    }
    public String getPath() {
        return null;
    }
    public void save(AddressBook addressBook) throws StorageOperationException {}
    
}
