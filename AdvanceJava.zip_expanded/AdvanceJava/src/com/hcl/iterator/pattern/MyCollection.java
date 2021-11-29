package com.hcl.iterator.pattern;

public class MyCollection implements Container {

	public String employeeNames[] = { "Arjun", "Savya", "Pritha", "Mohan", "Aditi" };

	@Override
	public MyIterator getMyIterator() {

		return new MyCollectionIterator();
	}

	private class MyCollectionIterator implements MyIterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < employeeNames.length) {
				return true;
			}

			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return employeeNames[index++];
			}
			return null;

		}

	}

}
