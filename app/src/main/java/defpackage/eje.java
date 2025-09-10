package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eje implements eis {
    public final String a;
    public final eif b;
    public final List c;
    public final eie d;
    public final eih e;
    public final eif f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public eje(String str, eif eifVar, List list, eie eieVar, eih eihVar, eif eifVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = eifVar;
        this.c = list;
        this.d = eieVar;
        this.e = eihVar;
        this.f = eifVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egw(efsVar, ejhVar, this);
    }
}
