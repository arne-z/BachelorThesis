\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{template/hpi_thesis}[2017/09/10 HPI Master Thesis (System Analysis and Modelling Group)]

\RequirePackage[utf8]{inputenc}

\LoadClass[%
%%%%%		PDFTex verwenden
pagesize=pdftex,
%%%%%   Language
english,
%%%%%   Paper size
a4paper,
%%%%%		Schriftgröße Standard 11
fontsize=11pt,
%%%%%   Get smaller borders and more space for writing
%%%%% ATTENTION be carefull with your binding! See scrbook manual! 
DIV=14,
%%%%%   Set the binding correction
BCOR=10mm,
%%%%%   Create smaller headlines
2.5headlines, 
%%%%%   Create small headings
% headings=small, 
%%%%%   Use a titlepage
titlepage, 
%openbib,
%%%%%   Bibliography + List of ... in Table of Contents with a chapter number
bibliography = totocnumbered,
listof = totocnumbered,
%%%%%   Add the prefix "Appendix" to the apendix chapters
appendixprefix = true,
%%%%%   Use a twoside style
%%%%% ATTENTION oneside will change layout completely! Check this early!
twoside,
open=any,
%oneside,
parskip=half
]{scrbook}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% INCLUDE PACKAGES (GENERAL)
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\usepackage[normalem]{ulem}
\usepackage[ngerman,english]{babel}
\usepackage[backend=biber,style=alphabetic,maxbibnames=10,sorting=nyt]{biblatex}
\usepackage[acronym,nonumberlist,numberedsection,toc]{glossaries}
\usepackage[inline, shortlabels]{enumitem}
\usepackage{multicol,multirow}
\usepackage{graphicx}
\usepackage{subcaption}
\usepackage{rotating}
\usepackage[section]{placeins}
\usepackage{color}
\usepackage{xcolor}
\usepackage[pdftex, pdfdisplaydoctitle=true, colorlinks, linktocpage, linkcolor=black, citecolor=black, urlcolor=black]{hyperref}
\usepackage[autooneside,automark]{scrpage2}
\usepackage{bookmark}
\usepackage{longtable,ltcaption}
\usepackage{wrapfig}
\usepackage{titlesec}
\usepackage{textcomp}
\usepackage{listings}
\usepackage{fancybox}
\usepackage[T1]{fontenc}
\usepackage{caption}
\usepackage{colortbl}
\usepackage{amssymb}
\usepackage{ntheorem}
\usepackage{thmtools}
\usepackage[framemethod=tikz]{mdframed}
\usepackage{algorithm,algpseudocode}
\usepackage{extarrows}
\usepackage{makecell}

