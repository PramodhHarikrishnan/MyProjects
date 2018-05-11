package cex.common.helpers;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RESTClient {

	static Logger log = LogManager.getLogger(RESTClient.class.getName());

	private static String strContent;
	private static int intStatusCode;

	public static String GETRESTVALUE(String URI) {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URI);

		try {

			HttpResponse response = client.execute(request);

			// String strContentType = response.getEntity().getContentType().toString();
			intStatusCode = response.getStatusLine().getStatusCode();

			// strContent = IOUtils.toString(response.getEntity().getContent());
			// BufferedReader rd = new BufferedReader(new
			// InputStreamReader(response.getEntity().getContent()));

			strContent = IOUtils.toString(new InputStreamReader(response.getEntity().getContent()));

		} catch (Exception e) {
			log.error("GETRESTVALUE", e);
			// e.printStackTrace();

		}
		return strContent;

	}

	public static String POSTRESTVALUE(int itr, String URI, String header, String token, String JsonBody) {

		String strheader = null;
		String strheaderVal = null;
		String strtoken = null;
		String strtokenVal = null;
		try {

			/*
			 * String strURI = TestDataUtil.GetData(URI); String strHdr =
			 * TestDataUtil.GetData(header); String strTkn = TestDataUtil.GetData(token);
			 * String strJson = TestDataUtil.GetData(JsonBody);
			 */

			String strURI = TestDataUtil.GetDataWithIndex(URI, itr);
			String strHdr = TestDataUtil.GetDataWithIndex(header, itr);
			String strTkn = TestDataUtil.GetDataWithIndex(token, itr);
			String strJson = TestDataUtil.GetDataWithIndex(JsonBody, itr);

			if (strHdr.contains("/")) {
				String[] spt1 = strHdr.split("\\/");
				strheader = spt1[0];
				strheaderVal = spt1[1];
			}

			if (strTkn.contains("/")) {
				String[] spt1 = strTkn.split("\\/");
				strtoken = spt1[0];
				strtokenVal = spt1[1];
			}

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(strURI);

			post.addHeader(strheader, strheaderVal);
			post.addHeader(strtoken, strtokenVal);
			post.addHeader("Content-Type", "application/json");

			StringEntity strEnty = new StringEntity(strJson);
			post.setEntity(strEnty);
			HttpResponse response = client.execute(post);

			intStatusCode = response.getStatusLine().getStatusCode();
			assertEquals("Invalid Response: " + intStatusCode, 200, intStatusCode);

			strContent = IOUtils.toString(new InputStreamReader(response.getEntity().getContent()));

		} catch (Exception e) {
			log.error("POSTRESTVALUE", e);
		}
		return strContent;

	}

}
