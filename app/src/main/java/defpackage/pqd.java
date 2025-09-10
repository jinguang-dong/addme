package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pqd {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public final ReadWriteLock c = new StampedLock().asReadWriteLock();
    public final prh d;
    private ppv e;

    public pqd(prh prhVar, ppv ppvVar) {
        this.d = prhVar;
        this.e = ppvVar;
    }

    public final FileInputStream b() {
        this.c.readLock().lock();
        try {
            rnt.O(this.e.e(), "Unable to read from %s", this);
            return new pqb(this, this.e.b());
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    public final FileOutputStream c() {
        return g();
    }

    public final void d() {
        this.c.writeLock().lock();
        try {
            this.e.d();
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final FileOutputStream g() {
        this.c.writeLock().lock();
        try {
            rnt.O(this.e.f(), "Unable to write to %s", this);
            rnt.O(true, "Unable to append to %s", this);
            return new pqc(this, this.e.g());
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    protected final synchronized ppv l() {
        return this.e;
    }

    final synchronized void m(ppv ppvVar) {
        rnt.B(this.e.getClass().isAssignableFrom(ppvVar.getClass()), TOnSyMaYeslEl.xbL.concat(String.valueOf(String.valueOf(this.e.getClass()))));
        this.c.writeLock().lock();
        try {
            this.e = ppvVar;
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "<MediaMutex: %s>", this.e);
    }
}
