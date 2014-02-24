package myRPG;

/*
To play this game, add this file to the source and change the target to "myRPG"
It is easiers to play with the Num Keys so make sure your Num Lock is on
and if you didnt see it yet: 8=Up, 5=Down, 4=Left, 6=RIght 
and yes....you have to click enter after everything....

Credits goes to: [Jonathan Truong] and [John Nguyen] 
myRPG (current version):   VERSION .09

--------------------------------History-------------------------------------
myRPG:   VERSION .09

---------- Whats NEW:
-fix lots of glitches
-zakum gets stronger now when you kill it
-if kill zakum several times, then weapon get stronger
-changed a monster's name...

---------- Whats Next:
-maybe limit breaker
-new magic
-secret place?

----------------------------------------------------------------------------
myRPG:   VERSION .08

---------- Whats NEW:
-FINAL BOSS FIGHT RELEASED!
-2 new monster
-boss's armor and weapon
-new map
-fix glitches
-YAY CODE REACHED 5000 lines

---------- Whats Next:
-who knows
-maybe secret place? o_O

----------------------------------------------------------------------------
myRPG:   VERSION .07

---------- Whats NEW:
-fix some glitches
-new map!!!
-new monster!!
-new boss fight!
-new quest!
-new town!
-new weapon/armor!!!
-new abilitys(can learn heal now if finish quest)

---------- Whats Next:
-new map and new monster 

----------------------------------------------------------------------------
myRPG:   VERSION .06

---------- Whats NEW:
-when you click enter now without writing anything, the game will not break =)
-chopsticks is now a secret weapon
-new quest to get a new sword= starts after killing Baoswer
-fixed the enter(YAY!)

---------- Whats Next:
-i just dont know -_-

----------------------------------------------------------------------------
myRPG:   VERSION .05

---------- Whats NEW:
-now has a new map on the left with stronger monster!
-there is now MP with some attacking skill
-can unlock new skills every 5 level
-mp increases by 10% every time you make an attack or walk on map
-fix some more map glitch

---------- Whats Next:
-new map with hopefully another quest
-new monster/item
-more skills

----------------------------------------------------------------------------
myRPG:   VERSION .04

---------- Whats NEW:
-I had nerfed all the weapon = you start off really weak now
-new boss fight(dont bother to fight if your weak with no proper equips)
-secret item in the game(strong weapon!)
-new place in map 2!
-the 2nd map glitch had been fixed
-item store now sell weapons and armors!!!!(when bought, they replace your current)
-new quest starts in town with trader (rewards are nice =])
-monsters now have a 10% of dropping potion
-when you die, you lose 1/2 your gold now
-you can now have status alliment: burned(lose 5 hp per turn)
-there is now Hi-Potion(heal 50 HP)
-start off with one Hi-Potion
-new look in inventory and shop
-there is now a key item slot in inventory
-LVL UP! sign is now near your name when you level
-weapon and armor slots are no longer fixed
-there is now fixed talking(you cant choose what you or other say)


---------- Whats Next:
-another map with new monster(hopefully not animals/vegatables)-_-"
-another town
-more quest/items/equips
-more fixing bugs/errors

----------------------------------------------------------------------------
myRPG:   VERSION .03

---------- Whats NEW:
-new portal ( new monster : pumpkin n bear)
-inventory has been edited a little
-the item shop has been modified too to show amount of gold + potion
-when die, hp becomes half of max

---------- Whats Next:
-new stuff in new portal (maybe quest)
-more stuff town
-and maybe even a boss Baoser!! -_-''

----------------------------------------------------------------------------
myRPG:   VERSION .02

---------- Whats NEW:
-map
-monster

---------- Whats Next:
-portal?

----------------------------------------------------------------------------
myRPG:   VERSION .01

---------- Whats NEW:
-YAY PROJECT STARTED ON Nov. 14, 2006

---------- Whats Next:
-stuff i guess...

--------------------------------History-------------------------------------

*/

import java.io.*;

class Communicator
{
	String ign;
	String map="0";
	String battle;
	String item;
	String sp;
	String Move;
	String buy;
	String mp;
	String chopstick;
	String play;
	
	public void setMove() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		Move = input.readLine();
	}
	
	public String getMove()
	{
		return Move;
	}
	
	public void setchopstick() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		chopstick = input.readLine();
	}
	
	public String getchopstick()
	{
		return chopstick;
	}
	
	public void setName() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		ign = input.readLine();
	}
	
	public String getName()
	{
		return ign;
	}
	
	public void setMap() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		map = input.readLine();
	}
	
	public String getMap()
	{
		return map;
	}
	
	public void setBattle() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		battle = input.readLine();
	}
	
	public String getBattle()
	{
		return battle;
	}
	
	public void setItem() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		item = input.readLine();
	}
	
	public String getItem()
	{
		return item;
	}

	public void setPoint() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		sp = input.readLine();
	}
		
	public String getPoint()
	{
		return sp;
	}
	
	public void setbuy() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		buy = input.readLine();
	}
		
	public String getbuy()
	{
		return buy;
	} 
	
	public void setPlay() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		play = input.readLine();
	}
		
	public String getPlay()
	{
		return play;
	} 

	public void setmp() throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		mp = input.readLine();
	}
		
	public String getmp()
	{
		return mp;
	} 
}

