package defpackage;

import android.content.res.Resources;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mhc implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mhc(hvp hvpVar, jth jthVar, boolean z, Runnable runnable, int i) {
        this.e = i;
        this.b = hvpVar;
        this.c = jthVar;
        this.a = z;
        this.d = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kfg] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        if (this.e != 0) {
            kfn kfnVar = new kfn();
            Object obj = this.b;
            hvp hvpVar = (hvp) obj;
            meu meuVar = (meu) hvpVar.g.a();
            Duration duration = hvp.b;
            meuVar.f(duration);
            meuVar.h(duration);
            if (((Boolean) hvpVar.d.dL()).booleanValue()) {
                ?? r12 = this.d;
                boolean z = this.a;
                ?? r2 = this.c;
                jth jthVar = (jth) r2;
                hvpVar.c.e(r2, jthVar.b, kfnVar, jthVar.c, z, false, 2, meuVar, Optional.empty()).c(r12, hvpVar.f);
                hvpVar.h.ifPresent(new fio(obj, 19));
                return;
            }
            return;
        }
        mhe mheVar = (mhe) this.b;
        if (!mheVar.s || mheVar.H.p(gzy.l)) {
            rwc rwcVar = mheVar.k;
            if ((rwcVar.h() && ((mlw) rwcVar.c()).d() == mlv.QR_GLEAMING) || mheVar.x || mheVar.y || ((Boolean) ((ovx) mheVar.m.j).d).booleanValue() || ((Boolean) mheVar.g.dL()).booleanValue()) {
                return;
            }
            boolean z2 = this.a;
            mheVar.i();
            if (!z2) {
                mheVar.h();
            }
            Object obj2 = this.d;
            int iOrdinal = ((mhg) this.c).ordinal();
            if (iOrdinal == 0) {
                mheVar.e();
                return;
            }
            if (iOrdinal == 1) {
                if (mheVar.H.p(gzy.l) || ((mhh) mheVar.a.dL()).equals(mhh.AUTO)) {
                    mheVar.u++;
                }
                owq owqVar = mheVar.a;
                mheVar.p((mhh) owqVar.dL());
                mheVar.r((mhh) owqVar.dL());
            } else {
                if (iOrdinal == 2) {
                    owq owqVar2 = mheVar.a;
                    if (((mhh) owqVar2.dL()).equals(mhh.AUTO)) {
                        if (mheVar.j.a().a(mheVar.i)) {
                            mheVar.q(mheVar.n);
                            return;
                        }
                    }
                    if (!((mhh) owqVar2.dL()).equals(mhh.OFF)) {
                        mheVar.e();
                        return;
                    }
                    if (mheVar.H.p(gzy.q)) {
                        mheVar.r((mhh) owqVar2.dL());
                    } else {
                        mheVar.b((rwc) obj2);
                        mheVar.t();
                    }
                    mheVar.p((mhh) owqVar2.dL());
                    return;
                }
                if (iOrdinal == 3) {
                    mheVar.b((rwc) obj2);
                    mheVar.t();
                    return;
                } else if (iOrdinal != 4) {
                    return;
                }
            }
            mheVar.b((rwc) obj2);
            mheVar.t();
        }
    }

    public /* synthetic */ mhc(mhe mheVar, boolean z, mhg mhgVar, rwc rwcVar, int i) {
        this.e = i;
        this.b = mheVar;
        this.a = z;
        this.c = mhgVar;
        this.d = rwcVar;
    }
}
