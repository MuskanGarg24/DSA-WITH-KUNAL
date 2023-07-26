public class PacketDropping {
    public static int calculateDroppedPackets(int[][] requests, int max_packets, int packets_per_second) {
        int total_dropped_packets = 0;
        int current_packets = 0;

        for (int i = 0; i < requests.length; i++) {
            int time = requests[i][0];
            int packets = requests[i][1];

            // Remove packets from the queue every second until the requested time
            while (time > 0 && current_packets > 0) {
                current_packets -= Math.min(current_packets, packets_per_second);
                time--;
            }

            // If there are still remaining packets after the requested time, drop them
            if (time <= 0 && current_packets + packets > max_packets) {
                int dropped_packets = current_packets + packets - max_packets;
                total_dropped_packets += dropped_packets;
                current_packets = max_packets;
            }
            // If the requested time is in the future, add the packets to the queue
            else if (time > 0) {
                current_packets = Math.min(current_packets + packets, max_packets);
            }
        }

        return total_dropped_packets;
    }

    public static void main(String[] args) {
        int[][] requests = {
                { 1, 8 }, // At time 0, 10 packets are to be sent
                { 4, 9 }, // At time 1, 5 packets are to be sent
                { 6, 7 } // At time 2, 8 packets are to be sent
        };

        int max_packets = 15; // Maximum number of packets the network can hold
        int packets_per_second = 7; // Number of packets delivered to the client per second

        int dropped_packets = calculateDroppedPackets(requests, max_packets, packets_per_second);
        System.out.println("Total dropped packets: " + dropped_packets);
    }
}
