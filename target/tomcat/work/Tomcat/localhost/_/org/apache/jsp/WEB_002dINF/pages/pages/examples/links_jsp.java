/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-05 07:50:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.pages.examples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class links_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>JavaByKiran | Useful Links</title>\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <!-- Ionicons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("    <!-- Theme style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../dist/css/AdminLTE.min.css\">\n");
      out.write("    <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("         folder instead of downloading all of them to reduce the load. -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../dist/css/skins/_all-skins.min.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("     <header class=\"main-header\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("        <a href=\"dashboard\" class=\"logo\">\n");
      out.write("          <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("          <span class=\"logo-mini\"><b>JBK</b></span>\n");
      out.write("          <!-- logo for regular state and mobile devices -->\n");
      out.write("          <span class=\"logo-lg\"><b>Java By Kiran</b></span>\n");
      out.write("        </a>\n");
      out.write("        <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("        <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("          <!-- Sidebar toggle button -->\n");
      out.write("\n");
      out.write("          <div class=\"navbar-custom-menu\">\n");
      out.write("            \n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("             <!--  Messages: style can be found in dropdown.less\n");
      out.write("               User Account: style can be found in dropdown.less -->\n");
      out.write("              <li class=\"dropdown user user-menu\">\n");
      out.write("                <a href=\"loginpage\" class=\"\">LOGOUT</a>\n");
      out.write("\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("<!--       Left side column. contains the logo and sidebar\n");
      out.write(" -->      <aside class=\"main-sidebar\">\n");
      out.write("<!--         sidebar: style can be found in sidebar.less\n");
      out.write(" -->        <section class=\"sidebar\">\n");
      out.write("<!--           Sidebar user panel\n");
      out.write(" -->          <div class=\"user-panel\">\n");
      out.write("            <div class=\"pull-left image\">\n");
      out.write("              <img src=\"../../dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-left info\">\n");
      out.write("              <p><a href=\"profile\">");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</a></p>\n");
      out.write("              <i class=\"fa fa-circle text-success\"></i> Online\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("<!--           sidebar menu: : style can be found in sidebar.less\n");
      out.write(" -->          <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("            <li class=\"treeview\"><a href=\"dashboard\">\n");
      out.write("            <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span></a></li>\n");
      out.write("            <li class=\"active\"><a href=\"userlist\"><i class=\"fa fa-user\"></i> <span>Users</span></a></li>\n");
      out.write("            <li><a href=\"operators\"><i class=\"fa fa-retweet\"></i> <span>Operators</span></a></li>\n");
      out.write("            <li class=\"treeview\"><a href=\"links\"><i class=\"fa fa-external-link\"></i> <span>     Useful Links</span></a></li>\n");
      out.write("            <li class=\"treeview\"><a href=\"downloads\">\n");
      out.write("            <i class=\"fa fa-download\"></i> <span>Downloads</span></a></li>\n");
      out.write("            <li><a href=\"loginpage\"><i class=\"fa fa-power-off\"></i> <span>Logout</span></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </section>\n");
      out.write("<!--         /.sidebar\n");
      out.write(" -->      </aside>\n");
      out.write("\n");
      out.write("      <!-- Content Wrapper. Contains page content -->\n");
      out.write("      <div class=\"content-wrapper\">\n");
      out.write("        <!-- Content Header (Page header) -->\n");
      out.write("        <section class=\"content-header\">\n");
      out.write("          <h1>Useful Links</h1>\n");
      out.write("          <ol class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("            <li class=\"active\">Useful Links</li>\n");
      out.write("          </ol>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Main content -->\n");
      out.write("        <section class=\"content\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12\">\n");
      out.write("              <div class=\"box\">\n");
      out.write("                <div class=\"box-header\">\n");
      out.write("                  <h3 class=\"box-title\">* Internet Required</h3>\n");
      out.write("                  <div class=\"box-tools\">\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div><!-- /.box-header -->\n");
      out.write("                <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                  <table class=\"table table-hover\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Sr</th>\n");
      out.write("                      <th>Content</th>\n");
      out.write("                      <th>Click</th>\n");
      out.write("                    </tr>\n");
      out.write("                  \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  </table>\n");
      out.write("                </div><!-- /.box-body -->\n");
      out.write("              </div><!-- /.box -->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("        </section><!-- /.content -->\n");
      out.write("      </div><!-- /.content-wrapper -->\n");
      out.write("      <footer class=\"main-footer\">\n");
      out.write("        <div class=\"pull-right hidden-xs\">\n");
      out.write("          <b>Design for Selenium Automation Test</b> V 2.3.0\n");
      out.write("        </div>\n");
      out.write("        <strong>Copyright &copy; 2005-2019 <a href=\"https://www.javabykiran.com/\" target=\"_blank\">JavaByKiran</a>.</strong> All rights reserved.\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("      <!-- Control Sidebar -->\n");
      out.write("      <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("        <!-- Create the tabs -->\n");
      out.write("        <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\n");
      out.write("          <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("          <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Tab panes -->\n");
      out.write("        <div class=\"tab-content\">\n");
      out.write("          <!-- Home tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\n");
      out.write("                    <p>Will be 23 on April 24th</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-user bg-yellow\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Frodo Updated His Profile</h4>\n");
      out.write("                    <p>New phone +1(800)555-1234</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-envelope-o bg-light-blue\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Nora Joined Mailing List</h4>\n");
      out.write("                    <p>nora@example.com</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-file-code-o bg-green\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Cron Job 254 Executed</h4>\n");
      out.write("                    <p>Execution time 5 seconds</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul><!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Custom Template Design\n");
      out.write("                    <span class=\"label label-danger pull-right\">70%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Update Resume\n");
      out.write("                    <span class=\"label label-success pull-right\">95%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-success\" style=\"width: 95%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Laravel Integration\n");
      out.write("                    <span class=\"label label-warning pull-right\">50%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 50%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Back End Framework\n");
      out.write("                    <span class=\"label label-primary pull-right\">68%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-primary\" style=\"width: 68%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul><!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("          </div><!-- /.tab-pane -->\n");
      out.write("          <!-- Stats tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div><!-- /.tab-pane -->\n");
      out.write("          <!-- Settings tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\n");
      out.write("            <form method=\"post\">\n");
      out.write("              <h3 class=\"control-sidebar-heading\">General Settings</h3>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Report panel usage\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Some information about this general settings option\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Allow mail redirect\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Other sets of options are available\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Expose author name in posts\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Allow the user to show his name in blog posts\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <h3 class=\"control-sidebar-heading\">Chat Settings</h3>\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Show me as online\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Turn off notifications\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\">\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Delete chat history\n");
      out.write("                  <a href=\"javascript::;\" class=\"text-red pull-right\"><i class=\"fa fa-trash-o\"></i></a>\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("            </form>\n");
      out.write("          </div><!-- /.tab-pane -->\n");
      out.write("        </div>\n");
      out.write("      </aside><!-- /.control-sidebar -->\n");
      out.write("      <!-- Add the sidebar's background. This div must be placed\n");
      out.write("           immediately after the control sidebar -->\n");
      out.write("      <div class=\"control-sidebar-bg\"></div>\n");
      out.write("    </div><!-- ./wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery 2.1.4 -->\n");
      out.write("    <script src=\"plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("    <script>\n");
      out.write("      $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("    </script>\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Morris.js charts -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("    <script src=\"plugins/morris/morris.min.js\"></script>\n");
      out.write("    <!-- Sparkline -->\n");
      out.write("    <script src=\"plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("    <!-- jvectormap -->\n");
      out.write("    <script src=\"plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("    <script src=\"plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("    <!-- jQuery Knob Chart -->\n");
      out.write("    <script src=\"plugins/knob/jquery.knob.js\"></script>\n");
      out.write("    <!-- daterangepicker -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js\"></script>\n");
      out.write("    <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("    <!-- datepicker -->\n");
      out.write("    <script src=\"plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\n");
      out.write("    <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("    <!-- Slimscroll -->\n");
      out.write("    <script src=\"plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"plugins/fastclick/fastclick.min.js\"></script>\n");
      out.write("    <!-- AdminLTE App -->\n");
      out.write("    <script src=\"dist/js/app.min.js\"></script>\n");
      out.write("    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("    <script src=\"dist/js/pages/dashboard.js\"></script>\n");
      out.write("    <!-- AdminLTE for demo purposes -->\n");
      out.write("    <script src=\"dist/js/demo.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/pages/pages/examples/links.jsp(70,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginname}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/pages/examples/links.jsp(119,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("link");
    // /WEB-INF/pages/pages/examples/links.jsp(119,19) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/pages/examples/links.jsp(119,19) '${linklist }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${linklist }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                      <td>");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("                      <td>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("                      <td><a href=\"");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\" target=\"_blank\"><span class=\"label label-success\">Go !</span></a>  </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/pages/examples/links.jsp(121,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${link.getIdLinks() }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/pages/examples/links.jsp(122,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${link.getContent() }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/pages/examples/links.jsp(123,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${link.getClick() }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
