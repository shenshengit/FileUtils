//1 存储字符串
  public void saveString(String fileName, String data){
    FileOutputStream out = null;
    BufferedWriter writer = null;
    try {
      out = openFileOutput(fileName, Context.MODE_PRIVATE);
      writer = new BufferedWriter(new OutputStreamWriter(out));
      writer.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (writer != null) {
          writer.close();
        } 
      } catch (IOException e ) {
        e.printStackTrace ();
      }
    }
  }


//2 读取字符串
  public string loadString(String fileName) {
    FileInputStream in = null;
    BufferedReader reader = null;
    StringBuilder content = new StringBuilder();
    try {
      in = openFileInput(fileName);
      reader = new BufferedReader(new InputStreamReader(in));
      String line = "";
      while ((line = reader.readLine()) != null) {
        content.append(line);
      }
    } catch (IOException e) {
      e.printStarckTrace();
    } finally {
      if (reader != null) {
        try{
          reader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return content.toString();
  }
3 存储字节数据

4 读取字节数据
