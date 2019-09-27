package scanip_pc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ScanIP_PC {

    public static void main(String[] args) throws IOException {
        //Спикок ip адрессов
        List<String> ipAdress = new ArrayList<>();
        try {
            //Сгенерировать ip адреса 
            for (int i = 1; i < 10; i++) {
                String ip = "192.168.0." + i;
                //Добавить в спикок адреса
                ipAdress.add(ip);
            }
            //Перебрать список адресов
            for (String ip : ipAdress) {
                //Получить IP-адрес для данного имени хоста
                InetAddress ipPC = InetAddress.getByName(ip);
                //Вывести адрес и доступен ли адрес 
                System.out.println(ip + "-> cоединение:" + ipPC.isReachable(1000));
            }
            //Если не удалось найти IP-адрес
        } catch (UnknownHostException e) {
            System.out.println("Адрес недоступен " + e);
            //Если возникает сетевая ошибка
        } catch (IOException e) {
            System.err.println("Ошибка потока " + e);
        }

    }

}
