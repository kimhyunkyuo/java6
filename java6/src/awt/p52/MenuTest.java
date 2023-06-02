package awt.p52;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일");
		MenuItem miNew = new MenuItem("새로만들기(n)          Ctl+N");
		MenuItem miOpen = new MenuItem("새창(W)          Ctrl+Shift+N");
		MenuItem mOthers = new Menu("열기(O)...                 Ctl+O");
		MenuItem miExit = new MenuItem("저장(S)             Ctl+S");
		MenuItem miA = new MenuItem("다른 이름으로 저장(A)             Ctl+Shift+S");
		MenuItem miB = new MenuItem("페이지 설정(U)...");
		MenuItem miC = new MenuItem("인쇄(P)...             Ctl+P");
		MenuItem miD = new MenuItem("끝내기(X)");

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);
		mFile.add(miA);
		mFile.add(miB);
		mFile.add(miC);
		mFile.add(miD);

		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
//        mOthers.add(miPrint);
//        mOthers.add(miPreview);
//        mOthers.add(miSetup);
//        

		Menu mEdit = new Menu("편집");

		MenuItem miE = new MenuItem("실행취소(U)                 Ctl+Z");
		MenuItem miF = new MenuItem("잘라내기(T)                 Ctrl+X");
		MenuItem miG = new MenuItem("복사(C)...                   Ctl+C");
		MenuItem miH = new MenuItem("붙여넣기(P)                 Ctl+V");
		MenuItem miI = new MenuItem("삭제(L)                        DEL");
		MenuItem miZ = new MenuItem("Bing으로 검색(S)...                                 Ctrl+E");
		MenuItem miX = new MenuItem("찾기(F)...                                Ctrl+F");
		Menu mi1 = new Menu("다음 찾기(N)                                  F3");
		MenuItem mi2 = new MenuItem("이전 찾기(V)                                     SHIFT+F3");
		MenuItem miN = new MenuItem("바꾸기(R)...                                     Ctrl+H");
		MenuItem miM = new MenuItem("이동(G)...                                    Ctrl+G");
		MenuItem mi0 = new MenuItem("모두 선택(A)                                     Ctrl+A");
		MenuItem miV = new MenuItem("시간/날짜(D)                                     F5");

		mEdit.add(miE);
		mEdit.addSeparator();

		mEdit.add(miF);
		mEdit.add(miG);
		mEdit.add(miH);
		mEdit.add(miI);
		mEdit.addSeparator();

        mEdit.add(miZ);
        mEdit.add(miX);
        mEdit.add(mi1);
        mEdit.add(mi2);
        mEdit.add(miN);n
        mEdit.add(miM);
        mEdit.addSeparator();
        mEdit.add(mi0);
        mEdit.add(miV);

		Menu mView = new Menu("서식");

		Menu mHelp = new Menu("보기");
		Menu mo = new Menu("도움말");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("자동 줄바꿈(W)");
		mView.add("자동 줄바꿈(W)");
		mView.add("글꼴(F)...");
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.add(mHelp);
		mb.add(mo);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);
	}
}
