package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lm extends kn {
    public abstract boolean e(lg lgVar, lg lgVar2, int i, int i2, int i3, int i4);

    public abstract boolean f(lg lgVar, int i, int i2, int i3, int i4);

    public abstract void i(lg lgVar);

    public abstract void j(lg lgVar);

    @Override // defpackage.kn
    public final boolean m(lg lgVar, km kmVar, km kmVar2) {
        int i;
        int i2;
        if (kmVar != null && ((i = kmVar.a) != (i2 = kmVar2.a) || kmVar.b != kmVar2.b)) {
            return f(lgVar, i, kmVar.b, i2, kmVar2.b);
        }
        i(lgVar);
        return true;
    }

    @Override // defpackage.kn
    public final boolean n(lg lgVar, lg lgVar2, km kmVar, km kmVar2) {
        int i;
        int i2;
        int i3 = kmVar.a;
        int i4 = kmVar.b;
        if (lgVar2.z()) {
            int i5 = kmVar.a;
            i2 = kmVar.b;
            i = i5;
        } else {
            i = kmVar2.a;
            i2 = kmVar2.b;
        }
        return e(lgVar, lgVar2, i3, i4, i, i2);
    }

    @Override // defpackage.kn
    public final boolean o(lg lgVar, km kmVar, km kmVar2) {
        int i = kmVar.a;
        int i2 = kmVar.b;
        View view = lgVar.a;
        int left = kmVar2 == null ? view.getLeft() : kmVar2.a;
        int top = kmVar2 == null ? view.getTop() : kmVar2.b;
        if (lgVar.u() || (i == left && i2 == top)) {
            j(lgVar);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return f(lgVar, i, i2, left, top);
    }

    @Override // defpackage.kn
    public final boolean p(lg lgVar, km kmVar, km kmVar2) {
        int i = kmVar.a;
        int i2 = kmVar2.a;
        if (i != i2 || kmVar.b != kmVar2.b) {
            return f(lgVar, i, kmVar.b, i2, kmVar2.b);
        }
        k(lgVar);
        return false;
    }

    @Override // defpackage.kn
    public final boolean q(lg lgVar) {
        return lgVar.s();
    }
}
