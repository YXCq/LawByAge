
/**
 * Copyright (c) 2023 YXCq
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, subject to the following conditions:
 *
 * **The above permission is granted with the condition that any use, modification,
 * or distribution of this Software must be explicitly approved by the original
 * author YXCq in writing.**
 *
 * ...
 */



import java.util.Scanner;

public class Lawbyage {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Type your age: ");
        
        int age = scanner.nextInt();
        
        if (age < 18) {
        	 String article1 = "Child means every human being below the age of eighteen years unless under the law applicable to the child, majority is attained earlier.";
             String article2 = "The rights contained in this Convention shall be ensured to each child without discrimination of any kind, irrespective of the child's or his or her parent's or legal guardian's race, colour, sex, language, religion, political or other opinion, national, ethnic or social origin, property, disability, birth or other status.";
             String article3 = "In all actions concerning children, whether undertaken by public or private social welfare institutions, courts of law, administrative authorities or legislative bodies, the best interests of the child shall be a primary consideration.";
             String article5 = "States Parties shall respect the responsibilities, rights and duties of parents or, where applicable, the members of the extended family or community as provided for by local custom, legal guardians or other persons legally responsible for the child, to provide, in a manner consistent with the evolving capacities of the child, appropriate direction and guidance in the exercise by the child of the rights recognized in the present Convention.";
             String article6 = "Every child has the inherent right to life.";
             String article7 = "The child shall be registered immediately after birth and shall have the right from birth to a name, the right to acquire a nationality and, as far as possible, the right to know and be cared for by his or her parents.";
             String article8 = "States Parties undertake to respect the right of the child to preserve his or her identity, including nationality, name and family relations as recognized by law without unlawful interference.";
             String article9 = "States Parties shall ensure that a child shall not be separated from his or her parents against their will, except when competent authorities subject to judicial review determine, in accordance with applicable law and procedures, that such separation is necessary for the best interests of the child.";
             String article12 = "The child who is capable of forming his or her own views has the right to express those views freely in all matters affecting the child, the views of the child being given due weight in accordance with the age and maturity of the child.";
             String article13 = "The child shall have the right to freedom of expression; this right shall include freedom to seek, receive and impart information and ideas of all kinds, regardless of frontiers, either orally, in writing or in print, in the form of art, or through any other media of the child's choice.";
             String article14 = "States Parties shall respect the right of the child to freedom of thought, conscience and religion.";
             String article15 = "The child shall have the right to freedom of association and to freedom of peaceful assembly.";
             String article16 = "No child shall be subjected to arbitrary or unlawful interference with his or her privacy, family, or correspondence, nor to unlawful attacks on his or her honour and reputation.";
             String article17 = "States Parties recognize the important function performed by the mass media and shall ensure that the child has access to information and material from a diversity of national and international sources, especially those aimed at the promotion of his or her social, spiritual and moral well-being and physical and mental health.";
             String article18 = "States Parties shall use their best efforts to ensure recognition of the principle that both parents have common responsibilities for the upbringing and development of the child.";
             String article19 = "States Parties shall take all appropriate legislative, administrative, social and educational measures to protect the child from all forms of physical or mental violence, injury or abuse, neglect or negligent treatment, maltreatment or exploitation, including sexual abuse, while in the care of parent(s), legal guardian(s) or any other person who has the care of the child.";
             String article24 = "States Parties recognize the right of the child to the enjoyment of the highest attainable standard of health and to facilities for the treatment of illness and rehabilitation of health. States Parties shall strive to ensure that no child is deprived of his or her right of access to such health care services.";
             String article26 = "States Parties shall recognize for every child the right to benefit from social security, including social insurance, and shall take the necessary measures to achieve the full realization of this right in accordance with their national law.";
             String article27 = "States Parties recognize the right of every child to a standard of living adequate for the child's physical, mental, spiritual, moral and social development.";
             String article28 = "States Parties recognize the right of the child to education, and with a view to achieving this right progressively and on the basis of equal opportunity, they shall, in particular:";
             String article29 = "States Parties agree that the education of the child shall be directed to:";

             System.out.println("Article 1: " + article1);
             System.out.println("Article 2: " + article2);
             System.out.println("Article 3: " + article3);
             System.out.println("Article 5: " + article5);
             System.out.println("Article 6: " + article6);
             System.out.println("Article 7: " + article7);
             System.out.println("Article 8: " + article8);
             System.out.println("Article 9: " + article9);
             System.out.println("Article 12: " + article12);
             System.out.println("Article 13: " + article13);
             System.out.println("Article 14: " + article14);
             System.out.println("Article 15: " + article15);
             System.out.println("Article 16: " + article16);
             System.out.println("Article 17: " + article17);
             System.out.println("Article 18: " + article18);
             System.out.println("Article 19: " + article19);
             System.out.println("Article 24: " + article24);
             System.out.println("Article 26: " + article26);
             System.out.println("Article 27: " + article27);
             System.out.println("Article 28: " + article28);
             System.out.println("Article 29: " + article29);
           
        } else {
        	System.out.println("Laws applicable to individuals over 18 years:");
        	System.out.println("1. Prohibition of purchasing alcohol for individuals under 18 years of age.");
        	System.out.println("2. Right to vote in elections.");
        	System.out.println("3. Increased responsibility for one's own actions before the law.");
        	System.out.println("4. Laws regarding employment and labor rights.");
        	System.out.println("5. Rules of driving motor vehicles.");
        	System.out.println("6. Tax legislation.");
        	System.out.println("7. Real estate and rental laws.");
        	System.out.println("8. Laws concerning higher education and employment.");
        	System.out.println("9. Laws pertaining to family relationships.");
        	System.out.println("10. Laws governing investments and finance.");
            
        }
        
        scanner.close();
        }
    }
