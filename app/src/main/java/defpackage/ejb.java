package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejb implements eis {
    public final Path.FillType a;
    public final String b;
    public final eie c;
    public final eih d;
    public final boolean e;
    private final boolean f;

    public ejb(String str, boolean z, Path.FillType fillType, eie eieVar, eih eihVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = eieVar;
        this.d = eihVar;
        this.e = z2;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egk(efsVar, ejhVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
