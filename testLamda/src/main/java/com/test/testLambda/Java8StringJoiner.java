package com.test.testLambda;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Java8StringJoiner {
	public static void main(String[] args) {
		
		System.out.println("___Java8 StringJoiner___");
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		
		String result = sj.toString();
		System.out.println(result);
		//aaa,bbb,ccc
		
		sj = new StringJoiner("/", "prefix-", "-suffix");
		sj.add("2016");
		sj.add("02");
		sj.add("26");
		result = sj.toString();
		System.out.println(result);
		//prefix-2016/02/26-suffix
		
		result = String.join("-", "2015", "10", "31");
		System.out.println(result);
		//2015-10-31
		
		System.out.println("___String .join()___");		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		result = String.join(",", list);
		System.out.println(result);		
		//java,python,nodejs,ruby
		
		System.out.println("___Java8 Stream & Collectors___");
		System.out.println(list.stream().map(s->s).collect(Collectors.joining("|")));
		//java|python|nodejs|ruby
		
		List<Game> gameList = Arrays.asList(
                new Java8StringJoiner().new Game("Dragon Blaze", 5),
                new Java8StringJoiner().new Game("Angry Bird", 5),
                new Java8StringJoiner().new Game("Candy Crush", 5)
        );
		System.out.println(gameList.stream().map(x->x.getName()).collect(Collectors.joining(",", "{", "}")));
		//{Dragon Blaze,Angry Bird,Candy Crush}

	}
	
    class Game{
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }
}
