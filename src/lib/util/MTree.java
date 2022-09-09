package lib.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

public class MTree<SubType extends Comparable<SubType>, ValueType> implements Iterable<SubType> {

    private TreeMap<SubType, MTree<SubType, ValueType>> subscripts;
    private ValueType value;

    public MTree() {
        subscripts = new TreeMap<SubType, MTree<SubType, ValueType>>();
        value = null;
    }

    public boolean hasSubscripts() {
        return !subscripts.isEmpty();
    }

    public boolean hasSub(SubType subscript) {
        return subscripts.containsKey(subscript);
    }

    public MTree<SubType, ValueType> sub(SubType subscript) {
        MTree<SubType, ValueType> subTree = subscripts.get(subscript);
        if (subTree == null) {
            subTree = new MTree<SubType, ValueType>();
            subscripts.put(subscript, subTree);
        }
        return subTree;
    }

    @Override
    public Iterator<SubType> iterator() {
        return subscripts.keySet().iterator();
    }

    /**
     * Shallow copies the given subtree into this tree.
     */
    public void merge(MTree<SubType, ValueType> tree) {
        this.setValue(tree.getValue());
        for (SubType sub : tree.subscripts.keySet()) {
            MTree<SubType, ValueType> oldSubtree = subscripts.get(sub);
            if (oldSubtree != null) {
                if (oldSubtree.hasSubscripts()) {
                    oldSubtree.merge(tree.sub(sub));
                } else {
                    oldSubtree.setValue(tree.sub(sub).getValue());
                }
            } else {
                subscripts.put(sub, tree.sub(sub));
            }
        }
    }

    public ValueType getValue() {
        return value;
    }

    public MTree<SubType, ValueType> setValue(ValueType value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof MTree<?, ?> unparamTree)) { return false; }
        if (!(Arrays.equals(
                this.getClass().getTypeParameters(),
                unparamTree.getClass().getTypeParameters()))) {
            return false;
        }
        MTree<SubType, ValueType> tree = (MTree<SubType, ValueType>)unparamTree;

        if (!(this.getValue() == null && tree.getValue() == null)
                && this.getValue() != tree.getValue()
                && !this.getValue().equals(tree.getValue())) {
            return false;
        }

        Iterator<SubType> thisSubs = this.iterator();
        Iterator<SubType> treeSubs = tree.iterator();
        while (thisSubs.hasNext() && treeSubs.hasNext()) {
            SubType thisSub = thisSubs.next();
            SubType treeSub = treeSubs.next();
            if (!thisSub.equals(treeSub)) {
                return false;
            }
            MTree<SubType, ValueType> thisSubtree = this.sub(thisSub);
            MTree<SubType, ValueType> treeSubtree = tree.sub(treeSub);
            if (!thisSubtree.equals(treeSubtree)) {
                return false;
            }
        }
        return !(thisSubs.hasNext() || treeSubs.hasNext());
    }

    @Override
    public String toString() {
        return "root" + toStringInternal("root");
    }

    private String toStringInternal(String indent) {
        StringBuilder s = new StringBuilder();
        // calculate length of the longest subscript, for indents prettiness
        int maxLength = 0;
        for (SubType sub : subscripts.keySet()) {
            int length = sub.toString().length();
            if (length >= maxLength) { maxLength = length; }
        }
        //String newIndent = indent + " ".repeat(Math.max(0, maxLength + 1));

        // print value, if it exists
        if (value != null) {
            s.append('=').append(value).append('\n');
        }
        for (SubType sub : subscripts.keySet()) {
            // if there's a subtree, recursively print it
            MTree<SubType, ValueType> subTree = subscripts.get(sub);
            if (subTree == null ||
                    (!subTree.hasSubscripts() && subTree.getValue() == null)) {
                s.append(indent).append(',').append(sub.toString());
                s.append("=\"\"\n");
            } else if (!subTree.hasSubscripts()) {
                s.append(indent).append(',').append(sub.toString());
                s.append('=').append(subTree.getValue()).append('\n');
            } else {
                // generate new indent for the subtrees
                String newIndent = indent + "," + sub
                        + " ".repeat(Math.max(0, maxLength - sub.toString().length()));
                s.append(subTree.toStringInternal(newIndent));
            }
        }
        return s.toString();
    }

}
