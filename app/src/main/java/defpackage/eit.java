package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eit implements eis {
    public final Path.FillType a;
    public final eig b;
    public final eih c;
    public final eij d;
    public final eij e;
    public final String f;
    public final boolean g;
    public final int h;

    public eit(String str, int i, Path.FillType fillType, eig eigVar, eih eihVar, eij eijVar, eij eijVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = eigVar;
        this.c = eihVar;
        this.d = eijVar;
        this.e = eijVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egl(efsVar, efhVar, ejhVar, this);
    }
}
