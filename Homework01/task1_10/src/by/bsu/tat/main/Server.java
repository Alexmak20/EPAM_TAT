package by.bsu.tat.main;

/**
 * Class takes an ip address and checks for the correct input.
 *
 * @author Alexey Makovski.
 */
public class Server {

    /**
     * Line with ip address.
     */
    private String ip;

    /**
     * Private constructor for avoiding creation with invalid ip address.
     *
     * @param ip line with ip address.
     */
    private Server(String ip) {
        this.ip = ip;
    }

    /**
     * @return line with ip address.
     */
    public String getIp() {
        return ip;
    }

    /**
     * Class that represents Builder design pattern.
     */
    public static class Builder {
        /**
         * Tries to build with received ip address.
         *
         * @param ip with ip address.
         * @return with received ip address.
         */
        public static Server build(String ip) throws Exception {
            validate(ip);
            return new Server(ip);
        }


        /**
         * Check the correctness of the entered data.
         *
         * @param ip ip address to check.
         * @throws Exception if ip address is invalid.
         */
        private static void validate(String ip) throws Exception {
            for (int i = 0; i < 3; i++) {
                int Index = ip.indexOf(".");
                if (Index == -1) {
                    throw new Exception("Incorrectly entered ip address.");
                }
                String part = ip.substring(0, Index);
                if (part.startsWith("+")) {
                    throw new Exception("Incorrectly entered ip address.");
                }
                int number = Integer.parseInt(part);
                if (number < 0 || number > 255) {
                    throw new Exception("Incorrectly entered ip address.");
                }
                ip = ip.substring(Index + 1);
            }
            int number = Integer.parseInt(ip);
            if (number < 0 || number > 255) {
                throw new Exception("Incorrectly entered ip address.");
            }

        }
    }
}
