Integer fib(Integer n) {
	if (n == 0) return 0;
	else if (n == 1) return 1;
	return fib(n-1) + fib(n-2);
}

Integer fib(Integer n) {
	if (n == 0) return 0;
	else if (n == 1) return 1;

	Integer[] memo = new Integer[n+1];
	memo[0] = 0;
	memo[1] = 1;
	for (int i = 2; i <= n; i++) {
		memo[i] = memo[i-1]+memo[i-2];
	}
	return memo[n];
}

Integer fib(Integer n) {
	if (n == 0) return 0;
	else if (n == 1) return 1;

	Integer a = 0, b = 1, res = 0;
	for (int i = 2; i <= n; i++) {
		res = a + b;
		a = b;
		b = res;
	}
	return res;
}