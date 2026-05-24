class KokoEatingBananasSolution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;

        for(int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            long hours = 0;

            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
```

---

# Intuition

We binary search on answer (`k` = bananas/hour).

* Smaller `k` → more hours needed
* Larger `k` → fewer hours needed

We need:

```text id="uxn7s8"
minimum k such that totalHours <= h
```

---

# Why `end = mid - 1`

When:

```text id="rq1m6z"
hours <= h
```

current speed works.

But maybe a smaller speed also works.

So search left.

---

# Complexity

* Time Complexity → `O(n log maxPile)`
* Space Complexity → `O(1)`

# Dry Run

Example:

```text id="4qz1qk"
piles = [3,6,7,11]
h = 8
```

We need minimum eating speed `k`.

---

# Step 1: Search Space

start = 1
end = 11   (maximum pile)
ans = 11
```

---

# Iteration 1

## Find mid

mid = (1 + 11) / 2
    = 6
```

So Koko eats:

6 bananas/hour
```

---

## Calculate Hours

Formula:
(pile + mid - 1) / mid
```

---

### pile = 3

(3 + 6 - 1) / 6
= 8 / 6
= 1 hour
```

---

### pile = 6

(6 + 6 - 1) / 6
= 11 / 6
= 1 hour
```

---

### pile = 7

(7 + 6 - 1) / 6
= 12 / 6
= 2 hours
```

---

### pile = 11

(11 + 6 - 1) / 6
= 16 / 6
= 2 hours
```

---

## Total Hours

1 + 1 + 2 + 2 = 6
```

Since:

6 <= 8
```

speed `6` works.

Store answer:

ans = 6
```

Try smaller speed:

end = mid - 1
     = 5
```

---

# Iteration 2
start = 1
end = 5
mid = 3
```

---

## Hours

3 -> 1
6 -> 2
7 -> 3
11 -> 4
```

Total:

1 + 2 + 3 + 4 = 10
```

Since:

10 > 8
```

Too slow.

Need bigger speed.

start = mid + 1
      = 4
```

---

# Iteration 3

start = 4
end = 5
mid = 4
```

---

## Hours

3 -> 1
6 -> 2
7 -> 2
11 -> 3
```

Total:

1 + 2 + 2 + 3 = 8
```

Valid.

ans = 4
end = 3
```

---

Now:

start = 4
end = 3
```

Loop ends.

---

# Final Answer

4
```

Minimum eating speed = `4 bananas/hour`.

