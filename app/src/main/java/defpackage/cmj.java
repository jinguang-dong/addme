package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmj extends coi {
    private final cmd a;

    public cmj(cmd cmdVar) {
        this.a = cmdVar;
    }

    @Override // defpackage.coi
    public final void h(int i) {
        cmd cmdVar = this.a;
        if (cmdVar != null) {
            cmdVar.b();
        }
    }

    @Override // defpackage.coi
    public final void i(Typeface typeface) {
        cmd cmdVar = this.a;
        if (cmdVar != null) {
            cmdVar.a(typeface);
        }
    }
}
