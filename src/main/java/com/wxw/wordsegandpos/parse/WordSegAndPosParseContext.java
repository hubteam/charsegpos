package com.wxw.wordsegandpos.parse;

import com.wxw.wordsegandpos.samplestream.WordSegAndPosSample;

/**
 * 解析不同类型的文本语料的策略模式上下文类
 * @author 王馨苇
 *
 */
public class WordSegAndPosParseContext {

	private String sentence;
	private WordSegAndPosParseStrategy strage;
	private WordSegAndPosParseNews parse;
	
	/**
	 * 构造函数
	 * @param strage 解析语料对应的策略类
	 * @param sentence 要解析的语句
	 */
	public WordSegAndPosParseContext(WordSegAndPosParseStrategy strage,String sentence){
		this.sentence = sentence;
		this.strage = strage;
	}
	
	/**
	 * 解析语句
	 * @return 解析之后要的格式
	 */
	public WordSegAndPosSample parseSample(){
		return strage.parse(sentence);
	}

}
