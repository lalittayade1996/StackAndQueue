package com.bridgelabz.stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void given3Nums_WhenAdded_ShouldHaveLastAdded() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		StackClass stack = new StackClass();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		INode peak = stack.peak();
		Assert.assertEquals(thirdNode, peak);
	}

}