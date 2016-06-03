package br.com.gatto.chapter1;

//import java.util.*;
//import static java.util.Collections.*;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
	public List<String> copyAndSortList(List<String> original) {
		List<String> list = new ArrayList<>(original);
		sort(list);
		return list;
	}
}
