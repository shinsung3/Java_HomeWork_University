import java.util.Arrays;
import java.util.List;

interface Command {
	// Takes a String[] that contains the initial data
	// and returns a String[] that contains the
	// data that results from executing a command
	String[] execute(String[] data);
}

public class CmdTool implements Command {
	public static void main(String[] args) {
		main2(new String[] { "-l", "sum", "sum","sum","sum","sum","sum", "3", "1", "2" });
//		CmdTool ct = new CmdTool();
//		String[] answer = ct.execute(args);
//		System.out.println(answer[0]);
//		System.out.println(Arrays.toString(answer));
	}

	public static void main2(String[] args) {
		CmdTool ct = new CmdTool();
		String[] answer = ct.execute(args);
		System.out.println(Arrays.toString(answer));
	}

	@Override
	public String[] execute(String[] data) {
		String[] answer = {};
		if (data[0].equals("sum")) {
			Sum sum = new Sum();
			answer = sum.execute(data);
		} else if (data[0].equals("product")) {
			Product product = new Product();
			answer = product.execute(data);
		} else if (data[0].equals("mean")) {
			Mean mean = new Mean();
			answer = mean.execute(data);
		} else if (data[0].equals("max")) {
			Max max = new Max();
			answer = max.execute(data);
		} else if (data[0].equals("min")) {
			Min min = new Min();
			answer = min.execute(data);
		} else if (data[0].equals("positive")) {
			Positive positive = new Positive();
			answer = positive.execute(data);
		} else if (data[0].equals("negative")) {
			Negative negative = new Negative();
			answer = negative.execute(data);
		} else if (data[0].equals("count")) {
			Count count = new Count();
			answer = count.execute(data);
		} else if (data[0].equals("greater")) {
			Greater greater = new Greater();
			answer = greater.execute(data);
		} else if (data[0].equals("lesser")) {
			Lesser lesser = new Lesser();
			answer = lesser.execute(data);
		} else if (data[0].equals("equal")) {
			Equal equal = new Equal();
			answer = equal.execute(data);
		} else if (data[0].equals("-l") || data[0].equals("-list")) {
			CmdList cmdList = new CmdList();
			answer = cmdList.execute(data);
		}
		return answer;
	}

}

class Sum implements Command {

	@Override
	public String[] execute(String[] data) {
		int sum = 0;
		if (data[0].equals("sum")) {
			if (data.length == 1) {
				return new String[] { "0" };
			} else {
				for (int i = 1; i < data.length; i++) {
					sum += Integer.parseInt(data[i]);
				}
			}
		}
		return new String[] { sum + "" };
	}
}

class Product implements Command {
	@Override
	public String[] execute(String[] data) {
		int product = 1;
		if (data[0].equals("product")) {
			if (data.length == 1) {
				return new String[] { "1" };
			} else {
				for (int i = 1; i < data.length; i++) {
					product *= Integer.parseInt(data[i]);
				}
			}
		}
		return new String[] { product + "" };
	}
}

class Mean implements Command {
	@Override
	public String[] execute(String[] data) {
		int mean = 0;
		double answer = 0.0;
		if (data[0].equals("mean")) {
			if (data.length == 1) {
				return new String[] { "0" };
			} else {
				for (int i = 1; i < data.length; i++) {
					mean += Integer.parseInt(data[i]);
				}
				answer = (double) mean / (double) (data.length - 1);
			}
		}
		return new String[] { answer + "" };
	}
}

class Max implements Command {
	@Override
	public String[] execute(String[] data) {
		int max = 0;
		if (data[0].equals("max")) {
			if (data.length == 1) {
				return new String[] {};
			} else {
				for (int i = 1; i < data.length; i++) {
					max = max < Integer.parseInt(data[i]) ? Integer.parseInt(data[i]) : max;
				}
			}
		}
		return new String[] { max + "" };
	}

}

