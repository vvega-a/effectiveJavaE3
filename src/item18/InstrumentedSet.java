package item18;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E>  {
    private int addCount = 0;

    public InstrumentedSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addCount = addCount + collection.size();
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }
}