public class myRPG
{
	public static void main (String argv[]) throws IOException
	{
		int level=1;
		float myhp;
		float maxhp;
		float randatk=0;
		int randmon;
		float randmonatk=0;
		int myatk=0;
		int monatk=0;
		String monster="a";
		float monhp=1;
		float monmaxhp=1;
		int mongold=0;
		int monexp=0;
		int mygold=0;
		float myexp=0;
		float needexp=level*10;
		String train1="a";
		String train2="b";
		int potion=2;
		int hipotion=1;
		int randflee;
		String weapon="Wooden Sword";
		int sword=10;
		int tinsword=11;
		int coppersword=13;
		int bronzesword=15;
		int ironsword=20;
		int baosword=25;
		int atk=sword;
		String armor="Tattered Clothes";
		int clothes=3;
		int tincloth=4;
		int bronzecloth=7;
		int mail=clothes;
		int point=0;
		int str=10;
		int def=7;
		int randommon;
		int Start=1;
		int chart=0;
		int burn=0;
		int tail=0;
		int countTrader=0;
		int randomitem;
		float mymp;
		float maxmp;
		int skillcounter=0;
		int mpcounter=0;
		int ChopStickPower=0;
		int encounter=0;
		int BAO=0;
		int ginseng=0;
		int ginsengx=0;
		int ginsengCounter=0;
		int cure=0;
		int ZakumCounter=0;
		
		String skill=" ";
		String SATK= " ";
		String counterLVL=" ";
		String HealthBar="[||||||||||]";
		String MPBar="[||||||||||]";
		String MonBar="[||||||||||]";
		String ExpBar="[||||||||||]";
		
		Communicator com=new Communicator();
		
		for(int in=0 ;in<25;in++)
		System.out.println();
		System.out.println("                                      _|_|_|    _|_|_|      _|_|_|  ");
		System.out.println("            _|_|_|  _|_|    _|    _|  _|    _|  _|    _|  _|       ");
		System.out.println("            _|    _|    _|  _|    _|  _|_|_|    _|_|_|    _|  _|_| ");
		System.out.println("            _|    _|    _|  _|    _|  _|    _|  _|        _|    _|");
		System.out.println("            _|    _|    _|    _|_|_|  _|    _|  _|          _|_|_|  ");
		System.out.println("                                  _|     ");
		System.out.println("                              _|_|    ");
		System.out.println("                         ");
		
		System.out.println("Welcome to myRPG: a text-based game");
		System.out.println("1.Play 2.Instructions");
		com.setPlay();
		
		if (com.getPlay().equals("2"))
		{
			for(int in=0 ;in<25;in++)
				System.out.println();

			System.out.println("Instructions");
			System.out.println("---------------------------------");
			System.out.println("Press <Enter> after each entry");
			System.out.println("Press: ");
			System.out.println("8-move up");
			System.out.println("5-move down");
			System.out.println("4-move left");
			System.out.println("6-move right");
			System.out.println("The key will always be shown on the right of the map");
  			System.out.println("Start Playing!!!");
			System.out.println();
		}

		System.out.print("What will be your name? ");
		com.setName();
		
		for(int in=0 ;in<25;in++)
		System.out.println();
		
		int Hor=3;
		int Ver=1;
		
		myhp=level*20;
		maxhp=myhp;
		
		mymp= level*5;
		maxmp=mymp;
		
		String a = "O";
		String b = " ";
		String c = " ";
		String d = " ";
		String e = " ";
		String f = "O";
		String g = " ";
		String h = " ";
		String i = " ";
		String j = " ";
		String k = " ";
		String l = " ";
		String m = " ";
		String n = " ";
		String o = " ";
		String p = " ";
		String q = " ";
		String r = " ";
		String s = " ";
		String t = "T";
		String u = " ";
		String v = " ";
		String w = " ";
		String x = " ";
		String y = " ";
		String z = " ";
		String ab = " ";
		String ac = " ";
		String ad = " ";
		String ae = " ";
		String af = " ";
		String ag = " ";
		String ah = " ";
		String ai = " ";
		String aj = " ";
		String ak = " ";
		String al = " ";
		String am = " ";
		String an = "X";
		String ao = " ";
		String ap = " ";
		String aq = " ";
		
		while(Hor>0)
		{
			while(Start==1)
			{			
				if(mymp<maxmp)
				{
					mymp = mymp+maxmp/20 ;
	
					if(mymp>maxmp)
					{
						mymp=maxmp;
					}
				}
				
				if(weapon!="Pair of ChopSticks"||weapon!="ChopSticks Sword")
				{
					ChopStickPower=0;
				}
				
				if(myhp/maxhp==1)
				{
					HealthBar ="[||||||||||]";
				}
				if(myhp/maxhp>=.9&&myhp/maxhp<1)
				{
					HealthBar ="[||||||||| ]";
				}
				if(myhp/maxhp>=.8&&myhp/maxhp<.9)
				{
					HealthBar ="[||||||||  ]";
				}				
				if(myhp/maxhp>=.7&&myhp/maxhp<.8)
				{
					HealthBar ="[|||||||   ]";
				}				
				if(myhp/maxhp>=.6&&myhp/maxhp<.7)
				{
					HealthBar ="[||||||    ]";
				}				
				if(myhp/maxhp>=.5&&myhp/maxhp<.6)
				{
					HealthBar ="[|||||     ]";
				}				
				if(myhp/maxhp>=.4&&myhp/maxhp<.5)
				{
					HealthBar ="[||||      ]";
				}				
				if(myhp/maxhp>=.3&&myhp/maxhp<.4)
				{
					HealthBar ="[|||       ]";
				}				
				if(myhp/maxhp>=.2&&myhp/maxhp<.3)
				{
					HealthBar ="[||        ]";
				}				
				if(myhp/maxhp>=.1&&myhp/maxhp<.2)
				{
					HealthBar ="[|         ]";
				}
				if(myhp/maxhp<.1)
				{
					HealthBar ="[          ]";
				}
				
				if(myexp/needexp==1)
				{
					ExpBar ="[||||||||||]";
				}
				if(myexp/needexp>=.9&&myexp/needexp<1)
				{
					ExpBar ="[||||||||| ]";
				}
				if(myexp/needexp>=.8&&myexp/needexp<.9)
				{
					ExpBar ="[||||||||  ]";
				}				
				if(myexp/needexp>=.7&&myexp/needexp<.8)
				{
					ExpBar ="[|||||||   ]";
				}				
				if(myexp/needexp>=.6&&myexp/needexp<.7)
				{
					ExpBar ="[||||||    ]";
				}				
				if(myexp/needexp>=.5&&myexp/needexp<.6)
				{
					ExpBar ="[|||||     ]";
				}				
				if(myexp/needexp>=.4&&myexp/needexp<.5)
				{
					ExpBar ="[||||      ]";
				}				
				if(myexp/needexp>=.3&&myexp/needexp<.4)
				{
					ExpBar ="[|||       ]";
				}				
				if(myexp/needexp>=.2&&myexp/needexp<.3)
				{
					ExpBar ="[||        ]";
				}				
				if(myexp/needexp>=.1&&myexp/needexp<.2)
				{
					ExpBar ="[|         ]";
				}
				if(myexp/needexp<.1)
				{
					ExpBar ="[          ]";
				}
				
				if(mymp/maxmp==1)
				{
					MPBar ="[||||||||||]";
				}
				if(mymp/maxmp>=.9&&mymp/maxmp<1)
				{
					MPBar ="[||||||||| ]";
				}
				if(mymp/maxmp>=.8&&mymp/maxmp<.9)
				{
					MPBar ="[||||||||  ]";
				}				
				if(mymp/maxmp>=.7&&mymp/maxmp<.8)
				{
					MPBar ="[|||||||   ]";
				}				
				if(mymp/maxmp>=.6&&mymp/maxmp<.7)
				{
					MPBar ="[||||||    ]";
				}				
				if(mymp/maxmp>=.5&&mymp/maxmp<.6)
				{
					MPBar ="[|||||     ]";
				}				
				if(mymp/maxmp>=.4&&mymp/maxmp<.5)
				{
					MPBar ="[||||      ]";
				}				
				if(mymp/maxmp>=.3&&mymp/maxmp<.4)
				{
					MPBar ="[|||       ]";
				}				
				if(mymp/maxmp>=.2&&mymp/maxmp<.3)
				{
					MPBar ="[||        ]";
				}				
				if(mymp/maxmp>=.1&&mymp/maxmp<.2)
				{
					MPBar ="[|         ]";
				}
				if(mymp/maxmp<.1)
				{
					MPBar ="[          ]";
				}

				System.out.println(com.getName() + counterLVL);
				System.out.println("Level " + level + "  EXP: " + ExpBar+ " "+myexp +"/" + needexp );
				System.out.println("HP: "  +HealthBar+" " + myhp + "/" + maxhp + "  MP: " +MPBar+" " + mymp + "/" + maxmp);
				System.out.println("---------------------------------");
				
				System.out.println("  ");
				System.out.println("| " + a + " | " + b + " | " + c+ " | " +d + " | " + e + " | " + f + " |      ----------------------                 ");
				System.out.println("| " + g + " | " + h + " | " + i+ " | " +j + " | " + k + " | " + l + " |      |     Map Key        |          ^  ");
				System.out.println("| " + m + " | " + n + " | " + o+ " | " +p + " | " + q + " | " + r + " |      |    ----------      |         |8|    ");
				System.out.println("| " + s + " | " + t + " | " + u+ " | " +v + " | " + w + " | " + x + " |      |    X = Player      |      <4=|=|=6>        ");
				System.out.println("| " + y + " | " + z + " | " + ab+ " | " +ac + " | " + ad + " | " + ae + " |      |    T = Town        |         |5|");
				System.out.println("| " + af + " | " + ag + " | " + ah+ " | " +ai + " | " + aj + " | " + ak + " |      |    O = Portal      |          v");
				System.out.println("| " + al + " | " + am + " | " + an+ " | " +ao + " | " + ap + " | " + aq + " |      |____________________|        ");
				System.out.println("  ");
				System.out.println("1. Inventory   2.Stat");
				System.out.print("What would you like to do?  ");
				com.setMove();
				
				Start = 0;
				burn = 0;
				counterLVL=" ";

				for(int in=0 ;in<25;in++)	
				System.out.println();
				
				if(com.getMove().equals("1337"))
				{
					System.out.println("Code Entered");
					maxhp=999999;
					myhp=maxhp;
					maxmp=999999;
					mymp=maxmp;
					str=999999;
					mygold=99999;
					level=20;
					skillcounter=3;
					cure=1;
				}
				
				if(com.getMove().equals("monster off"))
				{
					System.out.println("Monsters encounter are now turned off");
					encounter=1;
				}
				
				if(com.getMove().equals("monster on"))
				{
					System.out.println("Monsters encounter are now turned on");
					encounter=0;
				}
				
				if(com.getMove().equals("money"))
				{
					System.out.println("Code Entered");
					mygold=99999;
				}
				
				if(com.getMove().equals("1"))
				{
					System.out.println("--------------EQUIP--------------");
					System.out.println("Weapon: " + weapon + "= " + atk + " wep atk");	
					System.out.println("Armor: " + armor + "= " + mail + " wep def");	
					System.out.println("Amount of gold: " + mygold);
					System.out.println(" ");
					System.out.println("-------------KEY ITEM------------");
					if(tail>0)
					{
						System.out.println(tail + "x BAOser's tail");
					}
					if(ginseng>0)
					{
						System.out.println(ginseng + "x ginseng");
					}
					System.out.println(" ");
					System.out.println("--------------ITEMS--------------");
					System.out.println("1. " + potion + "x Potions");
					System.out.println("2. " + hipotion + "x Hi-Potions");
					System.out.println("3. Back");
					System.out.println(" ");

					Start = 1;
					System.out.print("What would you like to do? ");
					com.setItem();
					for(int in=0 ;in<25;in++)	
					System.out.println();
					
					if (com.getItem().equals("1") && potion==0)
					{
						System.out.println("Not enough potions");
						System.out.println("---------------------------------");
					}
					
					if (com.getItem().equals("1") && potion>0)
					{
						if (myhp==maxhp)
						{
							System.out.println("You don't need to use this potion");
						}

						else 
						{
							System.out.println("The potion has healed you");
								
							if (myhp<(maxhp-10))
							{
								myhp+=10;
								potion--;
							}
								
							else if (myhp>=(maxhp-10))
							{
								myhp=maxhp;
								potion--;
							}
						}
							
						System.out.println("---------------------------------");
					}
					
					if (com.getItem().equals("2") && hipotion==0)
					{
						System.out.println("Not enough hipotion");
						System.out.println("---------------------------------");
					}
					
					if (com.getItem().equals("2") && hipotion>0)
					{
						if (myhp==maxhp)
						{
							System.out.println("You don't need to use this potion");
						}

						else 
						{
							System.out.println("The potion has healed you");
								
							if (myhp<(maxhp-50))
							{
								myhp+=50;
								hipotion--;
							}
								
							else if (myhp>=(maxhp-50))
							{
								myhp=maxhp;
								hipotion--;
							}
						}
							
						System.out.println("---------------------------------");
					}
				}
				
				if(com.getMove().equals("2"))
				{
					System.out.println("---------------------------------");
					System.out.println("1. Strength: " + str);
					System.out.println("2. Defence: " + def);
					System.out.println(com.getName() + " has " + point + " stat points");
					System.out.println("---------------------------------");
					Start = 1;
					
					while (point>0)
					{
						System.out.print("Where would you like to put the points? ");
						com.setPoint();

						if (com.getPoint().equals("1"))
						{
							str+=1;
							point--;
						}

						if (com.getPoint().equals("2"))
						{
							def+=1;
							point--;
						}
						
						for(int in=0 ;in<25;in++)
						System.out.println();
						
						System.out.println("---------------------------------");
						System.out.println("1. Strength: " + str);
						System.out.println("2. Defence: " + def);
						System.out.println(com.getName() + " has " + point + " stat points");
						System.out.println("---------------------------------");
					}	
				}

				if(com.getMove().equals("8")&&Ver!=7)
				{
					Ver++;
				}
				if(com.getMove().equals("4")&&Hor !=1)
				{
					Hor=Hor-1;
				}
				if(com.getMove().equals("6")&&Hor!=6)
				{
					Hor++;
				}
				if(com.getMove().equals("5")&&Ver!=1)
				{
					Ver=Ver-1;
				}


			}
			randommon=(int)(Math.random()*10);
			Start = 1;

			if (chart==1 && Ver==7 && Hor==3)
				{
					monster="BAOser";
					monhp=200;
					mongold=50;
					monexp=40;
					SATK="FireBlast"; 


					monmaxhp=monhp;
					System.out.println(com.getName() + " hears a monsterous roar");
					System.out.println(com.getName() + " has encountered the man-eating " + monster);
					System.out.println("---------------------------------");
					mpcounter=0;
					
				while (monhp>0 && myhp>0)
				{
						if(mymp<maxmp&&mpcounter==0)
						{
							mymp=maxmp/20 + mymp;
				

							if(mymp>maxmp)
							{
								mymp=maxmp;
							}
						}
						mpcounter=1;
						
						if(myhp/maxhp==1)
						{
							HealthBar ="[||||||||||]";
						}
						if(myhp/maxhp>=.9&&myhp/maxhp<1)
						{
							HealthBar ="[||||||||| ]";
						}
						if(myhp/maxhp>=.8&&myhp/maxhp<.9)
						{
							HealthBar ="[||||||||  ]";
						}			
						if(myhp/maxhp>=.7&&myhp/maxhp<.8)
						{
							HealthBar ="[|||||||   ]";
						}				
						if(myhp/maxhp>=.6&&myhp/maxhp<.7)
						{
							HealthBar ="[||||||    ]";
						}				
						if(myhp/maxhp>=.5&&myhp/maxhp<.6)
						{
							HealthBar ="[|||||     ]";
						}				
						if(myhp/maxhp>=.4&&myhp/maxhp<.5)
						{
							HealthBar ="[||||      ]";
						}				
						if(myhp/maxhp>=.3&&myhp/maxhp<.4)
						{
							HealthBar ="[|||       ]";
						}				
						if(myhp/maxhp>=.2&&myhp/maxhp<.3)
						{
							HealthBar ="[||        ]";
						}				
						if(myhp/maxhp>=.1&&myhp/maxhp<.2)
						{
							HealthBar ="[|         ]";
						}
						if(myhp/maxhp<.1)
						{
							HealthBar ="[          ]";
						}
							
						if(monhp/monmaxhp==1)
						{
							MonBar ="[||||||||||]";
						}
						if(monhp/monmaxhp>=.9&&monhp/monmaxhp<1)
						{
							MonBar ="[||||||||| ]";
						}
						if(monhp/monmaxhp>=.8&&monhp/monmaxhp<.9)
						{
							MonBar ="[||||||||  ]";
						}				
						if(monhp/monmaxhp>=.7&&monhp/monmaxhp<.8)
						{
							MonBar ="[|||||||   ]";
						}				
						if(monhp/monmaxhp>=.6&&monhp/monmaxhp<.7)
						{
							MonBar ="[||||||    ]";
						}				
						if(monhp/monmaxhp>=.5&&monhp/monmaxhp<.6)
						{
							MonBar ="[|||||     ]";
						}				
						if(monhp/monmaxhp>=.4&&monhp/monmaxhp<.5)
						{
							MonBar ="[||||      ]";
						}				
						if(monhp/monmaxhp>=.3&&monhp/monmaxhp<.4)
						{
							MonBar ="[|||       ]";
						}				
						if(monhp/monmaxhp>=.2&&monhp/monmaxhp<.3)
						{
							MonBar ="[||        ]";
						}				
						if(monhp/monmaxhp>=.1&&monhp/monmaxhp<.2)
						{
							MonBar ="[|         ]";
						}
						if(monhp/monmaxhp<.1)
						{
							MonBar ="[          ]";
						}
							
						System.out.println(com.getName() + "                    " + monster);
						System.out.println("HP: " + myhp + "/" + maxhp + "           HP: " + monhp + "/" + monmaxhp);
						System.out.println( HealthBar + "            "  + MonBar);
						System.out.println(" ");
						System.out.println("BATTLE MENU -----------------------------------");
						System.out.println("1)Attack");
						System.out.println("2)Skill");
						System.out.println("3)Item ");
						System.out.println("4)Flee ");
						System.out.print("Chose your action:  "); 
						com.setBattle();
						System.out.println("-----------------------------------------------");
							
						for(int in=0 ;in<25;in++)
						System.out.println();
							
						if (com.getBattle().equals("1"))
						{
							mpcounter=0;
							System.out.println("BATTLE MODE -----------------------------------");
							randmonatk=(int)((Math.random()*monexp));
							monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

							if(randmonatk>=(.8*monexp))
							{
								System.out.println(monster + " uses Fire Blast on " + com.getName() + " for " + monatk);
								burn=1;
							}

							if(randmonatk==0)
							{
								System.out.println(monster + " missed");
							}
					
							if(randmonatk>0 && randmonatk<(.8*monexp))
							{
								System.out.println(monster + " does " + monatk + " damage on " + com.getName());
							}
							myhp-=monatk;		
								
							if (myhp<=0)
							{
								break;
							}

							randatk=(float)(Math.random());
							myatk=(int)((((str * 5.0)/ 100) * atk)*randatk);

							if(randatk>=.8)
							{
								System.out.println(com.getName() + " does a CRITICAL HIT on " + monster + " for " + myatk);
								
								if(ChopStickPower==1)
								{
									myatk=50;
									System.out.println("The pair of ChopSticks begins to glow and does 50 damage to " + monster);
									System.out.println(com.getName()+" also got healed for 10 HP");
									
									if (myhp<(maxhp-10))
									{
										myhp+=10;
									}
										
									else if (myhp>=(maxhp-10))
									{
										myhp=maxhp;
									}
								}
							}

								if(randatk<=.1)
								{
									System.out.println(com.getName() + " missed");
								}
					
								if (randatk>.1 && randatk<.8)
								{
									System.out.println(com.getName() + " does " + myatk + " damage on " + monster);
								}
								monhp-=myatk;
								
								if (monhp<=0)
								{
									break;
								}

								if(burn==1)
								{
									myhp=myhp-5;
								}
								System.out.println("-----------------------------------------------");
							}
							if(com.getBattle().equals("2"))
							{
							
								if(mymp/maxmp==1)
								{
									MPBar ="[||||||||||]";
								}
								if(mymp/maxmp>=.9&&mymp/maxmp<1)
								{
									MPBar ="[||||||||| ]";
								}
								if(mymp/maxmp>=.8&&mymp/maxmp<.9)
								{
									MPBar ="[||||||||  ]";
								}				
								if(mymp/maxmp>=.7&&mymp/maxmp<.8)
								{
									MPBar ="[|||||||   ]";
								}				
								if(mymp/maxmp>=.6&&mymp/maxmp<.7)
								{
									MPBar ="[||||||    ]";
								}				
								if(mymp/maxmp>=.5&&mymp/maxmp<.6)
								{
									MPBar ="[|||||     ]";
								}				
								if(mymp/maxmp>=.4&&mymp/maxmp<.5)
								{
									MPBar ="[||||      ]";
								}				
								if(mymp/maxmp>=.3&&mymp/maxmp<.4)
								{
									MPBar ="[|||       ]";
								}				
								if(mymp/maxmp>=.2&&mymp/maxmp<.3)
								{
									MPBar ="[||        ]";
								}				
								if(mymp/maxmp>=.1&&mymp/maxmp<.2)
								{
									MPBar ="[|         ]";
								}
								if(mymp/maxmp<.1)
								{
									MPBar ="[          ]";
								}
								
								System.out.println("MP: " + MPBar + " "+mymp + "/" + maxmp);
								System.out.println("1.SlashBlast   4 MP");
								
								if(skillcounter==1)
								{
									System.out.println("2.Sonic Blast   12 MP");
								}
								if(skillcounter==2)
								{
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
								}
								if(skillcounter==3)
								{	
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
									System.out.println("4.Omni Slash   30 MP");
								}
								if(cure==1)
								{
									System.out.println("0.Cure   20 MP");
								}
								
								System.out.print("You choice is: ");
								com.setmp();
								for(int in=0 ;in<25;in++)
								System.out.println();
								
							if(com.getmp().equals("0")&&cure==1)
							{
								if(mymp<20)
								{
									System.out.println("Not enough MP");
									System.out.println("-----------------------------------------------");
								}
								
								if(mymp>=20)
								{
									mpcounter=0;
									
									mymp=mymp-20;
									
									System.out.println("BATTLE MODE -----------------------------------");
									
									System.out.println(com.getName() + " use Cure on himself ");
		
									myhp= maxhp;

									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
										
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
								if(com.getmp().equals("1"))
								{
									if(mymp<4)
									{
										System.out.println("Not enough MP");
										System.out.println("-----------------------------------------------");
									}
									
									if(mymp>=4)
									{
										mymp=mymp-4;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Fire Blast on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 7.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a SlashBlast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("2")&&skillcounter>=1)
								{
									if(mymp<12)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=12)
									{
										mymp=mymp-12;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses  Fire Blast on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 10.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Sonic Blast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("3")&&skillcounter>=2)
								{
									if(mymp<18)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=18)
									{
										mymp=mymp-18;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Fire Blast on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 13.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Slice and Dice on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("4")&&skillcounter>=3)
								{
									if(mymp<30)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=30)
									{
										mymp=mymp-30;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Fire Blast on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 15.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Omni Slash on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
							}
							if (com.getBattle().equals("3"))
							{
								System.out.println("1. Potion x" + potion);
								System.out.println("2. Hi-Potion x" + hipotion);
								System.out.println("3. Back");
								System.out.print("You choice is: ");
								com.setItem();
								
								if (com.getItem().equals("1") && potion==0)
								{
									System.out.println("Not enough potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("1") && potion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this potion");
									}

									else 
									{
										System.out.println("The potion has healed you");
										
										if (myhp<(maxhp-10))
										{
											myhp+=10;
											potion--;
										}
										
										else if (myhp>=(maxhp-10))
										{
											myhp=maxhp;
											potion--;
										}
									}
									
									System.out.println("---------------------------------");
								}

								if (com.getItem().equals("2") && hipotion==0)
								{
									System.out.println("Not enough Hi-Potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("2") && hipotion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this Hi-Potion");
									}

									else 
									{
										System.out.println("The Hi-Potion has healed you");
										
										if (myhp<(maxhp-50))
										{
											myhp+=50;
											hipotion--;
										}
										
										else if (myhp>=(maxhp-50))
										{
											myhp=maxhp;
											hipotion--;
										}
									}
									
									System.out.println("---------------------------------");
								}
							}

							if (com.getBattle().equals("4"))
							{
								randflee=(int)(Math.random()*4);	
								
								if (randflee<=2)
								{	
									System.out.println("BATTLE OVER -----------------------------------");
									System.out.println(com.getName() + " has successfully fled the battle");
									System.out.println("-----------------------------------------------");
									break;
								}
								
								if (randflee>2)
								{
									System.out.println("BATTLE MODE -----------------------------------");
									System.out.println(com.getName() + " has failed to flee the battle");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));
									mpcounter=0;
									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses Fire Blast on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
					
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
								
									if (myhp<=0)
									{
										break;
									}
									System.out.println("-----------------------------------------------");
								}
							}

						 }
						 
						if (monhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(com.getName() + " killed " + monster);
							System.out.println("---------------------------------");
							System.out.println("Rewards: ");
							System.out.println(mongold + " gold");
							mygold+=mongold;
							System.out.println(monexp + " exp"); 
							myexp+=monexp;    

							randomitem=(int)(Math.random()*10);
							
							if(tail==0)
							{
								System.out.println("You have found a BAOser's tail!"); 
								tail++;
							}
							if(tail==-1)
							{
								System.out.println("You have found a BAOser's Sword");
								atk=baosword;
								weapon="BAOser's Sword";
								System.out.println(com.getName() + " has equiped the BAOser's Sword");							
							}

							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}

						if (myhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(monster + " killed " + com.getName());
							System.out.println("---------------------------------");
							System.out.println("You lost some exp and gold");
							if ((needexp*.07)<myexp)
							{
								myexp-=(needexp*.07);    
							}
		
							if ((needexp*.07)>=myexp)
							{
								myexp=0;
							}
							mygold=mygold/2;
							myhp=maxhp/2;
							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}
					}
				
		if(myexp>=needexp)
		{
			level++;
			myhp=level*10;
			maxhp=myhp;
			mymp=maxmp+5;
			maxmp=mymp;
			myexp=0;
			needexp=level*10;
			point+=3;
			counterLVL=" [LEVEL UP!] You have 3 more stat points now!";
			
			if(level==5||level==10||level==15)
			{
				if(level==5)
				{
					skill="Sonic Slash";
					skillcounter=1;
				}
				if(level==10)
				{
					skill="Slice and Dice";
					skillcounter=2;
				}
				if(level==15)
				{
					skill="Omni Slash";
					skillcounter=3;
				}
				
				System.out.println("You have learned the skill " + skill);	
			}
		}
		
			if (chart==3 && Ver==7&&Hor==2)//ginseng
				{
					monster="Rose Kraken";
					monhp=1000;
					mongold=100;
					monexp=100;
					SATK="Constrict";


					monmaxhp=monhp;
					System.out.println(com.getName() + ", about to pick up some ginseng, got ambushed");
					System.out.println(com.getName() + " has encountered the fearsome " + monster);
					System.out.println("---------------------------------");
					mpcounter=0;
					
				while (monhp>0 && myhp>0)
				{
						if(mymp<maxmp&&mpcounter==0)
						{
							mymp=maxmp/20 + mymp;
							
							if(mymp>maxmp)
							{
								mymp=maxmp;
							}
						}
						
						mpcounter=1;
						
						if(myhp/maxhp==1)
						{
							HealthBar ="[||||||||||]";
						}
						if(myhp/maxhp>=.9&&myhp/maxhp<1)
						{
							HealthBar ="[||||||||| ]";
						}
						if(myhp/maxhp>=.8&&myhp/maxhp<.9)
						{
							HealthBar ="[||||||||  ]";
						}			
						if(myhp/maxhp>=.7&&myhp/maxhp<.8)
						{
							HealthBar ="[|||||||   ]";
						}				
						if(myhp/maxhp>=.6&&myhp/maxhp<.7)
						{
							HealthBar ="[||||||    ]";
						}				
						if(myhp/maxhp>=.5&&myhp/maxhp<.6)
						{
							HealthBar ="[|||||     ]";
						}				
						if(myhp/maxhp>=.4&&myhp/maxhp<.5)
						{
							HealthBar ="[||||      ]";
						}				
						if(myhp/maxhp>=.3&&myhp/maxhp<.4)
						{
							HealthBar ="[|||       ]";
						}				
						if(myhp/maxhp>=.2&&myhp/maxhp<.3)
						{
							HealthBar ="[||        ]";
						}				
						if(myhp/maxhp>=.1&&myhp/maxhp<.2)
						{
							HealthBar ="[|         ]";
						}
						if(myhp/maxhp<.1)
						{
							HealthBar ="[          ]";
						}
							
						if(monhp/monmaxhp==1)
						{
							MonBar ="[||||||||||]";
						}
						if(monhp/monmaxhp>=.9&&monhp/monmaxhp<1)
						{
							MonBar ="[||||||||| ]";
						}
						if(monhp/monmaxhp>=.8&&monhp/monmaxhp<.9)
						{
							MonBar ="[||||||||  ]";
						}				
						if(monhp/monmaxhp>=.7&&monhp/monmaxhp<.8)
						{
							MonBar ="[|||||||   ]";
						}				
						if(monhp/monmaxhp>=.6&&monhp/monmaxhp<.7)
						{
							MonBar ="[||||||    ]";
						}				
						if(monhp/monmaxhp>=.5&&monhp/monmaxhp<.6)
						{
							MonBar ="[|||||     ]";
						}				
						if(monhp/monmaxhp>=.4&&monhp/monmaxhp<.5)
						{
							MonBar ="[||||      ]";
						}				
						if(monhp/monmaxhp>=.3&&monhp/monmaxhp<.4)
						{
							MonBar ="[|||       ]";
						}				
						if(monhp/monmaxhp>=.2&&monhp/monmaxhp<.3)
						{
							MonBar ="[||        ]";
						}				
						if(monhp/monmaxhp>=.1&&monhp/monmaxhp<.2)
						{
							MonBar ="[|         ]";
						}
						if(monhp/monmaxhp<.1)
						{
							MonBar ="[          ]";
						}
							
						System.out.println(com.getName() + "                    " + monster);
						System.out.println("HP: " + myhp + "/" + maxhp + "           HP: " + monhp + "/" + monmaxhp);
						System.out.println( HealthBar + "            "  + MonBar);
						System.out.println(" ");
						System.out.println("BATTLE MENU -----------------------------------");
						System.out.println("1)Attack");
						System.out.println("2)Skill");
						System.out.println("3)Item ");
						System.out.println("4)Flee ");
						System.out.print("Chose your action:  "); 
						com.setBattle();
						System.out.println("-----------------------------------------------");
							
						for(int in=0 ;in<25;in++)
						System.out.println();
							
						if (com.getBattle().equals("1"))
						{
							mpcounter=0;
							System.out.println("BATTLE MODE -----------------------------------");
							randmonatk=(int)((Math.random()*monexp));
							monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

							if(randmonatk>=(.8*monexp))
							{
								System.out.println(monster + " uses Constrict on " + com.getName() + " for " + monatk);
							}

							if(randmonatk==0)
							{
								System.out.println(monster + " missed");
							}
					
							if(randmonatk>0 && randmonatk<(.8*monexp))
							{
								System.out.println(monster + " does " + monatk + " damage on " + com.getName());
							}
							myhp-=monatk;		
								
							if (myhp<=0)
							{
								break;
							}

							randatk=(float)(Math.random());
							myatk=(int)((((str * 5.0)/ 100) * atk)*randatk);

							if(randatk>=.8)
							{
								System.out.println(com.getName() + " does a CRITICAL HIT on " + monster + " for " + myatk);
								
								if(ChopStickPower==1)
								{
									myatk=50;
									System.out.println("The pair of ChopSticks begins to glow and does 50 damage to " + monster);
									System.out.println(com.getName()+" also got healed for 10 HP");
									
									if (myhp<(maxhp-10))
									{
										myhp+=10;
									}
										
									else if (myhp>=(maxhp-10))
									{
										myhp=maxhp;
									}
								}
							}

								if(randatk<=.1)
								{
									System.out.println(com.getName() + " missed");
								}
					
								if (randatk>.1 && randatk<.8)
								{
									System.out.println(com.getName() + " does " + myatk + " damage on " + monster);
								}
								monhp-=myatk;
								
								if (monhp<=0)
								{
									break;
								}

								if(burn==1)
								{
									myhp=myhp-5;
								}
								System.out.println("-----------------------------------------------");
							}
							if(com.getBattle().equals("2"))
							{
							
								if(mymp/maxmp==1)
								{
									MPBar ="[||||||||||]";
								}
								if(mymp/maxmp>=.9&&mymp/maxmp<1)
								{
									MPBar ="[||||||||| ]";
								}
								if(mymp/maxmp>=.8&&mymp/maxmp<.9)
								{
									MPBar ="[||||||||  ]";
								}				
								if(mymp/maxmp>=.7&&mymp/maxmp<.8)
								{
									MPBar ="[|||||||   ]";
								}				
								if(mymp/maxmp>=.6&&mymp/maxmp<.7)
								{
									MPBar ="[||||||    ]";
								}				
								if(mymp/maxmp>=.5&&mymp/maxmp<.6)
								{
									MPBar ="[|||||     ]";
								}				
								if(mymp/maxmp>=.4&&mymp/maxmp<.5)
								{
									MPBar ="[||||      ]";
								}				
								if(mymp/maxmp>=.3&&mymp/maxmp<.4)
								{
									MPBar ="[|||       ]";
								}				
								if(mymp/maxmp>=.2&&mymp/maxmp<.3)
								{
									MPBar ="[||        ]";
								}				
								if(mymp/maxmp>=.1&&mymp/maxmp<.2)
								{
									MPBar ="[|         ]";
								}
								if(mymp/maxmp<.1)
								{
									MPBar ="[          ]";
								}
								
								System.out.println("MP: " + MPBar + " "+mymp + "/" + maxmp);
								System.out.println("1.SlashBlast   4 MP");
								
								if(skillcounter==1)
								{
									System.out.println("2.Sonic Blast   12 MP");
								}
								if(skillcounter==2)
								{
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
								}
								if(skillcounter==3)
								{	
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
									System.out.println("4.Omni Slash   30 MP");
								}
								
								if(cure==1)
								{
									System.out.println("0.Cure   20 MP");
								}
								
								System.out.print("You choice is: ");
								com.setmp();
								for(int in=0 ;in<25;in++)
								System.out.println();
							
							if(com.getmp().equals("0")&&cure==1)
							{
								if(mymp<20)
								{
									System.out.println("Not enough MP");
									System.out.println("-----------------------------------------------");
								}
								
								if(mymp>=20)
								{
									mpcounter=0;
									
									mymp=mymp-20;
									
									System.out.println("BATTLE MODE -----------------------------------");

									System.out.println(com.getName() + " use Cure on himself ");
		
									myhp= maxhp;

									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
									
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
								if(com.getmp().equals("1"))
								{
									if(mymp<4)
									{
										System.out.println("Not enough MP");
										System.out.println("-----------------------------------------------");
									}
									
									if(mymp>=4)
									{
										mymp=mymp-4;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Constrict on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 7.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a SlashBlast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("2")&&skillcounter>=1)
								{
									if(mymp<12)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=12)
									{
										mymp=mymp-12;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses  Constrict on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 10.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Sonic Blast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("3")&&skillcounter>=2)
								{
									if(mymp<18)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=18)
									{
										mymp=mymp-18;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Constrict on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 13.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Slice and Dice on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("4")&&skillcounter>=3)
								{
									if(mymp<30)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=30)
									{
										mymp=mymp-30;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Constrict on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 15.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Omni Slash on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
							}
							if (com.getBattle().equals("3"))
							{
								System.out.println("1. Potion x" + potion);
								System.out.println("2. Hi-Potion x" + hipotion);
								System.out.println("3. Back");
								System.out.print("You choice is: ");
								com.setItem();
								
								if (com.getItem().equals("1") && potion==0)
								{
									System.out.println("Not enough potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("1") && potion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this potion");
									}

									else 
									{
										System.out.println("The potion has healed you");
										
										if (myhp<(maxhp-10))
										{
											myhp+=10;
											potion--;
										}
										
										else if (myhp>=(maxhp-10))
										{
											myhp=maxhp;
											potion--;
										}
									}
									
									System.out.println("---------------------------------");
								}

								if (com.getItem().equals("2") && hipotion==0)
								{
									System.out.println("Not enough Hi-Potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("2") && hipotion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this Hi-Potion");
									}

									else 
									{
										System.out.println("The Hi-Potion has healed you");
										
										if (myhp<(maxhp-50))
										{
											myhp+=50;
											hipotion--;
										}
										
										else if (myhp>=(maxhp-50))
										{
											myhp=maxhp;
											hipotion--;
										}
									}
									
									System.out.println("---------------------------------");
								}
							}

							if (com.getBattle().equals("4"))
							{
								randflee=(int)(Math.random()*4);	
								
								if (randflee<=2)
								{	
									System.out.println("BATTLE OVER -----------------------------------");
									System.out.println(com.getName() + " has successfully fled the battle");
									System.out.println("-----------------------------------------------");
									break;
								}
								
								if (randflee>2)
								{
									System.out.println("BATTLE MODE -----------------------------------");
									System.out.println(com.getName() + " has failed to flee the battle");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));
									mpcounter=0;
									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses Constrict on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
					
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
								
									if (myhp<=0)
									{
										break;
									}
									System.out.println("-----------------------------------------------");
								}
							}

						 }
						 
						if (monhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(com.getName() + " killed " + monster);
							System.out.println("---------------------------------");
							System.out.println("Rewards: ");
							System.out.println(mongold + " gold");
							mygold+=mongold;
							System.out.println(monexp + " exp"); 
							myexp+=monexp;    

							randomitem=(int)(Math.random()*10);
							
							System.out.println("You have found a ginseng!"); 
							ginseng++;

							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}

						if (myhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(monster + " killed " + com.getName());
							System.out.println("---------------------------------");
							System.out.println("You lost some exp and gold");
							if ((needexp*.07)<myexp)
							{
								myexp-=(needexp*.07);    
							}
		
							if ((needexp*.07)>=myexp)
							{
								myexp=0;
							}
							mygold=mygold/2;
							myhp=maxhp/2;
							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}
					}
				
		if(myexp>=needexp)
		{
			level++;
			myhp=level*10;
			maxhp=myhp;
			mymp=maxmp+5;
			maxmp=mymp;
			myexp=0;
			needexp=level*10;
			point+=3;
			counterLVL=" [LEVEL UP!] You have 3 more stat points now!";
			
			if(level==5||level==10||level==15)
			{
				if(level==5)
				{
					skill="Sonic Slash";
					skillcounter=1;
				}
				if(level==10)
				{
					skill="Slice and Dice";
					skillcounter=2;
				}
				if(level==15)
				{
					skill="Omni Slash";
					skillcounter=3;
				}
				
				System.out.println("You have learned the skill " + skill);	
			}
		}//end of boss ginseng----------------------------------------------------------------------------------------------------------------------------------
		
		if(Ver==5&&Hor==1&&chart==4)
		{
					monster="Zakum";
					mongold=500;
					monexp=200;
					SATK="Hand of Fate";
					
					if(ZakumCounter==0)
					{
						monhp=5000;
						monmaxhp=monhp;
						ZakumCounter++;
						System.out.println(com.getName() + ": Its the FINAL BOSS FIGHT!!!");
					}
					
					if(armor.equals("Zakum Armor"))
					{
						monhp=10000;
						monmaxhp=monhp;
						mongold=1000;
						
						if(weapon.equals("Doom Bringer"))
						{
							monhp=(atk-60)+10000;
							monmaxhp=monhp;
							mongold=1000;
							monexp=500;
						}
					}
					
					System.out.println(com.getName() + " has encountered " + monster);
					System.out.println("---------------------------------");
					mpcounter=0;
					
				while (monhp>0 && myhp>0)
				{
						if(mymp<maxmp&&mpcounter==0)
						{
							mymp=maxmp/20 + mymp;
							
							if(mymp>maxmp)
							{
								mymp=maxmp;
							}
						}
						
						mpcounter=1;
						
						if(myhp/maxhp==1)
						{
							HealthBar ="[||||||||||]";
						}
						if(myhp/maxhp>=.9&&myhp/maxhp<1)
						{
							HealthBar ="[||||||||| ]";
						}
						if(myhp/maxhp>=.8&&myhp/maxhp<.9)
						{
							HealthBar ="[||||||||  ]";
						}			
						if(myhp/maxhp>=.7&&myhp/maxhp<.8)
						{
							HealthBar ="[|||||||   ]";
						}				
						if(myhp/maxhp>=.6&&myhp/maxhp<.7)
						{
							HealthBar ="[||||||    ]";
						}				
						if(myhp/maxhp>=.5&&myhp/maxhp<.6)
						{
							HealthBar ="[|||||     ]";
						}				
						if(myhp/maxhp>=.4&&myhp/maxhp<.5)
						{
							HealthBar ="[||||      ]";
						}				
						if(myhp/maxhp>=.3&&myhp/maxhp<.4)
						{
							HealthBar ="[|||       ]";
						}				
						if(myhp/maxhp>=.2&&myhp/maxhp<.3)
						{
							HealthBar ="[||        ]";
						}				
						if(myhp/maxhp>=.1&&myhp/maxhp<.2)
						{
							HealthBar ="[|         ]";
						}
						if(myhp/maxhp<.1)
						{
							HealthBar ="[          ]";
						}
							
						if(monhp/monmaxhp==1)
						{
							MonBar ="[||||||||||]";
						}
						if(monhp/monmaxhp>=.9&&monhp/monmaxhp<1)
						{
							MonBar ="[||||||||| ]";
						}
						if(monhp/monmaxhp>=.8&&monhp/monmaxhp<.9)
						{
							MonBar ="[||||||||  ]";
						}				
						if(monhp/monmaxhp>=.7&&monhp/monmaxhp<.8)
						{
							MonBar ="[|||||||   ]";
						}				
						if(monhp/monmaxhp>=.6&&monhp/monmaxhp<.7)
						{
							MonBar ="[||||||    ]";
						}				
						if(monhp/monmaxhp>=.5&&monhp/monmaxhp<.6)
						{
							MonBar ="[|||||     ]";
						}				
						if(monhp/monmaxhp>=.4&&monhp/monmaxhp<.5)
						{
							MonBar ="[||||      ]";
						}				
						if(monhp/monmaxhp>=.3&&monhp/monmaxhp<.4)
						{
							MonBar ="[|||       ]";
						}				
						if(monhp/monmaxhp>=.2&&monhp/monmaxhp<.3)
						{
							MonBar ="[||        ]";
						}				
						if(monhp/monmaxhp>=.1&&monhp/monmaxhp<.2)
						{
							MonBar ="[|         ]";
						}
						if(monhp/monmaxhp<.1)
						{
							MonBar ="[          ]";
						}
							
						System.out.println(com.getName() + "                    " + monster);
						System.out.println("HP: " + myhp + "/" + maxhp + "           HP: " + monhp + "/" + monmaxhp);
						System.out.println( HealthBar + "            "  + MonBar);
						System.out.println(" ");
						System.out.println("BATTLE MENU -----------------------------------");
						System.out.println("1)Attack");
						System.out.println("2)Skill");
						System.out.println("3)Item ");
						System.out.println("4)Flee ");
						System.out.print("Chose your action:  "); 
						com.setBattle();
						System.out.println("-----------------------------------------------");
							
						for(int in=0 ;in<25;in++)
						System.out.println();
							
						if (com.getBattle().equals("1"))
						{
							mpcounter=0;
							System.out.println("BATTLE MODE -----------------------------------");
							randmonatk=(int)((Math.random()*monexp));
							monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

							if(randmonatk>=(.8*monexp))
							{
								System.out.println(monster + " uses Hand of Fate on " + com.getName() + " for " + monatk);
							}

							if(randmonatk==0)
							{
								System.out.println(monster + " missed");
							}
					
							if(randmonatk>0 && randmonatk<(.8*monexp))
							{
								System.out.println(monster + " does " + monatk + " damage on " + com.getName());
							}
							myhp-=monatk;		
								
							if (myhp<=0)
							{
								break;
							}

							randatk=(float)(Math.random());
							myatk=(int)((((str * 5.0)/ 100) * atk)*randatk);

							if(randatk>=.8)
							{
								System.out.println(com.getName() + " does a CRITICAL HIT on " + monster + " for " + myatk);
								
								if(ChopStickPower==1)
								{
									myatk=50;
									System.out.println("The pair of ChopSticks begins to glow and does 50 damage to " + monster);
									System.out.println(com.getName()+" also got healed for 10 HP");
									
									if (myhp<(maxhp-10))
									{
										myhp+=10;
									}
										
									else if (myhp>=(maxhp-10))
									{
										myhp=maxhp;
									}
								}
							}

								if(randatk<=.1)
								{
									System.out.println(com.getName() + " missed");
								}
					
								if (randatk>.1 && randatk<.8)
								{
									System.out.println(com.getName() + " does " + myatk + " damage on " + monster);
								}
								monhp-=myatk;
								
								if (monhp<=0)
								{
									break;
								}

								if(burn==1)
								{
									myhp=myhp-5;
								}
								System.out.println("-----------------------------------------------");
							}
							if(com.getBattle().equals("2"))
							{
							
								if(mymp/maxmp==1)
								{
									MPBar ="[||||||||||]";
								}
								if(mymp/maxmp>=.9&&mymp/maxmp<1)
								{
									MPBar ="[||||||||| ]";
								}
								if(mymp/maxmp>=.8&&mymp/maxmp<.9)
								{
									MPBar ="[||||||||  ]";
								}				
								if(mymp/maxmp>=.7&&mymp/maxmp<.8)
								{
									MPBar ="[|||||||   ]";
								}				
								if(mymp/maxmp>=.6&&mymp/maxmp<.7)
								{
									MPBar ="[||||||    ]";
								}				
								if(mymp/maxmp>=.5&&mymp/maxmp<.6)
								{
									MPBar ="[|||||     ]";
								}				
								if(mymp/maxmp>=.4&&mymp/maxmp<.5)
								{
									MPBar ="[||||      ]";
								}				
								if(mymp/maxmp>=.3&&mymp/maxmp<.4)
								{
									MPBar ="[|||       ]";
								}				
								if(mymp/maxmp>=.2&&mymp/maxmp<.3)
								{
									MPBar ="[||        ]";
								}				
								if(mymp/maxmp>=.1&&mymp/maxmp<.2)
								{
									MPBar ="[|         ]";
								}
								if(mymp/maxmp<.1)
								{
									MPBar ="[          ]";
								}
								
								System.out.println("MP: " + MPBar + " "+mymp + "/" + maxmp);
								System.out.println("1.SlashBlast   4 MP");
								
								if(skillcounter==1)
								{
									System.out.println("2.Sonic Blast   12 MP");
								}
								if(skillcounter==2)
								{
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
								}
								if(skillcounter==3)
								{	
									System.out.println("2.Sonic Blast   12 MP");
									System.out.println("3.Slice and Dice   18 MP");
									System.out.println("4.Omni Slash   30 MP");
								}
								
								if(cure==1)
								{
									System.out.println("0.Cure   20 MP");
								}
								
								System.out.print("You choice is: ");
								com.setmp();
								for(int in=0 ;in<25;in++)
								System.out.println();
							
							if(com.getmp().equals("0")&&cure==1)
							{
								if(mymp<20)
								{
									System.out.println("Not enough MP");
									System.out.println("-----------------------------------------------");
								}
								
								if(mymp>=20)
								{
									mpcounter=0;
									
									mymp=mymp-20;
									
									System.out.println("BATTLE MODE -----------------------------------");

									System.out.println(com.getName() + " use Cure on himself ");
		
									myhp= maxhp;

									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
																		
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
								if(com.getmp().equals("1"))
								{
									if(mymp<4)
									{
										System.out.println("Not enough MP");
										System.out.println("-----------------------------------------------");
									}
									
									if(mymp>=4)
									{
										mymp=mymp-4;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
										/*jon*/	System.out.println(monster + " uses Hand of Fate on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 7.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a SlashBlast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("2")&&skillcounter>=1)
								{
									if(mymp<12)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=12)
									{
										mymp=mymp-12;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses  Hand of Fate on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 10.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Sonic Blast on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("3")&&skillcounter>=2)
								{
									if(mymp<18)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=18)
									{
										mymp=mymp-18;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
											System.out.println(monster + " uses Hand of Fate on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 13.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Slice and Dice on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
								
								if(com.getmp().equals("4")&&skillcounter>=3)
								{
									if(mymp<30)
									{
										System.out.println("Not enough MP");
									}
									
									if(mymp>=30)
									{
										mymp=mymp-30;
										mpcounter=0;
										System.out.println("BATTLE MODE -----------------------------------");
										randmonatk=(int)((Math.random()*monexp));
										monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

										if(randmonatk>=(.8*monexp))
										{
										/*jon*/	System.out.println(monster + " uses Hand of Fate on " + com.getName() + " for " + monatk);
										}

										if(randmonatk==0)
										{
											System.out.println(monster + " missed");
										}
								
										if(randmonatk>0 && randmonatk<(.8*monexp))
										{
											System.out.println(monster + " does " + monatk + " damage on " + com.getName());
										}
										myhp-=monatk;		
											
										if (myhp<=0)
										{
											break;
										}

										randatk=(float)(Math.random());
										myatk=(int)((((str * 15.0)/ 100) * atk)*randatk);

										System.out.println(com.getName() + " does a Omni Slash on " + monster + " for " + myatk);
			
										monhp-=myatk;
											
										if (monhp<=0)
										{
											break;
										}

										if(burn==1)
										{
											myhp=myhp-5;
										}
										System.out.println("-----------------------------------------------");
									}
								}	
							}
							if (com.getBattle().equals("3"))
							{
								System.out.println("1. Potion x" + potion);
								System.out.println("2. Hi-Potion x" + hipotion);
								System.out.println("3. Back");
								System.out.print("You choice is: ");
								com.setItem();
								
								if (com.getItem().equals("1") && potion==0)
								{
									System.out.println("Not enough potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("1") && potion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this potion");
									}

									else 
									{
										System.out.println("The potion has healed you");
										
										if (myhp<(maxhp-10))
										{
											myhp+=10;
											potion--;
										}
										
										else if (myhp>=(maxhp-10))
										{
											myhp=maxhp;
											potion--;
										}
									}
									
									System.out.println("---------------------------------");
								}

								if (com.getItem().equals("2") && hipotion==0)
								{
									System.out.println("Not enough Hi-Potion");
									System.out.println("---------------------------------");
								}
								
								if (com.getItem().equals("2") && hipotion>0)
								{
									if (myhp==maxhp)
									{
										System.out.println("You don't need to use this Hi-Potion");
									}

									else 
									{
										System.out.println("The Hi-Potion has healed you");
										
										if (myhp<(maxhp-50))
										{
											myhp+=50;
											hipotion--;
										}
										
										else if (myhp>=(maxhp-50))
										{
											myhp=maxhp;
											hipotion--;
										}
									}
									
									System.out.println("---------------------------------");
								}
							}

							if (com.getBattle().equals("4"))
							{
								randflee=(int)(Math.random()*4);	
								
								if (randflee<=2)
								{	
									System.out.println("BATTLE OVER -----------------------------------");
									System.out.println(com.getName() + " has successfully fled the battle");
									System.out.println("-----------------------------------------------");
									break;
								}
								
								if (randflee>2)
								{
									System.out.println("BATTLE MODE -----------------------------------");
									System.out.println(com.getName() + " has failed to flee the battle");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));
									mpcounter=0;
									if(randmonatk>=(.8*monexp))
									{
									/*jon*/	System.out.println(monster + " uses Hand of Fate on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
					
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
								
									if (myhp<=0)
									{
										break;
									}
									System.out.println("-----------------------------------------------");
								}
							}

						 }
						 
						if (monhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(com.getName() + " killed " + monster);
							System.out.println("---------------------------------");
							System.out.println("Rewards: ");
							System.out.println(mongold + " gold");
							mygold+=mongold;
							System.out.println(monexp + " exp"); 
							myexp+=monexp;    
							
							if(armor.equals("Zakum Armor"))
							{
								if(weapon.equals("Doom Bringer"))
								{
									System.out.println("Your Doom Bringer have been upgraded");
									atk=atk+1;
								}
							
								if(!weapon.equals("Doom Bringer"))
								{
									System.out.println("You found Doom Bringer!");
									System.out.println(com.getName() + " has equiped the Doom Bringer");
									weapon="Doom Bringer";
									atk=60;
								}
							}
							
							if(!armor.equals("Zakum Armor"))
							{
								mail=40;
								armor="Zakum Armor";
								System.out.println("You found Zakum Armor!");
								System.out.println(com.getName() + " has equiped the Zakum Armor");
							}
							
							System.out.println("---------------------------------");
								
							randomitem=(int)(Math.random()*10);

							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}

						if (myhp<=0)
						{
							System.out.println("---------------------------------");
							System.out.println(monster + " killed " + com.getName());
							System.out.println("---------------------------------");
							System.out.println("You lost some exp and gold");
							if ((needexp*.07)<myexp)
							{
								myexp-=(needexp*.07);    
							}
		
							if ((needexp*.07)>=myexp)
							{
								myexp=0;
							}
							mygold=mygold/2;
							myhp=maxhp/2;
							System.out.println(" ");
							System.out.println("BATTLE OVER -----------------------------------");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
						}
					}
				
		if(myexp>=needexp)
		{
			level++;
			myhp=level*10;
			maxhp=myhp;
			mymp=maxmp+5;
			maxmp=mymp;
			myexp=0;
			needexp=level*10;
			point+=3;
			counterLVL=" [LEVEL UP!] You have 3 more stat points now!";
			
			if(level==5||level==10||level==15)
			{
				if(level==5)
				{
					skill="Sonic Slash";
					skillcounter=1;
				}
				if(level==10)
				{
					skill="Slice and Dice";
					skillcounter=2;
				}
				if(level==15)
				{
					skill="Omni Slash";
					skillcounter=3;
				}
				
				System.out.println("You have learned the skill " + skill);	
			}
		}
		
			
		if(randommon<=3&&encounter==0)
		{
			randmon=(int)(Math.random()*5);

				if (randmon<=3 && chart==1)
				{
					monster="pumpkin";
					monhp=50;
					mongold=10;
					monexp=10;
					SATK="Pumpkin Toss";
				}

				if (randmon>3 && chart==1)
				{
					monster="bear";
					monhp=75;
					mongold=15;
					monexp=15;
					SATK="Tiger Claw";
				}
					
				if (randmon<=3 && chart==0)
				{
					monster="chicken";
					monhp=10;
					mongold=2;
					monexp=5;
					SATK="Peck";
				}
		
				if (randmon>3 && chart==0)
				{
					monster="black chicken";
					monhp=15;
					mongold=5;
					monexp=8;
					SATK="Peck of Doom";
				}
				
				if (randmon>3 && chart==2)
				{
					monster="Assassin";
					monhp=100;
					mongold=25;
					monexp=25;
					SATK="Lucky Seven";
				}
				
				if (randmon<=3 && chart==2)
				{
					monster="Bandit";
					monhp=80;
					mongold=20;
					monexp=20;
					SATK="Dagger Thrust";
				}
				
				if (randmon>3 && chart==3)
				{
					monster="Fire Titan";
					monhp=200;
					mongold=40;
					monexp=40;
					SATK="Burning Flame";
				}
				
				if (randmon<=3 && chart==3)
				{
					monster="Ice Knight";
					monhp=150;
					mongold=30;
					monexp=30;
					SATK="Frost Cut";
				}
				
				if (randmon>3 && chart==4)
				{
					monster="Ig-Knight";
					monhp=500;
					mongold=80;
					monexp=80;
					SATK="Scorching Blade";
				}
				
				if (randmon<=3 && chart==4)
				{
					monster="Balrog";
					monhp=600;
					mongold=90;
					monexp=90;
					SATK="Crimson Wing";
				}
				monmaxhp=monhp;

				System.out.println(com.getName() + " has encountered a " + monster);
				System.out.println("---------------------------------");

				while (monhp>0 && myhp>0)
				{
					if(mymp<maxmp&&mpcounter==0)
					{
						mymp=maxmp/20 + mymp;
						
						if(mymp>maxmp)
						
						{
							mymp=maxmp;
						}
					}
					mpcounter=1;
					
					if(myhp/maxhp==1)
					{
						HealthBar ="[||||||||||]";
					}
					if(myhp/maxhp>=.9&&myhp/maxhp<1)
					{
						HealthBar ="[||||||||| ]";
					}
					if(myhp/maxhp>=.8&&myhp/maxhp<.9)
					{
						HealthBar ="[||||||||  ]";
					}			
					if(myhp/maxhp>=.7&&myhp/maxhp<.8)
					{
						HealthBar ="[|||||||   ]";
					}				
					if(myhp/maxhp>=.6&&myhp/maxhp<.7)
					{
						HealthBar ="[||||||    ]";
					}				
					if(myhp/maxhp>=.5&&myhp/maxhp<.6)
					{
						HealthBar ="[|||||     ]";
					}				
					if(myhp/maxhp>=.4&&myhp/maxhp<.5)
					{
						HealthBar ="[||||      ]";
					}				
					if(myhp/maxhp>=.3&&myhp/maxhp<.4)
					{
						HealthBar ="[|||       ]";
					}				
					if(myhp/maxhp>=.2&&myhp/maxhp<.3)
					{
						HealthBar ="[||        ]";
					}				
					if(myhp/maxhp>=.1&&myhp/maxhp<.2)
					{
						HealthBar ="[|         ]";
					}
					if(myhp/maxhp<.1)
					{
						HealthBar ="[          ]";
					}
						
					if(monhp/monmaxhp==1)
					{
						MonBar ="[||||||||||]";
					}
					if(monhp/monmaxhp>=.9&&monhp/monmaxhp<1)
					{
						MonBar ="[||||||||| ]";
					}
					if(monhp/monmaxhp>=.8&&monhp/monmaxhp<.9)
					{
						MonBar ="[||||||||  ]";
					}				
					if(monhp/monmaxhp>=.7&&monhp/monmaxhp<.8)
					{
						MonBar ="[|||||||   ]";
					}				
					if(monhp/monmaxhp>=.6&&monhp/monmaxhp<.7)
					{
						MonBar ="[||||||    ]";
					}				
					if(monhp/monmaxhp>=.5&&monhp/monmaxhp<.6)
					{
						MonBar ="[|||||     ]";
					}				
					if(monhp/monmaxhp>=.4&&monhp/monmaxhp<.5)
					{
						MonBar ="[||||      ]";
					}				
					if(monhp/monmaxhp>=.3&&monhp/monmaxhp<.4)
					{
						MonBar ="[|||       ]";
					}				
					if(monhp/monmaxhp>=.2&&monhp/monmaxhp<.3)
					{
						MonBar ="[||        ]";
					}				
					if(monhp/monmaxhp>=.1&&monhp/monmaxhp<.2)
					{
						MonBar ="[|         ]";
					}
					if(monhp/monmaxhp<.1)
					{
						MonBar ="[          ]";
					}
						
					System.out.println(com.getName() + "                    " + monster);
					System.out.println("HP: " + myhp + "/" + maxhp + "           HP: " + monhp + "/" + monmaxhp);
					System.out.println( HealthBar + "            "  + MonBar);
					System.out.println(" ");
					System.out.println("BATTLE MENU -----------------------------------");
					System.out.println("1)Attack");
					System.out.println("2)Skill");
					System.out.println("3)Item ");
					System.out.println("4)Flee ");
					System.out.print("Chose your action:  "); 
					com.setBattle();
					System.out.println("-----------------------------------------------");
						
					for(int in=0 ;in<25;in++)
					System.out.println();
						
					if (com.getBattle().equals("1"))
					{
						mpcounter=0;
						
						System.out.println("BATTLE MODE -----------------------------------");
						randmonatk=(int)((Math.random()*monexp));
						monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

						if(randmonatk>=(.8*monexp))
						{
							System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
						}

						if(randmonatk==0)
						{
							System.out.println(monster + " missed");
						}
				
						if(randmonatk>0 && randmonatk<(.8*monexp))
						{
							System.out.println(monster + " does " + monatk + " damage on " + com.getName());
						}
						myhp-=monatk;		
							
						if (myhp<=0)
						{
							break;
						}

						randatk=(float)(Math.random());
						myatk=(int)((((str * 5.0)/ 100) * atk)*randatk);

						if(randatk>=.8)
						{
							if(!weapon.equals("Pair of ChopSticks") && !weapon.equals("ChopSticks Sword")) //jon
							{
								System.out.println(com.getName() + " does a CRITICAL HIT on " + monster + " for " + myatk);
							}
							
							if(weapon.equals("Pair of ChopSticks") || weapon.equals("ChopSticks Sword"))
							{
								myatk=50;
								System.out.println("The pair of ChopSticks begins to glow and does 50 damage to " + monster);
								System.out.println(com.getName()+" also got healed for 10 HP");
								
								if (myhp<(maxhp-10))
								{
									myhp+=10;
								}
									
								else if (myhp>=(maxhp-10))
								{
									myhp=maxhp;
								}
							}
						}
	
							if(randatk<=.1)
							{
								System.out.println(com.getName() + " missed");
							}
				
							if (randatk>.1 && randatk<.8)
							{
								System.out.println(com.getName() + " does " + myatk + " damage on " + monster);
							}
							monhp-=myatk;
							
							if (monhp<=0)
							{
								break;
							}

							if(burn==1)
							{
								myhp=myhp-5;
							}
							System.out.println("-----------------------------------------------");
						}
						if(com.getBattle().equals("2"))
						{
						
							if(mymp/maxmp==1)
							{
								MPBar ="[||||||||||]";
							}
							if(mymp/maxmp>=.9&&mymp/maxmp<1)
							{
								MPBar ="[||||||||| ]";
							}
							if(mymp/maxmp>=.8&&mymp/maxmp<.9)
							{
								MPBar ="[||||||||  ]";
							}				
							if(mymp/maxmp>=.7&&mymp/maxmp<.8)
							{
								MPBar ="[|||||||   ]";
							}				
							if(mymp/maxmp>=.6&&mymp/maxmp<.7)
							{
								MPBar ="[||||||    ]";
							}				
							if(mymp/maxmp>=.5&&mymp/maxmp<.6)
							{
								MPBar ="[|||||     ]";
							}				
							if(mymp/maxmp>=.4&&mymp/maxmp<.5)
							{
								MPBar ="[||||      ]";
							}				
							if(mymp/maxmp>=.3&&mymp/maxmp<.4)
							{
								MPBar ="[|||       ]";
							}				
							if(mymp/maxmp>=.2&&mymp/maxmp<.3)
							{
								MPBar ="[||        ]";
							}				
							if(mymp/maxmp>=.1&&mymp/maxmp<.2)
							{
								MPBar ="[|         ]";
							}
							if(mymp/maxmp<.1)
							{
								MPBar ="[          ]";
							}
							
							System.out.println("MP: " + MPBar + " "+mymp + "/" + maxmp);
							System.out.println("1.SlashBlast   4 MP");
							
							if(skillcounter==1)
							{
								System.out.println("2.Sonic Blast   12 MP");
							}
							if(skillcounter==2)
							{
								System.out.println("2.Sonic Blast   12 MP");
								System.out.println("3.Slice and Dice   18 MP");
							}
							if(skillcounter==3)
							{	
								System.out.println("2.Sonic Blast   12 MP");
								System.out.println("3.Slice and Dice   18 MP");
								System.out.println("4.Omni Slash   30 MP");
							}
							
							if(cure==1)
							{
								System.out.println("0.Cure   20 MP");
							}
							
							System.out.print("You choice is: ");
							com.setmp();
							for(int in=0 ;in<25;in++)
							System.out.println();
							
							if(com.getmp().equals("0")&&cure==1)
							{
								if(mymp<20)
								{
									System.out.println("Not enough MP");
									System.out.println("-----------------------------------------------");
								}
								
								if(mymp>=20)
								{
									mpcounter=0;
									
									mymp=mymp-20;
									
									System.out.println("BATTLE MODE -----------------------------------");

									System.out.println(com.getName() + " use Cure on himself ");
		
									myhp= maxhp;
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
																	
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
							
							
							if(com.getmp().equals("1"))
							{
								if(mymp<4)
								{
									System.out.println("Not enough MP");
									System.out.println("-----------------------------------------------");
								}
								
								if(mymp>=4)
								{
									mpcounter=0;
									
									mymp=mymp-4;
									
									System.out.println("BATTLE MODE -----------------------------------");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
									myatk=(int)((((str * 7.0)/ 100) * atk)*randatk);

									System.out.println(com.getName() + " does a SlashBlast on " + monster + " for " + myatk);
		
									monhp-=myatk;
										
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
							
							if(com.getmp().equals("2")&&skillcounter>=1)
							{
								if(mymp<12)
								{
									System.out.println("Not enough MP");
								}
								
								if(mymp>=12)
								{
									mpcounter=0;
									
									mymp=mymp-12;
									
									System.out.println("BATTLE MODE -----------------------------------");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
									myatk=(int)((((str * 10.0)/ 100) * atk)*randatk);

									System.out.println(com.getName() + " does a Sonic Blast on " + monster + " for " + myatk);
		
									monhp-=myatk;
										
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
							
							if(com.getmp().equals("3")&&skillcounter>=2)
							{
								if(mymp<18)
								{
									System.out.println("Not enough MP");
								}
								
								if(mymp>=18)
								{
									mymp=mymp-18;
									mpcounter=0;
									System.out.println("BATTLE MODE -----------------------------------");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
									myatk=(int)((((str * 13.0)/ 100) * atk)*randatk);

									System.out.println(com.getName() + " does a Slice and Dice on " + monster + " for " + myatk);
		
									monhp-=myatk;
										
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
							
							if(com.getmp().equals("4")&&skillcounter>=3)
							{
								if(mymp<30)
								{
									System.out.println("Not enough MP");
								}
								
								if(mymp>=30)
								{
									mymp=mymp-30;
									mpcounter=0;
									System.out.println("BATTLE MODE -----------------------------------");
									randmonatk=(int)((Math.random()*monexp));
									monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));

									if(randmonatk>=(.8*monexp))
									{
										System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
									}

									if(randmonatk==0)
									{
										System.out.println(monster + " missed");
									}
							
									if(randmonatk>0 && randmonatk<(.8*monexp))
									{
										System.out.println(monster + " does " + monatk + " damage on " + com.getName());
									}
									myhp-=monatk;		
										
									if (myhp<=0)
									{
										break;
									}

									randatk=(float)(Math.random());
									myatk=(int)((((str * 15.0)/ 100) * atk)*randatk);

									System.out.println(com.getName() + " does a Omni Slash on " + monster + " for " + myatk);
		
									monhp-=myatk;
										
									if (monhp<=0)
									{
										break;
									}

									if(burn==1)
									{
										myhp=myhp-5;
									}
									System.out.println("-----------------------------------------------");
								}
							}	
						}
						if (com.getBattle().equals("3"))
						{
							System.out.println("1. Potion x" + potion);
							System.out.println("2. Hi-Potion x" + hipotion);
							System.out.println("3. Back");
							System.out.print("You choice is: ");
							com.setItem();
							
							if (com.getItem().equals("1") && potion==0)
							{
								System.out.println("Not enough potion");
								System.out.println("---------------------------------");
							}
							
							if (com.getItem().equals("1") && potion>0)
							{
								if (myhp==maxhp)
								{
									System.out.println("You don't need to use this potion");
								}

								else 
								{
									System.out.println("The potion has healed you");
									
									if (myhp<(maxhp-10))
									{
										myhp+=10;
										potion--;
									}
									
									else if (myhp>=(maxhp-10))
									{
										myhp=maxhp;
										potion--;
									}
								}
								
								System.out.println("---------------------------------");
							}

							if (com.getItem().equals("2") && hipotion==0)
							{
								System.out.println("Not enough Hi-Potion");
								System.out.println("---------------------------------");
							}
							
							if (com.getItem().equals("2") && hipotion>0)
							{
								if (myhp==maxhp)
								{
									System.out.println("You don't need to use this Hi-Potion");
								}

								else 
								{
									System.out.println("The Hi-Potion has healed you");
									
									if (myhp<(maxhp-50))
									{
										myhp+=50;
										hipotion--;
									}
									
									else if (myhp>=(maxhp-50))
									{
										myhp=maxhp;
										hipotion--;
									}
								}
								
								System.out.println("---------------------------------");
							}
						}

						if (com.getBattle().equals("4"))
						{
							randflee=(int)(Math.random()*4);	
							
							if (randflee<=2)
							{	
								System.out.println("BATTLE OVER -----------------------------------");
								System.out.println(com.getName() + " has successfully fled the battle");
								System.out.println("-----------------------------------------------");
								break;
							}
							
							if (randflee>2)
							{
								System.out.println("BATTLE MODE -----------------------------------");
								System.out.println(com.getName() + " has failed to flee the battle");
								randmonatk=(int)((Math.random()*monexp));
								monatk=(int)(randmonatk-(((def+mail) * 5.0)/ 100));
								mpcounter=0;
								if(randmonatk>=(.8*monexp))
								{
									System.out.println(monster + " uses " + SATK + " on " + com.getName() + " for " + monatk);
								}

								if(randmonatk==0)
								{
									System.out.println(monster + " missed");
								}
				
								if(randmonatk>0 && randmonatk<(.8*monexp))
								{
									System.out.println(monster + " does " + monatk + " damage on " + com.getName());
								}
								myhp-=monatk;		
							
								if (myhp<=0)
								{
									break;
								}
								System.out.println("-----------------------------------------------");
							}
						}

					 }
					 
					if (monhp<=0)
					{
						System.out.println("---------------------------------");
						System.out.println(com.getName() + " killed " + monster);
						System.out.println("---------------------------------");
						System.out.println("Rewards: ");
						System.out.println(mongold + " gold");
						mygold+=mongold;
						System.out.println(monexp + " exp"); 
						myexp+=monexp;    

						randomitem=(int)(Math.random()*10);
						if(randomitem==1)
						{
							System.out.println("You found a Potion on the ground");	
							potion++;
						}

						System.out.println(" ");
						System.out.println("BATTLE OVER -----------------------------------");
						System.out.println("-----------------------------------------------");
						System.out.println(" ");
					}

					if (myhp<=0)
					{
						System.out.println("---------------------------------");
						System.out.println(monster + " killed " + com.getName());
						System.out.println("---------------------------------");
						System.out.println("You lost some exp and gold");
						if ((needexp*.07)<myexp)
						{
							myexp-=(needexp*.07);    
						}
	
						if ((needexp*.07)>=myexp)
						{
							myexp=0;
						}
						mygold=mygold/2;
						myhp=maxhp/2;
						System.out.println(" ");
						System.out.println("BATTLE OVER -----------------------------------");
						System.out.println("-----------------------------------------------");
						System.out.println(" ");
					}
				}
				
		if(myexp>=needexp)
		{
			level++;
			myhp=level*10;
			maxhp=myhp;
			mymp=maxmp+5;
			maxmp=mymp;
			myexp=0;
			needexp=level*10;
			point+=3;
			counterLVL=" [LEVEL UP!] You have 3 more stat points now!";
			
			if(level==5||level==10||level==15)
			{
				if(level==5)
				{
					skill="Sonic Slash";
					skillcounter=1;
				}
				if(level==10)
				{
					skill="Slice and Dice";
					skillcounter=2;
				}
				if(level==15)
				{
					skill="Omni Slash";
					skillcounter=3;
				}
				
				System.out.println("You have learned the skill " + skill);	
			}
		}
			
			 a = " ";
			 if(chart==0)
			 {
			 	a = "O";
			 }
			 b = " ";
			 c = " ";
			 d = " ";
			 e = " ";
			 f = " ";
			 g = " ";
			 h = " ";
			 i = " ";
			 j = " ";
			 k = " ";
			 l = " ";
			 m = " ";
			 n = " ";
			 o = " ";
			 p = " ";
			 q = " ";
			 r = " ";
			 s = " ";
			 t = " ";
			 u = " ";
			 v = " ";
			 w = " ";
			 x = " ";
			 y = " ";
			 z = " ";
			 ab = " ";
			 ac = " ";
			 ad = " ";
			 ae = " ";
			 af = " ";
			 ag = " ";
			 ah = " ";
			 ai = " ";
			 aj = " ";
			 ak = " ";
			 al = " ";
			 am = " ";
			 an = " ";
			 if (chart==1)
			 {
				al="O";
				c="B";
			 }
			 ao = " ";
			 ap = " ";
			 aq = " ";
			 if(chart==2)
			 {
			 	f = " ";
			 	t = " ";
			 	aq = "O";
			 	s="O";
			 	x=" ";
				ag=" ";
				b=" ";
				ao=" ";
			  }
			  
			 if(chart==3)
			{
				x="O";
				ag="T";
				b="G";
				ao="O";
				m=" ";
			}
				
			if (chart==0)
			 {	
			 	f = "O";
			 	t = "T";
			 }
			 
			 if(chart==4)
			 {
			 	d="O";
			 	ag=" ";
				b=" ";
				ao=" ";
				m="Z";
			 }
			 
			if(Ver==1&&Hor==1)
			{
				if(chart==0||chart==2||chart==3||chart==4)
				{
					al = "X";
				}
				if (chart==1)
				{
					chart=0;
					f= "O";
					t= "T";
					Ver=7;
					Hor=5;
					al=" ";
					c=" ";
					a="O";
				}	
			}
			
			if(Ver==1&&Hor==2)
			{
				am = "X";
			}
			
			if(Ver==1&&Hor==3)
			{
				an = "X";			
			}
			
			if(Ver==1&&Hor==4)
			{
				ao = "X";
				if(chart==3)
				{
					chart=4;
					ao=" ";
					Ver=7;
					Hor=5;
					e="X";
					ag=" ";
					b=" ";
					ao=" ";
					d="O";
					b=" ";
					ao=" ";
					x=" ";
					m="Z";
				}
			}
			
			if(Ver==1&&Hor==5)
			{
				ap = "X";
			}
			
			if(Ver==1&&Hor==6)
			{
				aq = "X";
				if(chart==2)
				{
					chart=0;
					f= "O";
					t= "T";
					s=" ";
					Ver=7;
					Hor=2;
					al=" ";
					c=" ";
					a="O";
					aq=" ";
					b="X";
				}
			}
			
			if(Ver==2&&Hor==1)
			{
				af = "X";
			}
			
			if(Ver==2&&Hor==2)
			{
				ag = "X";
				
				if(chart==3)
				{
					t = "T";
					System.out.println("Welcome to town");
					System.out.println("---------------------------------");
					
					String world="0";
					while(!(world.equals("4")))
					{
						System.out.println("HP: "+myhp +"/" + maxhp);
						System.out.println("Gold: " + mygold);
						System.out.println("---------------------------------");
						System.out.println("1.Inn  2.Shop  3.Magic Shop  4. Leave");
						System.out.print("Where would you like to go? ");
						com.setMap();
						world=com.getMap();
					
						if(world.equals("1"))
						{
							for(int in=0 ;in<25;in++)
							System.out.println();
							myhp=maxhp;
							System.out.println("Inn Keeper: Have a nice day!");
							System.out.println("Your HP has been fully restored");
						}
						
						if(world.equals("2"))
						{
							for(int in=0 ;in<25;in++)
							System.out.println();
							System.out.println("Shop Keeper: Welcome to shop");
							System.out.println("---------------------------------");
							String store ="0";
							
							while(!(store.equals("9")))
							{	
								System.out.println("-------------Items---------------");
								System.out.println("1. Potion(Heal 10 HP)             5 Gold");
								System.out.println("2. Hi-Potion(Heal 50 HP)         30 Gold");
								System.out.println(" ");
								System.out.println("-------------Sword---------------");
								System.out.println("3. Steel Sword(23 ATK)           100 Gold");
								System.out.println("4. Steel Battle Axe(25 ATK)      150 Gold");
								System.out.println("5. Mithril Sword(30 ATK)         200 Gold");
								System.out.println("6. Mithril Great Sword(40 ATK)   400 Gold");
								System.out.println(" ");
								System.out.println("-------------Armor---------------");
								System.out.println("7. Iron Armor(10 DEF)            150 Gold");
								System.out.println("8. Steel Armor(15 DEF)           200 Gold");
								System.out.println(" ");
								System.out.println("---------------------------------");
								System.out.println("9. Leave");
								System.out.println("---------------------------------");
								System.out.println("You have " + mygold + " gold");
								System.out.println("You have " + potion + " Potions");
								System.out.println("You have " + hipotion + " Hi-Potions");
								System.out.println("---------------------------------");
								System.out.print("Shop Keeper: What would you like to buy? ");
								com.setbuy();
								store = com.getbuy();
								
								if(store.equals("1"))
								{
									if(mygold<5)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}
								
									if(mygold>=5)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-5;
										potion++;
										System.out.println("Shop Keeper: Thank you for buying a Potion ");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("2"))
								{
									if(mygold<30)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}
								
									if(mygold>=30)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-30;
										hipotion++;
										System.out.println("Shop Keeper: Thank you for buying a Hi-Potion ");
										System.out.println("---------------------------------");
									}
								}
		
								if(store.equals("3"))
								{
									if(mygold<100)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}

								if (atk>=23)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								

									if(mygold>=100 && atk<23)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-100;
										atk=23;
										weapon="Steel Sword";
										System.out.println("Shop Keeper: Thank you for buying a Steel Sword");
										System.out.println(com.getName() + " has equiped the Steel Sword");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("4"))
								{
									if(mygold<150)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}

								if (atk>=25)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								

									if(mygold>=150 && atk<25)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-150;
										atk=25;
										weapon="Steel Battle Axe";
										System.out.println("Shop Keeper: Thank you for buying a Steel Battle Axe");
										System.out.println(com.getName() + " has equiped the Steel Battle Axe");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("5"))
								{
									if(mygold<200)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}

									if (atk>=30)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								

									if(mygold>=200 && atk<30)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-200;
										atk=30;
										weapon="Mithril Sword";
										System.out.println("Shop Keeper: Thank you for buying a Mithril Sword");
										System.out.println(com.getName() + " has equiped the Mithril Sword");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("6"))
								{
									if(mygold<400)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}
									
									if (atk>=ironsword)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								

									if(mygold>=400 && atk<40)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-400;
										atk=40;
										weapon="Mithril Great Sword";
										System.out.println("Shop Keeper: Thank you for buying an Mithril Great Sword");
										System.out.println(com.getName() + " has equiped the Mithril Great Sword");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("7"))
								{
									if(mygold<150)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}
								if (mail>=10)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								
									if(mygold>=150 && mail<10)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-150;
										mail=10;
										armor="Iron Armorr";
										System.out.println("Shop Keeper: Thank you for buying a Iron Armor");
										System.out.println(com.getName() + " has equiped the Iron Armor");
										System.out.println("---------------------------------");
									}
								}


								if(store.equals("8"))
								{
									if(mygold<200)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										System.out.println("Shop Keeper: Not enough money");
										System.out.println("---------------------------------");
									}
									
									if (mail>=15)
									{
										System.out.println("Shop Keeper: You already have this item");
									}
								
									if(mygold>=200 && mail<15)
									{
										for(int in=0 ;in<25;in++)
										System.out.println();
										
										mygold=mygold-200;
										mail=15;
										armor="Steel Armor";
										System.out.println("Shop Keeper: Thank you for buying a Steel Armor");
										System.out.println(com.getName() + " has equiped the Steel Armor");
										System.out.println("---------------------------------");
									}
								}

								if(store.equals("9"))
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Thank you for coming ");
								}
							}
						}

						if(world.equals("3"))
						{
							if(ginseng==0&&ginsengx!=0)
							{
								for(int in=0 ;in<25;in++)
								System.out.println();
								System.out.println("???: Get me some ginseng....");	
								System.out.println("---------------------------------");	
							}
						
							if(ginsengx==0&&ginseng==0)
							{
								for(int in=0 ;in<25;in++)
								System.out.println();
								System.out.println("A shady person in a robe sits in the corner of the magic shop");
								System.out.println("???: Welcome...");
								System.out.println(com.getName() + ": Um....I would like to learn to use magic");
								System.out.println("???: Oh really? Go find me some ginseng for the spell...");
								System.out.println("???: Then I'll teach you what you want...");
								System.out.println(com.getName() + ": -_-' what a weirdo...");
								System.out.println("---------------------------------");
								ginsengx++;
							}
							
							if(ginseng>0&&ginsengCounter==0&&ginsengx!=0)
							{
								for(int in=0 ;in<25;in++)
								System.out.println();
								System.out.println("???: So you managed to live...");
								System.out.println(com.getName() + ": managed to live?! I was so close to dying!!");	
								System.out.println("???: and?...");
								System.out.println(com.getName() + ": -_-' ");
								System.out.println("???: I'll grant you a new ablity");
								System.out.println(com.getName() + " have learned Cure");	
								System.out.println(com.getName() + ": Yes! I now own!");	
								System.out.println("---------------------------------");
								ginseng--;
								ginsengCounter++;
								cure=1;
							}
							
							if(ginseng>0&&ginsengCounter!=0&&ginsengx!=0)
							{
								for(int in=0 ;in<25;in++)
								System.out.println();
								System.out.println("???: I see you got some..Give me one...");
								ginseng--;	
								System.out.println(com.getName() + " feels a little bit stronger");	
								maxmp=maxmp+10;
								System.out.println("---------------------------------");		
							}
						}
						
						if(world.equals("4"))
						{
							for(int in=0 ;in<25;in++)
							System.out.println();
						}
						
						if(!(world.equals("4"))&&!(world.equals("3"))&&!(world.equals("2"))&&!(world.equals("1")))
						{
							for(int in=0 ;in<25;in++)
							System.out.println();
						}
					}
					t=" ";
				}
			}
			
			if(Ver==2&&Hor==3)
			{
				ah = "X";
			}
			
			if(Ver==2&&Hor==4)
			{
				ai = "X";
			}
			
			if(Ver==2&&Hor==5)
			{
				aj = "X";
			}
			
			if(Ver==2&&Hor==6)
			{
				ak = "X";
			}
			
			if(Ver==3&&Hor==1)
			{
				y = "X";
			}
			
			if(Ver==3&&Hor==2)
			{
				z = "X";
			}
			
			if(Ver==3&&Hor==3)
			{
				ab = "X";
			}
			
			if(Ver==3&&Hor==4)
			{
				ac = "X";
			}
			
			if(Ver==3&&Hor==5)
			{
				ad = "X";
			}
			
			if(Ver==3&&Hor==6)
			{
				ae = "X";
			}
						
			if(Ver==4&&Hor==1)
			{
				s = "X";
				if(chart==2)
				{
					Ver=3;
					Hor=6;
					ae="X";
					chart=3;
					x="O";
					s= " ";
					aq=" ";
					ag="T";
					b= "G";
					ao="O";
				}
			}
			
			if(Ver==4&&Hor==2)
			{
				if(chart==0)
				{
				t = "T";
				System.out.println("Welcome to town");
				System.out.println("---------------------------------");
				
				String world="0";
				while(!(world.equals("4")))
				{
					System.out.println("HP: "+myhp +"/" + maxhp);
					System.out.println("Gold: " + mygold);
					System.out.println("---------------------------------");
					System.out.println("1.Inn  2.Shop  3.Trader  4. Leave");
					System.out.print("Where would you like to go? ");
					com.setMap();
					world=com.getMap();
				
					if(world.equals("1"))
					{
						for(int in=0 ;in<25;in++)
						System.out.println();
						myhp=maxhp;
						System.out.println("Inn Keeper: Have a nice day!");
						System.out.println("Your HP has been fully restored");
					}
					
					if(world.equals("2"))
					{
						for(int in=0 ;in<25;in++)
						System.out.println();
						System.out.println("Shop Keeper: Welcome to shop");
						System.out.println("---------------------------------");
						String store ="0";
						
						while(!(store.equals("9")))
						{	
							System.out.println("-------------Items---------------");
							System.out.println("1. Potion(Heal 10 HP)      5 Gold");
							System.out.println("2. Hi-Potion(Heal 50 HP)  30 Gold");
							System.out.println(" ");
							System.out.println("-------------Sword---------------");
							System.out.println("3. Tin Sword(11 ATK)      10 Gold");
							System.out.println("4. Copper Sword(13 ATK)   20 Gold");
							System.out.println("5. Bronze Sword(15 ATK)   30 Gold");
							System.out.println("6. Iron Sword(20 ATK)     50 Gold");
							System.out.println(" ");
							System.out.println("-------------Armor---------------");
							System.out.println("7. Tin Armor(4 DEF)       20 Gold");
							System.out.println("8. Bronze Armor(7 DEF)    40 Gold");
							System.out.println(" ");
							System.out.println("---------------------------------");
							System.out.println("9. Leave");
							System.out.println("---------------------------------");
							System.out.println("You have " + mygold + " gold");
							System.out.println("You have " + potion + " Potions");
							System.out.println("You have " + hipotion + " Hi-Potions");
							System.out.println("---------------------------------");
							System.out.print("Shop Keeper: What would you like to buy? ");
							com.setbuy();
							store = com.getbuy();
							
							if(store.equals("1"))
							{
								if(mygold<5)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}
							
								if(mygold>=5)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-5;
									potion++;
									System.out.println("Shop Keeper: Thank you for buying a Potion ");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("2"))
							{
								if(mygold<30)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}
							
								if(mygold>=30)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-30;
									hipotion++;
									System.out.println("Shop Keeper: Thank you for buying a Hi-Potion ");
									System.out.println("---------------------------------");
								}
							}
	
							if(store.equals("3"))
							{
								if(mygold<10)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}

							if (atk>=tinsword)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							

								if(mygold>=10 && atk<tinsword)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-10;
									atk=tinsword;
									weapon="Tin Sword";
									System.out.println("Shop Keeper: Thank you for buying a Tin Sword");
									System.out.println(com.getName() + " has equiped the Tin Sword");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("4"))
							{
								if(mygold<20)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}

							if (atk>=coppersword)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							

								if(mygold>=20 && atk<coppersword)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-20;
									atk=coppersword;
									weapon="Copper Sword";
									System.out.println("Shop Keeper: Thank you for buying a Copper Sword");
									System.out.println(com.getName() + " has equiped the Copper Sword");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("5"))
							{
								if(mygold<30)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}

							if (atk>=bronzesword)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							

								if(mygold>=30 && atk<bronzesword)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-30;
									atk=bronzesword;
									weapon="Bronze Sword";
									System.out.println("Shop Keeper: Thank you for buying a bronze sword");
									System.out.println(com.getName() + " has equiped the bronze sword");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("6"))
							{
								if(mygold<50)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}
								
								if (atk>=ironsword)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							

								if(mygold>=50 && atk<ironsword)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-50;
									atk=ironsword;
									weapon="Iron Sword";
									System.out.println("Shop Keeper: Thank you for buying an Iron Sword");
									System.out.println(com.getName() + " has equiped the Iron Sword");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("7"))
							{
								if(mygold<20)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}
							if (mail>=tincloth)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							
								if(mygold>=20 && mail<tincloth)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-20;
									mail=tincloth;
									armor="Tin Armor";
									System.out.println("Shop Keeper: Thank you for buying a Tin Armor");
									System.out.println(com.getName() + " has equiped the Tin Armor");
									System.out.println("---------------------------------");
								}
							}


							if(store.equals("8"))
							{
								if(mygold<40)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									System.out.println("Shop Keeper: Not enough money");
									System.out.println("---------------------------------");
								}
								
								if (mail>=bronzecloth)
								{
									System.out.println("Shop Keeper: You already have this item");
								}
							
								if(mygold>=40 && mail<bronzecloth)
								{
									for(int in=0 ;in<25;in++)
									System.out.println();
									
									mygold=mygold-40;
									mail=bronzecloth;
									armor="Bronze Armor";
									System.out.println("Shop Keeper: Thank you for buying a Bronze Armor");
									System.out.println(com.getName() + " has equiped the Bronze Armor");
									System.out.println("---------------------------------");
								}
							}

							if(store.equals("9"))
							{
								for(int in=0 ;in<25;in++)
								System.out.println();
								System.out.println("Shop Keeper: Thank you for coming ");
							}
						}
					}

					if(world.equals("3"))
					{
						for(int in=0 ;in<25;in++)
						System.out.println();
						countTrader++;

						if(countTrader==1)
						{
							System.out.println("Trader: Hey you! The kid with the " + weapon);
							System.out.println(com.getName() + ": M-M-Me? ");
							System.out.println("Trader: Yeah, I need to ask you a favor");
							System.out.println("Trader: I was told to get the tail of this beast NorthEast from here");
							System.out.println("Trader: But I'm not fighter you see, so I'll reward you if you get me some");
							System.out.println(com.getName() + ": Sweet! That monster is going down!");
							System.out.println("---------------------------------");
						}

						if(countTrader>1&&tail==0)
						{
							System.out.println("Trader: I see you're tailless");
							System.out.println("Trader: Remember! NorthEast from here!");
							System.out.println("---------------------------------");
						}

						if(countTrader>1&&tail<0)
						{
							if(!(weapon.equals("BAOser's Sword"))&&BAO==0)
							{
								System.out.println("Trader: If I remember correctly, the beast had other treasures...");
								System.out.println("---------------------------------");
							}
							
							if(weapon.equals("BAOser's Sword"))
							{
								System.out.println("Trader: Wha... is that the lengendary BAOser's Sword?!");
								System.out.println("Trader: If you find a pair of magical chopsticks...");
								System.out.println("Trader: I can fuse them together for you to make something special");
								System.out.print("Trader: So can I hold the BAOser's Sword for you?  (1=Yes, 2=No) ");
								com.setchopstick();
								
								if(com.getchopstick().equals("1"))
								{
									atk=10;
									weapon="Wooden Sword";
									BAO=1;
									System.out.println("Trader: Now go find the chopsticks");
									System.out.println("Trader: Its in town somewhere...");
								}		
								
								System.out.println("---------------------------------");
								
							}
							
							if(weapon.equals("Pair of ChopSticks")&&BAO==1)
							{
								System.out.println("Trader: Why! Thats the magical chopsticks!");
								System.out.println("Trader takes the chopsticks from you");
								System.out.println("Trader: There! Its done! Its a work of art");
								System.out.println(com.getName() + " equips ChopSticks Sword!");
								atk=30;
								weapon="ChopSticks Sword";
								ChopStickPower=1;
								System.out.println("---------------------------------");
							}
						}

						if(countTrader>1&&tail>0)
						{
							System.out.println("Trader: Thanks for getting me this tail!");
							tail=tail-2;
							System.out.println("Trader: A reward as promise");
							System.out.println("You have received 100 gold and 5 Hi-Potion!");
							mygold=mygold+100;
							hipotion=hipotion+5;
							System.out.println(" ");
							System.out.println("Trader: If I remember correctly, the beast had other treasures...");
							System.out.println("---------------------------------");
						}
						
					}
					
					if(world.equals("5"))
					{
						for(int in=0 ;in<25;in++)
						System.out.println();
						System.out.println("By looking around, " + com.getName() + " have found a pair of chopsticks in a bowl of pho.");
						System.out.print("Would you like to equip the chopsticks (1 ATK)? (1= Yes, 2 = No) ");
						com.setchopstick();
						
						for(int in=0 ;in<25;in++)
						System.out.println();
						
						if(com.getchopstick().equals("1"))
						{
							System.out.println(com.getName() + " put down his " + weapon);
							System.out.println(" and quickly stuffed the chopsticks in his pocket.");
							atk=1;
							weapon="Pair of ChopSticks";
							ChopStickPower=1;
						}		
					}
					
					if(!(world.equals("5"))&&!(world.equals("4"))&&!(world.equals("3"))&&!(world.equals("2"))&&!(world.equals("1")))
					{
						for(int in=0 ;in<25;in++)
						System.out.println();
					}
					System.out.println("---------------------------------");
				}
				
					for(int in=0 ;in<25;in++)
					System.out.println();
			}
			if(chart!=0)
			{
				t = "X";
			}
			
			}
			
			if(Ver==4&&Hor==3)
			{
				u = "X";
			}
			
			if(Ver==4&&Hor==4)
			{
				v = "X";
			}
			
			if(Ver==4&&Hor==5)
			{
				w = "X";
			}
			
			if(Ver==4&&Hor==6)
			{
				x = "X";
				if(chart==3)
				{
				 	chart=2;
					Ver=3;
					Hor=1;
					y= "X";
					x=" ";
					f = " ";
			 		t = " ";
			 		a = " ";
			 		aq ="O";
			 		s="O";
			 		ag=" ";
					b=" ";
					ao=" ";
				}
			}
						
			if(Ver==5&&Hor==1)
			{
				m = "X";
				if(chart==4)
				{
					m= "Z";
				}
			}
			
			if(Ver==5&&Hor==2)
			{
				n = "X";
			}
			
			if(Ver==5&&Hor==3)
			{
				o = "X";
			}
			
			if(Ver==5&&Hor==4)
			{
				p = "X";
			}
			
			if(Ver==5&&Hor==5)
			{
				q = "X";
			}
			
			if(Ver==5&&Hor==6)
			{
				r = "X";
			}
			
			if(Ver==6&&Hor==1)
			{
				g = "X";
			}
			
			if(Ver==6&&Hor==2)
			{
				h = "X";
			}
			
			if(Ver==6&&Hor==3)
			{
				i = "X";
			}
			
			if(Ver==6&&Hor==4)
			{
				j = "X";
			}
			
			if(Ver==6&&Hor==5)
			{
				k = "X";
			}
			
			if(Ver==6&&Hor==6)
			{
				l = "X";
			}
			
			if(Ver==7&&Hor==1)
			{
				a = "X";
				if(chart==0)
				{
					chart=2;
					f = " ";
			 		t = " ";
			 		a = " ";
			 		ap = "X";
			 		aq ="O";
			 		Ver=1;
			 		Hor=5;
			 		s="O";
				}
			}
			
			if(Ver==7&&Hor==2)
			{
				b = "X";
			}
			
			if(Ver==7&&Hor==3)
			{
				c = "X";
			}
			
			if(Ver==7&&Hor==4)
			{
				d = "X";
				if(chart==4)
				{
					chart =3;
					Ver=1;
					Hor=5;
					s= " ";
					aq=" ";
					ag="T";
					b= "G";
					ao="O";
					d=" ";
					ap="X";
					x="O";
					f = " ";
			 		t = " ";
			 		a = " ";
			 		m=" ";
			 		
				}
			}
			
			if(Ver==7&&Hor==5)
			{
				e = "X";
			}
			
			if(Ver==7&&Hor==6)
			{
				if (chart!=0)
				{
					f="X";			
				}

				if (chart==0)
				{
					chart=1;

					f= " ";
					t= " ";
					a=" ";
					am="X";
					Ver=1;
					Hor=2;
					al="O";	
					c="B";				
				}
			}	
		}
	}
}