package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		//원하는 위치에 값 추가
		list.add(1, "css");
		
		//리스트의 크기
		System.out.println(list.size());
		
		
		System.out.println(list);
		
		//리스트에 해당 인덱스로 값 찾기
		String subject = list.get(2);
		System.out.println(subject);
		//리스트에서 값을 통해 인덱스 찾기
		int findIndex = list.indexOf("python");
		System.out.println("python 위치: " + findIndex);
		
		//값 수정
		list.set(1, "java");
		System.out.println(list);
		
		//해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("C");
		
		boolean contains = list.contains("java");
		System.out.println(contains);
		
		boolean containsAll = list.containsAll(tempList);
		System.out.println(containsAll);
		
		//다른 컬렉션의 데이터(요소) 추가
		list.addAll(tempList);
		System.out.println(list);
		
		//삭제
		list.remove("python");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.addAll(tempList);
		System.out.println(list);
		
		System.out.println();
		list.removeAll(tempList);
		System.out.println(list);
		
		list.addAll(tempList);
		System.out.println(list);
		
		list.retainAll(tempList);
		System.out.println(list);
		
		//리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
		//리스트 전체 비우기
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		//리스트에 배열 넣기
		String[] strs = {"java", "python", "C", "html"};
		
		List<String> asList = Arrays.asList(strs);
		list.addAll(asList);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		// foreach
		for(String str : list) {
			System.out.println(str);
		}
		
		
		
	}

}
