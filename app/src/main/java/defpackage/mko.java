package defpackage;

import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mko extends gsn {
    final /* synthetic */ mkr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mko(mkr mkrVar) {
        super((int[]) null);
        this.a = mkrVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        oge ogeVar = this.a.K;
        ogeVar.getClass();
        ((mjl) ogeVar.b).i();
    }

    @Override // defpackage.gsn
    public final void e() {
        syu syuVar;
        syu syuVar2;
        oge ogeVar = this.a.K;
        ogeVar.getClass();
        mjl mjlVar = (mjl) ogeVar.b;
        if (((mii) mjlVar.l.d).equals(mii.STATE_RECORDING)) {
            mjlVar.O.c(R.raw.video_pause);
            mjlVar.P.f();
            out outVar = mjlVar.p;
            mkl mklVar = mjlVar.B;
            mklVar.getClass();
            outVar.c(new mjh(mklVar, 0));
            mje mjeVar = mjlVar.A;
            miv mivVar = mjeVar.y;
            if (mivVar.q) {
                mivVar.b.set(true);
                syuVar2 = syq.a;
            } else {
                miq miqVar = mivVar.k;
                if (miqVar.o != 1) {
                    ((sgt) miq.a.c().M(4807)).s("State check failed. Recording already started.");
                    syuVar = syq.a;
                } else if (miqVar.e.get() > 2) {
                    syuVar = syq.a;
                } else {
                    synchronized (miqVar.h) {
                        miqVar.m = new szh();
                        syuVar = miqVar.m;
                    }
                }
                syuVar.c(new mir(mivVar, 2), ojl.ce());
                syuVar2 = syuVar;
            }
            syuVar2.c(new mir(mjeVar, 4), sxo.a);
            mjlVar.z.a.set(false);
        }
    }

    @Override // defpackage.gsn
    public final void f() {
        oge ogeVar = this.a.K;
        ogeVar.getClass();
        mjl mjlVar = (mjl) ogeVar.b;
        if (((mii) mjlVar.l.d).equals(mii.STATE_RECORDING_PAUSE)) {
            mjlVar.O.c(R.raw.video_start);
            mjlVar.P.a();
            out outVar = mjlVar.p;
            mkl mklVar = mjlVar.B;
            mklVar.getClass();
            outVar.c(new mir(mklVar, 17));
            mje mjeVar = mjlVar.A;
            mjeVar.y.b.set(false);
            mjj mjjVar = mjeVar.ac;
            mjjVar.getClass();
            mjl mjlVar2 = mjjVar.e;
            mjlVar2.l.a(mii.STATE_RECORDING);
            mjlVar2.f();
            mjlVar.z.a.set(true);
        }
    }

    @Override // defpackage.gsn
    public final void j() {
        mkr mkrVar = this.a;
        mkrVar.e.q(false);
        mkrVar.E.K.o();
        oge ogeVar = mkrVar.K;
        ogeVar.getClass();
        ltd ltdVarA = ltd.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ltf ltfVar = ltf.VIDEO_SNAPSHOT;
        String strA = hei.a(ltfVar, System.currentTimeMillis());
        Object obj = ogeVar.b;
        mjl mjlVar = (mjl) obj;
        lte lteVarB = lte.b(ltdVarA, jCurrentTimeMillis, strA, ltfVar, mjlVar.X.q());
        mjlVar.G.m(lteVarB, Optional.empty());
        ske.W(mjlVar.y.a(lteVarB), new fxw(obj, 11), mjlVar.p);
    }
}
