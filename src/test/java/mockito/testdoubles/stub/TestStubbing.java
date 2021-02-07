package mockito.testdoubles.stub;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestStubbing {

	@Test
	public void testArgumentBasedStubbing() {
		ObjectToStub objectToStub = mock(ObjectToStub.class);
		when(objectToStub.methodToStub(1)).thenReturn(3);
		when(objectToStub.methodToStub(2)).thenReturn(4);

		Assertions.assertEquals(3, objectToStub.methodToStub(1));
		Assertions.assertEquals(4, objectToStub.methodToStub(2));
	}

}