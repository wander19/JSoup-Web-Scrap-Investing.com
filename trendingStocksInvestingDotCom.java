import org.jsoup.Jsoup; // importing Jsoup library

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.*;

public class trendingStocks{

	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("https://in.investing.com/equities/trending-stocks").get();
		
		for(Element row : doc.select("table.common-table.medium.js-table.js-streamable-table tr")) {
			String name = row.select(".col-name").text();
			String price = row.select(".u-txt-align-end.col-last").text();
			String high = row.select(".u-txt-align-end.col-high").text();
			String low = row.select(".u-txt-align-end.col-low").text();
			String volume = row.select(".u-txt-align-end.col-volume").text();
			
			System.out.println(name + "  " + price + "  " + high + "  " + low + "  " + volume);
		}
	}
}
