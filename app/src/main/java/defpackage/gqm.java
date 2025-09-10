package defpackage;

import android.graphics.PointF;
import android.view.View;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqm implements gre {
    public gso a;

    @Override // defpackage.gre
    public final void a(List list) {
        if (this.a == null || list.isEmpty()) {
            return;
        }
        Stream streamFilter = Collection.EL.stream(list).filter(new fla(12));
        int i = sbp.d;
        sbp sbpVar = (sbp) streamFilter.collect(ryv.a);
        Object obj = sbpVar.isEmpty() ? list.get(0) : sbpVar.get(0);
        gso gsoVar = this.a;
        gsoVar.getClass();
        gsoVar.d((gpr) obj);
    }

    @Override // defpackage.gsj
    public final boolean h(PointF pointF) {
        return false;
    }

    @Override // defpackage.gre
    public final paq i(gso gsoVar) {
        this.a = gsoVar;
        return new gge(this, 5);
    }

    @Override // defpackage.gre
    public final void b() {
    }

    @Override // defpackage.mlu
    public final void c() {
    }

    @Override // defpackage.gre
    public final void e() {
    }

    @Override // defpackage.gre
    public final void f() {
    }

    @Override // defpackage.mlu
    public final void d(mlv mlvVar) {
    }

    @Override // defpackage.gre
    public final void g(View view) {
    }
}
