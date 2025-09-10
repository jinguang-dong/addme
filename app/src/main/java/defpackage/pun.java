package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pun {
    public final String a;
    public final rwc b;
    public final rwc c;
    public final rwc d;
    public final rwc e;
    public final rwc f;
    public final rwc g;
    public final rwc h;
    public final int i;
    public final boolean j;
    public final int k;

    public pun() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pun) {
            pun punVar = (pun) obj;
            if (this.a.equals(punVar.a) && this.b.equals(punVar.b) && this.c.equals(punVar.c) && this.d.equals(punVar.d) && this.e.equals(punVar.e) && this.f.equals(punVar.f) && this.g.equals(punVar.g) && this.h.equals(punVar.h) && this.i == punVar.i) {
                int i = this.k;
                int i2 = punVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.j == punVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode();
        int i = this.k;
        a.aF(i);
        return ((((((this.i ^ (iHashCode * 1000003)) * (-721379959)) ^ i) * 1000003) ^ 1237) * 1000003) ^ (true != this.j ? 1237 : 1231);
    }

    public pun(String str, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, rwc rwcVar6, rwc rwcVar7, int i, int i2, boolean z) {
        this.a = str;
        this.b = rwcVar;
        this.c = rwcVar2;
        this.d = rwcVar3;
        this.e = rwcVar4;
        this.f = rwcVar5;
        this.g = rwcVar6;
        this.h = rwcVar7;
        this.i = i;
        this.k = i2;
        this.j = z;
    }

    public final String toString() {
        int i = this.k;
        rwc rwcVar = this.h;
        rwc rwcVar2 = this.g;
        rwc rwcVar3 = this.f;
        rwc rwcVar4 = this.e;
        rwc rwcVar5 = this.d;
        rwc rwcVar6 = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(rwcVar6);
        String strValueOf3 = String.valueOf(rwcVar5);
        String strValueOf4 = String.valueOf(rwcVar4);
        String strValueOf5 = String.valueOf(rwcVar3);
        String strValueOf6 = String.valueOf(rwcVar2);
        String strValueOf7 = String.valueOf(rwcVar);
        String str = i != 1 ? i != 2 ? "null" : "ALL" : "NONE";
        int i2 = this.i;
        return JvFFEwFNdCrxf.QnOznoFEXmloivC + this.a + ", " + strValueOf + ", " + strValueOf2 + ", " + strValueOf3 + ", " + strValueOf4 + ", " + strValueOf5 + ", " + strValueOf6 + ", " + strValueOf7 + ", " + i2 + ", 0, " + str + ", false, " + this.j + "}";
    }
}
