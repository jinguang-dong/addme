package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class etq implements eto {
    int a;
    public Bitmap.Config b;
    private final etr c;

    public etq(etr etrVar) {
        this.c = etrVar;
    }

    @Override // defpackage.eto
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etq) {
            etq etqVar = (etq) obj;
            if (this.a == etqVar.a) {
                Bitmap.Config config = this.b;
                Bitmap.Config config2 = etqVar.b;
                char[] cArr = fax.a;
                if (a.ao(config, config2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return ets.a(this.a, this.b);
    }
}
