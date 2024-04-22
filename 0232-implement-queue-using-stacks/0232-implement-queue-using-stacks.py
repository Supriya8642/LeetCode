class MyQueue:
    def __init__(self):
        self.stk1 = []
        self.stk2 = []

    def push(self, x):
        self.stk1.append(x)

    def pop(self):
        self.move()
        return self.stk2.pop()

    def peek(self):
        self.move()
        return self.stk2[-1]

    def empty(self):
        return not self.stk1 and not self.stk2

    def move(self):
        if not self.stk2:
            while self.stk1:
                self.stk2.append(self.stk1.pop())