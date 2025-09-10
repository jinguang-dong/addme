package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyj implements kbr {
    public final pmv a;
    public final pmv b;
    public final pmv c;
    public final pmv d;
    private final kbr e;
    private final pmv f;

    public jyj(pna pnaVar, kbr kbrVar) {
        this.e = kbrVar;
        this.f = pnaVar.b("/gca/moments/hdr_launch_count", new pmq[0]);
        this.a = pnaVar.b("/gca/moments/hdr_finish_count", new pmq("result", String.class));
        this.b = pnaVar.b("/gca/moments/hdr_images_closed_count", new pmq[0]);
        this.c = pnaVar.c("/gca/moments/hdr_processing_time_ms", new pmq("result", String.class));
        this.d = pnaVar.c("/gca/moments/hdr_result_open_ms", new pmq[0]);
    }

    @Override // defpackage.kbr
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.kbr
    public final void b(pdk pdkVar, kfl kflVar, int i, kbz kbzVar, kbq kbqVar) {
        this.e.b(pdkVar, kflVar, i, kbzVar, new jyi(this, SystemClock.elapsedRealtime(), kbqVar));
        this.f.b(new Object[0]);
    }

    @Override // defpackage.kbr
    public final boolean c(pdk pdkVar, lat latVar) {
        return true;
    }
}
