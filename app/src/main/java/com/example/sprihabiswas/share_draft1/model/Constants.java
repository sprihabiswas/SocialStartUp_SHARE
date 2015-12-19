package com.example.sprihabiswas.share_draft1.model;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.adapter.NewsInShortAdapter;
import com.example.sprihabiswas.share_draft1.sb.Fragment_AboutUs;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Events;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Feedback;
import com.example.sprihabiswas.share_draft1.sb.Fragment_LogOut;
import com.example.sprihabiswas.share_draft1.sb.Fragment_News;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Orgs;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Policies;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Profile;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Settings;
import com.example.sprihabiswas.share_draft1.sb.Fragment_SignIn;
import com.example.sprihabiswas.share_draft1.sb.Fragment_Tabs;
import com.example.sprihabiswas.share_draft1.sb.Frgament_SignUp;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Constants {
    public static final String fontpath_bold="fonts/Montserrat-Bold.otf";
    public static final String fontpath_regular="fonts/Montserrat-Regular.otf" ;
    public static final String fontpath_light="fonts/Montserrat-Light.otf" ;
    public static final String fontpath_ultralight="fonts/Montserrat-UltraLight.otf";

    public static final String MyPREFERENCES = "MyPrefs";

    public static final String LoggedInKey="LoggedInTrue";
    public static int logged_in=0;
    public static String user_nameKey="user_name";
    public static String user_emailKey="user_email";


    public static int tab_id=0;
    public static NavigationView mNavigationView;

    //tab_id=0 then login tab fragment else main tab fragment
    public static int num_items[]={2,3};

    public static Fragment signinup[]={new Frgament_SignUp(), new Fragment_SignIn()};
    public static String tab_titles_signinup[]={"REGISTER","LOGIN"};

    public static Fragment main[]={new Fragment_Events(),new Fragment_News(), new Fragment_Orgs()};
    public static String tab_titles_main[]={"EVENTS","NEWS","ORGS"};

    public static Fragment menu_loggedIn[]={new Fragment_Tabs(),new Fragment_Profile(), new Fragment_AboutUs(), new Fragment_Policies(),
            new Fragment_Feedback(), new Fragment_Settings(), new Fragment_LogOut()};
    public static int menu_loggedIn_id[]={R.id.nav_item_home, R.id.nav_item_profile, R.id.nav_item_aboutus, R.id.nav_item_policies,
            R.id.nav_item_feedback, R.id.nav_item_settings, R.id.nav_item_logout};

    public static Fragment menu_loggedOut[]={new Fragment_Tabs(),new Fragment_Tabs(), new Fragment_AboutUs(), new Fragment_Policies(),
        new Fragment_Feedback(), new Fragment_Settings()};
    public static int menu_loggedOut_id[]={R.id.nav_item_home, R.id.nav_item_login, R.id.nav_item_aboutus, R.id.nav_item_policies,
            R.id.nav_item_feedback, R.id.nav_item_settings};

    public static int drawer_menu_ids[]={R.menu.menu_logged_out, R.menu.menu_logged_in};

    public static int EventPosition=0;

    public static int event_photoIds[]={R.drawable.event1,R.drawable.event2,R.drawable.event3};
    public static String event_name[]={"Juhu Beach Clean Up Drive","Run for A Cause","Food for All"};
    public static String event_by[]={"By Youth Club","By Hiranandani Trust","By Akshaya Patra"};
    public static String event_desc[]={"This event aims at giving a platform to the youth to come forward and contribute to the welfare of the society in whatever ways they can."};


    public static int NewsPosition=0;
    public static VerticalViewPager verticalViewPager;
    public static NewsInShortAdapter news_adapter;
    //news_instant
    public static String news_heading[]={"Be the change you wish to see in the world. Go Volunteer!",
    "Bio-fuel from Plastic Trash! Rags to riches. Literally",
    "Waterless Toilets. A hope to end Open-Defecation in India.",
    "When the world sleeps, they learn. Thanks to Night-schools.",
            "Village Drill. A simple tech solution to counter drought.",
            "Working in the social sector – A changing mindset.",
            "Defeating age – A 92 year old wins Gold at World Masters Athletic Championship"};

    public static String news_card_newsinshort[]={
            "How many of us have at some point in time complained about the world - the poverty, the illiteracy, the inequalities? Now, how many of us have helped a stranger, fed a beggar, educated a child - only because they cannot afford it and you can, for them? \n" +
                    "\n" +
                    "Such small acts of volunteerism are a feat of human selflessness, which imbibe the spirit to give, share and better other people’s lives. Do take some time out of your normal routine and volunteer to a cause that is close to your heart. The ripples of good deeds that you create today will be tomorrow’s tsunamis of awesomeness!\n" +
                    "\n" +
                    "Many small people who in many small places do many small things can alter the face of the world – The Berlin Wall\n",

            "A 17-year-old Egyptian teen named AzzaFaid has solved the most precarious problem of plastic waste. Egyptian petroleum research Institute, impressed by her solution, is assisting Azza in converting the plastic waste into bio-fuel. Yes, plastic waste is recyclable now!\n" +
                    "\n" +
                    "Azza’s process promises to stagger the world numbers by making $163 million each year from plastic waste. After receiving accolades from the European Union contest for Young scientists, Azza is on her way to get her process patented. \n" +
                    "\n" +
                    "Young minds like hers are an inspiration for all to make an effort for a better tomorrow.\n",

            "Addressing rural India’s dual shortcomings – lack of water and toilets – Prof. Kishore Munshi, a senior faculty at IIT Bombay has designed a waterless toilet with garnering financial support from the ministry of Drinking Water and Sanitation, along with CTech, an IIT-B incubated designed company.\n" +
                    "\n" +
                    "The “Dry San Hygienic Rural Toilet” is a unique design where water doesn’t need to be flushed. This will play an important role in addressing the problem of open defecation, improve hygiene, and help vulnerable sections including women and children\n",

            "Night-schools, a concept that is more that 150 years old is playing its role in lighting up people’s lives. \n" +
                    "\n" +
                    "Masoom, a Mumbai based NGO is facilitating night-schools in the city for adolescents and adults who work during the day. It provides night schools with mobile science labs, books, evening meals and so on. The students’ thirst for knowledge in each of these schools is incredibly infectious! To encourage volunteership, they have also recently launched a ‘Padhao Mumbai’ campaign. \n" +
                    "\n" +
                    "Night-schools are not only working towards providing the underprivileged a fair chance in the world and but also helping in changing the notion of an awesome, productive night-out for India’s educated urban youth.\n",

            "Even the most complex problems have simple solutions. For example, in drought-affected areas, we see a huge scarcity of water on land. But what about water hiding inside the earth, sitting idly for us to pull it up?\n" +
                    "\n" +
                    "The Village Drill is a simple human-powered borehole drill which does exactly that. Human power, which is essentially the thirsty village folk, is used to drill the hole. Once the borehole is complete and the well pump is attached a village has instant access to lifesaving water.\n" +
                    "\n" +
                    "On average, a Village Drill can drill at least 20 wells per year. With 100 drills in operation it could easily create $25 million worth of wells, bringing clean water to over 2 million people — each and every year. Owing to it’s ease of use, instant impact and community inclusion in the process has made Village Drill an overwhelming success in more than 130 Afrian villages now! \n" +
                    "\n" +
                    "An amazing solution to the current Indian drought problems, isn’t it?\n",
            "There has been a considerable change in the mind set of the youngsters when it comes to social entrepreneurship. Quite a few of them are moving towards working in the unconventional social sector leaving their highly paid jobs. Organizations like Selco, Avanti, Impact Law Ventures are working towards changing the life of the underprivileged. \n" +
                    "\n" +
                    "The happiness and satisfaction that comes from making a difference to the world is unmatchable. In Jim Carry’s words, “The effect that you have on others is the greatest currency that exists”. These social entrepreneurs are the living proof of such a powerful thought.\n",

            "VallabhajosyulaSrimulu, a 92 year old navy veteran has won gold in 10 km speed walk in the 92-94 year category at the World Masters Athletic Championship in France. In December 2010, he won 4 gold medals in the Asian Masters Athletic Championships, Kuala Lumpur. In the world championships held in California in 2011, he won a gold medal in 20km race walk and 2 silver medals in the 5 km and 10 km race walks.\n" +
                    "\n" +
                    "An inspiration to all of us who succumb to their internal fears of not being physically or mentally fit for the job!\n",};

    public static int news_card_photos[]={R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,
            R.drawable.news6,R.drawable.news7,};


}
