class Solution {
class State {
	int node;
	double prob;
	State(int _node, double _prob) {
		node = _node;
		prob = _prob;
	}
}

public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

	// build graph -> double[0]: node, double[1]: edge prob
	Map<Integer, List<double[]>> map = new HashMap<>();
	for (int i = 0; i < edges.length; ++i) {
		int[] edge = edges[i];

		map.putIfAbsent(edge[0], new ArrayList<>());
		map.putIfAbsent(edge[1], new ArrayList<>());

		map.get(edge[0]).add(new double[] {edge[1], succProb[i]});
		map.get(edge[1]).add(new double[] {edge[0], succProb[i]});
	}

	double[] probs = new double[n];  // best prob so far for each node
	Queue<State> queue = new LinkedList<>();
	queue.add(new State(start, 1.0));

	while (!queue.isEmpty()) {

		State state = queue.poll();
		int parent = state.node;
		double prob = state.prob;

		for (double[] child : map.getOrDefault(parent, new ArrayList<>())) {
			// add to queue only if: it can make a better prob
			if (probs[(int) child[0]] >= prob * child[1]) continue;

			queue.add(new State((int) child[0], prob * child[1]));
			probs[(int) child[0]] = prob * child[1];
		}

	}

	return probs[end];
}
}