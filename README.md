## Networking: 
  * `=>Ipconfig` (config ase kina)
  * `=>ping 10.100.0.5` (given com id) [akta computer r aktate connect ase kina take knock kore replay dakhbe][4 bar store kore thambe]
  * `=>ping 10.100.0.5 /t`  [continuous er t][no timelimit until i stop][ctrl+c to stop]
  
## Setting ip:
**Off windos dfender from control panel:**
    `Control pannel > Network and sharing center > Change adpater setting > Ethernet > Properties > Ipv4 > chnage deafault`
## Folder sharing :
`Make a new folder > open properties > Open Share tab > network and sharing > all networks > turn off password protection>save
then propertis of that folder > share tab > click on share > then add everyone > save`

**Then on Run** `=>192.168.12.28\myshare`[targeted ip and shared folder name]


## SMTP Comm Sequence:

``
S: 220 smtp.example.com ESMTP Postfix
C: HELO relay.example.com
S: 250 smtp.example.com, I am glad to meet you
C: MAIL FROM:<bob@example.com>
S: 250 Ok
C: RCPT TO:<alice@example.com>
S: 250 Ok
C: RCPT TO:<theboss@example.com>
S: 250 Ok
C: DATA
S: 354 End data with <CR><LF>.<CR><LF>
C: From: "Bob Example" <bob@example.com>
C: To: Alice Example <alice@example.com>
C: Cc: theboss@example.com
C: Date: Tue, 15 Jan 2008 16:02:43 -0500
C: Subject: Test message
C: 
C: Hello Alice.
C: This is a test message with 5 header fields and 4 lines in the message body.
C: Your friend,
C: Bob
C: .
S: 250 Ok: queued as 12345
C: QUIT
S: 221 Bye
{The server closes the connection}
``
