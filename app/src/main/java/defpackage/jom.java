package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jom implements AutoCloseable {
    private static final sgv i = sgv.g("jom");
    public final rwc a;
    public final rwc c;
    public final Executor d;
    jol g;
    boolean h;
    private final MediaFormat j;
    private final hbj n;
    public final AtomicLong e = new AtomicLong();
    private final AtomicLong k = new AtomicLong();
    private final AtomicLong l = new AtomicLong();
    public final AtomicLong f = new AtomicLong();
    private final AtomicLong m = new AtomicLong();
    public final Handler b = ojl.cg(new our(), "mv-aud-encoder");

    public jom(hbj hbjVar, MediaFormat mediaFormat, rwc rwcVar, rwc rwcVar2, Executor executor) {
        this.n = hbjVar;
        this.j = mediaFormat;
        this.a = rwcVar2;
        this.c = rwcVar;
        this.d = executor;
    }

    public final void a(boolean z) {
        if (!z) {
            if (System.currentTimeMillis() < this.m.get() + 1000) {
                return;
            }
        }
        this.e.get();
        this.l.get();
        this.f.get();
        this.k.get();
        this.m.set(System.currentTimeMillis());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [sgt, shi] */
    public final synchronized void b() {
        rwc rwcVarJ;
        rwc rwcVar = this.c;
        if (rwcVar.h() && !this.h) {
            jol jolVar = this.g;
            jolVar.getClass();
            qth qthVar = jolVar.c;
            if (qthVar != null) {
                try {
                    qlj qljVarA = ((qli) qthVar.b).a();
                    if (qljVarA != null) {
                        try {
                            joo jooVar = jolVar.b;
                            while (true) {
                                mpc mpcVar = (mpc) ((hoq) rwcVar.c()).c.m();
                                Object obj = mpcVar == null ? null : mpcVar.a;
                                if (obj == null) {
                                    rwcVarJ = rvk.a;
                                    break;
                                }
                                AtomicLong atomicLong = this.e;
                                atomicLong.incrementAndGet();
                                rfv rfvVarE = jooVar.e(TimeUnit.MICROSECONDS.convert(((qkz) obj).c, TimeUnit.NANOSECONDS));
                                if (rfvVarE.h()) {
                                    this.k.incrementAndGet();
                                } else {
                                    gzi gziVar = gzz.a;
                                    if (rfvVarE.i()) {
                                        rwc rwcVar2 = this.a;
                                        if (rwcVar2.h() && atomicLong.get() >= 5) {
                                            ((hpg) rwcVar2.c()).b();
                                            a(true);
                                            atomicLong.set(0L);
                                        }
                                    }
                                    rwcVarJ = rwc.j(obj);
                                }
                            }
                            if (!rwcVarJ.h()) {
                                qljVarA.close();
                                return;
                            }
                            ByteBuffer byteBuffer = ((qle) qljVarA).b;
                            byteBuffer.put(((qkz) rwcVarJ.c()).a.asReadOnlyBuffer());
                            byteBuffer.position(((qkz) rwcVarJ.c()).a.limit());
                            ((qle) qljVarA).a = TimeUnit.MICROSECONDS.convert(((qkz) rwcVarJ.c()).c, TimeUnit.NANOSECONDS);
                            this.l.incrementAndGet();
                            a(false);
                            qljVarA.close();
                        } catch (Throwable th) {
                            try {
                                qljVarA.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IllegalStateException e) {
                    ((sgt) ((sgt) i.c().i(e)).M((char) 2957)).s("Error trying to encode audio packet. Possible codec shutdown");
                }
            }
        }
    }

    public final synchronized void c(qfc qfcVar, joo jooVar) {
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            if (this.g != null) {
                ((sgt) i.c().M(2952)).s("Attempting to re-initialize AudioTrackSampler!");
                return;
            }
            hoq hoqVar = (hoq) rwcVar.c();
            jmr jmrVar = new jmr(this, 5);
            Executor executor = this.d;
            Map map = hoqVar.b;
            if (map.containsKey(jmrVar)) {
                ((sgt) ((sgt) hoq.a.c().j(shw.MEDIUM)).M(1409)).s("Attempting to register listener twice.");
            } else {
                map.put(jmrVar, executor);
            }
            qlm qlmVar = new qlm(new jpf(qfcVar));
            qln qlnVarC = qlmVar.c(this.j);
            qlnVarC.c = this.b;
            qlnVarC.a(new jok(this));
            qth qthVarB = qlnVarC.b();
            qlmVar.b();
            this.g = new jol(qlmVar, qthVarB, jooVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.h = true;
        a(true);
        this.d.execute(new jnw(this, this.g, 3));
    }
}
