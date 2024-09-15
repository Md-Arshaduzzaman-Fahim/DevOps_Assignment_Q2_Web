package com.qa.ajkerpatrika.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Constants {
	public static final String LOGIN_PAGE_TITLE = "লগইন - আজকের পত্রিকা";
	public static final String HOME_PAGE_TITTLE = "আজকের পত্রিকা | সারা দেশের স্থানীয় দৈনিক";
	public static final String SECOND_TAB_NAME = "ছবি";
	public static final String WORLD_PAGE_TITLE = "বিশ্ব খবর | International News";
	public static final String COUNTRY_PAGE_TITLE = "সারা দেশ - আজকের পত্রিকা";
	public static final String USANDCANADA_PAGE_TITLE = "যুক্তরাষ্ট্র ও কানাডা - আজকের পত্রিকা";
	public static final String FACTCHECK_PAGETITLE = "ফ্যাক্টচেক | Fact-Check News in Bangla";
	public static final String DHAKA_PAGE_TITLE="ঢাকা - আজকের পত্রিকা";
	
public static final int MORE_MENU_LIST_SIZE = 30;

public static final int TITLE_BAR_NUMBER = 21;

public static final int MOST_RED_NUMBER = 5;

public static final int WEB_LIST_NUMBER = 10;
	
	
	public static List<String> getExpectedmenuList() {
		   List<String> expList = new ArrayList<String>();
		   
		   expList.add("সর্বশেষ");
		   expList.add("জাতীয়");
		   expList.add("রাজনীতি");
		   expList.add("খেলা");
		   expList.add("বিশ্ব");
		   expList.add("সারা দেশ");
		   expList.add("ফ্যাক্টচেক");
		   expList.add("বিনোদন");
		   expList.add("অর্থনীতি");
		   expList.add("প্রযুক্তি");
		   return expList;
	   }
	
	
	public static List<String> getDivisionList() {
		   List<String> dList = new ArrayList<String>();
		   
		   dList.add("বিভাগ");
		   dList.add("ঢাকা");
		   dList.add("চট্টগ্রাম");
		   dList.add("রাজশাহী");
		   dList.add("খুলনা");
		   dList.add("সিলেট");
		   dList.add("বরিশাল");
		   dList.add("রংপুর");
		   dList.add("ময়মনসিংহ");
		   return dList;
	   }

	
	
	public static List<String> getWorldList() {
		   List<String> wlList = new ArrayList<String>();
		   
		   wlList.add("ভারত");
		   wlList.add("পাকিস্তান");
		   wlList.add("চীন");
		   wlList.add("এশিয়া");
		   wlList.add("মধ্যপ্রাচ্য");
		   wlList.add("যুক্তরাষ্ট্র ও কানাডা");
		   wlList.add("লাতিন আমেরিকা");
		   wlList.add("ইউরোপ");
		   wlList.add("আফ্রিকা");
		   
		   
		   return wlList;
	   }

	
	
	public static List<String> getCountryList() {
		   List<String> ctList = new ArrayList<String>();
		   
		   ctList.add("ঢাকা");
		   ctList.add("চট্টগ্রাম");
		   ctList.add("বরিশাল");
		   ctList.add("ময়মনসিংহ");
		   ctList.add("সিলেট");
		   ctList.add("রংপুর");
		   ctList.add("রাজশাহী");
		   ctList.add("খুলনা");
		   
		   return ctList;
	   }
	
	
}
