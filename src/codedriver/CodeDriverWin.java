/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codedriver;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.*;

import org.apache.commons.io.FileUtils;

/**
 *
 * @author staff
 */
public class CodeDriverWin extends javax.swing.JFrame {

    /**
     * Creates new form CodeDriverWin
     */
    
    public File f;
    String filePath; 
    String fileName;
    String fileExtension;
    
    public CodeDriverWin() {
        initComponents();
        evalCodeBtn.setEnabled(false);
        pullTcBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fileNameTxtField = new javax.swing.JTextField();
        pullTcBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        clearBufferBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        filePathLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fileNameLabel = new javax.swing.JLabel();
        browseBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consoleTextArea = new javax.swing.JTextArea();
        evalCodeBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeDriver");
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel1.setText("CodeDriver");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 134, 24));

        fileNameTxtField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        fileNameTxtField.setPreferredSize(new java.awt.Dimension(83, 21));
        getContentPane().add(fileNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, -1));

        pullTcBtn.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        pullTcBtn.setText("Run Test-cases");
        pullTcBtn.setEnabled(false);
        pullTcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pullTcBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pullTcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        pullTcBtn.getAccessibleContext().setAccessibleName("pullTcBtn");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel2.setText("Path");
        jLabel2.setPreferredSize(new java.awt.Dimension(119, 21));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        clearBufferBtn.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        clearBufferBtn.setText("Clear Buffer");
        clearBufferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBufferBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBufferBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel3.setText("File to be Tested");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 21));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        filePathLabel.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        filePathLabel.setText("...");
        filePathLabel.setPreferredSize(new java.awt.Dimension(119, 21));
        getContentPane().add(filePathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 270, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel5.setText("File chosen");
        jLabel5.setPreferredSize(new java.awt.Dimension(119, 21));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 20));

        fileNameLabel.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        fileNameLabel.setForeground(java.awt.Color.blue);
        fileNameLabel.setText("...");
        fileNameLabel.setPreferredSize(new java.awt.Dimension(119, 21));
        getContentPane().add(fileNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 270, 20));

        browseBtn1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        browseBtn1.setText("Browse");
        browseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(browseBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        consoleTextArea.setEditable(false);
        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);
        jScrollPane1.setViewportView(consoleTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 540, 290));

        evalCodeBtn.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        evalCodeBtn.setText("Compile Code");
        evalCodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evalCodeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(evalCodeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("0/0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 110, 0));
        jLabel6.setText("CDC - Coding Team, SSIET");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pullTcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pullTcBtnActionPerformed
        JSONParser parser = new JSONParser();
	boolean fileFoundFlag = false;

        JSONObject jobj = null;
	String progName = null;
        
        File tFile = null;
        
        consoleTextArea.append("Executing " + this.fileName.substring(0,this.fileName.lastIndexOf(".")) + "\n");
      	try
        {
            URL link = new URL("http://172.16.3.174:8080/CodeDriverWeb/TcServlet?tcName=" + this.fileName.substring(0,this.fileName.lastIndexOf(".")));
            tFile = new File("temp.crypt");
            FileUtils.copyURLToFile(link, tFile);
            
            FileReader fr = new FileReader(tFile);
            Object obj = parser.parse(fr);
            
            PrintWriter pr = new PrintWriter(tFile);
            pr.write("");
            pr.close();
 
            int progCount = 1;
            for(int item=1;item<=progCount;++item)
            {
//                jobj = new JSONObject(new String(cbuf));
		jobj = (JSONObject) obj;
		progName = jobj.get("name").toString();

		if(progName.equals(fileName.substring(0, fileName.lastIndexOf("."))))
		{
                    fileFoundFlag = true;
                    break;
		}
            }  
            if(fileFoundFlag)
            {
		runTestCase(fileName,jobj);
            }  
            else
            {
                consoleTextArea.append("Error! Cannot find " + fileName + " in the Testcases file." + " \n");
            }  
      	}
        catch(Exception e) 
        {
            consoleTextArea.append(e.getMessage() + " \n");
            e.printStackTrace();
	}
    }//GEN-LAST:event_pullTcBtnActionPerformed

    private void clearBufferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBufferBtnActionPerformed
        fileNameTxtField.setText("");
        fileNameLabel.setText("...");
        filePathLabel.setText("...");
        pullTcBtn.setEnabled(false);
        
        jLabel4.setForeground(Color.RED);
        jLabel4.setText("0/0");
        
        consoleTextArea.setText("");
        
        fileName = "";
        filePath = "";
        f = null;
    }//GEN-LAST:event_clearBufferBtnActionPerformed

    private void browseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtn1ActionPerformed
        JFileChooser fc=new JFileChooser();    
        int i=fc.showOpenDialog(this);    
        if(i==JFileChooser.APPROVE_OPTION)
        {    
            f=fc.getSelectedFile(); 
            String temp = f.getPath();
            
            fileNameTxtField.setText(temp);

            this.filePath = temp.substring(0,temp.lastIndexOf(System.getProperty("file.separator"))); 
            this.fileName = temp.substring(temp.lastIndexOf(System.getProperty("file.separator"))+1);
            this.fileExtension = fileName.substring(fileName.indexOf(".")+1);
            
            fileNameLabel.setText(fileName);
            filePathLabel.setText(filePath);
            
            if(fileExtension.equalsIgnoreCase("py"))
            {
                evalCodeBtn.setEnabled(false);
                pullTcBtn.setEnabled(true);
            }
            else if(fileExtension.equalsIgnoreCase("java"))
            {
                evalCodeBtn.setEnabled(true);
                pullTcBtn.setEnabled(false);
            }
            else if(fileExtension.equalsIgnoreCase("c"))
            {
                evalCodeBtn.setEnabled(true);
                pullTcBtn.setEnabled(false);
            }
            else if(fileExtension.equalsIgnoreCase("cpp"))
            {
                evalCodeBtn.setEnabled(true);
                pullTcBtn.setEnabled(false);
            }
            else
            {
                evalCodeBtn.setEnabled(false);
                pullTcBtn.setEnabled(false);
            }
            
        }	
    }//GEN-LAST:event_browseBtn1ActionPerformed

    private void evalCodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evalCodeBtnActionPerformed
    
        if(this.fileExtension.equalsIgnoreCase("java"))
        {
            if(compileJava(fileName, filePath))
                pullTcBtn.setEnabled(true);
            else
                pullTcBtn.setEnabled(false);
        }
        else if(fileExtension.equalsIgnoreCase("c"))
        {
            if(compileC(fileName, filePath))
                pullTcBtn.setEnabled(true);
            else
                pullTcBtn.setEnabled(false);
        }
        else if(fileExtension.equalsIgnoreCase("cpp"))
        {
            if(compileCpp(fileName, filePath))
                pullTcBtn.setEnabled(true);
            else
                pullTcBtn.setEnabled(false);
        }
        
    }//GEN-LAST:event_evalCodeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CodeDriverWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeDriverWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeDriverWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeDriverWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodeDriverWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn1;
    private javax.swing.JButton clearBufferBtn;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JButton evalCodeBtn;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JTextField fileNameTxtField;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pullTcBtn;
    // End of variables declaration//GEN-END:variables

    
    public void runTestCase(String f, JSONObject progData)
    {
        int cleared = 0;
	try
	{
            int testCaseCount = Integer.parseInt(progData.get("count").toString());
            consoleTextArea.append("Number of Test-cases : " + testCaseCount + "\n");

            JSONArray ja = (JSONArray) progData.get("testcases");
            String tcFileName = this.filePath + "\\testcases.txt";

            for(int i=0;i<testCaseCount;i++)
            {
		JSONObject tobj = (JSONObject) ja.get(i);
				
                consoleTextArea.append("Running Testcase " + tobj.get("name") + "..." + "\n");
                
                JSONArray tarray = (JSONArray) tobj.get("inputs");
                String temp = "";
                
                for(int index=0;index<tarray.size();index++)
                {
                    temp += tarray.get(index).toString();
                    temp += "\r\n";
                }

                if(tobj.get("isSample").toString().equals("true"))
                    consoleTextArea.append(temp + "\n"); 
                else
                    consoleTextArea.append("***Hidden***\n");

                String tFileName = fileName.substring(0,fileName.lastIndexOf("."));
                
                PrintWriter fout = new PrintWriter(new File(tcFileName));
                fout.println(temp.toCharArray());
		fout.close();
		
                if(this.fileExtension.equalsIgnoreCase("py"))
                    RunPyProgram(fileName, filePath);
                else if(this.fileExtension.equalsIgnoreCase("java"))
                    RunProgram(tFileName,filePath);
                else if(this.fileExtension.equalsIgnoreCase("c"))
                    RunCProgram(tFileName,filePath);
                else if(this.fileExtension.equalsIgnoreCase("cpp"))
                    RunCProgram(tFileName,filePath);
		fetchTestCaseOutput(tobj);
		boolean op = verifyTestCaseOutput();
		if(op)
                    ++cleared;
            }
            consoleTextArea.append("Cleared " + cleared +"/" + testCaseCount + " testcases" + "\n");
            
            if(cleared == testCaseCount)
            {
                consoleTextArea.append("Congratulations! Your code has cleared all the test cases." + "\n");
                jLabel4.setForeground(new Color(0,100,0));
                jLabel4.setText(cleared + "/" + testCaseCount);
            }
            else
            {
                consoleTextArea.append("Your code has'nt cleared all the test cases. Please try again." + "\n");
                jLabel4.setForeground(Color.RED);
                jLabel4.setText(cleared + "/" + testCaseCount);
            }
            clearFiles();
	}
	catch(Exception e)
	{
            e.printStackTrace();
	}
    }
    
    public void fetchTestCaseOutput(JSONObject progData)
	{
            String tcOutputFileName = this.filePath + "\\tcout.txt";

            try
            {
                JSONArray tarray = (JSONArray) progData.get("outputs");
                String temp="";
                System.out.println(tarray.size());
                int ind = 0;
                for(ind=0;ind<tarray.size()-1;ind++)
                {
                    temp += tarray.get(ind) + "\r\n";
                }
                temp += tarray.get(ind);

                PrintWriter fout = new PrintWriter(new File(tcOutputFileName));
                fout.println(temp.toCharArray());
                fout.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
	}

	public boolean verifyTestCaseOutput() throws IOException
	{
            BufferedReader reader1 = new BufferedReader(new FileReader(this.filePath + "\\tcout.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader(this.filePath + "\\out.txt"));
         
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            boolean areEqual = true;
            int lineNum = 1;

            while (line1 != null || line2 != null)
            {
                if(line1 == null || line2 == null)
                {
                    areEqual = false;
                    break;
                }
                else if(! line1.equalsIgnoreCase(line2))
                {
                    areEqual = false;
                    consoleTextArea.append("Output mismatch in line : "+lineNum + "\n");
                    consoleTextArea.append("Expected : "+line1+"\nObtained : "+line2 + "\n");
                }

                System.out.println();
                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }
            consoleTextArea.append("\n----------------------------\n");

            reader1.close();
            reader2.close();
            return areEqual;
        }
        
    public boolean compileJava(String fileName ,String fpath)
    {
        boolean success = false;
        try
        {
            consoleTextArea.append("Compiling " + "\n");
            consoleTextArea.append("File : " + this.fileName + "\n");
            
            String fileFullPath = this.filePath+ System.getProperty("file.separator") + this.fileName;

            ProcessBuilder pb = new ProcessBuilder("javac", "-cp", filePath , fileFullPath);
            Process p = pb.start();

            BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader es = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            String line; 

            p.waitFor();

            if((line = es.readLine()) != null)
            {
                success = false;
                consoleTextArea.append("The following errors were found in your code!\n");
                consoleTextArea.append(line + " \n");

                while ((line = es.readLine()) != null){
                consoleTextArea.append(line + " \n");
                }
            }
            else
            {
                success = true;
                consoleTextArea.append("Compilation successfull \n");
                while ((line = is.readLine()) != null)
                {
                    consoleTextArea.append(line + " \n");
                }
            }
            p.destroy();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return success;
    }
    
    public boolean compileC(String fileName ,String fpath)
    {
        boolean success = false;
        try
        {
            consoleTextArea.append("Compiling " + "\n");
            consoleTextArea.append("File : " + this.fileName + "\n");
            
            String fileFullPath = this.filePath+ System.getProperty("file.separator") + this.fileName;
            String outputFilePath = this.filePath+ System.getProperty("file.separator") + "output.exe";
            
            ProcessBuilder pb = new ProcessBuilder("gcc", fileFullPath, "-o", outputFilePath);
            Process p = pb.start();

            BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader es = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            String line; 

            p.waitFor();

            if((line = es.readLine()) != null)
            {
                success = false;
                consoleTextArea.append("The following errors were found in your code!\n");
                consoleTextArea.append(line + " \n");

                while ((line = es.readLine()) != null){
                consoleTextArea.append(line + " \n");
                }
            }
            else
            {
                success = true;
                consoleTextArea.append("Compilation successfull \n");
                while ((line = is.readLine()) != null)
                {
                    consoleTextArea.append(line + " \n");
                }
            }
            p.destroy();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return success;
    }
    
    public boolean compileCpp(String fileName ,String fpath)
    {
        boolean success = false;
        try
        {
            consoleTextArea.append("Compiling " + "\n");
            consoleTextArea.append("File : " + this.fileName + "\n");
            
            String fileFullPath = this.filePath+ System.getProperty("file.separator") + this.fileName;
            String outputFilePath = this.filePath+ System.getProperty("file.separator") + "output.exe";
            
            ProcessBuilder pb = new ProcessBuilder("g++", fileFullPath, "-o", outputFilePath);
//            ProcessBuilder pb = new ProcessBuilder("javac", "-cp", filePath , fileFullPath);
            Process p = pb.start();

            BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader es = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            String line; 

            p.waitFor();

            if((line = es.readLine()) != null)
            {
                success = false;
                consoleTextArea.append("The following errors were found in your code!\n");
                consoleTextArea.append(line + " \n");

                while ((line = es.readLine()) != null){
                consoleTextArea.append(line + " \n");
                }
            }
            else
            {
                success = true;
                consoleTextArea.append("Compilation successfull \n");
                while ((line = is.readLine()) != null)
                {
                    consoleTextArea.append(line + " \n");
                }
            }
            p.destroy();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return success;
    }

    public void RunProgram(String fileName ,String fpath)
    {
        try
        {
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", this.filePath , this.fileName.substring(0, this.fileName.lastIndexOf(".")));
            pb.redirectInput(new File(this.filePath + "\\testcases.txt"));
            pb.redirectOutput(new File(this.filePath + "\\out.txt"));
            pb.redirectError(new File(this.filePath + "\\out.txt"));
            Process p = pb.start();

            p.waitFor();
            p.destroy();
        }
        catch(Exception e)
        {
//            e.printStackTrace();
            consoleTextArea.append("Exception!\n" + e.getMessage());
        }
    }
    
    public void RunPyProgram(String fileName ,String fpath)
    {
        try
        {
            String fileFullPath = this.filePath+ System.getProperty("file.separator") + this.fileName;
//            consoleTextArea.append("Full Path : " +fileFullPath + "\n");
            
            ProcessBuilder pb = new ProcessBuilder("python", fileFullPath);
            pb.redirectInput(new File(this.filePath + "\\testcases.txt"));
            pb.redirectOutput(new File(this.filePath + "\\out.txt"));
            pb.redirectError(new File(this.filePath + "\\out.txt"));
            Process p = pb.start();
            
            BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream())); 
            String line; 

            p.waitFor();
            p.destroy();
        }
        catch(Exception e)
        {
//            e.printStackTrace();
            consoleTextArea.append("Exception!\n" + e.getMessage());
        }
    }
    
    public void RunCProgram(String fileName ,String fpath)
    {
        try
        {
            String fileFullPath = this.filePath+ System.getProperty("file.separator") + "output.exe";
//            consoleTextArea.append("Full Path : " +fileFullPath + "\n");
            
            ProcessBuilder pb = new ProcessBuilder(fileFullPath);
            pb.redirectInput(new File(this.filePath + "\\testcases.txt"));
            pb.redirectOutput(new File(this.filePath + "\\out.txt"));
            pb.redirectError(new File(this.filePath + "\\out.txt"));
            Process p = pb.start();
            
            BufferedReader is = new BufferedReader(new InputStreamReader(p.getInputStream())); 
            String line; 

            p.waitFor();
            p.destroy();
        }
        catch(Exception e)
        {
//            e.printStackTrace();
            consoleTextArea.append("Exception!\n" + e.getMessage());
        }
    }
    
    public void clearFiles()
    {
        try{
        String tFileName = this.filePath + System.getProperty("file.separator") + "out.txt";
        PrintWriter fout = new PrintWriter(new File(tFileName));
        fout.println("");
        fout.close();
        
        tFileName = this.filePath + System.getProperty("file.separator") + "tcout.txt";
        fout = new PrintWriter(new File(tFileName));
        fout.println("");
        fout.close();
        
        tFileName = this.filePath + System.getProperty("file.separator") + "testcases.txt";
        fout = new PrintWriter(new File(tFileName));
        fout.println("");
        fout.close();
        }
        catch(Exception e)
        {
            consoleTextArea.append(e.getMessage());
        }
    }
    
}
