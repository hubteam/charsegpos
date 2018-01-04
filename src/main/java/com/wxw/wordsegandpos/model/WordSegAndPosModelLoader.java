package com.wxw.wordsegandpos.model;

import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.cmdline.ModelLoader;

/**
 * 中文基于字的词性标注模型加载
 * @author 王馨苇
 *
 */
public final class WordSegAndPosModelLoader extends ModelLoader<WordSegAndPosModel>{

	public WordSegAndPosModelLoader() {
		super("wordSegAndPos Model");
	}

	@Override
	protected WordSegAndPosModel loadModel(InputStream modelIn) throws IOException {
		return new WordSegAndPosModel(modelIn);
	}
}
