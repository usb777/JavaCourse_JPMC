package com.dzs.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorChild implements Spliterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean tryAdvance(Consumer action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Spliterator trySplit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long estimateSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int characteristics() {
		// TODO Auto-generated method stub
		return 0;
	}

}
