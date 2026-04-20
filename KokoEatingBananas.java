class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find max pile (upper bound for speed)
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long hoursNeeded = calculateHours(piles, mid);

            if (hoursNeeded <= h) {
                answer = mid;      // possible answer
                right = mid - 1;   // try smaller speed
            } else {
                left = mid + 1;    // need more speed
            }
        }

        return answer;
    }

    private long calculateHours(int[] piles, int speed) {
        long hours = 0;

        for (int pile : piles) {
            // ceil(pile / speed)
            hours += (pile + speed - 1) / speed;
        }

        return hours;
    }
}