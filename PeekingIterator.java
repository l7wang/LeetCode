// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
        
    private Iterator<Integer> it;
    private Integer top = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it = iterator;
	    if (it.hasNext()) {
	        top = it.next();
	    }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return top;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer res = top;
	    if (it.hasNext()) top = it.next();
	    else top = null;
	    return res;
	}

	@Override
	public boolean hasNext() {
	    return top != null;
	}
}