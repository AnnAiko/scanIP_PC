package scanip_pc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ScanIP_PC {

    public static void main(String[] args) throws IOException {
        //������ ip ��������
        List<String> ipAdress = new ArrayList<>();
        try {
            //������������� ip ������ 
            for (int i = 1; i < 10; i++) {
                String ip = "192.168.0." + i;
                //�������� � ������ ������
                ipAdress.add(ip);
            }
            //��������� ������ �������
            for (String ip : ipAdress) {
                //�������� IP-����� ��� ������� ����� �����
                InetAddress ipPC = InetAddress.getByName(ip);
                //������� ����� � �������� �� ����� 
                System.out.println(ip + "-> c���������:" + ipPC.isReachable(1000));
            }
            //���� �� ������� ����� IP-�����
        } catch (UnknownHostException e) {
            System.out.println("����� ���������� " + e);
            //���� ��������� ������� ������
        } catch (IOException e) {
            System.err.println("������ ������ " + e);
        }

    }

}
