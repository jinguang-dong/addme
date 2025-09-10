package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lye implements lyo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lye(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, poe] */
    @Override // defpackage.lyo
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            lyy lyyVar = (lyy) obj;
            rnt.L(lyyVar.d);
            if (lyyVar.e) {
                lzh lzhVar = lyyVar.a;
                if (lzhVar instanceof lzg) {
                    ((lzg) lzhVar).h(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ((lyy) obj).g(lyq.k((ltw) this.a));
            return;
        }
        if (i != 2) {
            ((lyy) obj).h(((Boolean) this.a).booleanValue());
            return;
        }
        poj pojVarK = ((pkf) this.a).k();
        if (pojVarK == null) {
            ((sgt) lyq.a.b().M(4523)).s("Unable to fork ref counted image");
            return;
        }
        SystemClock.elapsedRealtime();
        lyy lyyVar2 = (lyy) obj;
        rnt.L(lyyVar2.d);
        if (lyyVar2.e) {
            lzh lzhVar2 = lyyVar2.a;
            if (lzhVar2 instanceof lzf) {
                ((lzf) lzhVar2).a();
                return;
            }
        }
        pojVarK.close();
    }
}
