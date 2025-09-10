package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kd extends kf {
    public kd(kq kqVar) {
        super(kqVar);
    }

    @Override // defpackage.kf
    public final int a(View view) {
        return kq.bu(view) + ((kr) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.kf
    public final int b(View view) {
        kr krVar = (kr) view.getLayoutParams();
        return kq.bg(view) + krVar.leftMargin + krVar.rightMargin;
    }

    @Override // defpackage.kf
    public final int c(View view) {
        kr krVar = (kr) view.getLayoutParams();
        return kq.bf(view) + krVar.topMargin + krVar.bottomMargin;
    }

    @Override // defpackage.kf
    public final int d(View view) {
        return kq.bt(view) - ((kr) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.kf
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.kf
    public final int f() {
        kq kqVar = this.a;
        return kqVar.C - kqVar.av();
    }

    @Override // defpackage.kf
    public final int g() {
        return this.a.av();
    }

    @Override // defpackage.kf
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.kf
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.kf
    public final int j() {
        return this.a.au();
    }

    @Override // defpackage.kf
    public final int k() {
        kq kqVar = this.a;
        return (kqVar.C - kqVar.au()) - kqVar.av();
    }

    @Override // defpackage.kf
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bm(view, rect);
        return rect.right;
    }

    @Override // defpackage.kf
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bm(view, rect);
        return rect.left;
    }

    @Override // defpackage.kf
    public final void n(int i) {
        this.a.aJ(i);
    }
}
