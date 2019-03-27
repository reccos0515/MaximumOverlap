/**
 * An interface for describing basic getter functionality for a node
 *
 * @param <K>
 * @param <V>
 * @author Adrian Hamill
 */
public interface EntryNode<K, V> {

    /**
     * Returns the parent node of this node. If there is no parent node,
     * <code>null</code> is returned.
     *
     * @return
     */
    public EntryNode<K, V> parent();

    /**
     * <p>
     * Returns the child node of this node. If a node has multiple children,
     * then this returns the left-most child. E.g.,
     * </p>
     * <p>
     * <pre>
     *          Parent
     *            |
     * null <-> Child <-> Sibling <-> Sibling ...
     * </pre>
     * <p>
     * If there is no child node, <code>null</code> is returned.
     * </p>
     *
     * @return
     */
    public EntryNode<K, V> left();


    /**
     * Returns the previous sibling of this node. If there is no previous
     * sibling, <code>null</code> is returned.
     *
     * @return
     */
    public EntryNode<K, V> right();

    /**
     * Returns the (non-null) key for this node.
     *
     * @return
     */
    public int key();

    /**
     * Returns the value for this node.
     *
     * @return
     */
    public int value();
}
