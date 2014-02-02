package edu.uci.ics.crawler4j.crawler;

public class ClassBasedCrawlerFactory implements AbstractWebCrawlerFactory<WebCrawler> {

	private Class<? extends WebCrawler> clazz;

	public ClassBasedCrawlerFactory(Class<? extends WebCrawler> clazz) {
		this.clazz = clazz;
	}

	@Override
	public WebCrawler createWebCrawler() {
		try {
			return this.clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			return new WebCrawler();
		}
	}

}
