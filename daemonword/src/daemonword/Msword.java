package daemonword;

public class Msword extends Thread{
public void run()
{
	try
	{
		if(getName().equals("TYPE"))
		{
			typing();
		}
		else if(getName().equals("SPELL"))
		{
			spellcheck();
		}
		else
		{
			autosave();
		}
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void typing()
{
	try
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("typing");
			Thread.sleep(3000);
		}
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void spellcheck()
{
	try
	{
		for( int i= 1; i<=5 ;i++ )
		{
			System.out.println("spell checking");
			Thread.sleep(3000);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void autosave()
{
	try
	{
		for( int i= 1; i<=5 ;i++  )
		{
			System.out.println("auto saving");
			Thread.sleep(3000);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
