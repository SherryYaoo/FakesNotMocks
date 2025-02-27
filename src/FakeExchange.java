public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        // Return a fixed exchange rate for testing
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.95f; // 1 USD = 0.95 Euro on Feb 27, 2025
        }
        // Add more conditions if needed for other currency pairs
        return 1.0f; // Default rate
    }
}
