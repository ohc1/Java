package lec10_extends_interface.board;

public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board(1, "ù��° �Խñ�", "1���̴�", "abc123");
		System.out.println(board.toString());
		
		// �߰�ŷ� �Խ���
		// �ʵ忡 ��ǰ �̹���, ��ǰ ����
		TradeBoard trade = new TradeBoard(1, "����Ű �Ź� �˴ϴ�", "����", "badc12", "����Ű�Ź�.jpg", 50000);
		System.out.println(trade.toString());
		
		// ������ �Խ���
		// �ʵ忡 ��ũ
		VideoBoard video = new VideoBoard(1, "������ �ŵ幫��", "��Ÿų ����", "akow283", "");
		System.out.println(video.toString());
		
	} // main ����
}