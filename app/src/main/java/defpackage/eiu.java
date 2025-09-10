package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiu implements eis {
    public final String a;
    public final eig b;
    public final eih c;
    public final eij d;
    public final eij e;
    public final eif f;
    public final float g;
    public final List h;
    public final eif i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public eiu(String str, int i, eig eigVar, eih eihVar, eij eijVar, eij eijVar2, eif eifVar, int i2, int i3, float f, List list, eif eifVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = eigVar;
        this.c = eihVar;
        this.d = eijVar;
        this.e = eijVar2;
        this.f = eifVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = eifVar2;
        this.j = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egm(efsVar, ejhVar, this);
    }
}
