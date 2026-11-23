from pathlib import Path
import pandas as pd
import matplotlib.pyplot as plt

csv_path = Path(__file__).parent / "algA_results.csv"
data = pd.read_csv(csv_path)

plt.plot(data["n"], data["elapsed"], marker="o")

plt.xscale("log", base=10)
plt.yscale("log", base=10)

plt.xlabel("Input size n")
plt.ylabel("Execution time (nanoseconds)")

plt.title("Algorithm A: Input Size vs Execution Time")
plt.grid(True)
plt.show()