\renewcommand*{\labelalphaothers}{\textsuperscript{+}}
\NewDocumentCommand{\rot}{O{45} O{1em} m}{\makebox[#2][l]{\rotatebox{#1}{#3}}}%





%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% HPI COLORS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% red
\definecolor{hpired}{rgb}{0.686,0,0.204}   %100 
\colorlet{hpired2}{hpired!60!white}        % 60
\colorlet{hpired3}{hpired!40!white}        % 40
\colorlet{hpired4}{hpired!20!white}        % 20
% orange
\definecolor{hpiorange}{rgb}{0.867,0.380,0.031} %100 
\colorlet{hpiorange2}{hpiorange!60!white}       % 60
\colorlet{hpiorange3}{hpiorange!40!white}       % 40
\colorlet{hpiorange4}{hpiorange!20!white}       % 20	
% yellow
\definecolor{hpiyellow}{rgb}{0.965,0.659,0}			%100 
\colorlet{hpiyellow2}{hpiyellow!60!white}				% 60
\colorlet{hpiyellow3}{hpiyellow!40!white}				% 40
\colorlet{hpiyellow4}{hpiyellow!20!white}				% 20
% grey
\definecolor{hpigray}{rgb}{0.376,0.408,0.420}		%100
\colorlet{hpigray2}{hpigray!70!white}						% 70
\colorlet{hpigray3}{hpigray!50!white}						% 50
\colorlet{hpigray4}{hpigray!20!white}						% 20
% blue
\definecolor{hpiblue}{rgb}{0,0.478,0.620}				%100
\colorlet{hpiblue2}{hpiblue!60!white}						% 60
\colorlet{hpiblue3}{hpiblue!40!white}						% 40
\colorlet{hpiblue4}{hpiblue!15!white}						% 15

{\hypersetup{citecolor=hpired}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% PAGESTYLE SELECTION
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\pagestyle{scrheadings}
\renewcommand*{\chapterpagestyle}{scrheadings}
\renewcommand*{\indexpagestyle}{scrheadings}
\automark[chapter]{chapter}
\clearscrheadfoot
\lehead[]{\headmark}
\rohead[]{\headmark}
\cfoot{\parbox[t][1em]{\textwidth}{\centering\vfill\textbf{--} \pagemark\textbf{ --}}}

%% colored head- and footlines
\setheadsepline{1.0pt}[\color{hpired}] 
\setfootsepline{1.0pt}[\color{hpired}]
\pdfminorversion=6
\captionsetup{format=plain,labelfont=bf,labelsep=endash,justification=RaggedRight}%,indention=1cm}

%% Specially formated chapter header
\titleformat{\chapter}[hang]{\Huge\bfseries\sffamily}{\thechapter\hspace{20pt}\textcolor{hpired}{|}\hspace{20pt}}{0pt}{\Huge\bfseries}



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% SUBFOLDERS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% PATHES FOR GRAPHIC-FILES
\graphicspath{{./}{img/}{template/}}



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% TITLEPAGE
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\renewcommand{\maketitle}[0]{
	\begin{titlepage}


  \vspace*{0.5cm}
	\centering
	\sffamily
	\includegraphics[height=20ex]{logo/uni_potsdam_logo}
	\hspace{2.5cm}
	\includegraphics[width=35ex]{logo/hpi_logo}
	\vspace*{0.75cm}

	\textsf{\Large \docIntituteLong}\\

	\vspace{2cm}

	\LARGE \textbf{Bachelor's Thesis}
  \\[0.5\baselineskip]
	\Huge \textbf{\docTitleEn}
  \\[0.5\baselineskip]
  \Large \docTitleDe

	\vspace{1.5cm}

	{\Large \docAuthor}
  \\[0.5\baselineskip]
	{\normalsize \docAuthorMail}\\

  \todoImprove{Add Graphic.}

	\vfill

	\large Supervised by \docSupervisited
	\\[0.1\baselineskip]
	\docChair

	\vspace{1cm}
	\textsf{\docCity{}, \docDate}\\ %%Date - better you write it yourself.
	\end{titlepage}
}



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% DEFINITIONS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\theoremstyle{break}
\theoremseparator{\medskip}
\theorembodyfont{\normalfont}

\newmdtheoremenv[
  linewidth=2pt,
  linecolor=hpired,
  hidealllines=true,
  leftline=true,
  innertopmargin=0.5\topskip,
  innerbottommargin=0.5\topskip,
  skipbelow=\topskip,
  ntheorem=true,
]{mathdef}{Definition}

\newmdtheoremenv[
  linewidth=2pt,
  linecolor=hpiorange,
  hidealllines=true,
  leftline=true,
  innertopmargin=0.5\topskip,
  innerbottommargin=0.5\topskip,
  skipbelow=\topskip,
  ntheorem=true
]{crit}{Criterion}

\newmdtheoremenv[
  linewidth=2pt,
  linecolor=hpiyellow,
  hidealllines=true,
  leftline=true,
  innertopmargin=0.5\topskip,
  innerbottommargin=0.5\topskip,
  skipbelow=\topskip,
  ntheorem=true
]{example}{Example}

\newmdtheoremenv[
  linewidth=2pt,
  linecolor=hpiorange,
  hidealllines=true,
  leftline=true,
  innertopmargin=0.5\topskip,
  innerbottommargin=0.5\topskip,
  skipbelow=\topskip,
  ntheorem=true
]{comp}{Complexity Result}


%\newcommand{\mathdefautorefname}{Definition}
%\newcommand{\critautorefname}{Criterion}
\newcommand{\algorithmautorefname}{Algorithm}
%\newcommand{\exampleautorefname}{Example}
%\newcommand{\compautorefname}{Complexity Result}

\makeatletter
  \def\ll@mathdef{%
    \protect\numberline{\csname the\thmt@envname\endcsname}%
    \ifx\@empty\thmt@shortoptarg
      \thmt@thmname
    \else
      \thmt@shortoptarg
    \fi}
  \def\l@thmt@mathdef{} 

  \def\ll@example{%
    \protect\numberline{\csname the\thmt@envname\endcsname}%
    \ifx\@empty\thmt@shortoptarg
      \thmt@thmname
    \else
      \thmt@shortoptarg
    \fi}
  \def\l@thmt@example{} 

  \def\ll@crit{%
    \protect\numberline{\csname the\thmt@envname\endcsname}%
    \ifx\@empty\thmt@shortoptarg
      \thmt@thmname
    \else
      \thmt@shortoptarg
    \fi}
  \def\l@thmt@crit{} 

  \def\ll@comp{%
    \protect\numberline{\csname the\thmt@envname\endcsname}%
    \ifx\@empty\thmt@shortoptarg
      \thmt@thmname
    \else
      \thmt@shortoptarg
    \fi}
  \def\l@thmt@comp{} 
\makeatother


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% HEADERS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% \titleformat
% {\chapter} % command
% [display] % shape
% {\bfseries\Large\itshape} % format
% {\thechapter} % label
% {0.5cm} % sep
% { \centering } % before-code
% [ \vspace{1cm} \rule{\textwidth}{1pt}] % after-code