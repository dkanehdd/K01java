package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		
		
		try{
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("src/ex20io/friend_info.obj"));
			
			Friend[] friend = new Friend[100]; 
			int i=0;
			while(true) {
				
//				Friend friend2 = (Friend)in.readObject();
//				
//				friend2.showAllData();
				friend[i] = (Friend)in.readObject();
				//더이상 복원할 객체가 없다면 루프를 탈출한다.
				if(friend[i]==null) {
					break;
				}
				friend[i].showAllData();
				i++;
			}
			in.close();
		}
		catch (FileNotFoundException e) {}
		catch(ClassNotFoundException e) {}
		catch(IOException e) {}
		
	}

}
