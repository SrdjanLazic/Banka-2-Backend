package rs.edu.raf.si.bank2.users.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Order with id <" + id + "> has not been found.");
    }
}
