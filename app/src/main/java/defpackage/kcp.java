package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import j$.time.Instant;
import j$.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcp implements iaf {
    final /* synthetic */ long a;
    final /* synthetic */ pkf b;
    final /* synthetic */ kcq c;

    public kcp(kcq kcqVar, long j, pkf pkfVar) {
        this.a = j;
        this.b = pkfVar;
        this.c = kcqVar;
    }

    @Override // defpackage.iaf
    public final void a(iby ibyVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        kcq kcqVar = this.c;
        ite iteVar = kcqVar.p;
        iteVar.getClass();
        AtomicLong atomicLong = kcqVar.c;
        long nanos = TimeUnit.SECONDS.toNanos(atomicLong.get());
        long j = kcqVar.m.e;
        iteVar.b(hardwareBuffer, nanos / j);
        mkv mkvVar = kcqVar.r;
        if (mkvVar != null) {
            mkvVar.a(atomicLong.getAndIncrement(), j);
        }
        synchronized (kcqVar.g) {
            if (kcqVar.w != null && atomicLong.get() >= 2) {
                ((sgt) kcq.a.c().M(3219)).u("At least %d frames are encoded. ", atomicLong.get());
                szh szhVar = kcqVar.w;
                szhVar.getClass();
                szhVar.e(null);
                kcqVar.w = null;
            }
        }
        kcq kcqVar2 = this.c;
        Long l = (Long) kcqVar2.d.remove(Long.valueOf(this.a));
        if (l != null) {
            synchronized (kcqVar2.h) {
                kcqVar2.o.add(Long.valueOf(Instant.now().minusMillis(l.longValue()).toEpochMilli()));
            }
        }
        this.b.l();
        Collection.EL.removeIf(this.c.k, new hdx(this.a, 3));
    }
}
