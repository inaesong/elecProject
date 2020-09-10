/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-21 08:04:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map.Entry;
import board.model.vo.Board;
import java.util.Map;
import product.model.vo.ProductInfo;
import java.util.List;

public final class ProductViewPhone_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.Map.Entry");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("product.model.vo.ProductInfo");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	Map<String, String> colorMap = (Map<String, String>)request.getAttribute("colorMap");
	List<String> capaList = (List<String>)request.getAttribute("capaList");
	ProductInfo productInfo = (ProductInfo)request.getAttribute("productInfo");
	List<Board> reviewList = (List<Board>)request.getAttribute("reviewList");
	List<ProductInfo> otherProducts = (List<ProductInfo>)request.getAttribute("otherProducts");
	String rvo = (String)request.getAttribute("rvo");
	
	
	System.out.println("colorMap = " + colorMap);
	System.out.println("capaList = " + capaList);
	System.out.println("productInfo = " + productInfo);
	System.out.println("reviewList = " + reviewList);
	System.out.println("otherProducts = " + otherProducts);
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Phone</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("   \t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"containerJ\">\r\n");
      out.write("        <section id=\"contentJ\">\r\n");
      out.write("            <div id=\"first-boxJ\">\r\n");
      out.write("                <div id=\"left-lineJ\">\r\n");
      out.write("                    <div id=\"imgSectionJ\">\r\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath() );
      out.print( productInfo.getProductImg() );
      out.write("/thum.png\" alt=\"\" id=\"detailJ\">\r\n");
      out.write("                       <h2 id=\"productNameJ\">");
      out.print( productInfo.getProductName() );
      out.write("</h2>\r\n");
      out.write("                        <h1 id=\"productGradeJ\">★ ");
      out.print( productInfo.getProductGrade() );
      out.write("</h1>\r\n");
      out.write("                        <p id=\"productDescJ\">\r\n");
      out.write("                           ");
 String[] desc = productInfo.getProductDesc().split(",");
      out.write("\r\n");
      out.write("                          ");
 for(int d=0; d<desc.length; d++){ 
      out.write("\r\n");
      out.write("                        \t\t");
      out.print( desc[d]);
      out.write(" <br>\r\n");
      out.write("                           ");
 } 
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"right-lineJ\">\r\n");
      out.write("                   <div id=\"colorOptionJ\">\r\n");
      out.write("                        <p class=\"optionTitleJ\" >Choose Your Color</p>\r\n");
      out.write("                        <div id=\"colorOptionBoxJ\"  >\r\n");
      out.write("                           ");
 for (Entry<String, String> entry : colorMap.entrySet()) { 
      out.write(" \r\n");
      out.write("                            <div class=\"color-nameJ\" >\r\n");
      out.write("                                <div class=\"circleJ\" style=\"background-color : ");
      out.print( entry.getValue() );
      out.write("\"></div> \r\n");
      out.write("                                <p class=\"colorPJ\">");
      out.print( entry.getKey() );
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
} 
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"hrJ\"></div>\r\n");
      out.write("                    <div id=\"capacityOptionJ\">\r\n");
      out.write("                        <p class=\"optionTitleJ\" >Choose Your Capacity</p>\r\n");
      out.write("                        <div id=\"capaOptionBoxJ\" >\r\n");
      out.write("                        \t");
 for(String capa : capaList) {
      out.write("\r\n");
      out.write("                            <div class=\"capa-nameJ\" >\r\n");
      out.write("                               <span>");
      out.print( capa );
      out.write("</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"hrJ\"></div>\r\n");
      out.write("                      <div id=\"totalRowJ\">\r\n");
      out.write("                     \t");
 int price = productInfo.getPrice() * (100 - productInfo.getDiscountRate()) / 100; 
      out.write("\r\n");
      out.write("                        <p id=\"totalPriceJ\" class=\"korBoldJ\" value=\"");
      out.print( price );
      out.write("\">Price : ");
      out.print( price );
      out.write(" WON</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"button-rowJ\">\r\n");
      out.write("                        <button id=\"btnCartJ\" onclick=\"addToCart(");
      out.print( productInfo.getInch());
      out.write(");\">Cart</button>\r\n");
      out.write("                        <input type=\"hidden\" id=\"inputProdCodeJ\" value=\"");
      out.print( productInfo.getProductCode() );
      out.write("\" name=\"prodCode\" />\r\n");
      out.write("                        <button id=\"btnBuyJ\" onclick=\"buyProduct(");
      out.print( productInfo.getInch());
      out.write(");\">Buy Now</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"second-boxJ\">\r\n");
      out.write("                <div id=\"ad-rowJ\">\r\n");
      out.write("                    <img id=\"adImgJ\" src=\"");
      out.print( request.getContextPath() );
      out.print( productInfo.getProductImg() );
      out.write("/adImg1.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"third-boxJ\">\r\n");
      out.write("                <div class=\"hrJ\"></div>\r\n");
      out.write("                <div id=\"review-rowJ\" class=\"menuJ\">\r\n");
      out.write("                   <p class=\"slideTitleJ\">Review</p>\r\n");
      out.write("                   <div class=\"rotateJ\" id=\"review-rotateJ\">+</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"reviewJ\" class=\"slide-contentJ\"> \r\n");
      out.write("                 ");
 if(rvo.equals("on")){
      out.write("\r\n");
      out.write("                    <div id=\"inputReviewJ\">\r\n");
      out.write("                       <form action=\"");
      out.print( request.getContextPath() );
      out.write("/board/insert\" method=\"post\" id=\"formReviewJ\">\r\n");
      out.write("                       <div id=\"box1J\"><span class=\"korBoldJ\">리뷰작성하기</span></div>\r\n");
      out.write("                       <div id=\"box2J\"><input type=\"text\" value=\"\" id=\"textReviewJ\" class=\"korJ\" name=\"inputReview\"></div>\r\n");
      out.write("                       <div class=\"box3J\">\r\n");
      out.write("                            <p class=\"star_ratingJ\">\r\n");
      out.write("                                <a href=\"\" class=\"onJ\">★</a>\r\n");
      out.write("                                <a href=\"\" class=\"onJ\">★</a>\r\n");
      out.write("                                <a href=\"\" class=\"onJ\">★</a>\r\n");
      out.write("                                <a href=\"\">★</a>\r\n");
      out.write("                                <a href=\"\">★</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <input type=\"hidden\" name=\"reivewGrade\" id=\"reivewGradeJ\" value=\"\"/>\r\n");
      out.write("                            <input type=\"hidden\" name=\"prodCode\" value=\"");
      out.print( productInfo.getProductCode());
      out.write("\"/>\r\n");
      out.write("                            <input type=\"hidden\" name=\"prodInch\" value=\"");
      out.print( productInfo.getInch());
      out.write("\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       <div id=\"box4J\"><button id=\"btnReviewJ\" type=\"submit\">OK</button></div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 ");
 } 
      out.write("\r\n");
      out.write("                    <table id=\"review-tableJ\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"korBoldJ\">아이디</th>\r\n");
      out.write("                            <th class=\"korBoldJ\">한줄평</th>\r\n");
      out.write("                            <th class=\"korBoldJ\">평점</th>\r\n");
      out.write("                            <th class=\"korBoldJ\">날짜</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                       ");
if(reviewList == null || reviewList.isEmpty()){ 
      out.write("\r\n");
      out.write("\t                       <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th colspan=\"4\">작성된 리뷰가 없습니다.</th>\r\n");
      out.write("\t\t\t\t\t\t   </tr>\r\n");
      out.write("                       ");
}else { 
                       	  for(Board b : reviewList){
      out.write("\r\n");
      out.write("\t                       \t<tr>\r\n");
      out.write("\t                            <th>");
      out.print( b.getBoardWriter() );
      out.write("</th>\r\n");
      out.write("\t                            <th class=\"korJ\">");
      out.print( b.getBoardContent() );
      out.write("</th>\r\n");
      out.write("\t                            <th>");
      out.print( b.getBoardGrade() );
      out.write("</th>\r\n");
      out.write("\t                            <th>");
      out.print( b.getBoardDate() );
      out.write("</th>\r\n");
      out.write("\t                        </tr>\r\n");
      out.write("\t                      ");
 }
                        } 
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"hrJ\"></div>\r\n");
      out.write("                <div id=\"product-rowJ\" class=\"menuJ\">\r\n");
      out.write("                    <p class=\"slideTitleJ\">Other Product</p>\r\n");
      out.write("                    <div class=\"rotateJ\" id=\"product-rotateJ\">+</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"productJ\" class=\"slide-contentJ\">\r\n");
      out.write("                    <p id=\"compStmJ\">Compare with other items</p>\r\n");
      out.write("                     ");
 for(int i=0; i<otherProducts.size(); i++){
      out.write("\r\n");
      out.write("        \t\t\t");
 ProductInfo pi = otherProducts.get(i); 
      out.write("\r\n");
      out.write("                    <div  class=\"prodBoxJ\">\r\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath());
      out.print( pi.getProductImg() );
      out.write("/thum.png\" alt=\"\" class=\"prodBoxImgJ\">\r\n");
      out.write("                        <h2 class=\"prodBoxNameJ\">");
      out.print( pi.getProductName() );
      out.write("</h2>\r\n");
      out.write("                        <p class=\"prodBoxDescJ\" >\r\n");
      out.write("                        \t");
 String[] temp = pi.getProductDesc().split(","); 
      out.write("\r\n");
      out.write("                        \t");
 for(int t=0; t<temp.length; t++){ 
      out.write("\r\n");
      out.write("                        \t\t");
      out.print( temp[t]);
      out.write(" <br>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <button class=\"prodBoxBtnJ\">Buy</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 ");
 } 
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                <div class=\"hrJ\"></div>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <footer>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("<script>\r\n");
      out.write("    var deg = -45;\r\n");
      out.write("    var totalDeg = 0;\r\n");
      out.write("    $(\"div.menuJ\").click(function(){\r\n");
      out.write("        $(this).next().slideToggle(\"easeOut\")\r\n");
      out.write("                      .siblings(\"p\").slideUp(\"easeOut\");\r\n");
      out.write("\r\n");
      out.write("        deg *= -1;\r\n");
      out.write("        totalDeg += deg; \r\n");
      out.write("        $(this).children(\"div\").css('transform','rotate(' + totalDeg + 'deg)');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $( \".star_ratingJ a\" ).click(function() {\r\n");
      out.write("        $(this).parent().children(\"a\").removeClass(\"onJ\");\r\n");
      out.write("        $(this).addClass(\"onJ\").prevAll(\"a\").addClass(\"onJ\");\r\n");
      out.write("        return false;\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"div.color-nameJ\").click(function(){\r\n");
      out.write("        var products = document.querySelectorAll(\".color-nameJ\");\r\n");
      out.write("        console.log(products);\r\n");
      out.write("        for(var i=0; i<products.length; i++){\r\n");
      out.write("            products[i].style.border = \"2px solid darkgray\"; \r\n");
      out.write("            products[i].setAttribute(\"value\",\"off\");\r\n");
      out.write("        }\r\n");
      out.write("        $(this).css({\"border-color\": \"#0070c9\", \r\n");
      out.write("                    \"border-width\":\"2px\", \r\n");
      out.write("                    \"border-style\":\"solid\"})\r\n");
      out.write("               .attr('value','on');\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"div.capa-nameJ\").click(function(){\r\n");
      out.write("        var products = document.querySelectorAll(\".capa-nameJ\");\r\n");
      out.write("        console.log(products);\r\n");
      out.write("        for(var i=0; i<products.length; i++){\r\n");
      out.write("            products[i].style.border = \"2px solid darkgray\"; \r\n");
      out.write("            products[i].setAttribute(\"value\",\"off\");\r\n");
      out.write("        }\r\n");
      out.write("        $(this).css({\"border-color\": \"#0070c9\", \r\n");
      out.write("                    \"border-width\":\"2px\", \r\n");
      out.write("                    \"border-style\":\"solid\"})\r\n");
      out.write("               .attr('value','on');\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function buyProduct(inch){\r\n");
      out.write("    \tif(examineSelectOption() < 2){\r\n");
      out.write("    \t\talert(\"옵션을 선택해주세요!\");\r\n");
      out.write("    \t}else{\r\n");
      out.write("    \t\tvar confirmBuy = confirm(\"상품을 구매하시겠습니까?\"); \r\n");
      out.write("        \tif(confirmBuy == true){\r\n");
      out.write("        \t\tvar orderSerialcode = findSerialCode(inch);\r\n");
      out.write("        \t\tvar orderQuantityList = 1;\r\n");
      out.write("        \t\tvar totalPrice = $(\"#totalPriceJ\").attr('value');\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t/* console.log(orderSerialcode);\r\n");
      out.write("        \t\tconsole.log(orderQuantityList);\r\n");
      out.write("        \t\tconsole.log(totalPrice); */\r\n");
      out.write("        \t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/order/orderpage?orderSerialcode=\"+orderSerialcode+\"&orderQuantityList=\"+orderQuantityList+\"&totalPrice\"+totalPrice;\r\n");
      out.write("        \t}\r\n");
      out.write("    \t}\r\n");
      out.write("    \tvar orderSerialcode = findSerialCode(inch);\r\n");
      out.write("\t\tvar orderQuantityList = 1;\r\n");
      out.write("\t\tvar totalPrice = $(\"#totalPriceJ\").attr('value');\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\tfunction addToCart(inch){\r\n");
      out.write("    \t\r\n");
      out.write("\t\tif(examineSelectOption() < 2){\r\n");
      out.write("    \t\talert(\"옵션을 선택해주세요!\");\r\n");
      out.write("    \t}else{\r\n");
      out.write("    \t\tvar addCart = confirm(\"장바구니에 상품을 담으시겠습니까?\"); \r\n");
      out.write("        \tif(addCart == true){\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\tvar serialCode = findSerialCode(inch);\r\n");
      out.write("        \t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/cart/view?serialCode=\"+serialCode;\t\r\n");
      out.write("        \t}\r\n");
      out.write("    \t}\t\t\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#formReviewJ\").submit(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar stars = document.getElementsByClassName(\"onJ\");\r\n");
      out.write("\t\tvar grade = stars.length;\r\n");
      out.write("\t\tconsole.log(grade);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar stars = document.getElementsByClassName(\"onJ\");\r\n");
      out.write("\t\tvar grade = stars.length;\r\n");
      out.write("\t\tconsole.log(grade);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#reivewGradeJ\").val(grade);\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction findSerialCode(inch){\r\n");
      out.write("\t\tvar prodCode = $(\"#button-rowJ input[type='hidden']\").val();\r\n");
      out.write("      \tvar colorOption = document.querySelectorAll(\"div.color-nameJ\");\r\n");
      out.write("    \tvar capaOption = document.querySelectorAll(\"div.capa-nameJ\");\r\n");
      out.write("    \tvar color;\r\n");
      out.write("    \tvar capa;\r\n");
      out.write("  \r\n");
      out.write("    \tfor(var i=0; i<colorOption.length; i++){\r\n");
      out.write("    \t\tif(colorOption[i].getAttribute(\"value\") == 'on'){\r\n");
      out.write("    \t\t\tcolor = findColorCode(colorOption[i].innerText);\r\n");
      out.write("    \t\t}\r\n");
      out.write("        } \r\n");
      out.write("    \t\r\n");
      out.write("    \tfor(var j=0; j<capaOption.length; j++){\r\n");
      out.write("    \t\tif(capaOption[j].getAttribute(\"value\") == 'on'){\r\n");
      out.write("    \t\t\tcapa = findCapaCode(capaOption[j].innerText);\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("    \t \r\n");
      out.write("    \tvar serialCode = prodCode + color + \"I\" + inch + capa;\r\n");
      out.write("    \treturn serialCode;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction findCapaCode(capacity){\r\n");
      out.write("\t\tvar capaCode;\r\n");
      out.write("\t\tswitch(capacity){\r\n");
      out.write("\t\tcase \"32GB\" : \r\n");
      out.write("\t\t\tcapaCode = \"M32\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"64GB\" : \r\n");
      out.write("\t\t\tcapaCode = \"M64\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"256GB\" : \r\n");
      out.write("\t\t\tcapaCode = \"M256\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"512GB\" : \r\n");
      out.write("\t\t\tcapaCode = \"M512\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn capaCode;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction findColorCode(colorName){\r\n");
      out.write("\t\tvar colorCode;\r\n");
      out.write("\t\tswitch(colorName){\r\n");
      out.write("\t\tcase \"Black\" : \r\n");
      out.write("\t\t\tcolorCode = \"C1\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Red\" : \r\n");
      out.write("\t\t\tcolorCode = \"C2\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Blue\" : \r\n");
      out.write("\t\t\tcolorCode = \"C3\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Green\" : \r\n");
      out.write("\t\t\tcolorCode = \"C5\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Gray\" : \r\n");
      out.write("\t\t\tcolorCode = \"C6\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"White\" : \r\n");
      out.write("\t\t\tcolorCode = \"C7\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Purple\" : \r\n");
      out.write("\t\t\tcolorCode = \"C9\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Silver\" : \r\n");
      out.write("\t\t\tcolorCode = \"C10\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase \"Gold\" : \r\n");
      out.write("\t\t\tcolorCode = \"C11\";\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn colorCode;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction examineSelectOption(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar colorOption = document.querySelectorAll(\"div.color-nameJ\");\r\n");
      out.write("    \tvar capaOption = document.querySelectorAll(\"div.capa-nameJ\");\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar count = 0;\r\n");
      out.write("    \tfor(var i=0; i<colorOption.length; i++){\r\n");
      out.write("    \t\tif(colorOption[i].getAttribute(\"value\") == 'on'){\r\n");
      out.write("    \t\t\tcount += 1;\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t}\r\n");
      out.write("        } \r\n");
      out.write("    \t\r\n");
      out.write("    \tfor(var j=0; j<capaOption.length; j++){\r\n");
      out.write("    \t\tif(capaOption[j].getAttribute(\"value\") == 'on'){\r\n");
      out.write("    \t\t\tcount += 1;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("\t\t\r\n");
      out.write("    \treturn count;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}