package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhj extends cmd {
    final /* synthetic */ nhm a;

    public nhj(nhm nhmVar) {
        this.a = nhmVar;
    }

    @Override // defpackage.cmd
    public final void a(Typeface typeface) {
        nhm nhmVar = this.a;
        nhmVar.b.setTypeface(typeface);
        nhmVar.c.setTypeface(typeface);
    }

    @Override // defpackage.cmd
    public final void b() {
    }
}
