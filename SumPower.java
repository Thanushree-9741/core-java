class SumPower {

        public static void main(String[] args) {
            int number = 153;
            int quotient = number;
            int count = 0;
            while(quotient > 0) {
                count = count + 1;
                quotient = quotient / 10;
            }
            System.out.println("count of digit is " + count);
            int rem = 0;
            int sum = 0;
            while(number > 0) {
                rem = number % 10;

                int power = 1;
                for (int i = 0; i < count; i++) {
                    power = power * rem;
                }

                sum = sum + power;
                number = number / 10;

            }
            System.out.println("sum is " + sum);
        }

    }

