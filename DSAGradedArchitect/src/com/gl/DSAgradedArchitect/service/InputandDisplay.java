package com.gl.DSAgradedArchitect.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class InputandDisplay {
	 int noOfFloors;
	 int[] floorsSize,floorAscending;
	 
	 Stack<Integer> floorStack;
	Scanner scr = new Scanner(System.in);
	
	public void Input(){
		// for no of floors in building
	System.out.println("Enter the no. of floors in the building ");
	noOfFloors = scr.nextInt();
	// floor size prepared everyday for assembling at the construction site
	floorsSize = new int[noOfFloors];
	for (int i=0;i<noOfFloors;i++){
	System.out.println("Enter the floor size given on day :"+(i+1));
	floorsSize[i]=scr.nextInt();
	}
	//sorting floor size entered in ascending order
	floorAscending = floorsSize.clone();
	AscendingSort As = new AscendingSort();
	As.sort(floorAscending, 0, noOfFloors-1);
	// storing floor size in stack in ascending order
	floorStack=new Stack<>();
	for(int i=0;i<noOfFloors;i++){
		floorStack.push(floorAscending[i]);
		
		//System.out.println(floorStack.peek());
	//for(int j=0;j<noOfFloors;j++){
		//	System.out.print("ELment in stack at"+(noOfFloors-j-1)+" "+floorStack.peek()+"\n");
		//}
	}
	}
	// method to construct floors according to sizes bigger first and smaller afterward
	public void Construction(){
		
		
		System.out.println();
		System.out.println("The order of construction is as follows :");
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Stack<Integer> tempStack = new Stack<>();
		Stack<Integer> tempoftempstack =new Stack<>();
		
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Day " + (i + 1));
			int floorOfTheDay = floorsSize[i];
			//System.out.print("floor of the day"+floorOfTheDay+"\n");
			
			int largestFloor = floorStack.peek();
			//System.out.println("largest floor"+largestFloor);
			
			if (floorOfTheDay != largestFloor) {
				tempStack.push(floorOfTheDay);
				System.out.println();
				//System.out.print("days"+(i+1)+" "+tempStack.peek());
			} 
			else {
				System.out.print(/*"day "+(i+1)+" "*/+floorStack.pop() + " ");
				
				while (!tempStack.isEmpty() ) {
					if(floorStack.peek()==tempStack.peek()){
					System.out.print(floorStack.pop() + " ");
					tempStack.pop();
					}else{
						temp.add(tempStack.peek());
						tempoftempstack.push(tempStack.peek());
					tempStack.pop();
				}
			}
					
			System.out.println();
		}
			
		}
		Collections.sort(temp,Collections.reverseOrder());
		System.out.print(temp);
		
		}
			

	
}
