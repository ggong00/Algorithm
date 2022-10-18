import sys
from collections import deque
input = sys.stdin.readline

N, M, V = list(map(int, input().split()))
graph = [[] for i in range(N + 1)]

for i in range(M):
  x,y = list(map(int, input().split()))
  graph[x].append(y)
  graph[y].append(x)

for i in range(1, N+1):
  graph[i].sort()   

visit = []  

def dfs(start):
  visit.append(start)
  print(start,end=' ')
  
  for i in graph[start]:
    if i not in visit and i not in [0]:
      dfs(i)  

dfs(V)    
print()

visit = []

def bfs(start):
  queue = deque()
  visit.append(start)
  queue.append(start)

  while queue:
    start = queue.popleft()
    print(start,end=' ')
    
    for i in graph[start]:
      if i not in visit and i not in [0]:
        visit.append(i)
        queue.append(i)

bfs(V)        