class Min implements Command {
	@Override
	public String[] execute(String[] data) {
		int min = Integer.MAX_VALUE;
		if (data[0].equals("min")) {
			if (data.length == 1) {
				return new String[] {};
			} else {
				for (int i = 1; i < data.length; i++) {
					min = min > Integer.parseInt(data[i]) ? Integer.parseInt(data[i]) : min;
				}
			}
		}
		return new String[] { min + "" };
	}

}

class Positive implements Command {
	@Override
	public String[] execute(String[] data) {
		int cnt = 0;
		String positive[] = {};
		if (data[0].equals("positive")) {
			for (int i = 1; i < data.length; i++) {
				if (Integer.parseInt(data[i]) > 0) {
					cnt++;
				}
			}
			int idx = 0;
			positive = new String[cnt];
			for (int i = 1; i < data.length; i++) {
				if (Integer.parseInt(data[i]) > 0) {
					positive[idx] = data[i];
					idx++;
				}
			}
		}
		return positive;
	}

}

class Negative implements Command {

	@Override
	public String[] execute(String[] data) {
		int cnt = 0;
		String negative[] = {};
		if (data[0].equals("negative")) {
			for (int i = 1; i < data.length; i++) {
				if (Integer.parseInt(data[i]) < 0) {
					cnt++;
				}
			}
			int idx = 0;
			negative = new String[cnt];
			for (int i = 1; i < data.length; i++) {
				if (Integer.parseInt(data[i]) < 0) {
					negative[idx] = data[i];
					idx++;
				}
			}
		}
		return negative;
	}
}

class Count implements Command {

	@Override
	public String[] execute(String[] data) {
		// TODO Auto-generated method stub
		int count = data.length - 1;
		return new String[] { count + "" };
	}

}

class Greater implements Command {

	@Override
	public String[] execute(String[] data) {
		int cnt = 0;
		String[] greaterArray = {};
		if (data[0].equals("greater")) {
			int greater = Integer.parseInt(data[1]);

			for (int i = 2; i < data.length; i++) {
				if (greater < Integer.parseInt(data[i])) {
					cnt++;
				}
			}
			greaterArray = new String[cnt];
			int idx = 0;
			for (int i = 2; i < data.length; i++) {
				if (greater < Integer.parseInt(data[i])) {
					greaterArray[idx] = data[i];
					idx++;
				}
			}
		}
		return greaterArray;
	}

}

class Lesser implements Command {

	@Override
	public String[] execute(String[] data) {
		int cnt = 0;
		String[] lesserArray = {};
		if (data[0].equals("lesser")) {
			int lesser = Integer.parseInt(data[1]);

			for (int i = 2; i < data.length; i++) {
				if (lesser > Integer.parseInt(data[i])) {
					cnt++;
				}
			}
			lesserArray = new String[cnt];
			int idx = 0;
			for (int i = 2; i < data.length; i++) {
				if (lesser > Integer.parseInt(data[i])) {
					lesserArray[idx] = data[i];
					idx++;
				}
			}
		}
		return lesserArray;
	}

}

class Equal implements Command {

	@Override
	public String[] execute(String[] data) {
		int cnt = 0;
		String[] equalArray = {};
		if (data[0].equals("equal")) {
			int equal = Integer.parseInt(data[1]);

			for (int i = 2; i < data.length; i++) {
				if (equal == Integer.parseInt(data[i])) {
					cnt++;
				}
			}
			equalArray = new String[cnt];
			int idx = 0;
			for (int i = 2; i < data.length; i++) {
				if (equal == Integer.parseInt(data[i])) {
					equalArray[idx] = data[i];
					idx++;
				}
			}
		}
		return equalArray;
	}

}

class CmdList implements Command {
	Command[] command;

	public CmdList() {
	}

	public CmdList(Command[] command) {
		this.command = command;
	}

