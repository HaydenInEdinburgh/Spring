# Spring
Lecture Coding files and Spring projects
Initial configuration
0. DO NOT CONNECT TO INTERNET
1. Create an offline account with username admin and password as today's date in yyyyMMdd format, save the password to *Admin vault of the organization. Change computer's device name to something meaningful. 
2. Check system version, upgrade to Professional if Home version:
	Open cmd as admin, execute
		slmgr /ipk VK7JG-NPHTM-C97JM-9MPGT-3V66T
3. Activate Windows
	3.1 If setting up a desktop computer for use in an office, use KMS
		Open cmd as admin, execute
			slmgr /ipk W269N-WFGWX-YVC9B-4J6C9-T83GX
			slmgr /skms 192.168.1.43
			slmgr /ato
	3.2 If setting up a laptop computer, skip until after Office is installed then activate both
4. Disable OS Version Upgrade
	Open cmd as admin, execute
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Policies\Microsoft
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Policies\Microsoft\Windows
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Policies\Microsoft\Windows /v DisableOSUpgrade /d 1 /t REG_DWORD /f
reg add HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\WindowsUpdate /v AllowOSUpgrade /d 0 /t REG_DWORD /f
5. If a fresh install, download and install drivers
6. Open Mangage BitLocker and Turn on BitLocker for fixed hard drives. Save the BitLocker ID and Recovery Key to *Admin vault of the organization
7. Download and install Chrome, 7-zip, teamviewer
8. Setup teamviewer, choose advanced mode and enable unattended access support, skip online account and enable unattended access. Generate a strong password and save to *Admin vault of the organization
9. In Control Panel - Programs and Software, uninstall any existing Microsoft Office
10. Make a folder somewhere and exclude it in Windows Security - Virus & threat protection - Manage Settings - Add or remove exclusions
11. Exclude C:\ProgramData, C:\Program Files, C:\Program Files (x86)  in Windows Security - Virus & threat protection - Manage Settings - Add or remove exclusions
12. Copy Office installer to the newly craeted folder from
	\\dudley-depot\Public\Software\PC softwares\鍔炲叕杞欢\Office\Office 2016\MICROSOFT Office PRO Plus 2016 v16.0.4266.1003 RTM + Activator [TechTools.NET]/MICROSOFT Office PRO Plus 2016 v16.0.4266.1003 RTM + Activator [TechTools.NET].rar
	12.1 Unzip using 7-zip and run office\setup64.exe
	12.2 OPEN ANY OFFICE PROGRAM AND CLICK ACCEPT
	12.3 After installing, execute KMSAuto Net 2015 v1.3.8 Portable\KMSAuto Net.exe as admin, click Activation - Activate Office. It will most likely pop up a window letting you convert from Retail to VL. Click on the only button and wait it to become gray.
	12.4 If installing for desktop computer, use task manager to kill the KMSAuto Net program.
		12.4.1 Open cmd as admin and execute
			cd C:\Program Files\Microsoft Office\Office16
			cscript ospp.vbs /sethst:192.168.1.43
			cscript ospp.vbs /act
	12.5 If installing for laptop computer, click the close button and wait for prompt to set up scheduled task and click Yes.
		12.5.1 Click Activate Windows and wait for prompt to change scheduled task to activate both Windows and Office, click Yes.
13. Copy Acrobat installer from \\dudley-depot\Public\Software\PC softwares\Adobe-鍙夾dobe鐩稿叧\Adobe Acrobat XI\Adobe Acrobat XI Pro 11.0.0 Multilanguage (Cracked dll ) [ChingLiu].zip
	13.1 DISCONNECT INTERNET
	13.2 Unzip and follow the instructions in Adobe Acrobat XI Pro 11.0.0 Multilanguage (Cracked dll ) ChingLiu.mht
	13.3 Disable automatic update in Preferences - Updater

14. Create an offline standard user account for the person who will be using the computer. Create a meaningful complex password and save to *Admin vault of the organization
15. Log in as the user, download and install Nextcloud, Element.io, Enpass
16. Configure the software according to relevant documentation
