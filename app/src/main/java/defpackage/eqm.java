package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqm implements eqi {
    public final yd b = new fal();

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            yd ydVar = this.b;
            if (i >= ydVar.d) {
                return;
            }
            eql eqlVar = (eql) ydVar.d(i);
            Object objG = ydVar.g(i);
            eqk eqkVar = eqlVar.c;
            if (eqlVar.e == null) {
                eqlVar.e = eqlVar.d.getBytes(eqi.a);
            }
            eqkVar.a(eqlVar.e, objG, messageDigest);
            i++;
        }
    }

    public final Object b(eql eqlVar) {
        yd ydVar = this.b;
        return ydVar.containsKey(eqlVar) ? ydVar.get(eqlVar) : eqlVar.b;
    }

    public final void c(eqm eqmVar) {
        this.b.i(eqmVar.b);
    }

    public final void d(eql eqlVar, Object obj) {
        this.b.put(eqlVar, obj);
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof eqm) {
            return this.b.equals(((eqm) obj).b);
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
