package m19.exceptions;

public class NoSuchUserIdException extends Exception {

    /** Serial number for serialization. */
    private static final long serialVersionUID = 201901101348L;
  
    /** Service id. */
    private int _id;
  
    /**
     * @param id
     */
    public NoSuchUserIdException(int id) {
      _id = id;
    }
  
    /** @return id */
    public int getId() {
      return _id;
    }
  
  }