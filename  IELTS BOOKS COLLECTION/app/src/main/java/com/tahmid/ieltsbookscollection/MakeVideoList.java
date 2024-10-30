
package com.tahmid.ieltsbookscollection;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();


		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 01", R.drawable.i1, "P1_compressed.pdf");
		//==========================================================================*

		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 02", R.drawable.i2, "P2_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 03", R.drawable.i3, "p3_compressed.pdf");
		//==========================================================================*


		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 04", R.drawable.i4, "p4_compressed.pdf");
		//==========================================================================*

		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 05", R.drawable.i5, "P5_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 06", R.drawable.i6, "p6_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 07", R.drawable.i7, "P7_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 08", R.drawable.i8, "p8_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 09", R.drawable.i9, "p9_compressed.pdf");
		//==========================================================================*

		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS PART 10", R.drawable.i10, "P10_compressed.pdf");
		//==========================================================================*




	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

