package Project;



import java.io.*;



public class SinglyLinkedList
{
Node head;//headoflist
static class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
//Methodtoinsertanewnode
public static SinglyLinkedList insert(SinglyLinkedList list,int data)
{
//Create a new node with given data
Node new_node=new Node(data);
new_node.next=null;
//If the LinkedList is empty,then make the new node as head
if(list.head==null)
{
list.head=new_node;
}
else
{
//Else traverse till the last node and insert the new_node
 
Node last = list.head;
while(last.next!=null)
{
last=last.next;
}
//Insertthenew_nodeatlastnode
last.next=new_node;
}
return list;
}
public static void printList(SinglyLinkedList list)
{
Node currNode=list.head;
System.out.print("LinkedList:");
//TraversethroughtheLinkedList
while(currNode!=null)
{
//Print the data at current node
System.out.print(currNode.data+"");
//Gotonextnode
currNode=currNode.next;
}
System.out.println();
}
//MethodtodeleteanodeintheLinkedListbyKEY
public static SinglyLinkedList deleteByKey(SinglyLinkedList list,int key)
{
//Store head node
Node currNode=list.head,prev=null;
if(currNode!=null&&currNode.data==key)
{
list.head=currNode.next;//Changed head
System.out.println(key+"found and deleted");
return list;
}
while(currNode!=null&&currNode.data!=key)
{
prev=currNode;
currNode=currNode.next;
}
if(currNode!=null)
{
prev.next=currNode.next;
System.out.println(key+"found and deleted");
}
if(currNode==null)
{
System.out.println(key+"not found");
}
return list;
}
//methodtocreateaSinglylinkedlistwithnnodes
public static void main(String[]args)
{
/*Startwiththeemptylist.*/
	SinglyLinkedList list=new SinglyLinkedList();
//Insertthevalues
list=insert(list,1);
list=insert(list,2);
list=insert(list,3);
list=insert(list,4);
list=insert(list,5);
list=insert(list,6);
list=insert(list,7);
list=insert(list,8);
//PrinttheLinkedList
printList(list);
//Deletenodewithvalue1
deleteByKey(list,1);
//PrinttheLinkedList
printList(list);
//Deletenodewithvalue4
deleteByKey(list,4);
//PrinttheLinkedList
printList(list);
//Deletenodewithvalue10
deleteByKey(list,10);
//PrinttheLinkedList
printList(list);
}
}