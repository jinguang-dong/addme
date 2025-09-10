package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rnj extends cmd {
    final /* synthetic */ rnk a;
    final /* synthetic */ eze b;

    public rnj(rnk rnkVar, eze ezeVar) {
        this.b = ezeVar;
        this.a = rnkVar;
    }

    @Override // defpackage.cmd
    public final void a(Typeface typeface) {
        rnk rnkVar = this.a;
        rnkVar.k = Typeface.create(typeface, rnkVar.c);
        rnkVar.m = true;
        this.b.e(rnkVar.k);
    }

    @Override // defpackage.cmd
    public final void b() {
        this.a.m = true;
        this.b.f();
    }
}
