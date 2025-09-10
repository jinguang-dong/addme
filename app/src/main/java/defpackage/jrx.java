package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrx implements iac, iad, iam {
    public final paq b;
    public final ltd c;
    public final /* synthetic */ hkk g;
    public boolean d = false;
    private final szh h = new szh();
    final szh e = new szh();
    final szh f = new szh();
    public final szh a = new szh();

    public jrx(hkk hkkVar, ltd ltdVar, paq paqVar) {
        this.g = hkkVar;
        this.c = ltdVar;
        this.b = paqVar;
    }

    @Override // defpackage.iad
    public final void en(iby ibyVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        this.f.e(bitmap.copy(Bitmap.Config.ARGB_8888, false));
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, joc] */
    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        synchronized (this.g) {
            this.d = true;
        }
        hkk hkkVar = this.g;
        poj pojVarD = hkkVar.c.d(j);
        if (pojVarD == null) {
            this.a.e(rvk.a);
            return;
        }
        Object obj = hkkVar.b;
        szh szhVar = this.e;
        szh szhVar2 = this.f;
        szh szhVar3 = this.h;
        new jru(((ejt) obj).a, szhVar, szhVar2, szhVar3);
        szhVar.e(pojVarD);
        this.a.f(swz.i(szhVar3, new idb(10), sxo.a));
    }

    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        this.a.e(rvk.a);
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        this.a.e(rvk.a);
    }

    @Override // defpackage.iam
    public final void o(iby ibyVar, mdr mdrVar) {
    }
}
