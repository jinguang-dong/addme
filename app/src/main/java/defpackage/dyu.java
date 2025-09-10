package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyu extends ujq implements uiq {
    final /* synthetic */ dwi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ nhz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyu(dwi dwiVar, boolean z, String str, nhz nhzVar) {
        super(1);
        this.a = dwiVar;
        this.b = z;
        this.c = str;
        this.d = nhzVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof dyl) {
            this.a.e(((dyl) th).a);
        }
        if (this.b && (str = this.c) != null) {
            Trace.endAsyncSection(coh.k(str), ((ebx) this.d.f).hashCode());
        }
        return ufg.a;
    }
}
