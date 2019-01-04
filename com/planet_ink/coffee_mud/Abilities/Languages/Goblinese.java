package com.planet_ink.coffee_mud.Abilities.Languages;
import com.planet_ink.coffee_mud.core.interfaces.*;
import com.planet_ink.coffee_mud.core.*;
import com.planet_ink.coffee_mud.core.collections.*;
import com.planet_ink.coffee_mud.Abilities.interfaces.*;
import com.planet_ink.coffee_mud.Areas.interfaces.*;
import com.planet_ink.coffee_mud.Behaviors.interfaces.*;
import com.planet_ink.coffee_mud.CharClasses.interfaces.*;
import com.planet_ink.coffee_mud.Commands.interfaces.*;
import com.planet_ink.coffee_mud.Common.interfaces.*;
import com.planet_ink.coffee_mud.Exits.interfaces.*;
import com.planet_ink.coffee_mud.Items.interfaces.*;
import com.planet_ink.coffee_mud.Libraries.interfaces.*;
import com.planet_ink.coffee_mud.Locales.interfaces.*;
import com.planet_ink.coffee_mud.MOBS.interfaces.*;
import com.planet_ink.coffee_mud.Races.interfaces.*;

import java.util.*;

/*
   Copyright 2004-2019 Bo Zimmerman

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
public class Goblinese extends StdLanguage
{
	@Override
	public String ID()
	{
		return "Goblinese";
	}

	private final static String localizedName = CMLib.lang().L("Goblinese");

	@Override
	public String name()
	{
		return localizedName;
	}

	public static List<String[]> wordLists=null;
	public Goblinese()
	{
		super();
	}

	@Override
	public List<String[]> translationLists(final String language)
	{
		if(wordLists==null)
		{
			final String[] one={"i","klpt","ih","g"};
			final String[] two={"te","il","ag","go"};
			final String[] three={"nik","rem","tit","nip","pop","pon","ipi","wip","pec"};
			final String[] four={"perp","merp","nerp","pein","noog","gobo","koer","werp","terp","tert","grlt","Jrl","gran","kert"};
			final String[] five={"whamb","thwam","nipgo","pungo","upoin","krepe","tungo","pongo","twang","hrgap","splt","krnch","baam","poww"};
			final String[] six={"tawthak","krsplt","palpep","poopoo","dungdung","owwie","greepnak","tengak","grnoc","pisspiss","phlyyytt","plllb","hrangnok","ticktick","nurang"};
			wordLists=new Vector<String[]>();
			wordLists.add(one);
			wordLists.add(two);
			wordLists.add(three);
			wordLists.add(four);
			wordLists.add(five);
			wordLists.add(six);
		}
		return wordLists;
	}

	private static final Hashtable<String,String> hashwords=new Hashtable<String,String>();

	@Override
	public Map<String, String> translationHash(final String language)
	{
		if((hashwords!=null)&&(hashwords.size()>0))
			return hashwords;
		hashwords.put("0","di");
		hashwords.put("A","ah");
		hashwords.put("ABLE","gafnahkk");
		hashwords.put("ABOUT","bah");
		hashwords.put("ABOVE","hat");
		hashwords.put("ACCORDING","gi");
		hashwords.put("AGAIN","vi");
		hashwords.put("AGREE","yoess");
		hashwords.put("ALIVE","gongki");
		hashwords.put("ALL","jay");
		hashwords.put("ALRIGHT","yoess");
		hashwords.put("RIGHT","yoess");
		hashwords.put("ALLIANCE","zmat'him");
		hashwords.put("ALLY","zmat");
		hashwords.put("ALONGSIDE","kho");
		hashwords.put("ALSO","dok");
		hashwords.put("AM","ko");
		hashwords.put("AND","tw");
		hashwords.put("ANIMAL","achi");
		hashwords.put("ANYONE","chay");
		hashwords.put("ANYTHING","chez");
		hashwords.put("APPRENTICE","podri");
		hashwords.put("ARE","ko");
		hashwords.put("AREA","rrey");
		hashwords.put("AS","gon");
		hashwords.put("ASK","banrahk");
		hashwords.put("ASSIST","pod");
		hashwords.put("ASSISTANCE","podum");
		hashwords.put("ASSISTANT","podri");
		hashwords.put("AT","hm");
		hashwords.put("BACK","let");
		hashwords.put("BAD","neo");
		hashwords.put("BATTLE","znavo");
		hashwords.put("BAY","relah");
		hashwords.put("BE","kok");
		hashwords.put("BEAST","achi");
		hashwords.put("BECAUSE","ckhw");
		hashwords.put("BECOME","kok");
		hashwords.put("BEFRIEND","zmat");
		hashwords.put("BEGIN","plint");
		hashwords.put("BEGINNING","plin");
		hashwords.put("BEHIND","let");
		hashwords.put("BELOW","get");
		hashwords.put("BENEATH","get");
		hashwords.put("BIG","loakh");
		hashwords.put("BLACK","eske");
		hashwords.put("BLEED","gurr");
		hashwords.put("BLOOD","gurrde");
		hashwords.put("BLUE","meh");
		hashwords.put("BOTTOM","get");
		hashwords.put("BRIGHT","epli");
		hashwords.put("BROTHER","kokihn");
		hashwords.put("BROWN","ikm");
		hashwords.put("BUT","vw");
		hashwords.put("BY","gi");
		hashwords.put("BYE","dzo");
		hashwords.put("CAN","gafnahkk");
		hashwords.put("CAST","uvoj");
		hashwords.put("CHIEF","kore");
		hashwords.put("COME","ling");
		hashwords.put("RETURN","umkloer");
		hashwords.put("COMMON","mantan");
		hashwords.put("TONGUE","mantan");
		hashwords.put("COMPLICATED","efichi");
		hashwords.put("CONCEDE","yoess");
		hashwords.put("CONCEPT","ezo");
		hashwords.put("CURE","vuor");
		hashwords.put("CURIOUS","blomgreh");
		hashwords.put("DARK","eske");
		hashwords.put("DARKNESS","eske");
		hashwords.put("DAUGHTER","getrihn");
		hashwords.put("DAY","hn");
		hashwords.put("DEAD","kurri");
		hashwords.put("DEATH","kurrte");
		hashwords.put("DEEP","legin");
		hashwords.put("DIE","kurr");
		hashwords.put("DIFFICULT","efichi");
		hashwords.put("DIRECT","noreyg");
		hashwords.put("DIRT","shikm");
		hashwords.put("DISCOVER","kurflig");
		hashwords.put("DO","uft");
		hashwords.put("DWARF","dahrfw");
		hashwords.put("EASY","imshi");
		hashwords.put("EAT","chip");
		hashwords.put("ELF","elfw");
		hashwords.put("END","skeh");
		hashwords.put("ENEMY","neot'h");
		hashwords.put("ENJOY","gyur");
		hashwords.put("ENTER","ling");
		hashwords.put("ENTRANCE","lin");
		hashwords.put("ENTRUST","obranyuj");
		hashwords.put("EVERYONE","jay");
		hashwords.put("EVERYTHING","jez");
		hashwords.put("EXIT","keh");
		hashwords.put("FAERY","feyri");
		hashwords.put("FAIL","poep");
		hashwords.put("FAR","eysah");
		hashwords.put("FAT","nerri");
		hashwords.put("FATHER","hatkihn");
		hashwords.put("FAVOR","rekyom");
		hashwords.put("FEATHER","pwm");
		hashwords.put("FEMALE","rihn");
		hashwords.put("FIGHT","znav");
		hashwords.put("FIND","kurflig");
		hashwords.put("FINISH","sket");
		hashwords.put("FIRE","ikh");
		hashwords.put("FIX","yokok");
		hashwords.put("FOLLOW","podr");
		hashwords.put("FOLLOWER","podri");
		hashwords.put("FOOD","chipo");
		hashwords.put("FOR","cho");
		hashwords.put("FORGET","nrvidoj");
		hashwords.put("FORWARD","lit");
		hashwords.put("FREE","jihf");
		hashwords.put("FREEDOM","jihfo");
		hashwords.put("FRIEND","zmat'h");
		hashwords.put("FRIENDSHIP","zmat'him");
		hashwords.put("FROM","che");
		hashwords.put("FRONT","lit");
		hashwords.put("FULFILL","ghrakh");
		hashwords.put("FULFILLED","ghrakh");
		hashwords.put("FULL","meyrlin");
		hashwords.put("GET","tuhg");
		hashwords.put("GIFT","tuh");
		hashwords.put("GIVE","tuhv");
		hashwords.put("GO","loer");
		hashwords.put("GOBLIN","goblin");
		hashwords.put("GOBLINESE","goblintan");
		hashwords.put("GOING","po");
		hashwords.put("GOOD","yoe");
		hashwords.put("EVENING","hayke");
		hashwords.put("MORNING","hayli");
		hashwords.put("MIDNIGHT","dzoke");
		hashwords.put("GOODBYE","dzojo");
		hashwords.put("GRAY","pliske");
		hashwords.put("GREEN","epo");
		hashwords.put("GREMLIN","grihm");
		hashwords.put("GROUND","shah");
		hashwords.put("GUARD","ckhut");
		hashwords.put("GUARDIAN","ckhuttro");
		hashwords.put("GUIDE","norey");
		hashwords.put("HAPPY","ashi");
		hashwords.put("HARD","efichi");
		hashwords.put("HAS","ko");
		hashwords.put("HAVE","uk");
		hashwords.put("HE","kah");
		hashwords.put("HEAL","vuor");
		hashwords.put("HELLO","hay");
		hashwords.put("PLEASED","hayay");
		hashwords.put("MEET","hayay");
		hashwords.put("HELP","pod");
		hashwords.put("HELPER","podri");
		hashwords.put("HER","rah");
		hashwords.put("HERE","me");
		hashwords.put("HEY","hay");
		hashwords.put("HI","hay");
		hashwords.put("HIM","kah");
		hashwords.put("HIS","kahif");
		hashwords.put("HOBGOBLIN","hoblin");
		hashwords.put("HOW","fw");
		hashwords.put("HOWEVER","vw");
		hashwords.put("HUMAN","man");
		hashwords.put("SPEECH","mantan");
		hashwords.put("HUSBAND","kihnkahn");
		hashwords.put("I","ngah");
		hashwords.put("APOLOGIZE","jahsht");
		hashwords.put("SORRY","jahsht");
		hashwords.put("IF","lun");
		hashwords.put("IMP","ihm");
		hashwords.put("IN","wm");
		hashwords.put("INSTRUCT","tuhdoch");
		hashwords.put("INSTRUCTOR","tuhdoche");
		hashwords.put("INTRUDE","jrach");
		hashwords.put("INTRUDER","jrachw");
		hashwords.put("IS","ko");
		hashwords.put("IT","ez");
		hashwords.put("ITS","ezif");
		hashwords.put("JESTER","speyah");
		hashwords.put("JOKESTER","speyah");
		hashwords.put("KNOW","doj");
		hashwords.put("KOBOLD","achilin");
		hashwords.put("LAKE","relah");
		hashwords.put("LANGUAGE","tan");
		hashwords.put("LARGE","loakh");
		hashwords.put("LEAD","noreyg");
		hashwords.put("LEADER","kore");
		hashwords.put("LEARN","port");
		hashwords.put("LEARNER","port'h");
		hashwords.put("LEAVE","keng");
		hashwords.put("LESS","get");
		hashwords.put("LIFE","gongko");
		hashwords.put("LIGHT","epli");
		hashwords.put("LIKE","gon");
		hashwords.put("LIQUID","leyfah");
		hashwords.put("LIVE","gongk");
		hashwords.put("LIVING","gongki");
		hashwords.put("LONG","loakh");
		hashwords.put("AGO","eysah");
		hashwords.put("LOOK","jok");
		hashwords.put("LOOKS","turflig");
		hashwords.put("LOSE","kurfeckh");
		hashwords.put("LOTS","baso");
		hashwords.put("LOVE","gyurak");
		hashwords.put("MAGIC","uvojn");
		hashwords.put("MAGICAL","uvoji");
		hashwords.put("MAKE","neot");
		hashwords.put("MALE","kihn");
		hashwords.put("MARK","shtihk");
		hashwords.put("MASTER","norey");
		hashwords.put("ME","ngah");
		hashwords.put("MINE","ngahif");
		hashwords.put("MINERAL","tikm");
		hashwords.put("MISPLACE","kurfeckh");
		hashwords.put("MOON","meyre");
		hashwords.put("MORE","hat");
		hashwords.put("MOTHER","hatrihn");
		hashwords.put("MOUNTAIN","ikrro");
		hashwords.put("MUCH","baso");
		hashwords.put("MUD","rekm");
		hashwords.put("MUST","ckhiz");
		hashwords.put("MY","ngahif");
		hashwords.put("MYSTICAL","uvoji");
		hashwords.put("NEED","ckhiz");
		hashwords.put("NIGHT","meske");
		hashwords.put("NO","nah");
		hashwords.put("NOBODY","di");
		hashwords.put("NOONE","di");
		hashwords.put("NOSY","blomgreh");
		hashwords.put("NOT","nr");
		hashwords.put("NOTHING","di");
		hashwords.put("NOW","koy");
		hashwords.put("NUMBER","doh");
		hashwords.put("OBJECT","ezo");
		hashwords.put("OCEAN","relahle");
		hashwords.put("CARES","nyah");
		hashwords.put("OF","o");
		hashwords.put("OGRE","ogrh");
		hashwords.put("OKAY","yoess");
		hashwords.put("ON","am");
		hashwords.put("ONCE","vi");
		hashwords.put("BILLION","trw");
		hashwords.put("HUNDRED","toy");
		hashwords.put("MILLION","tri");
		hashwords.put("THOUSAND","tro");
		hashwords.put("OR","lw");
		hashwords.put("ORANGE","igh");
		hashwords.put("ORC","orkh");
		hashwords.put("OUR","jadif");
		hashwords.put("OVER","bah");
		hashwords.put("OWN","uk");
		hashwords.put("PLACE","rrey");
		hashwords.put("PLANT","ngepo");
		hashwords.put("PLEASE","tiki");
		hashwords.put("PLUME","pwm");
		hashwords.put("POND","relah");
		hashwords.put("POSSESS","uk");
		hashwords.put("POSSESSION","uktuh");
		hashwords.put("PRACTICE","gihspw");
		hashwords.put("PRESENT","tuh");
		hashwords.put("PRIZE","tyesui");
		hashwords.put("PROMISE","obranyu");
		hashwords.put("PROTECT","ckhut");
		hashwords.put("PURPLE","mede");
		hashwords.put("QUESTION","banrakh");
		hashwords.put("RECIEVE","tuhg");
		hashwords.put("RED","urde");
		hashwords.put("RELATE","gong");
		hashwords.put("RELATED","gong");
		hashwords.put("RELATION","gongah");
		hashwords.put("RELATIVE","gongah");
		hashwords.put("REMEMBER","vidoj");
		hashwords.put("REPAIR","yokok");
		hashwords.put("REPLACE","jepwov");
		hashwords.put("REPLACEMENT","jepwovw");
		hashwords.put("REQUEST","banrahk");
		hashwords.put("RESCUE","pod");
		hashwords.put("RESCUER","podri");
		hashwords.put("REWARD","tyesui");
		hashwords.put("RIVER","reloh");
		hashwords.put("ROCK","tikm");
		hashwords.put("RUN","reloh");
		hashwords.put("RUNNING","reloh");
		hashwords.put("SACRED","urpfah");
		hashwords.put("SAD","eckhi");
		hashwords.put("SAND","shikm");
		hashwords.put("SAVE","pod");
		hashwords.put("SEA","relahle");
		hashwords.put("SEARCH","turflig");
		hashwords.put("SECRET","urpfah");
		hashwords.put("SEE","jok");
		hashwords.put("SERIOUS","legin");
		hashwords.put("SHALL","po");
		hashwords.put("SHE","rah");
		hashwords.put("SHORT","loen");
		hashwords.put("SIDE","bit");
		hashwords.put("SIMPLE","imshi");
		hashwords.put("SIMULTANEOUSLY","kahnz");
		hashwords.put("SISTER","korihn");
		hashwords.put("SKINNY","zifti");
		hashwords.put("SKY","mey");
		hashwords.put("SLAVE","zruhg");
		hashwords.put("SMALL","loen");
		hashwords.put("SO","nw");
		hashwords.put("SOME","choy");
		hashwords.put("SOMEONE","chay");
		hashwords.put("SOMETHING","chez");
		hashwords.put("SON","getkihn");
		hashwords.put("SPEAK","tanz");
		hashwords.put("SPRING","reloh");
		hashwords.put("START","plint");
		hashwords.put("STREAK","shtihk");
		hashwords.put("STREAM","reloh");
		hashwords.put("STRIPE","shtihk");
		hashwords.put("STUDENT","port'h");
		hashwords.put("SUBSTITUTE","jepwov");
		hashwords.put("SUCCEED","poahp");
		hashwords.put("SUN","meykh");
		hashwords.put("SUNSET","meykeh");
		hashwords.put("SURISE","meykin");
		hashwords.put("SWAMP","rehao");
		hashwords.put("TAKE","tuhg");
		hashwords.put("TALK","tanz");
		hashwords.put("TALL","ngeyn");
		hashwords.put("TASK","rekyom");
		hashwords.put("TEACH","tuhdoch");
		hashwords.put("TEACHER","tuhdoche");
		hashwords.put("TEASE","speyak");
		hashwords.put("TELL","danz");
		hashwords.put("THANK","chiwkki");
		hashwords.put("THANKS","chiwkki");
		hashwords.put("THAT","ez");
		hashwords.put("THE","za");
		hashwords.put("EIGHT","wihn");
		hashwords.put("8","wihn");
		hashwords.put("FIVE","ye");
		hashwords.put("5","ye");
		hashwords.put("FOUR","hi");
		hashwords.put("4","hi");
		hashwords.put("NINE","yw");
		hashwords.put("9","yw");
		hashwords.put("ONE","o");
		hashwords.put("FIRST","oze");
		hashwords.put("SECOND","hoze");
		hashwords.put("THIRD","hoyze");
		hashwords.put("FOURTH","hize");
		hashwords.put("FIFTH","yeze");
		hashwords.put("SIXTH","yize");
		hashwords.put("SEVENTH","wize");
		hashwords.put("EIGHTH","wihnze");
		hashwords.put("NINETH","ywze");
		hashwords.put("TENTH","toze");
		hashwords.put("1","o");
		hashwords.put("SEVEN","wi");
		hashwords.put("7","wi");
		hashwords.put("SIX","yi");
		hashwords.put("6","yi");
		hashwords.put("TEN","to");
		hashwords.put("10","to");
		hashwords.put("THREE","hoy");
		hashwords.put("3","hoy");
		hashwords.put("TWO","ho");
		hashwords.put("2","ho");
		hashwords.put("THEIR","jedif");
		hashwords.put("THEM","jed");
		hashwords.put("THEN","noy");
		hashwords.put("THERE","mi");
		hashwords.put("THEREFORE","nw");
		hashwords.put("THESE","ne");
		hashwords.put("THEY","jed");
		hashwords.put("THIN","zifti");
		hashwords.put("THING","ezo");
		hashwords.put("THIS","e");
		hashwords.put("THOSE","ni");
		hashwords.put("TIME","oy");
		hashwords.put("TO","cho");
		hashwords.put("TODAY","koyn");
		hashwords.put("TOGETHER","kahnz");
		hashwords.put("TOMORROW","poyn");
		hashwords.put("TOO","dok");
		hashwords.put("TOP","hat");
		hashwords.put("TREAT","vuor");
		hashwords.put("TREE","ngeyn");
		hashwords.put("TRESPASS","jrach");
		hashwords.put("TRESPASSER","jrachw");
		hashwords.put("TROLL","trolo");
		hashwords.put("UNCOMPLICATED","imshi");
		hashwords.put("UNDER","get");
		hashwords.put("UNLESS","vw");
		hashwords.put("US","jad");
		hashwords.put("USE","ghrakh");
		hashwords.put("USED","ghrakh");
		hashwords.put("VERY","baso");
		hashwords.put("VIOLENT","znavo");
		hashwords.put("VIOLENCE","znavo");
		hashwords.put("VITALITIY","gongko");
		hashwords.put("WANT","kiz");
		hashwords.put("WAR","znavo");
		hashwords.put("WAS","no");
		hashwords.put("WATCH","jok");
		hashwords.put("WATER","reh");
		hashwords.put("WE","jad");
		hashwords.put("WELCOME","chiwkkshah");
		hashwords.put("WERE","no");
		hashwords.put("WHAT","fe");
		hashwords.put("WHATEVER","nyah");
		hashwords.put("WHEN","foy");
		hashwords.put("WHERE","fey");
		hashwords.put("WHICH","yr");
		hashwords.put("WHITE","epli");
		hashwords.put("WHO","fah");
		hashwords.put("WHY","fi");
		hashwords.put("WIDE","nerri");
		hashwords.put("WIFE","rihnkahn");
		hashwords.put("WILL","po");
		hashwords.put("WIN","poahp");
		hashwords.put("WITH","kho");
		hashwords.put("WITHOUT","konr");
		hashwords.put("WORK","zruhg");
		hashwords.put("YELLOW","ekh");
		hashwords.put("YES","yah");
		hashwords.put("YESTERDAY","noyn");
		hashwords.put("YET","vw");
		hashwords.put("YOU","so");
		hashwords.put("YALL","joth");
		hashwords.put("Y`ALL","joth");
		hashwords.put("YOUR","soif");
		return hashwords;
	}
}
