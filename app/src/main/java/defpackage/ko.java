package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ko implements mk {
    final /* synthetic */ kq a;
    private final /* synthetic */ int b;

    public ko(kq kqVar, int i) {
        this.b = i;
        this.a = kqVar;
    }

    @Override // defpackage.mk
    public final int a(View view) {
        int iBs;
        int i;
        if (this.b != 0) {
            kr krVar = (kr) view.getLayoutParams();
            iBs = kq.bu(view);
            i = krVar.rightMargin;
        } else {
            kr krVar2 = (kr) view.getLayoutParams();
            iBs = kq.bs(view);
            i = krVar2.bottomMargin;
        }
        return iBs + i;
    }

    @Override // defpackage.mk
    public final int b(View view) {
        int iBv;
        int i;
        if (this.b != 0) {
            kr krVar = (kr) view.getLayoutParams();
            iBv = kq.bt(view);
            i = krVar.leftMargin;
        } else {
            kr krVar2 = (kr) view.getLayoutParams();
            iBv = kq.bv(view);
            i = krVar2.topMargin;
        }
        return iBv - i;
    }

    @Override // defpackage.mk
    public final int c() {
        int i;
        int iAt;
        int i2 = this.b;
        kq kqVar = this.a;
        if (i2 != 0) {
            i = kqVar.C;
            iAt = kqVar.av();
        } else {
            i = kqVar.D;
            iAt = kqVar.at();
        }
        return i - iAt;
    }

    @Override // defpackage.mk
    public final int d() {
        int i = this.b;
        kq kqVar = this.a;
        return i != 0 ? kqVar.au() : kqVar.aw();
    }

    @Override // defpackage.mk
    public final View e(int i) {
        int i2 = this.b;
        kq kqVar = this.a;
        return i2 != 0 ? kqVar.az(i) : kqVar.az(i);
    }
}
