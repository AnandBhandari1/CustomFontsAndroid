<p>How to Use Custom Fonts Android, two easy methods</p>
<h2>To Use Custom Fonts Android need to follow these steps</h2>
<p>&nbsp;</p>
<p>Custom Fonts Android</p>
<ol>
	<li>Download Custom fonts TTF files from any site, like <a href="https://fonts.google.com/">google fonts</a>.</li>
	<li>Put the font in <strong>assets</strong> folder, (just create a folder name called assets)</li>
	<li>update the code in xml</li>
	<li>update the code in java file</li>
	<li>thats it.</li>
</ol>
<h2>Custom Fonts Android Details:</h2>
<h2>Method - 1</h2>
<h2>Using Asset folder</h2>
<p>Step -1 :</p>
<p>Download Google fonts in asset folder (</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2>Method - 2</h2>
<h2>By Creating font folder under res folder</h2>
<p>I am going to create random fonts for text my post content.</p>
<p>&nbsp;</p>
<p>I have created a folder name <strong>font </strong>under res folder and I have downloaded font from google fonts.</p>
<p id="BWVpxsg"><img class="alignnone size-full wp-image-426 " src="https://learnoye.com/wp-content/uploads/2018/05/img_5b018cda3315c.png" alt="" /></p>
<p>&nbsp;</p>
<h2>Java Code</h2>
<pre class="lang:java decode:true ">   int[] fonts = new int[15];
        fonts[0] = R.font.font1;
        fonts[1] = R.font.font2;
        fonts[2] = R.font.font3;
        fonts[3] = R.font.font4;
        fonts[4] = R.font.font5;
        fonts[5] = R.font.font6;
        fonts[6] = R.font.font7;
        fonts[7] = R.font.font8;
        fonts[8] = R.font.font9;
        fonts[9] = R.font.font10;
        fonts[10] = R.font.font11;
        fonts[11] = R.font.font12;
        fonts[12] = R.font.font13;
        fonts[13] = R.font.kavi;
        fonts[14] = R.font.noto;


        int idfx = new Random().nextInt(fonts.length);
        int randomfnts = (fonts[idfx]);



        Typeface typeface = ResourcesCompat.getFont(activity, randomfnts);
        post_content.setTypeface(typeface);</pre>
<p>&nbsp;</p>
<p>I have used <strong>post_content</strong> which is my text view, you can find it by findviewbyid</p>
<p>However there is static way to change font</p>
<pre class="lang:xhtml decode:true">&lt;TextView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:text="my demo text"
    android:fontFamily="@font/font1"
android:id="@+id/post_content"
    /&gt;</pre>
<p>Android provides an alternative way by using XML syntax.</p>
<p>Just like SRC we can reference fonts also</p>

<img class="wp-image-429 size-full" src="https://learnoye.com/wp-content/uploads/2018/05/img_5b018ed2788a8.png" alt="How to Use Custom Fonts Android, two easy methods" width="651" height="337" /> How to Use Custom Fonts Android, two easy methods

<p id="mRIbvdp"> </p>
<p>&nbsp;</p>
<h2>Download Sample Code</h2>
<p>&nbsp;</p>
<h2>Watch Video Tutorials</h2>
<p>&nbsp;</p>
<h2>Learn Take a Free Course on Android</h2>
<p>Queries: </p>
<p>custom font android xml,custom font android studio, android custom font for whole application, android fonts list,android font xml, android custom font textview, how to change font style in android xml, android font family</p>
<h2>Is there any drawback for using custom fonts in android</h2>
<p>Yes, because if you use custom fonts in Listview or any view which is dynamically added at run time. for example populating listview with very long text and at runtime the  font is applied at that time, it may cause lag or performance issue or may be app freeze.</p>
<p>but if you are using custom fonts in single page or post process of any task then it will work fine. Even if you use edittext and custom font it will work</p>
<p>enjoy, I am still learning... always <a href="https://learnoye.com">learning</a> :)</p>
<p>Thanks</p>
<h2 class="entry-title">Anand Bhandari</h2>
<p>Follow me on Facebook:</p>
<p>Visit My website:  <a href="https://anandbhandari.com">https://anandbhandari.com</a></p>
<p>&nbsp;</p>
