package lib.tests.util;

import org.junit.Test;

import lib.util.MTree;

import java.util.Iterator;

import static org.junit.Assert.*;

public class MTreeTests {
    public MTreeTests() {}

    @Test
    public void constructor__hasSubscriptsFalse() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        assertNull(tree.getValue());
        assertFalse(tree.hasSubscripts());
    }

    @Test
    public void getSetValue_rootSetValue1_rootGetValue1() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        tree.setValue(1);
        assertEquals(1, tree.getValue());
    }

    @Test
    public void sub_sub1_sub1getValueNull() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        tree.sub(1);
        assertNull(tree.sub(1).getValue());
    }

    @Test
    public void sub_sub1value2_sub1getValue2() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        tree.sub(1).setValue(2);
        assertEquals(2, tree.sub(1).getValue());
    }

    @Test
    public void sub_sub1sub2sub3value4_sub1sub2sub3getValue4() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        tree.sub(1).sub(2).sub(3).setValue(4);
        assertEquals(4, tree.sub(1).sub(2).sub(3).getValue());
    }

    @Test
    public void sub_sub4213_iterator1234() {
        MTree<Integer, Object> tree = new MTree<Integer, Object>();
        tree.sub(4);
        tree.sub(2);
        tree.sub(1);
        tree.sub(3);

        Iterator<Integer> iter = tree.iterator();
        assertEquals(1, (int)iter.next());
        assertEquals(2, (int)iter.next());
        assertEquals(3, (int)iter.next());
        assertEquals(4, (int)iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void merge_123sub4value5and283sub6value7_123sub4value5nsub6value7n8() {
        MTree<Integer, Object> tree1 = new MTree<Integer, Object>();
        tree1.setValue("one");
        tree1.sub(1);
        tree1.sub(2);
        tree1.sub(3).sub(4).setValue(5);
        MTree<Integer, Object> tree2 = new MTree<Integer, Object>();
        tree2.setValue("two");
        tree2.sub(2);
        tree2.sub(8);
        tree2.sub(3).sub(6).setValue(7);

        System.out.println(tree1);
        System.out.println(tree2);
        tree1.merge(tree2);
        System.out.println(tree1);

        assertEquals("two", tree1.getValue());

        Iterator<Integer> iter = tree1.iterator();
        assertEquals(1, (int)iter.next());
        assertEquals(2, (int)iter.next());
        assertEquals(3, (int)iter.next());
        assertEquals(8, (int)iter.next());
        assertFalse(iter.hasNext());

        iter = tree1.sub(3).iterator();
        assertEquals(4, (int)iter.next());
        assertEquals(6, (int)iter.next());
        assertFalse(iter.hasNext());
        assertEquals(5, tree1.sub(3).sub(4).getValue());
        assertEquals(7, tree1.sub(3).sub(6).getValue());
    }

}
