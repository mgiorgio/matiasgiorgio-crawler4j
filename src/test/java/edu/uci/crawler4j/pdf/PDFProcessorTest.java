package edu.uci.crawler4j.pdf;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.Test;

/**
 * Tests that an example PDF file is properly parsed.
 * 
 * @author mgiorgio
 * 
 */
public class PDFProcessorTest {

	public PDFProcessorTest() {
	}

	@Test
	public void processPDF() throws IOException {
		PDFTextStripper textStripper = new PDFTextStripper();
		String contentData = textStripper.getText(PDDocument.load(this.getClass().getClassLoader().getResourceAsStream("helloworld.pdf")));
		System.out.println(contentData);
	}
}
