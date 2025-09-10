package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmu extends rmp {
    public final rms a;
    public final rmt b;
    public Drawable c;

    public rmu(Context context, rlx rlxVar, rms rmsVar, rmt rmtVar) {
        super(context, rlxVar);
        this.a = rmsVar;
        this.b = rmtVar;
        rmtVar.j = this;
    }

    private final boolean a() {
        return this.p != null && qsy.n(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmu.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.rmp
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.f();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.rmp, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
