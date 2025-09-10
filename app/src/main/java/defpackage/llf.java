package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class llf {
    private int a;
    private final ReentrantLock b;
    private final Condition c;

    public llf() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.a = 0;
        this.c = reentrantLock.newCondition();
    }

    public final int a(int i) {
        this.b.lock();
        try {
            int i2 = this.a + i;
            this.a = i2;
            return i2;
        } finally {
            this.b.unlock();
        }
    }

    public final int b() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        int i = this.a;
        reentrantLock.unlock();
        return i;
    }

    public final void c() {
        this.b.lock();
        while (this.a != 0) {
            try {
                try {
                    this.c.await();
                } catch (InterruptedException e) {
                    throw e;
                }
            } finally {
                this.b.unlock();
            }
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        this.c.signal();
        reentrantLock.unlock();
    }

    public final void e(int i) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        this.a = i;
        reentrantLock.unlock();
    }
}
