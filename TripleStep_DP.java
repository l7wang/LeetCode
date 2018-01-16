int tripleStep(int n) {
	if (n == 1) return 1;
	else if (n == 2) return 2;
	else if (n == 3) return 4;

	int[] memo = new int[n];
	memo[0] = 1;
	memo[1] = 2;
	memo[2] = 4;

	for (int i = 3; i < n; i++) {
		memo[i] = memo[i-3] + memo[i-2] + memo[i-1];
	}
	return memo[n-1];
}