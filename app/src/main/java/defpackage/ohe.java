package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ohe extends ohg {
    public final int a;
    public final Bundle b;
    final /* synthetic */ ohm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ohe(ohm ohmVar, int i, Bundle bundle) {
        super(ohmVar, true);
        this.c = ohmVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(odj odjVar);

    protected abstract boolean b();

    @Override // defpackage.ohg
    protected final /* bridge */ /* synthetic */ void c() {
        int i = this.a;
        if (i != 0) {
            this.c.J(1, null);
            Bundle bundle = this.b;
            a(new odj(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (b()) {
                return;
            }
            this.c.J(1, null);
            a(new odj(8, null));
        }
    }
}
