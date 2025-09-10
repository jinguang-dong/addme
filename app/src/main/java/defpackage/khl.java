package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khl extends ojl {
    public final ReentrantLock a;
    public final Condition b;
    public long c;
    public long d;
    private final TreeMap e;
    private long f;
    private final Set g;

    public khl() {
        super((short[]) null);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.e = new TreeMap();
        this.c = -1L;
        this.d = -1L;
        this.f = -1L;
        this.g = new HashSet();
    }

    public final long j() {
        this.a.lock();
        try {
            return this.c;
        } finally {
            this.a.unlock();
        }
    }

    public final long k() {
        this.a.lock();
        try {
            return this.f;
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.ojl
    public final void l(pdo pdoVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            long j = pdoVar.d;
            if (this.c < j) {
                this.c = j;
                this.d = pdoVar.c;
                this.f = pdoVar.b;
                this.b.signal();
                while (true) {
                    TreeMap treeMap = this.e;
                    if (treeMap.isEmpty() || ((Long) treeMap.firstKey()).longValue() < this.c) {
                        break;
                    }
                    Map.Entry entryPollFirstEntry = treeMap.pollFirstEntry();
                    entryPollFirstEntry.getClass();
                    ((Runnable) entryPollFirstEntry.getValue()).run();
                }
                for (khk khkVar : this.g) {
                    long j2 = this.c;
                    long j3 = khkVar.a;
                    long j4 = khkVar.b;
                    if (j2 % 0 == 0) {
                        Runnable runnable = khkVar.c;
                        throw null;
                    }
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }
}
