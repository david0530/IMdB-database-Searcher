# IMdB-database-Searcher
Implement a Binary Search Tree (BST) based index for indexing/searching actors or movies in the IMDb dataset. done has Oxford College of Emory University CS171 project. 

The implementation allow the user to quickly find information associated with an actor, or a movie, based on the actor's or movie's name (e.g., "Arnold Schwarzenegger"), or a prefix of a name (e.g. "Arnold Schwarz*").

The search sis case insensitive (e.g., "arnold schwarz*" should also work.)

The search key is the short or simplified name of a movie or actor.

The information associated with the key of type MovieInfo.

The BST index is implemented as a stand-alone class named BSTIndex, having at least the public methods listed below .
public BSTIndex() : a constructor to initialize the BST. The data element should be an object of type MovieInfo as described above.

public MovieInfo findExact(String key) : returns the data MovieInfo element where the shortName matches the key exactly (although possibly with different capitalization).

public MovieInfo findPrefix (String prefix) : returns a data element MovieInfo where the shortName starts with the prefix (and possibly has different capitalization). If there is more than one match, you can return the MovieInfo for any of these -- your choice.

public void insert(MovieInfo data) : insert the given data element into the proper place in the BST structure.
