package Part3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Occurrence {
	public static void main(String[] args) throws IOException {
		String[] arr = { ".\\data_1.txt", ".\\data_2.txt", ".\\data_3.txt" };
		main2(arr);
	}

	public static void main2(String[] args) throws IOException {
		File file = new File(".");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			String abPath = file.getAbsolutePath();
			abPath += args[i];
			BufferedReader reader = new BufferedReader(new FileReader(abPath));
			String answer;
			while ((answer = reader.readLine()) != null) {
				sb.append(answer);
			}
		}
		String[] splitString = sb.toString().split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < splitString.length; i++) {
			if (map.isEmpty()) {
				map.put(splitString[i], 1);
			} else {
				if (map.containsKey(splitString[i])) {
					int value = map.get(splitString[i]) + 1;
					map.put(splitString[i], value);
				} else {
					map.put(splitString[i], 1);
				}
			}
		}
		int max = 0;
		String answer = "";
		for (String key : map.keySet()) {
			int value = map.get(key);
			if(max < value) {
				answer = key;
				max = value;
			}
		}

		System.out.println(answer);
	}

}
