package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ke extends kf {
    public ke(kq kqVar) {
        super(kqVar);
    }

    @Override // defpackage.kf
    public final int a(View view) {
        return kq.bs(view) + ((kr) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.kf
    public final int b(View view) {
        kr krVar = (kr) view.getLayoutParams();
        return kq.bf(view) + krVar.topMargin + krVar.bottomMargin;
    }

    @Override // defpackage.kf
    public final int c(View view) {
        kr krVar = (kr) view.getLayoutParams();
        return kq.bg(view) + krVar.leftMargin + krVar.rightMargin;
    }

    @Override // defpackage.kf
    public final int d(View view) {
        return kq.bv(view) - ((kr) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.kf
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.kf
    public final int f() {
        kq kqVar = this.a;
        return kqVar.D - kqVar.at();
    }

    @Override // defpackage.kf
    public final int g() {
        return this.a.at();
    }

    @Override // defpackage.kf
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.kf
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.kf
    public final int j() {
        return this.a.aw();
    }

    @Override // defpackage.kf
    public final int k() {
        kq kqVar = this.a;
        return (kqVar.D - kqVar.aw()) - kqVar.at();
    }

    @Override // defpackage.kf
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bm(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.kf
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bm(view, rect);
        return rect.top;
    }

    @Override // defpackage.kf
    public final void n(int i) {
        this.a.aK(i);
    }
}
