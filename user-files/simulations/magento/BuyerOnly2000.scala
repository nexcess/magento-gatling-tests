
package magento
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._
import assertions._

class BuyerOnly2000 extends Simulation {
  val urlBase = "http://mce000-lb.nexcess.net"
  val httpConf = httpConfig
      .baseURL(urlBase)
      .acceptEncodingHeader("gzip, deflate")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64; rv:17.0) Gecko/20100101 Firefox/17.0")

  setUp(AnonymousCheckout.scn.users(2000).protocolConfig(httpConf))

}
