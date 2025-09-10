package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsl implements lst {
    public final Set a = new HashSet();
    public final Map b = new HashMap();

    @Override // defpackage.lst
    public final void c(ltd ltdVar) {
        this.a.remove(ltdVar);
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        this.a.remove(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        this.a.add(ltdVar);
        this.b.put(ltdVar, lsyVar);
    }

    @Override // defpackage.lst
    public final void j(ltd ltdVar) {
        this.a.remove(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void b(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void n(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }
}
