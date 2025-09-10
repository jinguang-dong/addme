package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iex extends ojl {
    private final pau a;
    private final pau b;
    private final int c;
    private int d;
    private long e;
    private final mdy f;

    public iex(ovx ovxVar, ovx ovxVar2, hbj hbjVar, our ourVar, mdy mdyVar) {
        super((short[]) null);
        this.d = 0;
        this.e = 0L;
        this.b = ovxVar;
        this.a = ovxVar2;
        this.c = ((Integer) hbjVar.a(gzc.c).orElse(1)).intValue();
        this.f = mdyVar;
        ourVar.d(new iew(this, 0));
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Integer num;
        Boolean bool = (Boolean) poeVar.a(nvm.d);
        if (bool == null || !bool.booleanValue()) {
            i();
        } else {
            if (this.e == 0) {
                this.e = SystemClock.uptimeMillis();
            }
            this.d = 0;
            this.a.a(true);
        }
        CaptureResult.Key key = nvm.q;
        if (key == null || (num = (Integer) poeVar.a(key)) == null) {
            return;
        }
        this.b.a(Boolean.valueOf(num.intValue() == 2));
    }

    public final void i() {
        if (this.e != 0) {
            mdy mdyVar = this.f;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.e;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.DUAL_FUSION_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = sps.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sps spsVar = (sps) tpcVarM2.b;
            spsVar.b |= 1;
            spsVar.c = (int) jUptimeMillis;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            sps spsVar2 = (sps) tpcVarM2.l();
            spsVar2.getClass();
            sodVar2.an = spsVar2;
            sodVar2.d |= 8192;
            mdyVar.I(tpcVarM);
            this.e = 0L;
        }
        int i = this.d + 1;
        this.d = i;
        if (i == this.c) {
            this.a.a(false);
        }
    }
}
