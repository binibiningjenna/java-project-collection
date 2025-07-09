import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class JobHiring {
	
	static Color clrTheme = (new Color(188, 194, 162));
    static String selectedCategory = ""; 
	public static void main(String[] args) {
		
		// DECLARE ALL COMPONENTS
		JFrame frame = new JFrame("Upwork");
		JPanel pnlNav = new JPanel();
		JPanel pnlContent = new JPanel();
		JPanel pnlDevelopment = new JPanel();
		JPanel pnlAIServices = new JPanel();
		JPanel pnlDesign = new JPanel();
		JPanel pnlMarketing = new JPanel();
		JPanel pnlPostJob = new JPanel();
		JPanel pnlNotification = new JPanel();
		JPanel pnlFindJob = new JPanel();
		JButton btnDevelopment = new JButton("Development & IT");
		JButton btnAIServices = new JButton("AI Services");
		JButton btnDesign = new JButton("Design & Creative");
		JButton btnMarketing = new JButton("Sales & Marketing");
		JButton btnPost = new JButton("Post a Job");
		JButton btnPostedJob = new JButton("Find a Job ");
		JLabel lblItem = new JLabel("<html>");
	    JLabel lblTitle = new JLabel("Title:");
        JTextField txtTitle = new JTextField(50);
        JLabel lblDescription = new JLabel("Job Description:");
        JTextArea txtDescription = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(txtDescription); 
        JLabel lblBudget = new JLabel("Salary:");
        JTextField txtBudget = new JTextField(20);
        JLabel lblCategory = new JLabel("Job Category:");
        JButton btnPostJobNow = new JButton("Post Job Now");
        JPanel pnlCategories = new JPanel(new GridLayout(1, 0)); 
        
		// CREATE A DEVELOPMENT AND IT PANEL CONTENT

		String[][] DevJobs = {
				{"1.jpg", "Java Developer"},
				{"2.jpg", "Java Developer"},
				{"3.jpg", "QA Engineer"},
				{"4.jpg", "QA Engineer"},
				{"5.jpg", "Data Scientist"},
				{"6.jpg", "Data Scientist"},
				{"7.jpg", "SQL Developer"},
				{"8.jpg", "SQL Developer"},
				{"9.jpg", "iOS Developer"},
				{"10.jpg", "iOS Developer"},
		};
		
		// for each
		for(String[] DevJob : DevJobs) {
			URL imgurl1 = JobHiring.class.getResource("/" + DevJob[0]);
            ImageIcon icn1 = new ImageIcon(imgurl1);
			JButton btnDevJobs = new JButton(DevJob[0]);
			btnDevJobs.setIcon(icn1);
			btnDevJobs.setPreferredSize(new Dimension(207,290));
			pnlDevelopment.add(btnDevJobs);
			
			btnDevJobs.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            int option = JOptionPane.showConfirmDialog(frame,
		                    "Are you sure you want to hire a new employee?",
		                    "Verification",
		                    JOptionPane.YES_NO_OPTION);
		            if (option == JOptionPane.YES_OPTION) {
		            	String strReceipt = lblItem.getText();
						lblItem.setText(strReceipt + DevJob[1] + " " + "Hired!" + "<br/>");

		            } else {
		            }
		        }
		    });
		}
		
		// CREATE AI SERVICES PANEL CONTENT
		
		String[][] AIServices = {
				{"11.jpg", "AI Consultant"},
				{"12.jpg", "AI Consultant"},
				{"13.jpg", "AI  Model Developer"},
				{"14.jpg", "AI  Model Developer"},
				{"15.jpg", "AI Art Creator"},
				{"16.jpg", "AI Art Creator"},
				{"17.jpg", "ChatBot Developer"},
				{"18.jpg", "ChatBot Developer"},
				{"19.jpg", "AI Model Developer"},
				{"20.jpg", "AI Model Developer"},
		};
		
		// for each
		for(String[] AIservice : AIServices) {
			URL imgurl1 = JobHiring.class.getResource("/" + AIservice[0]);
            ImageIcon icn1 = new ImageIcon(imgurl1);
			JButton btnAIservices = new JButton(AIservice[0]);
			btnAIservices.setIcon(icn1);
			btnAIservices.setPreferredSize(new Dimension(207,290));
			pnlAIServices.add(btnAIservices);
			
			btnAIservices.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            int option = JOptionPane.showConfirmDialog(frame,
		                    "Are you sure you want to hire a new employee?",
		                    "Verification",
		                    JOptionPane.YES_NO_OPTION);
		            if (option == JOptionPane.YES_OPTION) {
		            	String strReceipt = lblItem.getText();
						lblItem.setText(strReceipt + AIservice[1] + " " + "Hired!" + "<br/>");

		            } else {
		            }
		        }
		    });
		}
		
		// CREATEDESIGN AND CREATIVES PANEL CONTENT
		
		String[][] Designs = {
				{"21.jpg", "UX Designer"},
				{"22.jpg", "UX Designer"},
				{"23.jpg", "Graphic Designer"},
				{"24.jpg", "Graphic Designer"},
				{"25.jpg", "Web Designer"},
				{"26.jpg", "Web Designer"},
				{"27.jpg", "Video Editor"},
				{"28.jpg", "Video Editor"},
				{"29.jpg", "Art Director"},
				{"30.jpg", "Art Director"},
			};
			
			// for each
			for(String[] Design : Designs) {
				URL imgurl1 = JobHiring.class.getResource("/" + Design[0]);
	            ImageIcon icn1 = new ImageIcon(imgurl1);
				JButton btnDesigns = new JButton(Design[0]);
				btnDesigns.setIcon(icn1);
				btnDesigns.setPreferredSize(new Dimension(207,290));
				pnlDesign.add(btnDesigns);
				
				btnDesigns.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			            int option = JOptionPane.showConfirmDialog(frame,
			                    "Are you sure you want to hire a new employee?",
			                    "Verification",
			                    JOptionPane.YES_NO_OPTION);
			            if (option == JOptionPane.YES_OPTION) {
			            	String strReceipt = lblItem.getText();
							lblItem.setText(strReceipt + Design[1] + " " + "Hired!" + "<br/>");

			            } else {
			            }
			        }
			    });
			}
			
		// CREATE SALES AND MARKETING PANEL CONTENT
			
		String[][] Marketings = {
				{"31.jpg", "Social Media Manager"},
				{"32.jpg", "Social Media Manager"},
				{"33.jpg", "SEM Specialist"},
				{"34.jpg", "SEM Specialist"},
				{"35.jpg", "SEO Expert"},
				{"36.jpg", "SEO Expert"},
				{"37.jpg", "Market Research Analyst"},
				{"38.jpg", "Market Research Analyst"},
				{"39.jpg", "Email Marketer"},
				{"40.jpg", "Email Marketer"},
			};
			
			// for each
			for(String[] Marketing : Marketings) {
				URL imgurl1 = JobHiring.class.getResource("/" + Marketing[0]);
	            ImageIcon icn1 = new ImageIcon(imgurl1);
				JButton btnMarketings = new JButton(Marketing[0]);
				btnMarketings.setIcon(icn1);
				btnMarketings.setPreferredSize(new Dimension(207,290));
				pnlMarketing.add(btnMarketings);
				
				btnMarketings.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			            int option = JOptionPane.showConfirmDialog(frame,
			                    "Are you sure you want to hire a new employee?",
			                    "Verification",
			                    JOptionPane.YES_NO_OPTION);
			            if (option == JOptionPane.YES_OPTION) {
			            	String strReceipt = lblItem.getText();
							lblItem.setText(strReceipt + Marketing[1] + " " + "Hired!" + "<br/>");

			            } else {
			            }
			        }
			    });
			}
	
		// CREATE JOB POST PANEL CONTENT
			
			pnlPostJob.setLayout(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.gridwidth = GridBagConstraints.REMAINDER;
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        gbc.insets = new Insets(4, 2, 2, 2);
	        txtDescription.setLineWrap(true); 
	        txtDescription.setWrapStyleWord(true); 
	        
	        String[] categories = {"Virtual Assistant", "Project Manager", "Teacher", "Freelancer"};
	        for (String category : categories) {
	            JButton btnCategory = new JButton(category);
	            btnCategory.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    selectedCategory = category; 
	                }
	            });
	            pnlCategories.add(btnCategory);
	            btnCategory.setBackground(clrTheme);
	        }
	        
	        btnPostJobNow.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                String title = txtTitle.getText();
	                String description = txtDescription.getText();
	                String budget = txtBudget.getText();
	                String category = selectedCategory;

	                JTextArea txtAreaContent = new JTextArea();
	                txtAreaContent.setEditable(false); 
	                txtAreaContent.setLineWrap(true); 
	                txtAreaContent.setWrapStyleWord(true); 

	                txtAreaContent.append("Title: " + title + "\n");
	                txtAreaContent.append("Description: " + description + "\n");
	                txtAreaContent.append("Salary: " + budget + "\n");
	                txtAreaContent.append("Category: " + category + "\n");

	                pnlFindJob.setLayout(new BoxLayout(pnlFindJob, BoxLayout.Y_AXIS));
	                pnlFindJob.add(txtAreaContent);

	                txtTitle.setText("");
	                txtDescription.setText("");
	                txtBudget.setText("");
	                selectedCategory = "";
	                for (Component comp : pnlCategories.getComponents()) {
	                    comp.setEnabled(true);
	                }

	                if (!(pnlFindJob.getBorder() instanceof TitledBorder)) {
	                    TitledBorder titledBorder = BorderFactory.createTitledBorder("APPLY NOW!");
	                    pnlFindJob.setBorder(titledBorder);
	                }

	                JLabel lblMessage = new JLabel("Job has been posted!");
	                pnlNotification.add(lblMessage);
	                pnlNotification.revalidate();
	                pnlNotification.repaint();
	            }
	        });

		// SET PANEL SETTINGS

		pnlNav.setLayout(new GridLayout());
		CardLayout lmCard = new CardLayout();
		pnlContent.setLayout(lmCard);
		pnlNotification.setPreferredSize(new Dimension(213,0));
		pnlDevelopment.setBackground(clrTheme);
		pnlAIServices.setBackground(clrTheme);
		pnlDesign.setBackground(clrTheme);
		pnlMarketing.setBackground(clrTheme);
		pnlFindJob.setBackground(clrTheme);
		pnlPostJob.setBackground(clrTheme);
		pnlNav.setBackground(clrTheme);
		pnlNotification.setBackground(clrTheme);
		btnDevelopment.setBackground(clrTheme);
		btnAIServices.setBackground(clrTheme);
		btnDesign.setBackground(clrTheme);
		btnMarketing.setBackground(clrTheme);
		btnPost.setBackground(clrTheme);
		btnPostedJob.setBackground(clrTheme);
		btnPostJobNow.setBackground(clrTheme);
		
		// BUTTON FUNCTIONS
		
		btnDevelopment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "Development");
			}
		});
		
		btnAIServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "AIServices");
			}
		});
		
		btnDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "Design");
			}
		});
		
		btnMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "Marketing");
			}
		});
		
		btnPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "PostJob");
			}
		});
		
		btnPostedJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "FindJob");
			}
		});
		
		// SET FRAME SETTINGS

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());
		
		// ADD TO PANEL
		
		btnPostedJob.setPreferredSize(new Dimension(0, 50));
		
		pnlPostJob.add(lblTitle, gbc);
        pnlPostJob.add(txtTitle, gbc);
        pnlPostJob.add(lblDescription, gbc);
        pnlPostJob.add(scrollPane, gbc);
        pnlPostJob.add(lblBudget, gbc);
        pnlPostJob.add(txtBudget, gbc);
        pnlPostJob.add(lblCategory, gbc);
        pnlPostJob.add(pnlCategories, gbc);
        pnlPostJob.add(btnPostJobNow, gbc);
        
        pnlNotification.add(lblItem);
        
		pnlContent.add(pnlDevelopment, "Development");
		pnlContent.add(pnlAIServices, "AIServices");
		pnlContent.add(pnlDesign, "Design");
		pnlContent.add(pnlMarketing, "Marketing");
		pnlContent.add(pnlPostJob, "PostJob");
		pnlContent.add(pnlFindJob, "FindJob");
		
		pnlNav.add(btnDevelopment);
		pnlNav.add(btnAIServices);
		pnlNav.add(btnDesign);
		pnlNav.add(btnMarketing);
		pnlNav.add(btnPost);				
		pnlNav.add(btnPostedJob);
		
		// ADD TO FRAME
		
		frame.add(pnlNav, BorderLayout.NORTH);
		frame.add(pnlContent, BorderLayout.CENTER);
		frame.add(pnlNotification, BorderLayout.EAST);
	}
}