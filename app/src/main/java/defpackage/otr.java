package defpackage;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otr extends osp {
    public ogn a;
    public final IntentFilter[] b;

    public otr(IntentFilter[] intentFilterArr) {
        this.b = intentFilterArr;
    }

    @Override // defpackage.osq
    public final void c(DataHolder dataHolder) {
        dataHolder.close();
    }

    @Override // defpackage.osq
    public final void d(osy osyVar) {
        ogn ognVar = this.a;
        if (ognVar != null) {
            ognVar.b(new omn(osyVar, 3));
        }
    }

    @Override // defpackage.osq
    public final void e(osz oszVar) {
        oszVar.b.close();
    }

    public final void m() {
        ogn ognVar = this.a;
        if (ognVar != null) {
            ognVar.a();
        }
        this.a = null;
    }

    @Override // defpackage.osq
    public final void g() {
    }

    @Override // defpackage.osq
    public final void h() {
    }

    @Override // defpackage.osq
    public final void i() {
    }

    @Override // defpackage.osq
    public final void j() {
    }

    @Override // defpackage.osq
    public final void k() {
    }

    @Override // defpackage.osq
    public final void l() {
    }

    @Override // defpackage.osq
    public final void b(orc orcVar) {
    }

    @Override // defpackage.osq
    public final void f(osy osyVar, osm osmVar) {
    }
}
