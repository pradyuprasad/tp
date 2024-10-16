package seedu.address.model.person;

/**
 * Represents the role of a person in the address book.
 */
public enum Role {
    /**
     * Represents a patient in the address book.
     */
    PATIENT,

    /**
     * Represents a caregiver in the address book.
     */
    CAREGIVER;

    public static final String MESSAGE_CONSTRAINTS = "Roles should only be 'PATIENT' or 'CAREGIVER'";

}
