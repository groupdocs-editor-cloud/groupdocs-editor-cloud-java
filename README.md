![](https://img.shields.io/badge/api-v1.0-lightgrey) ![GitHub release (latest by date)](https://img.shields.io/github/v/release/groupdocs-editor-cloud/groupdocs-editor-cloud-java) [![GitHub license](https://img.shields.io/github/license/groupdocs-editor-cloud/groupdocs-editor-cloud-java)](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-java/blob/master/LICENSE) 

# Java SDK to Document Editor REST API

[GroupDocs.Editor Cloud SDK for Java](https://products.groupdocs.cloud/editor/java) wraps GroupDocs.Editor RESTful API so you may integrate Document Editing features in your own apps with zero initial cost.

GroupDocs.Editor Cloud API allows the developers to edit most popular document formats using front-end WYSIWYG editors - without needing the applications like OpenOffice or Microsoft Office. Just load documents via GroupDocs.Editor into any WYSIWYG editor, edit document in a way you want and save it back to original document format.

## Document Editing in the Cloud

GroupDocs.Editor Cloud provides a set of options to customize the editing process dependending on the document type.

**Word Processing:** Edit document in a flow or paged mode, consider language information for multi-language document editing, manage font extraction to provide the same document editing and appearance behavior in different environments.\
**Spreadsheets:** Supports multi-tabbed spreadsheet editing with the ability to specify the index of the currently edited worksheet.\
**Comma-Separated & Tab-Separated Values:** Specify separator, flexible numeric and dates conversion, memory usage optimization for large files.\
**Markup:** Fix incorrect document structure, URI & e-mail address recognition, highlight and formatting options.

## Document Information Extraction

GroupDocs.Editor Cloud also provides the ability to extract basic information about the edited document.

- Document type
- Document size
- Pages count

Check out the [Developer's Guide](https://docs.groupdocs.cloud/editor/developer-guide/) to know more about GroupDocs.Editor REST API.

## Microsoft Office Formats

**Microsoft Word:** DOC, DOCX, DOCM, DOT, DOTM, DOTX, RTF, FlatOpc, WordML\
**Microsoft Excel:** XLS, XLSX, XLSM, XLT, XLTX, XLTM, XLSB, XLAM, SpreadsheetML\
**Microsoft PowerPoint:** PPT, PPTX, PPTM, PPS, PPSX, PPSM, POT, POTX, POTM

## Other Formats

**OpenDocument:** ODT, OTT, ODP, OTP, ODS, FODS\
**Markup:** HTML, XML\
**Others:** SXC, DIF, DSV, TXT, CSV, TSV

## Get Started with GroupDocs.Editor Cloud SDK for Java

First create an account at [GroupDocs for Cloud](https://dashboard.groupdocs.cloud/) and get your application information. Next, follow the installation steps as given below.

### Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

### Installation

Execute the following to install the API client library to your local Maven repository.

```shell
mvn install
```

Configure the settings of the repository and execute the following to deploy it to a remote Maven repository instead.

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

#### Maven

Add the following repository and dependency to your project's POM.

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-editor-cloud</artifactId>
    <version>19.11</version>
    <scope>compile</scope>
</dependency>
```

#### Others

Generate the JAR by executing `mvn package`, then manually install the following JARs.

* target/groupdocs-editor-cloud-19.11.jar
* target/lib/*.jar

## Edit an Excel XLSX File in the Cloud

```java
// For complete examples and data files, please go to https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-java-samples
// Get AppKey and AppSID from https://dashboard.groupdocs.cloud
String MyAppKey = ""; 
String MyAppSid = ""; 
  
Configuration configuration = new Configuration(MyAppSid, MyAppKey);
 
 
// Create necessary API instances
EditApi editApi = new EditApi(configuration);
FileApi fileApi = new FileApi(configuration);
 
// The document already uploaded into the storage.
// Load it into editable state
FileInfo fileInfo = new FileInfo();
fileInfo.setFilePath("Spreadsheet/four-sheets.xlsx");           
SpreadsheetLoadOptions loadOptions = new SpreadsheetLoadOptions();
loadOptions.setFileInfo(fileInfo);
loadOptions.setOutputPath("output");
LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
 
// Download html document
File file = fileApi.downloadFile(new DownloadFileRequest(loadResult.getHtmlPath(), null, null));
             
// Edit something...
List<String> lines = Files.readAllLines(file.toPath());
List<String> newLines = new ArrayList<String>();
for (String line : lines) {
    newLines.add(line.replaceAll("This is sample sheet", "This is sample sheep"));
}
Files.write(file.toPath(), newLines);
 
// Upload html back to storage
fileApi.uploadFile(new UploadFileRequest(loadResult.getHtmlPath(), file, Common.MYStorage));
 
// Save html back to xlsx
SpreadsheetSaveOptions saveOptions = new SpreadsheetSaveOptions();
saveOptions.setFileInfo(fileInfo);
saveOptions.setOutputPath("output/edited.xlsx");    
saveOptions.setHtmlPath(loadResult.getHtmlPath());      
saveOptions.setResourcesPath(loadResult.getResourcesPath());
DocumentResult saveResult = editApi.save(new SaveRequest(saveOptions));
 
System.out.println("Document edited: " + saveResult.getPath());
```

## GroupDocs.Editor Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Android |
|---|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-dotnet) | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-java) | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-php) | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-python) | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-ruby)  | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-node) | [GitHub](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-android) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Editor-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-editor-cloud) | [Composer](https://packagist.org/packages/groupdocscloud/groupdocs-editor-cloud) | [PIP](https://pypi.org/project/groupdocs-editor-cloud/) | [GEM](https://rubygems.org/gems/groupdocs_editor_cloud)  | [NPM](https://www.npmjs.com/package/groupdocs-editor-cloud) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-editor-cloud-android) |

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/editor/java) | [Documentation](https://docs.groupdocs.cloud/editor/) | [Live Demo](https://products.groupdocs.app/editor/total) | [API Reference](https://apireference.groupdocs.cloud/editor/) | [Code Samples](https://github.com/groupdocs-editor-cloud/groupdocs-editor-cloud-java-samples) | [Blog](https://blog.groupdocs.cloud/category/editor/) | [Free Support](https://forum.groupdocs.cloud/c/editor) | [Free Trial](https://dashboard.groupdocs.cloud)
