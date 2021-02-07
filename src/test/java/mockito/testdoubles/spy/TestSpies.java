package mockito.testdoubles.spy;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class TestSpies {

	@Test
	public void testListSpy() {
		List<Integer> list = new ArrayList<>();
		List<Integer> spyList = spy(list);

		spyList.add(1);
		spyList.add(2);

		// unordered check
		verify(spyList).add(2);
		verify(spyList).add(1);

		// check with order
		InOrder inOrder = inOrder(spyList);
		inOrder.verify(spyList).add(1);
		inOrder.verify(spyList).add(2);

		Assertions.assertEquals(2, spyList.size());
	}

}
