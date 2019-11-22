/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.editor.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.editor.client.ApiException;
import com.groupdocs.cloud.editor.model.requests.*;
import com.groupdocs.cloud.editor.model.*;

import org.junit.Test;


public class EditApiTests extends BaseApiTest {

    @Test
    public void TestOpenSaveDocx() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.FourPagesDocx;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }
 
    @Test
    public void TestOpenSaveDocxProtected() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }    

    @Test
    public void TestOpenSaveDocxWithOptions() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.PasswordProtectedDocx;
        WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);
        loadOptions.setEnablePagination(true);
        loadOptions.setFontExtraction(WordProcessingLoadOptions.FontExtractionEnum.EXTRACTALLEMBEDDED);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        WordProcessingSaveOptions saveOptions = new WordProcessingSaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
        saveOptions.setEnablePagination(true);
        saveOptions.setFormat("Docx");
        saveOptions.setPassword(testFile.getPassword());
        saveOptions.setProtectionPassword(testFile.getPassword());
        saveOptions.setProtectionType(WordProcessingSaveOptions.ProtectionTypeEnum.ALLOWONLYCOMMENTS);
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }

    @Test
    public void TestOpenSaveXlsx() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.FourSheetsXlsx;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }    

    @Test
    public void TestOpenSaveXlsxProtected() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.FourSheetsProtectedXlsx;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }     

    @Test
    public void TestOpenSaveXlsxWithOptions() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.FourSheetsProtectedXlsx;
        SpreadsheetLoadOptions loadOptions = new SpreadsheetLoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);
        loadOptions.setExcludeHiddenWorksheets(true);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SpreadsheetSaveOptions saveOptions = new SpreadsheetSaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
        saveOptions.setFormat("xlsx");
        saveOptions.setPassword(testFile.getPassword());
        saveOptions.setProtectionPassword(testFile.getPassword());
        saveOptions.setProtectionType(SpreadsheetSaveOptions.ProtectionTypeEnum.ALL);              
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }    
    
    @Test
    public void TestOpenSaveTsv() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.SampleTsv;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }   
    
    @Test
    public void TestOpenSaveTsvWithOptions() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.SampleTsv;
        DelimitedTextLoadOptions loadOptions = new DelimitedTextLoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);
        loadOptions.separator("\t");
        loadOptions.convertNumericData(true);
        loadOptions.treatConsecutiveDelimitersAsOne(true);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        DelimitedTextSaveOptions saveOptions = new DelimitedTextSaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
        saveOptions.setEncoding("UTF-8");
        saveOptions.setFormat("tsv");
        saveOptions.keepSeparatorsForBlankRow(true);
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }

    @Test
    public void TestOpenSaveText() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.Txt;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    } 
    
    @Test
    public void TestOpenSaveTextWithOptions() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.Txt;
        TextLoadOptions loadOptions = new TextLoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);
        loadOptions.setEnablePagination(true);
        loadOptions.setLeadingSpaces(TextLoadOptions.LeadingSpacesEnum.TRIM);
        loadOptions.setRecognizeLists(true);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        TextSaveOptions saveOptions = new TextSaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
        saveOptions.setAddBidiMarks(true);
        saveOptions.setEncoding("UTF-8");
        saveOptions.setFormat("txt");
        saveOptions.preserveTableLayout(true);
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    } 
    
    @Test
    public void TestOpenSavePresentation() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.WithNotesPptx;
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    } 
    
    @Test
    public void TestOpenSavePresentationWithOptions() throws ApiException
    {
        // Load
        TestFile testFile = TestFiles.WithHiddenSlidePptx;
        PresentationLoadOptions loadOptions = new PresentationLoadOptions();
        loadOptions.setFileInfo(testFile.ToFileInfo());
        loadOptions.setOutputPath(DefaultOutputPath);
        loadOptions.setShowHiddenSlides(true);
        loadOptions.setSlideNumber(0);

        LoadResult loadResult = editApi.load(new LoadRequest(loadOptions));
        assertNotNull(loadResult.getHtmlPath());
        assertNotNull(loadResult.getResourcesPath());
        
        // Save
        PresentationSaveOptions saveOptions = new PresentationSaveOptions();
        saveOptions.setFileInfo(testFile.ToFileInfo());
        saveOptions.setHtmlPath(loadResult.getHtmlPath());
        saveOptions.setResourcesPath(loadResult.getResourcesPath());
        saveOptions.setOutputPath(DefaultOutputPath + "/" + testFile.getFileName());
        saveOptions.setPassword("password");
      
        DocumentResult result = editApi.save(new SaveRequest(saveOptions));

        assertEquals(saveOptions.getOutputPath(), result.getPath());
    }     
}

