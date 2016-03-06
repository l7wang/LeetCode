% LaTeX resume using res.cls
\documentclass[margin]{res}
%\usepackage{helvetica} % uses helvetica postscript font (download helvetica.sty)
%\usepackage{newcent}   % uses new century schoolbook postscript font 
\setlength{\textwidth}{5.1in} % set width of text portion

\begin{document}

% Center the name over the entire width of resume:
 \moveleft.5\hoffset\centerline{\large\bf Liangbicheng (Ralph) Wang}
% Draw a horizontal line the whole width of resume:
 \moveleft\hoffset\vbox{\hrule width\resumewidth height 1pt}\smallskip
% address begins here
% Again, the address lines must be centered over entire width of resume:
 \moveleft.5\hoffset\centerline{Apt. 1503, 23 Hollywood Ave, North York, ON, M2N 7L8}
 \moveleft.5\hoffset\centerline{ralph.1314@gmail.com}
 \moveleft.5\hoffset\centerline{(416)-858-8578}


\begin{resume}
 
\section{OBJECTIVE}  To immerse myself in the ever-growing field of technology, and to be part of a dedicated and united team that shares the same vision.
 

\section{EDUCATION} {\sl Honours Bachelor of Computer Science,} \hfill Sept 2009 - Dec 2015  \\
                      % \sl will be bold italic in New Century Schoolbook (or
	              % any postscript font) and just slanted in
		      %	Computer Modern (default) font
		        Degree Conferral June 2016 \\
                University of Waterloo, Waterloo, ON, CA

\section{RELEVENT \\ COURSES} CS 456 - Computer Networks, CS 447 - Software Testing, CS 350 - Operating Systems, CS 349 - User Interface, CS 348 - Database, CS 341 - Algorithms
 
\section{COMPUTER \\ SKILLS} {\sl Languages:} Java, Swift, C/C++, XML, SQL, Javascript \\
                {\sl Software and tools:} Eclipse, Apache Ant, MySql, Xcode, Node.js, mongoDB \\
                {\sl OS:} Linux (Ubuntu), OS X, Windows \\
 
\section{EXPERIENCE} {\sl Software Developer} \hfill May 2014 - Sept 2015 \\
                IBM Toronto Lab, Markham, ON 
                \begin{itemize}  \itemsep -2pt %reduce space between items
                \item Maintained the continuous integration process of Build \& Test for IBM Integration Bus.
                \item Developed and improved the scripts for automating software build process in Ant.
                \item Engineered test cases for build verification test (BVT) in Java.
                \item Devised and delegated customized build plans to accommodate urgent/special requests from all developers.
                \item Assisted in transferring the dependency manager of Business Process Manager (BPM) from Apache Ivy into Maven.
                \item Collaborated with a development team of 10+ people.
                \end{itemize}
 
\section{PROJECTS} Nummy! \hfill Sept 2015 - Present \\
                iOS Application
                \begin{itemize} \itemsep -2pt %reduce space between items
                \item Application to post \& find personal chef information. For connecting chefs and customers while circumventing restaurants
                \item Developed application interface for all user profile related pages
                \item Implemented REST APIs on Node.js for sending and retrieving corresponding app data
                \item Collaborated with closely-knit team by matching design specifications with implementation
                \end{itemize}
                
\section{ABOUT ME} Eager new grad ready to develop both myself and great code in the world. I enjoy gaming on the side and recreational swimming. My beliefs are that a great team is the foundation of the best company.
 

\end{resume}
\end{document}