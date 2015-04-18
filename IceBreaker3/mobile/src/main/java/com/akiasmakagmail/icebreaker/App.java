package com.akiasmakagmail.icebreaker;

import android.app.Activity;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App
{
  private static int randomIndex(int n)
  {
    Random randIndex = new Random();
    return randIndex.nextInt(n);
  }//randomIndex
  public static String breakIce()
  {
    String input = "Are you a magician? Because whenever I look at you, everyone else disappears!\n" +
            "I'm not a photographer, but I can picture me and you together.\n" +
            "Are you an interior decorator? Because when I saw you, the entire room became beautiful.\n" +
            "Are you religious? Because you're the answer to all my prayers.\n" +
            "Are you a camera? Because every time I look at you, I smile.\n" +
            "Do you have a Band-Aid? Because I just scraped my knee falling for you.\n" +
            "Do you know what my shirt is made of? Boyfriend material.\n" +
            "If I were a stop light, I'd turn red everytime you passed by, just so I could stare at you a bit longer.\n" +
            "I wanna live in your socks so I can be with you every step of the way.\n" +
            "If you were a vegetable you'd be a cute-cumber.\n" +
            "I seem to have lost my phone number. Can I have yours?\n" +
            "Is your daddy a Baker? Because you've got some nice buns!\n" +
            "There are people who say Disneyland is the happiest place on earth. Apparently, none of them have ever been in your arms.\n" +
            "Did you invent the airplane? Cause you seem Wright for me.\n" +
            "If God made anything more beautiful than you, I'm sure he'd keep it for himself.\n" +
            "Do you have a map? I'm getting lost in your eyes.\n" +
            "I don't have a library card, but do you mind if I check you out?\n" +
            "Are you an orphanage? Cause I wanna give you kids.\n" +
            "I was feeling a little off today, but you definitely turned me on.\n" +
            "Are you my Appendix? Because I have a funny feeling in my stomach that makes me feel like I should take you out.\n" +
            "I'm sorry, I don't think we've met. I wouldn't forget a pretty face like that.\n" +
            "My buddies bet me that I wouldn't be able to start a conversation with the most beautiful girl in the bar. Wanna buy some drinks with their money?\n" +
            "Are you a fruit, because Honeydew you know how fine you look right now?\n" +
            "Does your left eye hurt? Because you've been looking right all day.\n" +
            "I will stop loving you when an apple grows from a mango tree on the 30th of February.\n" +
            "Do you live in a corn field, cause I'm stalking you.\n" +
            "Are you a parking ticket? 'Cause you've got fine written all over you.\n" +
            "You look cold. Want to use me as a blanket?\n" +
            "I'm not drunk, I'm just intoxicated by YOU.\n" +
            "I was so enchanted by your beauty that I ran into that wall over there. So I'm going to need your name and number for insurance purposes.\n" +
            "Is there an airport nearby or is that just my heart taking off?\n" +
            "I'm not staring at your boobs. I'm staring at your heart.\n" +
            "You're the only girl I love now... but in ten years, I'll love another girl. She'll call you 'Mommy.'\n" +
            "Can I take your picture to prove to all my friends that angels do exist?\n" +
            "I tried my best to not feel anything for you. Guess what? I failed.\n" +
            "Your body is 65% water and I'm thirsty.\n" +
            "Hey, don't frown. You never know who could be falling in love with your smile.\n" +
            "My doctor says I'm lacking Vitamin U.\n" +
            "Have you been to the doctor lately? Cause I think you're lacking some Vitamin Me.\n" +
            "Forget about Spiderman, Superman, and Batman. I'll be your man.\n" +
            "Can I follow you home? Cause my parents always told me to follow my dreams.\n" +
            "Because of you, I laugh a little harder, cry a little less, and smile a lot more.\n" +
            "For a moment I thought I had died and gone to heaven. Now I see that I am very much alive, and heaven has been brought to me.\n" +
            "You look so familiar… didn't we take a class together? I could've sworn we had chemistry.\n" +
            "Fascinating. I've been looking at your eyes all night long, 'cause I've never seen such dark eyes with so much light in them.\n" +
            "Was your dad a boxer? Cause you're a knockout!\n" +
            "You're so beautiful that you made me forget my pickup line.\n" +
            "You shouldn't wear makeup. It's messing with perfection!\n" +
            "If I had a star for every time you brightened my day, I'd have a galaxy in my hand.\n" +
            "Damn, if being sexy was a crime, you'd be guilty as charged!\n" +
            "I was wondering if you had an extra heart mine seems to have been stolen\n" +
            "I thought happiness started with an H. Why does mine start with U?\n" +
            "If I were a cat I'd spend all 9 lives with you.\n" +
            "Do you work at Starbucks? Because I like you a latte.\n" +
            "Are you a banana? Because I find you a-peeling\n" +
            "Did you read Dr. Seuss as a kid? Because green eggs and... damn!\n" +
            "Is your dad a drug dealer? Cause you're so Dope!\n" +
            "Smoking is hazardous to your health... and baby, you're killing me!\n" +
            "There isn't a word in the dictionary for how good you look.\n" +
            "Me without you is like a nerd without braces, A shoe without laces, aSentenceWithoutSpaces\n" +
            "Babe, your beauty makes the morning sun look like the dull glimmer of the moon.\n" +
            "Are you from Tennessee? Because you're the only ten I see!\n" +
            "I must be a snowflake, because I've fallen for you.\n" +
            "There is something wrong with my cell phone. It doesn't have your number in it.\n" +
            "Baby, if you were words on a page, you'd be what they call FINE PRINT!\n" +
            "Do you work at Dick's? Cause you're sporting the goods.\n" +
            "You must be a hell of a thief because you stole my heart from across the room.\n" +
            "Do you have a twin sister? Then you must be the most beautiful girl in the world!\n" +
            "You know I'd like to invite you over, but I'm afraid you're so hot that you'll skyrocket my air-conditioning bill.\n" +
            "Excuse me, but I think I dropped something. MY JAW!\n" +
            "If you were a booger I'd pick you first.\n" +
            "Do you know what I did last night? I looked up at the stars, and matched each one with a reason why I love you.\n" +
            "Excuse me, I think you have something in your eye. Oh wait, it's just a sparkle.\n" +
            "If I were to ask you out on a date, would your answer be the same as the answer to this question?\n" +
            "If this bar is a meat market, you must be the prime rib.\n" +
            "Are you lost ma'am? Because heaven is a long way from here.\n" +
            "I'm fighting the urge to make you the happiest woman on earth tonight.\n" +
            "Are you a campfire? Cause you are hot and I want s'more.\n" +
            "You're kinda, sorta, basically, pretty much always on my mind.\n" +
            "Put down that cupake... you're sweet enough already.\n" +
            "You wanna know what's beautiful? Read the first word again.\n" +
            "My love for you is like diarrhea, I just can't hold it in.\n" +
            "Hello, I'm a thief, and I'm here to steal your heart.\n" +
            "Hey baby you're so fine you make me stutter, wha-wha-what's your name?\n" +
            "I bet you $20 you're gonna turn me down.\n" +
            "I'm not actually this tall. I'm sitting on my wallet.\n" +
            "When I first saw you I looked for a signature, because every masterpiece has one.\n" +
            "I like Legos, you like Legos, why don't we build a relationship?\n" +
            "Baby I might not be Sriracha sauce but, I sure will spice up your life.\n" +
            "You may be asked to leave soon, you're making all the other women look bad.\n" +
            "Would you grab my arm so I can tell my friends I've been touched by an angel?\n" +
            "Hey... Didn't I see your name in the dictionary under \"Shazaam!\"?\n" +
            "If a thousand painters worked for a thousand years, they could not create a work of art as beautiful as you.\n" +
            "Of all the beautiful curves on your body, your smile is my favorite.\n" +
            "Did you have lucky charms for breakfast? Because you look magically delicious!\n" +
            "No wonder the sky is grey today, all the blue is in your eyes.\n" +
            "Can I borrow your cell phone? I need to call animal control, because I just saw a fox!\n" +
            "I'm no organ donor but I'd be happy to give you my heart.\n" +
            "If I had a penny for every time I thought of you, I'd have exactly one cent, because you never leave my mind.\n" +
            "Hershey's makes millions of kisses a day.. .all I'm asking for is one from you.\n" +
            "Life without you would be like a broken pencil... pointless.\n" +
            "I may not be a genie, but I can make your dreams come true.\n" +
            "Kiss me if I'm wrong, but dinosaurs still exist, right?\n" +
            "If I received a nickel for everytime I saw someone as beautiful as you, I'd have five cents.\n" +
            "If nothing lasts forever, will you be my nothing?\n" +
            "You are like a candy bar: half sweet and half nuts.\n" +
            "Excuse me, but does this smell like chloroform to you?\n" +
            "Did you clean your pants with Windex? I can practically see myself in them.\n" +
            "How was heaven when you left it?\n" +
            "Did you fart, cause you blew me away.\n" +
            "You know you're in love when you can't fall asleep because reality is finally better than your dreams.\n" +
            "Hey... somebody farted. Let's get out of here.\n" +
            "I didn't know that angels could fly so low!\n" +
            "There must be something wrong with my eyes, I can't take them off you.\n" +
            "You are so fine, I wish I could plant you and grow a whole field of you!\n" +
            "Is your last name Gillette? Because you are the best a man can get.\n" +
            "Is your name \"swiffer\"? 'Cause you just swept me off my feet.\n" +
            "Are you going to kiss me or do I have to lie to my diary?\n" +
            "Are you cold? You look like you could use some hot chocolate... Well, here I am!\n" +
            "If stars would fall everytime I would think of you, the sky would soon be empty.\n" +
            "You know, Dr. Phil says I'm afraid of commitment...Want to help prove him wrong?\n" +
            "Your lips look so lonely.... Would they like to meet mine?\n" +
            "Baby, you're so sweet, you put Hershey's outta business.\n" +
            "Can I buy you a drink or do you just want the money?\n" +
            "Did the sun come out or did you just smile at me?\n" +
            "So there you are! I've been looking all over for YOU, the woman of my dreams!\n" +
            "Do you believe in love at first sight, or should I walk by again?\n" +
            "Inheriting eighty million bucks doesn't mean much when you have a weak heart.\n" +
            "The only thing your eyes haven't told me is your name.\n" +
            "Excuse me, I just noticed you noticing me and I just wanted to give you notice that I noticed you too.\n" +
            "Somebody better call God, cuz heaven's missing an angel!\n" +
            "I'm Mr. Right, someone said you were looking for me?\n" +
            "Can I borrow a kiss? I promise I'll give it back.\n" +
            "If I were a transplant surgeon, I'd give you my heart.\n" +
            "Are you Willy Wonka's daughter, 'cuz you look sweet and delicious.\n" +
            "If you were a transformer, you'd be a HOT-obot, and your name would be Optimus Fine.\n" +
            "I know milk does a body good, but baby, how much have you been drinking?\n" +
            "I play the field, and it looks like I just hit a home run with you.\n" +
            "I'm new in town. Could you give me directions to your apartment?\n" +
            "If I could rearrange the alphabet, I would put 'U' and 'I' together.\n" +
            "If you were a tear in my eye I would not cry for fear of losing you.\n" +
            "If your heart was a prison, I would like to be sentenced for life.\n" +
            "My lenses turn dark in the sunshine of your love.\n" +
            "Was you father an alien? Because there's nothing else like you on Earth!\n" +
            "What time do you have to be back in heaven?\n" +
            "Baby, I'm no Fred Flintstone, but I can make your Bedrock!\n" +
            "Wouldn't we look cute on a wedding cake together?\n" +
            "You'd better direct that beauty somewhere else, you'll set the carpet on fire.\n" +
            "Your legs must be tired because you've been running through my mind all night.\n" +
            "Was your father a thief? 'Cause someone stole the stars from the sky and put them in your eyes.\n" +
            "Do you have a pencil? Cause I want to erase your past and write our future.\n" +
            "I love you like a pig loves not being bacon.\n" +
            "Are your parents bakers? Cause they sure made you a cutie pie!\n" +
            "Did you go to bed early last night? From the looks of it, you got your beauty sleep.\n" +
            "What's on the menu? Me-n-U\n" +
            "You're like pizza. Even when you are bad, you're good\n" +
            "I'd say God Bless you, but it looks like he already did.\n" +
            "I must be in a museum, because you truly are a work of art.\n" +
            "My friend thinks you're kinda cute, but I don't... I think you're absolutely gorgeous!\n" +
            "Let's commit the perfect crime: I'll steal your heart, and you'll steal mine.\n" +
            "You spend so much time in my mind, I should charge you rent.\n" +
            "If kisses were snowflakes, I'd send you a blizzard\n" +
            "Are you my phone charger? Because without you, I'd die.\n" +
            "How come you're not on top of a Christmas tree? I thought that's where angels belonged.\n" +
            "Are you a hipster, because you make my hips stir.\n" +
            "Are you a cat? Cause you are purrrfect\n" +
            "Does your father sell diamonds? Because you are FLAWLESS!\n" +
            "If you were a tropical fruit, you'd be a Fine-apple!\n" +
            "I wish I was cross eyed, so I could see you twice.\n" +
            "Are you on Nickelodeon? Cause you're a-Dora-ble!\n" +
            "I don't know if you're beautiful, I haven't gotten past your eyes yet.\n" +
            "You don't need keys to drive me crazy.\n" +
            "My name isn't Elmo, but you can tickle me any time you want to.\n" +
            "Can you take me to the doctor? Because I just broke my leg falling for you.\n" +
            "People call me John, but you can call me tonight.\n" +
            "You must be a ninja, because you snuck into my heart\n" +
            "I need a dollar, but I only have 90 cents... do you want to be my dime?\n" +
            "Are you a magician??? Because Abraca-DAYUM!\n" +
            "You're so hot, that if you ate a piece of bread, you'd poop out toast!\n" +
            "Be unique and different, say yes.\n" +
            "Your eyes are blue, like the ocean. And baby, I'm lost at sea.\n" +
            "You know how they say skin is the largest organ on the human body? Not in my case.\n" +
            "My lips are like skittles. Wanna taste the rainbow?\n" +
            "They say dating is a numbers game... so can I get your number?\n" +
            "My name isn't Elmo, but you can tickle me any time you want to.\n" +
            "You be the Dairy Queen and I'll be your Burger King: You treat me right, and I'll do it your way.\n" +
            "if I had to choose between breathing or loving you, I would say \"I love you\" with my last breath!\n" +
            "I'm not trying to impress you or anything, but... I'm Batman!\n" +
            "You must be from Pearl Harbor, because baby, you're the bomb.\n" +
            "You must be Jamaican, because Jamaican me crazy.\n" +
            "Do you know karate? Because your body is really kickin'.\n" +
            "When God made you, he was showing off.\n" +
            "Are you a Snickers bar? Cause you satisfy me.\n" +
            "Is your dad a terrorist? Because you are the bomb.\n" +
            "Is your last name Campbell? Cause you're \"mmmm... good!\"\n" +
            "You're like a dictionary, you add meaning to my life!\n" +
            "Baby, you are so fine I could put you on a plate and sop you up with a biscuit.\n" +
            "Is there a rainbow today? I just found the treasure I've been searching for!\n" +
            "You remind me of a magnet, because you sure are attracting me over here!\n" +
            "Hey, is it just me, or are we destined to be married?\n" +
            "Hello. Are you taking any applications for a boy/girlfriend?\n" +
            "I have an \"owie\" on my lip. Will you kiss it and make it better?\n" +
            "Let's make like a fabric softener and 'Snuggle\n" +
            "I didn't see any stars in the sky tonight, the most heavenly body was standing right next to me.\n" +
            "Hi, my name is Doug. That's \"god\" spelled backwards with a little bit of you wrapped up in it.\n" +
            "If I could reach out and hold a star for everytime you've made me smile, I'd hold the sky in the palm of my hand.\n" +
            "Well, here I am. What were your other two wishes?\n" +
            "Should I smile because we are friends, or cry because I know that is what we will ever be?\n" +
            "When I look into your eyes, it is like a gateway into the world of which I want to be a part.\n" +
            "This time next year let’s be laughing together.\n" +
            "Is your last name Whitman, because I want to sample you.\n" +
            "Let me tie your shoes, cause I dont want you falling for anyone else.\n" +
            "On a scale of 1 to 10, you're a 9. I'm the 1 you need.\n" +
            "Most guys need 3 meals a day to keep going... I just need eye contact from you.\n" +
            "Hey baby, I must be a light switch, cuz every time I see you, you turn me on!\n" +
            "Are you a beaver? Cause daaaaam!\n" +
            "I hope your day has been as beautiful as you are.\n" +
            "Do I know you? Cause you look just like my next girlfriend.\n" +
            "Is your father Little Caesar? Cause you look Hot 'n Ready.\n" +
            "I could use some spare change and you're a dime.\n" +
            "I'm no mathematician, but I'm pretty good with numbers. Tell you what, Give me yours and watch what I can do with it.\n" +
            "Didn't I see you on the cover of Vogue?\n" +
            "Have you always been this cute, or did you have to work at it?\n" +
            "Hey, don't I know you? Yeah, you're the girl with the beautiful smile.\n" +
            "Was your father a mechanic? Then how did you get such a finely tuned body?\n" +
            "I have had a really bad day and it always makes me feel better to see a pretty girl smile. So, would you smile for me?\n" +
            "I hope you know CPR, cuz you take my breath away!\n" +
            "I just had to come talk with you. Sweetness is my weakness.\n" +
            "I think I can die happy now, cause I've just seen a piece of heaven.\n" +
            "Apart from being sexy, what do you do for a living?\n" +
            "If I told you that you had a great body, would you hold it against me?\n" +
            "I sneezed because God blessed me with you.\n" +
            "Is it hot in here or is it just you?\n" +
            "So, what do you do for a living besides always making all the men excited and warm all over?\n" +
            "I may not be a genie, but I can make all your wishes come true!\n" +
            "Was your dad king for a day? He must have been to make a princess like you.\n" +
            "Were you arrested earlier? It's gotta be illegal to look that good.\n" +
            "Were your parents Greek Gods, 'cause it takes two gods to make a goddess.\n" +
            "What does it feel like to be the most beautiful girl in this room?\n" +
            "What's that on your face? Oh, must just be beauty. Here, let me get it off. Hey, it's not coming off!\n" +
            "Wow! Are those real?\n" +
            "I blame you for global warming... your hotness is too much for the planet to handle!\n" +
            "You are the reason men fall in love.\n" +
            "Are you Australian? Because you meet all of my koala-fications.\n" +
            "You know the more I drink, the prettier you get!\n" +
            "You know, I would die happy if I saw you naked just once!\n" +
            "If you were ground coffee, you'd be Espresso cause you're so fine.\n" +
            "You better call Life Alert, 'cause I've fallen for you and I can't get up.\n" +
            "You're single. I'm single. Coincidence? I think not.\n" +
            "You know, you might be asked to leave soon. You're making the other women look really bad.\n" +
            "You make me melt like hot fudge on a sundae.\n" +
            "You should be someone's wife.\n" +
            "Were you in Boy Scouts? Because you sure have tied my heart in a knot.\n" +
            "Are you as beautiful on the inside as you are on the outside?\n" +
            "I want to be your tear drop, so I could be born in your eyes, live on your cheeks, and die on your lips.\n" +
            "Babe! you look so fine I could drink your bath water!\n" +
            "You're so hot you would make the devil sweat.\n" +
            "If I had a rose for every time I thought of you, I would be walking through my garden forever.\n" +
            "Hi, I'm writing a term paper on the finer things in life, and I was wondering if I could interview you?\n" +
            "Girl, if I were a fly, I'd be all over you, because you're the shit!\n" +
            "There must be a lightswitch on my forehead because everytime I see you, you turn me on!\n" +
            "Damn girl, you have more curves than a race track.\n" +
            "If you stood in front of a mirror and help up 11 roses, you would see 12 of the most beautiful things in the world.\n" +
            "Do you have a sunburn, or are you always this hot?\n" +
            "You are so beautiful that I would marry your brother just to get into your family.\n" +
            "You look like a cool glass of refreshing water, and I am the thirstiest man in the world.\n" +
            "Are you a tamale? 'Cause you're hot.\n" +
            "You are so beautiful that you give the sun a reason to shine.\n" +
            "Do you bleach your teeth? 'Cause your smile lights up the entire room like a candle in the dark. Let's go prove it.\n" +
            "Someone should call the police, because you just stole my heart!\n" +
            "Stop, drop, and roll, baby. You are on fire.\n" +
            "Baby, you're so hot, you make the equator look like the north pole.\n" +
            "Come live in my heart, and pay no rent.\n" +
            "You're hotter than Papa Bear's porridge.\n" +
            "I hope there's a fire truck nearby, cause you're smokin'!\n" +
            "If it weren't for that DAMNED sun, you'd be the hottest thing ever created.\n" +
            "I just got dumped, and I think that you could make me feel better.\n" +
            "You are a 9 - you'd be a perfect 10 if you were with me.\n" +
            "Excuse me, I'd like to have kids someday, and I wanted to know how your parents created such a beautiful creature.\n" +
            "You're so hot, I bet you could light a candle at 10 paces.\n" +
            "Hey baby, you've got something on your butt - my eyes!\n" +
            "This isn't a beer belly, It's a fuel tank for a love machine.\n" +
            "I don't know you, but I think I love you already.\n" +
            "Here's the key to my house, my car... and my heart.\n" +
            "Is your name Summer? 'Cause you are as hot as hell.\n" +
            "If I had to choose between one night with you or winning the lottery...I would chose winning the lottery...but it would be close...real close...\n" +
            "Do you have any sunscreen? 'Cause you are burning me up!\n" +
            "See these keys? I wish I had the one to your heart.\n" +
            "You, Before I Wake Up From this Dream.\n" +
            "You're hotter than donut grease.\n" +
            "Your eyes are as blue as window cleaner.\n" +
            "Was that an earthquake or did you just rock my world?\n" +
            "If you were a burger at McDonalds, you'd be McGorgeous.\n" +
            "Are your parents retarded, 'cause you sure are special.\n" +
            "If you could put a price tag on beauty you'd be worth more than Fort Knox.\n" +
            "I must be dancing with the devil, because you're hot as hell.\n" +
            "I never need to see the sun again because your eyes light up my world.\n" +
            "If you were a steak you would be well done.\n" +
            "It's dark in here. Wait! It's because all of the light is shining on you.\n" +
            "Your hand looks heavy. Let me hold it for you.\n" +
            "Are you a kidnapper? Because you just abducted my heart.\n" +
            "Can you pull this heart-shaped arrow out of my butt? A damn little kid with wings shot me.\n" +
            "On The Phone\n" +
            "She/He says: \"Hold on\"\n" +
            "You Say: \"Sorry, I can't hold on... I've already fallen for you.\"\n" +
            "Is your body from McDonald's? Cause I'm lovin' it!\n" +
            "Are you a microwave oven? Cause you melt my heart.\n" +
            "Did you get your license suspended for driving so many guys crazy?\n" +
            "Are you a girl scout, cause you tie my heart in knots.\n" +
            "You're so hot, I could bake cookies on you.\n" +
            "You look beautiful today, just like every other day.\n" +
            "Let's play Winnie the Pooh and get my nose stuck in your honey jar.\n" +
            "When I'm older, I'll look back at all of my crowning memories, and I'll think of the day my children were born, the day I got married, and the day that I met you.\n" +
            "If beauty were time, you'd be eternity.\n" +
            "Hello. Cupid called. He says to tell you that he needs my heart back.\n";
    String lines[] = input.split("\\r?\\n");

      int index = randomIndex(lines.length);
        return lines[index];
  }
}