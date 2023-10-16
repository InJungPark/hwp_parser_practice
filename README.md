# hwp_parser_practice
hwp parser 문서 읽어오기 Test

한글 문서 파일 구조 5.0 됴큐먼트 : http://www.hancom.com/etc/hwpDownload.do 

참고 hwplib : https://github.com/neolord0/hwplib

한글과 컴퓨터(한컴)에서 만든 워드프로세서 "한글"의 파일에 대한 라이브러리입니다.
본 라이브러리는 JAVA로 구현되었으며, 한글 파일의 하부 구조인 Microsoft Compound File의 부분은 Apache-POI의 POIFS File System을 사용하여 처리합니다. 본 라이브러리는 한글과컴퓨터의 한글 문서 파일(.hwp) 공개 문서를 참고하여 개발하였습니다. 한컴에서 제공하는 문서(HWP 5.0)는 아래URL에서 받을 수 있습니다.
http://www.hancom.com/etc/hwpDownload.do?gnb0=269&gnb1=271&gnb0=101&gnb1=140
---
github에 올라온 프로젝트 소개 글이며, 처음부터 쭉 따라갔는데 Apache POI 라이브러리가 나오길래 
무슨 소리인가 했더니 찾아보고 주변에 물어보니 Apache POI 라이브러리는
마이크로소프트사의 워드 포맷 형식을 지원하는 라이브러리였다.
한글의 .hwp파일은 MicroSoft의 word 형식이랑 같은 건가? 하고 의문이 들었는데
hwp나 word는 같은 Compound File Binary Format이라고 하더라... 
또한 한글은 XML 기반으로도 파일이 제공된다고 한다.
위 라이브러리를 통해서 진행한 이 프로젝트는 한글파일을 읽어 들여와서 콘솔창에 띄우는 결과물을 만들어 낸 것이다.
