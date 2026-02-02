package Day4;

public class Screenshotcode {
/*
   WebDriver driver = new ChromDriver();
   driver.get("https//www.com");
   
   TakesScreenshot ts= (TakesScreenshot)driver;
   File src= ts.getScreenshotAs(OutputType.FILE);
   
   String timeStamp= new SimpleDataFormat("yyyyMMdd_HHmmss").format(new Date());
   File dest= new File("screenshots/screenshot"+timestamp+".png");
   
   FileUtils.copy(src,dest);
   System.out.println("Screenshot saved"+dest.getAbsolutePath());
   
   This line creates a timestamp string — a unique text based on the current date and time — which is often used in filenames (like screenshots, reports, logs, etc.).

🧠 Step-by-Step Explanation:

new Date()

Creates a new Date object that represents the current date and time right now.

Example:
👉 Tue Oct 07 20:45:30 IST 2025

new SimpleDateFormat("yyyyMMdd_HHmmss")

Creates a formatter that defines how the date/time should look when converted to a string.

Format pattern:

yyyy → Year (e.g., 2025)

MM → Month (e.g., 10)

dd → Day (e.g., 07)

_ → Just a separator (underscore)

HH → Hour (24-hour format)

mm → Minute

ss → Second

So "yyyyMMdd_HHmmss" means → 20251007_204530

.format(new Date())

Takes the current date (new Date()) and formats it according to the pattern defined above.

String timestamp = ...

Stores that formatted date/time string in the variable timestamp.

✅ Example Output

If the current time is October 7, 2025, 8:45:30 PM,
then:

String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
System.out.println(timestamp);


Output:

20251007_204530

🔧 Why It’s Useful

It helps you generate unique filenames each time your code runs — for example:

File screenshot = new File("screenshots/test_" + timestamp + ".png");


→ screenshots/test_20251007_204530.png

No overwriting — every file gets a unique name.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
}
