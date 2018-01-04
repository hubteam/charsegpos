package com.wxw.wordsegandpos.parse;

import com.wxw.wordsegandpos.samplestream.WordSegAndPosSample;

/**
 * 解析语料接口
 * @author 王馨苇
 *
 */
public interface WordSegAndPosParseStrategy {

	/**
	 * 解析语料读取的一条语句
	 * @param sentence 要解析的句子
	 * @return WordSegPosSample格式的语料信息
	 */
	public WordSegAndPosSample parse(String sentence);
}
