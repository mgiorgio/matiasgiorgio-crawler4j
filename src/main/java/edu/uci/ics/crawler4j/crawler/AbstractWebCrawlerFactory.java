package edu.uci.ics.crawler4j.crawler;

public interface AbstractWebCrawlerFactory<T extends WebCrawler> {

	public T createWebCrawler();
}
