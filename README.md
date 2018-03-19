# dom4j-big-xml
handle big xml with dom4j

1. dependency on  dom4j

2.Xml4bigKit.parseXml(String xpath,String dataStartTag,List<Class<? extends XmlBase>> cls,XmlHandler handle)

  String xpath: xml file path
  
  String dataStartTag: the data element parent node
  
  List<Class<? extends XmlBase>> cls  those Objects which extends XmlBase,these Objects are the target data mapping you need to impliment
  annotation Root for Class,annotation Column for field if the tag name of xml is differet from them
  
  XmlHandler handle  to handle the bi after parse the xml one or all 
  
  default  setting: if the xml size is lower than 30M ,go the dom4j doing for one whole file, otherwise read 20000 chars every time to do parse xml to call
  
  handle and then continue to read read 20000 chars  to go on until the file is read over
  
3. for the example  test

