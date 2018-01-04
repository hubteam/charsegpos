package com.wxw.wordsegandpos.model;

/**
 * 词性标记的接口
 * @author 王馨苇
 *
 */
public interface WordSegAndPos {

	/**
	 * 对生语料进行词性标记
	 * @param words 生语料
	 * @return
	 */
	public String[] wordsegandpos(String words);
	
	/**
	 * 对生语料进行词性标记
	 * @param words 一个个字
	 * @return
	 */
	public String[] wordsegandpos(String[] words);
	
	/**
	 * 对生语料进行分词
	 * @param sentence 生语料
	 * @return
	 */
	public String[] wordseg(String sentence);
	
	/**
	 * 对生语料进行分词
	 * @param characters 生语料分解成的一个个字
	 * @return
	 */
	public String[] wordseg(String[] characters);
}
