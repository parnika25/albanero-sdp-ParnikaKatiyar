package com.eg2.string;

import org.springframework.stereotype.Component;
@Component
public class Count 
{
	private String str;
		
	public String counting(String str1) 
	{
		str=str1;
		int vowels=0,special=0;
	
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			
			if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
				{
					vowels++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				continue;
			}
			else
				special++;
		}
		return ("Vowels - "+ vowels + " Special Characters - " + special);
	}
	}