	@Override
	public String[] execute(String[] data) {
		this.command = processCmdList(data);
		int countCmds = countCmds(data);
		String[] answer = {};
		String[] processCmdDataIsNull = processCmdData(data);
		int cnt = 0;
		for (int i = 0; i < processCmdDataIsNull.length; i++) {
			if (processCmdDataIsNull[i] != null) {
				cnt++;
			}
		}
		String[] processCmdData = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			processCmdData[i] = processCmdDataIsNull[i];
		}
		String[] processCmdDataCopy = new String[processCmdData.length + 1];
		int idx = 1;
		for (int i = 0; i < countCmds; i++) {
			boolean flag = false;
			for (int j = 0; j < processCmdData.length; j++) {
				if (j == 0) {
					if (data[idx].equals("greater") || data[idx].equals("lesser") || data[idx].equals("equal")) {
						flag = true;
						processCmdDataCopy = new String[processCmdData.length + 2];
					}
					if (flag) {
						processCmdDataCopy[0] = data[idx];
						idx++;
						processCmdDataCopy[1] = data[idx];
						idx++;
					} else {
						processCmdDataCopy[0] = data[idx];
						idx++;
					}
				}
				if (flag) {
					processCmdDataCopy[j + 2] = processCmdData[j];
				} else {
					processCmdDataCopy[j + 1] = processCmdData[j];
				}
			}
			answer = command[i].execute(processCmdDataCopy);
			processCmdData = answer;
			processCmdDataCopy = new String[processCmdData.length + 1];
		}
		return answer;
	}

	public Command[] processCmdList(String[] data) {
		Command[] command = new Command[countCmds(data)];
		int idx = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i].equals("sum")) {
				command[idx] = new Sum();
			} else if (data[i].equals("product")) {
				command[idx] = new Product();
			} else if (data[i].equals("mean")) {
				command[idx] = new Mean();
			} else if (data[i].equals("max")) {
				command[idx] = new Max();
			} else if (data[i].equals("min")) {
				command[idx] = new Min();
			} else if (data[i].equals("positive")) {
				command[idx] = new Positive();
			} else if (data[i].equals("negative")) {
				command[idx] = new Negative();
			} else if (data[i].equals("count")) {
				command[idx] = new Count();
			} else if (data[i].equals("greater")) {
				command[idx] = new Greater();
			} else if (data[i].equals("lesser")) {
				command[idx] = new Lesser();
			} else if (data[i].equals("equal")) {
				command[idx] = new Equal();
			}
			idx++;
		}
		return command;
	}

	// Returns the number of command options on the command line
	int countCmds(String[] data) {
		int countcmds = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i].equals("sum")) {
				countcmds++;
			} else if (data[i].equals("product")) {
				countcmds++;
			} else if (data[i].equals("mean")) {
				countcmds++;
			} else if (data[i].equals("max")) {
				countcmds++;
			} else if (data[i].equals("min")) {
				countcmds++;
			} else if (data[i].equals("positive")) {
				countcmds++;
			} else if (data[i].equals("negative")) {
				countcmds++;
			} else if (data[i].equals("count")) {
				countcmds++;
			} else if (data[i].equals("greater")) {
				countcmds++;
			} else if (data[i].equals("lesser")) {
				countcmds++;
			} else if (data[i].equals("equal")) {
				countcmds++;
			}
		}
		return countcmds;
	}

	// Returns a String[] containing only the integer data
	String[] processCmdData(String[] data) {
		String[] cmdData = new String[data.length - 1 - countCmds(data)];
		int idx = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i].equals("sum")) {
				continue;
			} else if (data[i].equals("product")) {
				continue;
			} else if (data[i].equals("mean")) {
				continue;
			} else if (data[i].equals("max")) {
				continue;
			} else if (data[i].equals("min")) {
				continue;
			} else if (data[i].equals("positive")) {
				continue;
			} else if (data[i].equals("negative")) {
				continue;
			} else if (data[i].equals("count")) {
				continue;
			} else if (data[i].equals("greater")) {
				i++;
			} else if (data[i].equals("lesser")) {
				i++;
			} else if (data[i].equals("equal")) {
				i++;
			} else {
				cmdData[idx] = data[i];
				idx++;
			}
		}
		return cmdData;
	}
}