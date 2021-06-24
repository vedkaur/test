set projectLocation=C:\Users\VEDIKA\eclipse-workspace\Automation_testing
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
timeout 90