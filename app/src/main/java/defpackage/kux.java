package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kux extends ojl {
    private static final PointF c = new PointF(-1.0f, -1.0f);
    public final ovx a;
    public final szh b;
    private final kqx d;
    private final jvb e;
    private final AtomicInteger f;
    private final pfl g;

    public kux(pfl pflVar, kqx kqxVar, jvb jvbVar) {
        super((short[]) null);
        this.b = new szh();
        this.f = new AtomicInteger();
        this.g = pflVar;
        this.d = kqxVar;
        this.e = jvbVar;
        this.a = new ovx(c);
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        int[] iArr;
        jvb jvbVar = this.e;
        Optional optional = jvbVar.c;
        rwc rwcVarJ = (optional.isEmpty() || (iArr = (int[]) poeVar.a((CaptureResult.Key) optional.get())) == null || iArr.length < 4) ? rvk.a : rwc.j(new Rect(iArr[0], iArr[1], iArr[2], iArr[3]));
        if (rwcVarJ.h()) {
            Optional optional2 = jvbVar.d;
            if (optional2.isPresent()) {
                Integer num = (Integer) poeVar.a((CaptureResult.Key) optional2.get());
                if (num == null || num.intValue() >= 60) {
                    this.f.set(0);
                } else if (this.f.incrementAndGet() > 10) {
                    this.b.e(null);
                }
            }
            this.a.a(this.g.m((Rect) rwcVarJ.c(), this.d.a));
        }
    }
}
