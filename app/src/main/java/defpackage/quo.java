package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quo implements qpo {
    public final int a;
    public final sbp b;
    private final int c;

    public quo() {
        throw null;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ uem b() {
        return null;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof quo)) {
            return false;
        }
        quo quoVar = (quo) obj;
        int i = this.c;
        int i2 = quoVar.c;
        if (i != 0) {
            return i == i2 && this.a == quoVar.a && ujp.aH(this.b, quoVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.aF(i);
        sbp sbpVar = this.b;
        return ((((this.a ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ sbpVar.hashCode()) * 1000003) ^ 1237;
    }

    public quo(int i, int i2, sbp sbpVar) {
        this.c = 3;
        this.a = 5;
        this.b = sbpVar;
    }

    public final String toString() {
        return "{" + qpp.a(this.c) + ", " + this.a + ", " + String.valueOf(this.b) + KsvNaXS.CeOo;
    }
}
