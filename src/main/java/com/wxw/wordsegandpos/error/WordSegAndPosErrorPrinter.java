package com.wxw.wordsegandpos.error;

import java.io.OutputStream;
import java.io.PrintStream;

import com.wxw.wordsegandpos.evaluate.WordSegAndPosEvaluateMonitor;
import com.wxw.wordsegandpos.samplestream.WordSegAndPosSample;

/**
 * 打印错误信息类 
 * @author 王馨苇
 *
 */
public class WordSegAndPosErrorPrinter extends WordSegAndPosEvaluateMonitor{

	private PrintStream errOut;
	
	public WordSegAndPosErrorPrinter(OutputStream out){
		errOut = new PrintStream(out);
	}
	
	/**
	 * 样本和预测的不一样的时候进行输出
	 * @param reference 参考的样本
	 * @param predict 预测的结果
	 */
	@Override
	public void missclassified(WordSegAndPosSample reference, WordSegAndPosSample predict) {
		 errOut.println("样本的结果：");
		 errOut.print(reference.toSample());
		 errOut.println();
		 errOut.println("预测的结果：");
		 errOut.print(predict.toSample());
		 errOut.println();
	}

	
}
